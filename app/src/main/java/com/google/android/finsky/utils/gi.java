package com.google.android.finsky.utils;

import com.android.volley.VolleyError;

/* loaded from: classes.dex */
public final class gi implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gj f4904a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gc f4905b;

    public gi(gc gcVar, gj gjVar) {
        this.f4905b = gcVar;
        this.f4904a = gjVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        if (this.f4904a != null) {
            this.f4904a.a(false);
        }
    }
}
