package com.google.android.finsky.activities.b;

import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class z implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ y f1605a;

    z(y yVar) {
        this.f1605a = yVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        this.f1605a.c = true;
        this.f1605a.d.m_();
    }
}
