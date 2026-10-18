package com.google.android.finsky.services;

import android.content.Intent;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class am implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4581a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f4582b;
    final /* synthetic */ RestoreService c;

    am(RestoreService restoreService, String str, String str2) {
        this.c = restoreService;
        this.f4581a = str;
        this.f4582b = str2;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        boolean z;
        Intent b2;
        this.c.f4555a.a(this.f4581a, false, volleyError);
        FinskyLog.c("Error while getting list of applications to restore from server: %s", volleyError.getMessage());
        at atVar = this.c.f4555a;
        String str = this.f4581a;
        ap apVar = atVar.c.get(str);
        if (apVar == null || apVar.f4586a < com.google.android.finsky.c.d.bG.b().intValue()) {
            z = true;
        } else {
            FinskyLog.a("Reached limit %d for %s", Integer.valueOf(apVar.f4586a), FinskyLog.a(str));
            atVar.c.remove(str);
            atVar.a(str);
            z = false;
        }
        if (z) {
            b2 = RestoreService.b(this.f4582b, this.f4581a, this.c);
            this.c.a(b2, RestoreService.a(com.google.android.finsky.c.d.bH.b().longValue()));
        }
    }
}
