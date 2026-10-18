package com.google.android.finsky.wear;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.volley.DisplayMessageError;

/* loaded from: classes.dex */
final class p implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5142a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f5143b;

    p(m mVar, String str) {
        this.f5143b = mVar;
        this.f5142a = str;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        com.google.android.finsky.a.n nVar;
        int a2 = com.google.android.finsky.installer.n.a(volleyError);
        FinskyLog.a("Received VolleyError %d (%s)", Integer.valueOf(a2), volleyError instanceof DisplayMessageError ? ((DisplayMessageError) volleyError).f7176a : null);
        this.f5143b.b();
        String str = this.f5142a;
        nVar = this.f5143b.i;
        bh.a(104, str, null, a2, null, nVar, this.f5143b.f5137b);
    }
}
