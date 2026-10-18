package com.google.android.finsky.billing.iab;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class t implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f2265a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2266b;
    private final long c;

    public t(r rVar, String str, long j) {
        this.f2265a = rVar;
        this.f2266b = str;
        this.c = j;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.d("Server error on InAppPurchaseInformationRequest: %s", volleyError);
        this.f2265a.f2262a.f2233b.a(this.f2266b, this.c, n.RESULT_SERVICE_UNAVAILABLE);
    }
}
