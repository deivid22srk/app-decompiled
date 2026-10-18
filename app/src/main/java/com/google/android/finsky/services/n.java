package com.google.android.finsky.services;

import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.cf;

/* loaded from: classes.dex */
final class n implements cf {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.apkg.n f4625a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.apkg.i f4626b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;
    final /* synthetic */ DailyHygiene e;

    n(DailyHygiene dailyHygiene, com.google.android.finsky.apkg.n nVar, com.google.android.finsky.apkg.i iVar, String str, int i) {
        this.e = dailyHygiene;
        this.f4625a = nVar;
        this.f4626b = iVar;
        this.c = str;
        this.d = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
    
        if (r0 != false) goto L11;
     */
    @Override // com.google.android.finsky.utils.cf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.finsky.protos.on r10) {
        /*
            r9 = this;
            r3 = 0
            r4 = 0
            com.google.android.finsky.FinskyApp r0 = com.google.android.finsky.FinskyApp.a()
            com.google.android.finsky.utils.hn r7 = r0.m
            int r8 = com.google.android.finsky.utils.hn.a(r10)
            if (r8 <= 0) goto L17
            com.google.android.finsky.apkg.n r0 = r9.f4625a
            r0.f1490a = r8
            com.google.android.finsky.apkg.n r0 = r9.f4625a
            r1 = 1
            r0.f1491b = r1
        L17:
            com.google.android.finsky.apkg.i r0 = r9.f4626b
            r1 = 119(0x77, float:1.67E-43)
            com.google.android.finsky.FinskyApp r2 = com.google.android.finsky.FinskyApp.a()
            java.lang.String r2 = r2.getPackageName()
            com.google.android.finsky.apkg.n r6 = r9.f4625a
            r5 = r3
            r0.a(r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = r9.c
            boolean r0 = r7.a(r8, r0)
            if (r0 == 0) goto L54
            com.google.android.play.utils.bpkg.a<java.lang.Boolean> r0 = com.google.android.finsky.cpkg.d.aN
            java.lang.Object r0 = r0.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L47
            int r0 = r9.d
            boolean r0 = com.google.android.finsky.services.DailyHygiene.a(r0)
            if (r0 == 0) goto L54
        L47:
            java.lang.String r0 = "Self-update started or running - defer daily hygiene"
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.google.android.finsky.utils.FinskyLog.a(r0, r1)
            com.google.android.finsky.services.DailyHygiene r0 = r9.e
            com.google.android.finsky.services.DailyHygiene.c(r0)
        L53:
            return
        L54:
            com.google.android.finsky.services.DailyHygiene r0 = r9.e
            com.google.android.finsky.services.DailyHygiene.d(r0)
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.services.n.a(com.google.android.finsky.protos.on):void");
    }

    @Override // com.google.android.finsky.utils.cf
    public final void a(VolleyError volleyError) {
        this.f4626b.a(119, FinskyApp.a().getPackageName(), (String) null, 0, volleyError.getClass().getSimpleName(), this.f4625a);
        this.e.f();
    }
}
