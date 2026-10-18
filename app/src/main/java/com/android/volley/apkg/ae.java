package com.android.volley.apkg;

import com.android.volley.VolleyError;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class ae<T> implements com.android.volley.s, com.android.volley.t<T>, Future<T> {

    /* renamed from: a, reason: collision with root package name */
    public com.android.volley.l<?> f1203a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1204b = false;
    public T c;
    public VolleyError d;

    public static <E> ae<E> a() {
        return new ae<>();
    }

    public ae() {
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean cancel(boolean z) {
        boolean z2 = false;
        synchronized (this) {
            if (this.f1203a != null && !isDone()) {
                this.f1203a.d();
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.concurrent.Future
    public final T get() {
        try {
            return a((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public final T get(long j, TimeUnit timeUnit) {
        return a(Long.valueOf(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
    }

    public synchronized T a(Long l) {
        T t;
        if (this.d != null) {
            throw new ExecutionException(this.d);
        }
        if (this.f1204b) {
            t = this.c;
        } else {
            if (l == null) {
                wait(0L);
            } else if (l.longValue() > 0) {
                wait(l.longValue());
            }
            if (this.d != null) {
                throw new ExecutionException(this.d);
            }
            if (!this.f1204b) {
                throw new TimeoutException();
            }
            t = this.c;
        }
        return t;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        if (this.f1203a == null) {
            return false;
        }
        return this.f1203a.e();
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        boolean z;
        if (!this.f1204b && this.d == null) {
            z = isCancelled();
        }
        return z;
    }

    @Override // com.android.volley.t
    public final synchronized void a_(T t) {
        this.f1204b = true;
        this.c = t;
        notifyAll();
    }

    @Override // com.android.volley.s
    public final synchronized void a(VolleyError volleyError) {
        this.d = volleyError;
        notifyAll();
    }
}
