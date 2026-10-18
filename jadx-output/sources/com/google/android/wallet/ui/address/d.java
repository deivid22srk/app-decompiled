package com.google.android.wallet.ui.address;

import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class d implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f7380a;

    d(b bVar) {
        this.f7380a = bVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        this.f7380a.aG = null;
        this.f7380a.S();
        b.g(this.f7380a);
    }
}
