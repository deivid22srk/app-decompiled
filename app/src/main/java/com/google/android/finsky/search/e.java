package com.google.android.finsky.search;

import com.android.volley.VolleyError;
import com.android.volley.s;

/* loaded from: classes.dex */
final class e implements s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f4523a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f4524b;

    e(c cVar, n nVar) {
        this.f4524b = cVar;
        this.f4523a = nVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        g unused;
        unused = this.f4524b.f;
        g.a(510, volleyError);
        this.f4523a.a();
    }
}
