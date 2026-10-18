package com.google.android.finsky.utils;

import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class cc implements ap {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f4792a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.api.b f4793b;
    final /* synthetic */ am c;
    final /* synthetic */ cf d;

    cc(boolean z, com.google.android.finsky.api.b bVar, am amVar, cf cfVar) {
        this.f4792a = z;
        this.f4793b = bVar;
        this.c = amVar;
        this.d = cfVar;
    }

    @Override // com.google.android.finsky.utils.ap
    public final void a() {
        cb.b(this.f4792a, this.f4793b, this.c, this.d);
    }

    @Override // com.google.android.finsky.utils.ap
    public final void a(VolleyError volleyError) {
        FinskyLog.c("Upload device configuration failed - try selfupdate anyway", new Object[0]);
        cb.b(this.f4792a, this.f4793b, this.c, this.d);
    }
}
