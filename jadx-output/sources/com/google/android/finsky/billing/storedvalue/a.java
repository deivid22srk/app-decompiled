package com.google.android.finsky.billing.storedvalue;

import android.os.Bundle;
import com.android.volley.VolleyError;
import com.android.volley.s;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.d;
import com.google.android.finsky.api.model.i;
import com.google.android.finsky.api.model.x;
import com.google.android.finsky.e.u;

/* loaded from: classes.dex */
public final class a extends u implements s, x {

    /* renamed from: a, reason: collision with root package name */
    i f2437a;

    /* renamed from: b, reason: collision with root package name */
    VolleyError f2438b;

    @Override // com.google.android.finsky.e.u, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.f2437a = new i(FinskyApp.a().b(this.r.getString("authAccount")), this.r.getString("list_url"), false);
        this.f2437a.a((x) this);
        this.f2437a.a((s) this);
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        if (((d) this.f2437a).f1970a != null && ((d) this.f2437a).f1970a.a() > 0) {
            a(2, 0);
        } else {
            a(3, 1);
        }
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        this.f2438b = volleyError;
        a(3, 0);
    }

    static /* synthetic */ a a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("list_url", str2);
        bundle.putString("authAccount", str);
        a aVar = new a();
        aVar.f(bundle);
        return aVar;
    }
}
