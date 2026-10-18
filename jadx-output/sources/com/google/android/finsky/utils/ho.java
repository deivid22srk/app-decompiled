package com.google.android.finsky.utils;

import android.os.Environment;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class ho implements com.android.volley.t<com.google.android.finsky.protos.fv> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hn f4969a;

    ho(hn hnVar) {
        this.f4969a = hnVar;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(com.google.android.finsky.protos.fv fvVar) {
        boolean a2;
        com.google.android.finsky.protos.fv fvVar2 = fvVar;
        int i = fvVar2.f3847a;
        if (i == 1) {
            if (fvVar2.c != null) {
                com.google.android.finsky.protos.aa aaVar = fvVar2.c;
                com.google.android.finsky.protos.il ilVar = aaVar.m[0];
                long j = aaVar.f3577b ? aaVar.f3576a : -1L;
                String str = aaVar.f ? aaVar.e : null;
                hn hnVar = this.f4969a;
                String str2 = aaVar.g;
                String str3 = ilVar.f3955a;
                String str4 = ilVar.c;
                if (j <= 0) {
                    a2 = true;
                } else if (!FinskyApp.a().e().a(12604524L)) {
                    a2 = true;
                } else {
                    com.google.android.finsky.installer.n nVar = FinskyApp.a().l;
                    a2 = com.google.android.finsky.installer.n.a(j, Environment.getDataDirectory(), FinskyApp.a().getContentResolver());
                }
                if (!a2) {
                    hnVar.f4968b = false;
                    FinskyApp.a().h().a(112, FinskyApp.a().getPackageName(), (String) null, 908, (String) null, hnVar.c);
                    FinskyLog.a("Self-update ignore download due to lack of free space", new Object[0]);
                    return;
                }
                hnVar.d = j;
                hnVar.e = str;
                com.google.android.finsky.download.e eVar = new com.google.android.finsky.download.e(str2, "", null, null, str3, str4, null, -1L, -1L, null, false, true);
                hnVar.f = eVar;
                hnVar.f4967a.a(hnVar);
                hnVar.f4967a.e(eVar);
                FinskyApp.a().h().a(100, FinskyApp.a().getPackageName(), (String) null, 0, (String) null, hnVar.c);
                return;
            }
            this.f4969a.f4968b = false;
            FinskyLog.c("SelfUpdate response missing appDeliveryData", new Object[0]);
            return;
        }
        this.f4969a.f4968b = false;
        FinskyLog.c("SelfUpdate non-OK response - %d", Integer.valueOf(i));
    }
}
