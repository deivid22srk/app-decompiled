package com.google.android.finsky.billing.switchfamilyinstrument;

import android.os.Bundle;
import com.android.volley.VolleyError;
import com.android.volley.s;
import com.android.volley.t;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.b;
import com.google.android.finsky.e.u;
import com.google.android.finsky.protos.hk;
import com.google.android.finsky.utils.aw;

/* loaded from: classes.dex */
public final class a extends u implements s, t<hk> {

    /* renamed from: a, reason: collision with root package name */
    String f2439a;

    /* renamed from: b, reason: collision with root package name */
    b f2440b;

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(hk hkVar) {
        hk hkVar2 = hkVar;
        if (hkVar2.f3912a == 1) {
            a(0, (Throwable) null);
            a(2, 0);
        } else {
            a(2, (Throwable) null);
            this.f2439a = hkVar2.c;
            a(3, 0);
        }
    }

    protected static a a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        a aVar = new a();
        aVar.f(bundle);
        return aVar;
    }

    @Override // com.google.android.finsky.e.u, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.f2440b = FinskyApp.a().b(this.r.getString("authAccount"));
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        a(1, volleyError);
        this.f2439a = aw.a(FinskyApp.a(), volleyError);
        a(3, 0);
    }

    private void a(int i, Throwable th) {
        com.google.android.finsky.a.b bVar = new com.google.android.finsky.a.b(346);
        if (i == 0) {
            bVar.a(true);
        } else {
            bVar.a(false).a(i).a(th);
        }
        FinskyApp.a().f(this.f2440b.c()).b(bVar.f1473a);
    }
}
