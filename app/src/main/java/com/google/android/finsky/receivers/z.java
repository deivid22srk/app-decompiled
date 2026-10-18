package com.google.android.finsky.receivers;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.fv;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class z implements com.android.volley.t<fv> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4508a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f4509b;

    z(u uVar, String str) {
        this.f4509b = uVar;
        this.f4508a = str;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(fv fvVar) {
        com.google.android.finsky.bpkg.s sVar;
        com.google.android.finsky.bpkg.s sVar2;
        fv fvVar2 = fvVar;
        int i = fvVar2.f3847a;
        if (i == 1) {
            sVar = this.f4509b.c;
            sVar.a(this.f4508a, fvVar2.c, System.currentTimeMillis());
            sVar2 = this.f4509b.c;
            com.google.android.finsky.bpkg.t a2 = sVar2.a(this.f4508a);
            this.f4509b.a(a2, true);
            this.f4509b.a(a2);
            this.f4509b.c(a2);
            return;
        }
        FinskyLog.a("Received non-OK response %d", Integer.valueOf(i));
        this.f4509b.a(false);
        aa aaVar = new aa(this, i);
        if (i == 5) {
            FinskyApp.a().b(aaVar);
        } else {
            aaVar.run();
        }
    }
}
