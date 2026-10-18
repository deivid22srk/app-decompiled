package com.a.a.apkg.bpkg;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;

/* loaded from: classes.dex */
public final class ao {
    public static final /* synthetic */ boolean i;

    /* renamed from: b, reason: collision with root package name */
    long f944b;
    public final int c;
    public final ac d;
    List<e> e;
    public final aq f;
    public final ap g;
    public final List<e> k;

    /* renamed from: a, reason: collision with root package name */
    long f943a = 0;
    public long j = 0;
    public final ar h = new ar(this);
    public final ar l = new ar(this);
    public a m = null;

    static {
        i = !ao.class.desiredAssertionStatus();
    }

    ao(int i2, ac acVar, boolean z, boolean z2, List<e> list) {
        if (acVar == null) {
            throw new NullPointerException("connection == null");
        }
        if (list == null) {
            throw new NullPointerException("requestHeaders == null");
        }
        this.c = i2;
        this.d = acVar;
        this.f944b = acVar.f.b();
        this.f = new aq(this, acVar.e.b(), (byte) 0);
        this.g = new ap(this);
        this.f.g = z2;
        this.g.d = z;
        this.k = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
    
        if (r1 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
    
        if (r1 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        if (r2.e == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean a() {
        /*
            r2 = this;
            r0 = 0
            monitor-enter(r2)
            com.a.a.apkg.bpkg.a r1 = r2.m     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L8
        L6:
            monitor-exit(r2)
            return r0
        L8:
            com.a.a.apkg.bpkg.aq r1 = r2.f     // Catch: java.lang.Throwable -> L2e
            boolean r1 = com.a.a.apkg.bpkg.aq.a(r1)     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L18
            com.a.a.apkg.bpkg.aq r1 = r2.f     // Catch: java.lang.Throwable -> L2e
            boolean r1 = com.a.a.apkg.bpkg.aq.b(r1)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L2c
        L18:
            com.a.a.apkg.bpkg.ap r1 = r2.g     // Catch: java.lang.Throwable -> L2e
            boolean r1 = com.a.a.apkg.bpkg.ap.a(r1)     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L28
            com.a.a.apkg.bpkg.ap r1 = r2.g     // Catch: java.lang.Throwable -> L2e
            boolean r1 = com.a.a.apkg.bpkg.ap.b(r1)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L2c
        L28:
            java.util.List<com.a.a.apkg.bpkg.e> r1 = r2.e     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L6
        L2c:
            r0 = 1
            goto L6
        L2e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.apkg.bpkg.ao.a():boolean");
    }

    public final boolean b() {
        return this.d.f930b == ((this.c & 1) == 1);
    }

    public final synchronized List<e> c() {
        this.h.c();
        while (this.e == null && this.m == null) {
            try {
                f();
            } catch (Throwable th) {
                this.h.b();
                throw th;
            }
        }
        this.h.b();
        if (this.e == null) {
            throw new IOException("stream was reset: " + this.m);
        }
        return this.e;
    }

    public final okio2.x d() {
        synchronized (this) {
            if (this.e == null && !b()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.g;
    }

    public final void a(a aVar) {
        if (d(aVar)) {
            this.d.b(this.c, aVar);
        }
    }

    public final void b(a aVar) {
        if (d(aVar)) {
            this.d.a(this.c, aVar);
        }
    }

    public boolean d(a aVar) {
        boolean z;
        boolean z2;
        if (!i && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            if (this.m != null) {
                return false;
            }
            z = this.f.g;
            if (z) {
                z2 = this.g.d;
                if (z2) {
                    return false;
                }
            }
            this.m = aVar;
            notifyAll();
            this.d.b(this.c);
            return true;
        }
    }

    public final void e() {
        boolean a2;
        if (!i && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f.g = true;
            a2 = a();
            notifyAll();
        }
        if (!a2) {
            this.d.b(this.c);
        }
    }

    public final synchronized void c(a aVar) {
        if (this.m == null) {
            this.m = aVar;
            notifyAll();
        }
    }

    public final void a(long j) {
        this.f944b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        try {
            wait();
        } catch (InterruptedException e) {
            throw new InterruptedIOException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r0 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void f(com.a.a.apkg.bpkg.ao r2) {
        /*
            boolean r0 = com.a.a.apkg.bpkg.ao.i
            if (r0 != 0) goto L10
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 == 0) goto L10
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L10:
            monitor-enter(r2)
            com.a.a.apkg.bpkg.aq r0 = r2.f     // Catch: java.lang.Throwable -> L41
            boolean r0 = com.a.a.apkg.bpkg.aq.a(r0)     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L3f
            com.a.a.apkg.bpkg.aq r0 = r2.f     // Catch: java.lang.Throwable -> L41
            boolean r0 = com.a.a.apkg.bpkg.aq.b(r0)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L3f
            com.a.a.apkg.bpkg.ap r0 = r2.g     // Catch: java.lang.Throwable -> L41
            boolean r0 = com.a.a.apkg.bpkg.ap.a(r0)     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L31
            com.a.a.apkg.bpkg.ap r0 = r2.g     // Catch: java.lang.Throwable -> L41
            boolean r0 = com.a.a.apkg.bpkg.ap.b(r0)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L3f
        L31:
            r0 = 1
        L32:
            boolean r1 = r2.a()     // Catch: java.lang.Throwable -> L41
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L44
            com.a.a.apkg.bpkg.a r0 = com.a.a.apkg.bpkg.a.CANCEL
            r2.a(r0)
        L3e:
            return
        L3f:
            r0 = 0
            goto L32
        L41:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            throw r0
        L44:
            if (r1 != 0) goto L3e
            com.a.a.apkg.bpkg.ac r0 = r2.d
            int r1 = r2.c
            r0.b(r1)
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.apkg.bpkg.ao.f(com.a.a.apkg.bpkg.ao):void");
    }

    public static /* synthetic */ void h(ao aoVar) {
        boolean z;
        boolean z2;
        z = aoVar.g.c;
        if (!z) {
            z2 = aoVar.g.d;
            if (z2) {
                throw new IOException("stream finished");
            }
            if (aoVar.m == null) {
                return;
            } else {
                throw new IOException("stream was reset: " + aoVar.m);
            }
        }
        throw new IOException("stream closed");
    }
}
