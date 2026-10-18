package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@gw
/* loaded from: classes.dex */
public class ii<T> implements ij<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f6057a = new Object();
    private T c = null;
    private boolean d = false;
    private boolean e = false;

    /* renamed from: b, reason: collision with root package name */
    final ik f6058b = new ik();

    public final void b(T t) {
        synchronized (this.f6057a) {
            if (this.e) {
                return;
            }
            if (this.d) {
                throw new IllegalStateException("Provided CallbackFuture with multiple values.");
            }
            this.d = true;
            this.c = t;
            this.f6057a.notifyAll();
            this.f6058b.a();
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        boolean z2 = false;
        if (z) {
            synchronized (this.f6057a) {
                if (!this.d) {
                    this.e = true;
                    this.d = true;
                    this.f6057a.notifyAll();
                    this.f6058b.a();
                    z2 = true;
                }
            }
        }
        return z2;
    }

    @Override // java.util.concurrent.Future
    public T get() {
        T t;
        synchronized (this.f6057a) {
            if (!this.d) {
                try {
                    this.f6057a.wait();
                } catch (InterruptedException e) {
                }
            }
            if (this.e) {
                throw new CancellationException("CallbackFuture was cancelled.");
            }
            t = this.c;
        }
        return t;
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) {
        T t;
        synchronized (this.f6057a) {
            if (!this.d) {
                try {
                    long millis = timeUnit.toMillis(j);
                    if (millis != 0) {
                        this.f6057a.wait(millis);
                    }
                } catch (InterruptedException e) {
                }
            }
            if (!this.d) {
                throw new TimeoutException("CallbackFuture timed out.");
            }
            if (this.e) {
                throw new CancellationException("CallbackFuture was cancelled.");
            }
            t = this.c;
        }
        return t;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        boolean z;
        synchronized (this.f6057a) {
            z = this.e;
        }
        return z;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        boolean z;
        synchronized (this.f6057a) {
            z = this.d;
        }
        return z;
    }
}
