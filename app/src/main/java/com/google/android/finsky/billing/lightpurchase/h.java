package com.google.android.finsky.billing.lightpurchase;

import com.android.volley.VolleyError;
import com.google.android.finsky.billing.an;

/* loaded from: classes.dex */
final class h implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f2386a;

    private h(e eVar) {
        this.f2386a = eVar;
    }

    /* synthetic */ h(e eVar, byte b2) {
        this(eVar);
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        long z;
        long y;
        this.f2386a.ap = volleyError;
        e eVar = this.f2386a;
        z = this.f2386a.z();
        y = this.f2386a.y();
        eVar.av.b(eVar.b(305, (an) null).a(volleyError).a(z).b(y).f1473a);
        this.f2386a.a(3, 3);
    }
}
