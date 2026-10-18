package com.google.android.finsky.utils;

import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class hp implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hn f4970a;

    hp(hn hnVar) {
        this.f4970a = hnVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        this.f4970a.f4968b = false;
        FinskyLog.c("SelfUpdate error - %s", volleyError);
    }
}
