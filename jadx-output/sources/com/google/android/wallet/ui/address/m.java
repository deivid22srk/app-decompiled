package com.google.android.wallet.ui.address;

import org.json.JSONObject;

/* loaded from: classes.dex */
final class m implements com.android.volley.t<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f7391a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f7392b;

    m(b bVar, n nVar) {
        this.f7392b = bVar;
        this.f7391a = nVar;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        this.f7391a.f = jSONObject2;
        this.f7392b.aG = jSONObject2;
        this.f7392b.S();
        b.g(this.f7392b);
    }
}
