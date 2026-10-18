package com.a.a.apkg.bpkg;

/* loaded from: classes.dex */
final class ap implements okio2.x {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ boolean f945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ao f946b;
    public boolean c;
    public boolean d;

    static {
        f945a = !ao.class.desiredAssertionStatus();
    }

    ap(ao aoVar) {
        this.f946b = aoVar;
    }

    @Override // okio2.x
    public final void a_(okio2.f fVar, long j) {
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

    @Override // okio2.x
    public final void b() {
        if (!f945a && Thread.holdsLock(this.f946b)) {
            throw new AssertionError();
        }
        synchronized (this.f946b) {
            ao.h(this.f946b);
        }
        this.f946b.d.c();
    }

    @Override // okio2.x
    public final okio2.z a() {
        return this.f946b.l;
    }

    @Override // okio2.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!f945a && Thread.holdsLock(this.f946b)) {
            throw new AssertionError();
        }
        synchronized (this.f946b) {
            if (!this.c) {
                if (!this.f946b.g.d) {
                    this.f946b.d.a(this.f946b.c, true, (okio2.f) null, 0L);
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
