package com.google.android.finsky.wear;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.fv;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class n implements com.android.volley.t<fv> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5138a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f5139b;

    n(m mVar, String str) {
        this.f5139b = mVar;
        this.f5138a = str;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(fv fvVar) {
        com.google.android.finsky.b.s sVar;
        com.google.android.finsky.b.s sVar2;
        fv fvVar2 = fvVar;
        int i = fvVar2.f3847a;
        if (i == 1) {
            sVar = this.f5139b.m;
            sVar.a(this.f5138a, fvVar2.c, System.currentTimeMillis());
            sVar2 = this.f5139b.m;
            com.google.android.finsky.b.t a2 = sVar2.a(this.f5138a);
            this.f5139b.a(a2, true);
            this.f5139b.a(a2);
            return;
        }
        FinskyLog.a("Received non-OK response %d", Integer.valueOf(i));
        this.f5139b.b();
        o oVar = new o(this, i);
        if (i == 5) {
            FinskyApp.a().b(oVar);
        } else {
            oVar.run();
        }
    }
}
