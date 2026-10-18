package com.google.android.finsky.utils;

import com.deivid22srk.store.R;
import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class l implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.support.v4.app.aa f5051a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f5052b;

    l(android.support.v4.app.aa aaVar, m mVar) {
        this.f5051a = aaVar;
        this.f5052b = mVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        if (this.f5051a != null) {
            android.support.v4.app.aa aaVar = this.f5051a;
            com.google.android.finsky.activities.gn gnVar = new com.google.android.finsky.activities.gn();
            gnVar.a(R.string.uninstall_refund_fail_body).d(R.string.ok);
            gnVar.b().a(aaVar, "refund_failure");
        }
        if (this.f5052b != null) {
            this.f5052b.a(false);
        }
    }
}
