package com.google.android.finsky.utils;

import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class ag implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f4731a;

    ag(ae aeVar) {
        this.f4731a = aeVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.c("Connectivity error deserializing reviews: %s", volleyError.toString());
    }
}
