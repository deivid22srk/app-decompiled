package com.google.android.finsky.utils;

import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class ci implements ap {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f4799a = false;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.api.b f4800b;
    final /* synthetic */ boolean c;
    final /* synthetic */ cl d;

    ci(com.google.android.finsky.api.b bVar, boolean z, cl clVar) {
        this.f4800b = bVar;
        this.c = z;
        this.d = clVar;
    }

    @Override // com.google.android.finsky.utils.ap
    public final void a() {
        cg.a(this.f4799a, this.f4800b, this.c, this.d);
    }

    @Override // com.google.android.finsky.utils.ap
    public final void a(VolleyError volleyError) {
        FinskyLog.c("Upload device configuration failed", new Object[0]);
        this.d.a(volleyError);
    }
}
