package com.google.android.finsky.activities.bpkg;

import com.android.volley.VolleyError;

/* loaded from: classes.dex */
public final class z implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f1605a;

    z(y yVar) {
        this.f1605a = yVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        this.f1605a.c = true;
        this.f1605a.d.m_();
    }
}
