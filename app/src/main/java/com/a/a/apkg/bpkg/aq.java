package com.a.a.apkg.bpkg;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class aq implements okio2.y {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ boolean f947a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ao f948b;
    public final okio2.f c;
    public final okio2.f d;
    public final long e;
    public boolean f;
    public boolean g;

    static {
        f947a = !ao.class.desiredAssertionStatus();
    }

    /* synthetic */ aq(ao aoVar, long j, byte b2) {
        this(aoVar, j);
    }

    public aq(ao aoVar, long j) {
        this.f948b = aoVar;
        this.c = new okio2.f();
        this.d = new okio2.f();
        this.e = j;
    }

    @Override // okio2.y
    public final long a(okio2.f fVar, long j) {
        long a2;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        synchronized (this.f948b) {
            b();
            if (!this.f) {
                if (this.f948b.m == null) {
                    if (this.d.f10b == 0) {
                        a2 = -1;
                    } else {
                        a2 = this.d.a(fVar, Math.min(j, this.d.f10b));
                        this.f948b.f943a += a2;
                        if (this.f948b.f943a >= this.f948b.d.e.b() / 2) {
                            this.f948b.d.a(this.f948b.c, this.f948b.f943a);
                            this.f948b.f943a = 0L;
                        }
                        synchronized (this.f948b.d) {
                            this.f948b.d.c += a2;
                            if (this.f948b.d.c >= this.f948b.d.e.b() / 2) {
                                this.f948b.d.a(0, this.f948b.d.c);
                                this.f948b.d.c = 0L;
                            }
                        }
                    }
                    return a2;
                }
                throw new IOException("stream was reset: " + this.f948b.m);
            }
            throw new IOException("stream closed");
        }
    }

    public void b() {
        this.f948b.h.c();
        while (this.d.f10b == 0 && !this.g && !this.f && this.f948b.m == null) {
            try {
                this.f948b.f();
            } finally {
                this.f948b.h.b();
            }
        }
    }

    public final void a(okio2.i iVar, long j) {
        boolean z;
        boolean z2;
        if (!f947a && Thread.holdsLock(this.f948b)) {
            throw new AssertionError();
        }
        while (j > 0) {
            synchronized (this.f948b) {
                z = this.g;
                z2 = this.d.f10b + j > this.e;
            }
            if (z2) {
                iVar.f(j);
                this.f948b.b(a.FLOW_CONTROL_ERROR);
                return;
            }
            if (z) {
                iVar.f(j);
                return;
            }
            long a2 = iVar.a(this.c, j);
            if (a2 == -1) {
                throw new EOFException();
            }
            j -= a2;
            synchronized (this.f948b) {
                boolean z3 = this.d.f10b == 0;
                this.d.a(this.c);
                if (z3) {
                    this.f948b.notifyAll();
                }
            }
        }
    }

    @Override // okio2.y
    public final okio2.z a() {
        return this.f948b.h;
    }

    @Override // okio2.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f948b) {
            this.f = true;
            this.d.o();
            this.f948b.notifyAll();
        }
        ao.f(this.f948b);
    }
}
