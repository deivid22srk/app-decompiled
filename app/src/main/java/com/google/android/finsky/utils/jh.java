package com.google.android.finsky.utils;

import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class jh implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.android.volley.s f5028a;

    jh(com.android.volley.s sVar) {
        this.f5028a = sVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.d("Failed to write user settings: %s", volleyError.toString());
        if (this.f5028a != null) {
            this.f5028a.a(volleyError);
        }
    }
}
