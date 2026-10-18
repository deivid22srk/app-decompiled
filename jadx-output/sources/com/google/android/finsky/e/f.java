package com.google.android.finsky.e;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class f implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f2753a;

    f(d dVar) {
        this.f2753a = dVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.d("Error pinging deeplink click: %s", volleyError);
        this.f2753a.a(521, volleyError);
    }
}
