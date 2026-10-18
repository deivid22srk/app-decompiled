package com.google.android.finsky.activities;

import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class cu implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cr f1668a;

    cu(cr crVar) {
        this.f1668a = crVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        com.google.android.finsky.epkg.t tVar;
        com.google.android.finsky.epkg.t tVar2;
        String a2 = com.google.android.finsky.utils.aw.a(this.f1668a.f(), volleyError);
        if (a2 != null) {
            tVar2 = this.f1668a.ao;
            tVar2.a(null, a2, true);
        } else {
            tVar = this.f1668a.ao;
            tVar.j();
        }
    }
}
