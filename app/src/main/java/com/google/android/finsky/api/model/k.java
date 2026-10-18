package com.google.android.finsky.api.model;

import com.android.volley.VolleyError;
import com.google.android.finsky.protos.nz;

/* loaded from: classes.dex */
public final class k extends j implements com.android.volley.t<nz> {

    /* renamed from: a, reason: collision with root package name */
    private boolean f1980a;

    public k(com.google.android.finsky.api.b bVar, String str, String str2, int i) {
        bVar.a(str, str2, i, this, this);
    }

    @Override // com.google.android.finsky.api.model.j
    public final boolean a() {
        return this.f1980a;
    }

    @Override // com.google.android.finsky.api.model.j, com.android.volley.s
    public final void a(VolleyError volleyError) {
        this.f1980a = true;
        super.a(volleyError);
        k();
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(nz nzVar) {
        this.f1980a = true;
        l();
        k();
    }
}
