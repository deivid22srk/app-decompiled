package com.google.android.finsky.detailspage;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class y implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f2675a;

    private y(w wVar) {
        this.f2675a = wVar;
    }

    /* synthetic */ y(w wVar, byte b2) {
        this(wVar);
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.d("Volley error while fetching social details doc: %s", volleyError.getClass());
        w.a(this.f2675a);
        this.f2675a.m_();
    }
}
