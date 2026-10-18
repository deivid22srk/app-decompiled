package com.google.android.finsky;

/* loaded from: classes.dex */
final class g implements com.android.volley.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f2781a;

    g(int i) {
        this.f2781a = i;
    }

    @Override // com.android.volley.q
    public final boolean a(com.android.volley.l<?> lVar) {
        if (lVar instanceof com.google.android.finsky.api.n) {
            if (((com.google.android.finsky.api.n) lVar).r) {
                return false;
            }
        } else if (lVar instanceof com.google.android.vending.a.a.e) {
            if (((com.google.android.vending.a.a.e) lVar).k) {
                return false;
            }
        } else if (lVar instanceof com.google.android.finsky.billing.b.b) {
            return false;
        }
        return lVar.a() < this.f2781a;
    }
}
