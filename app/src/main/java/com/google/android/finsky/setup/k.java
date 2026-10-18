package com.google.android.finsky.setup;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.volley.DisplayMessageError;

/* loaded from: classes.dex */
final class k implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f4665a;

    k(i iVar) {
        this.f4665a = iVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.d("Unable to fetch backup apps: %s (%s)", volleyError, volleyError instanceof DisplayMessageError ? ((DisplayMessageError) volleyError).f7176a : null);
        this.f4665a.f4662a = null;
        this.f4665a.a(6, 0);
    }
}
