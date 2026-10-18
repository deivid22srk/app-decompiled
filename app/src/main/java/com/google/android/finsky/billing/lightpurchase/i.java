package com.google.android.finsky.billing.lightpurchase;

import com.android.volley.VolleyError;
import com.google.android.finsky.billing.an;

/* loaded from: classes.dex */
public final class i implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f2387a;

    private i(e eVar) {
        this.f2387a = eVar;
    }

    public /* synthetic */ i(e eVar, byte b2) {
        this(eVar);
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        this.f2387a.ap = volleyError;
        r1.av.b(this.f2387a.b(306, (an) null).a(volleyError).a(-1L).b(-1L).f1473a);
        this.f2387a.a(3, 3);
    }
}
