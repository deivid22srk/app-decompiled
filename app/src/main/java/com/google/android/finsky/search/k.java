package com.google.android.finsky.search;

import com.android.volley.VolleyError;
import com.android.volley.s;

/* loaded from: classes.dex */
final class k implements s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f4534a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f4535b;

    k(h hVar, n nVar) {
        this.f4535b = hVar;
        this.f4534a = nVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        g.a(510, volleyError);
        this.f4534a.a();
    }
}
