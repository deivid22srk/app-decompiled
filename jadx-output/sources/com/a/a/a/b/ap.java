package com.a.a.a.b;

/* loaded from: classes.dex */
final class ap implements a.x {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f945a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ao f946b;
    private boolean c;
    private boolean d;

    static {
        f945a = !ao.class.desiredAssertionStatus();
    }

    ap(ao aoVar) {
        this.f946b = aoVar;
    }

    @Override // a.x
    public final void a_(a.f fVar, long j) {
        long min;
        if (!f945a && Thread.holdsLock(this.f946b)) {
            throw new AssertionError();
        }
        while (j > 0) {
            synchronized (this.f946b) {
                this.f946b.l.c();
                while (this.f946b.f944b <= 0 && !this.d && !this.c && this.f946b.m == null) {
                    try {
                        this.f946b.f();
                    } finally {
                    }
                }
                this.f946b.l.b();
                ao.h(this.f946b);
                min = Math.min(this.f946b.f944b, j);
                this.f946b.f944b -= min;
            }
            j -= min;
            this.f946b.d.a(this.f946b.c, false, fVar, min);
        }
    }

    @Override // a.x
    public final void b() {
        if (!f945a && Thread.holdsLock(this.f946b)) {
            throw new AssertionError();
        }
        synchronized (this.f946b) {
            ao.h(this.f946b);
        }
        this.f946b.d.c();
    }

    @Override // a.x
    public final a.z a() {
        return this.f946b.l;
    }

    @Override // a.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!f945a && Thread.holdsLock(this.f946b)) {
            throw new AssertionError();
        }
        synchronized (this.f946b) {
            if (!this.c) {
                if (!this.f946b.g.d) {
                    this.f946b.d.a(this.f946b.c, true, (a.f) null, 0L);
                }
                synchronized (this.f946b) {
                    this.c = true;
                }
                this.f946b.d.c();
                ao.f(this.f946b);
            }
        }
    }
}
