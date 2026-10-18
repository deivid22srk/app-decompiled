package com.google.android.finsky.utils;

import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class ao implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.apkg.i f4742a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ap f4743b;
    final /* synthetic */ aq c;
    final /* synthetic */ am d;

    ao(am amVar, com.google.android.finsky.apkg.i iVar, ap apVar, aq aqVar) {
        this.d = amVar;
        this.f4742a = iVar;
        this.f4743b = apVar;
        this.c = aqVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        this.f4742a.a(120, (String) null, (String) null, 0, volleyError.getClass().getSimpleName(), (com.google.android.finsky.apkg.n) null);
        FinskyLog.d("Couldn't upload device config", new Object[0]);
        if (this.f4743b != null) {
            this.f4743b.a(volleyError);
        }
        this.d.a(this.c);
    }
}
