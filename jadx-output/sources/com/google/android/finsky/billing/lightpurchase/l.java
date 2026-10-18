package com.google.android.finsky.billing.lightpurchase;

import com.android.volley.VolleyError;
import com.google.android.finsky.billing.an;

/* loaded from: classes.dex */
final class l implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f2390a;

    private l(e eVar) {
        this.f2390a = eVar;
    }

    /* synthetic */ l(e eVar, byte b2) {
        this(eVar);
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        long x;
        long w;
        this.f2390a.ap = volleyError;
        e eVar = this.f2390a;
        x = this.f2390a.x();
        w = this.f2390a.w();
        eVar.av.b(eVar.b(303, (an) null).a(volleyError).a(x).b(w).f1473a);
        this.f2390a.a(3, 3);
    }
}
