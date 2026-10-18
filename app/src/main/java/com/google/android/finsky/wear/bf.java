package com.google.android.finsky.wear;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class bf implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bd f5117a;

    bf(bd bdVar) {
        this.f5117a = bdVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        String str;
        WearSupportService wearSupportService;
        String str2;
        str = this.f5117a.e.f5113b;
        FinskyLog.c("Update check for node %s failed: %s", str, volleyError);
        bc.a(this.f5117a.c, false);
        wearSupportService = this.f5117a.e.f;
        str2 = this.f5117a.e.f5113b;
        wearSupportService.a(str2);
    }
}
