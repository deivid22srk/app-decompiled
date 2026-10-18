package com.a.a;

import java.net.Socket;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final m f1036a;

    /* renamed from: b, reason: collision with root package name */
    public final ai f1037b;
    public Socket c;
    com.a.a.apkg.apkg.f e;
    com.a.a.apkg.bpkg.ac f;
    long h;
    public s i;
    int j;
    public Object k;
    boolean d = false;
    public aa g = aa.HTTP_1_1;

    public l(m mVar, ai aiVar) {
        this.f1036a = mVar;
        this.f1037b = aiVar;
    }

    public final void a(Object obj) {
        if (!e()) {
            synchronized (this.f1036a) {
                if (this.k != null) {
                    throw new IllegalStateException("Connection already has an owner!");
                }
                this.k = obj;
            }
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this.f1036a) {
            if (this.k == null) {
                z = false;
            } else {
                this.k = null;
                z = true;
            }
        }
        return z;
    }

    public final boolean b() {
        return (this.c.isClosed() || this.c.isInputShutdown() || this.c.isOutputShutdown()) ? false : true;
    }

    public final boolean c() {
        return this.f == null || this.f.a();
    }

    public final long d() {
        return this.f == null ? this.h : this.f.b();
    }

    public final boolean e() {
        return this.f != null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:202)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:103)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void a(com.a.a.ab r11, int r12, int r13) {
        /*
            r10 = this;
            r2 = 0
            com.a.a.apkg.apkg.f r4 = new com.a.a.apkg.apkg.f
            com.a.a.m r0 = r10.f1036a
            java.net.Socket r1 = r10.c
            r4.<init>(r0, r10, r1)
            r4.a(r12, r13)
            java.net.URL r0 = r11.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "CONNECT "
            r1.<init>(r5)
            java.lang.String r5 = r0.getHost()
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r5 = ":"
            java.lang.StringBuilder r1 = r1.append(r5)
            int r0 = r0.getPort()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " HTTP/1.1"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r5 = r0.toString()
        L39:
            com.a.a.t r0 = r11.c
            r4.a(r0, r5)
            r4.a()
            com.a.a.ag r0 = r4.c()
            r0.f1014a = r11
            com.a.a.af r6 = r0.a()
            long r0 = com.a.a.apkg.apkg.u.a(r6)
            r8 = -1
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 != 0) goto L56
            r0 = r2
        L56:
            okio2.y r0 = r4.a(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.a.a.apkg.l.a(r0, r1, r7)
            r0.close()
            int r0 = r6.c
            switch(r0) {
                case 200: goto L81;
                case 407: goto L95;
                default: goto L6a;
            }
        L6a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected response code for CONNECT: "
            r1.<init>(r2)
            int r2 = r6.c
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L81:
            okio2.i r0 = r4.c
            okio2.f r0 = r0.c()
            long r0 = r0.f10b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lad
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "TLS tunnel buffered too many bytes!"
            r0.<init>(r1)
            throw r0
        L95:
            com.a.a.ai r0 = r10.f1037b
            com.a.a.aA2 r0 = r0.f1016a
            com.a.a.b r0 = r0.h
            com.a.a.ai r1 = r10.f1037b
            java.net.Proxy r1 = r1.f1017b
            com.a.a.ab r11 = com.a.a.apkg.apkg.u.a(r0, r6, r1)
            if (r11 != 0) goto L39
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Failed to authenticate with proxy"
            r0.<init>(r1)
            throw r0
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.l.a(com.a.a.ab, int, int):void");
    }

    public final String toString() {
        return "Connection{" + this.f1037b.f1016a.f885b + ":" + this.f1037b.f1016a.c + ", proxy=" + this.f1037b.f1017b + " hostAddress=" + this.f1037b.c.getAddress().getHostAddress() + " cipherSuite=" + (this.i != null ? this.i.f1047a : "none") + " protocol=" + this.g + '}';
    }
}
