package com.google.android.finsky.services;

import com.android.volley.VolleyError;
import com.google.android.finsky.protos.pw;
import com.google.android.finsky.utils.cl;

/* loaded from: classes.dex */
final class ax implements cl {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.android.volley.a.ae f4601a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aw f4602b;

    ax(aw awVar, com.android.volley.a.ae aeVar) {
        this.f4602b = awVar;
        this.f4601a = aeVar;
    }

    @Override // com.google.android.finsky.utils.cl
    public final void a(pw pwVar) {
        this.f4601a.a_(pwVar);
    }

    @Override // com.google.android.finsky.utils.cl
    public final void a(VolleyError volleyError) {
        this.f4601a.a(volleyError);
    }
}
