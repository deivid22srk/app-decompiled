package com.google.android.finsky.activities;

import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.pv;
import com.google.android.finsky.protos.pw;
import com.google.android.finsky.utils.hi;
import com.google.android.finsky.utils.hn;

/* loaded from: classes.dex */
final class v implements com.google.android.finsky.utils.cl {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean[] f1874a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f1875b;
    final /* synthetic */ boolean c;
    final /* synthetic */ d d;

    v(d dVar, boolean[] zArr, String str, boolean z) {
        this.d = dVar;
        this.f1874a = zArr;
        this.f1875b = str;
        this.c = z;
    }

    @Override // com.google.android.finsky.utils.cl
    public final void a(pw pwVar) {
        if (this.f1874a[0]) {
            new com.google.android.finsky.utils.n(this.d.getApplicationContext()).a(new w(this), 10000);
            return;
        }
        this.f1874a[0] = true;
        FinskyApp.a().a(d.a(pwVar));
        hn hnVar = FinskyApp.a().m;
        int i = -1;
        if (pwVar.t != null) {
            pv pvVar = pwVar.t;
            if (pvVar.f4272b) {
                i = pvVar.f4271a;
            }
        }
        hnVar.a(i, this.f1875b);
        if (pwVar.w != null) {
            com.google.android.finsky.billing.al.a(FinskyApp.a().j(), pwVar.w);
        }
        hi.a(new x(this.d, this.c));
    }

    @Override // com.google.android.finsky.utils.cl
    public final void a(VolleyError volleyError) {
        this.d.x_();
        this.d.a(volleyError);
    }
}
