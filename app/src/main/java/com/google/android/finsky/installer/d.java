package com.google.android.finsky.installer;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class d implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2860a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f2861b;

    d(String str, f fVar) {
        this.f2860a = str;
        this.f2861b = fVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.c("Error while fetching dependencies for %s: %s", this.f2860a, volleyError);
        this.f2861b.a(volleyError);
    }
}
