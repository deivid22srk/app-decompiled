package com.google.android.finsky.billing.lightpurchase.a;

import android.os.Bundle;
import com.android.vending.R;
import com.android.volley.VolleyError;
import com.android.volley.s;
import com.android.volley.t;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.api.model.x;
import com.google.android.finsky.e.u;
import com.google.android.finsky.protos.cn;
import com.google.android.finsky.protos.dk;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.aw;

/* loaded from: classes.dex */
public final class i extends u implements s, t<dk>, x {

    /* renamed from: a, reason: collision with root package name */
    com.google.android.finsky.api.b f2294a;

    /* renamed from: b, reason: collision with root package name */
    cn f2295b;
    String c;
    com.google.android.finsky.api.model.h d;
    private com.google.android.finsky.a.i e;

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(dk dkVar) {
        dk dkVar2 = dkVar;
        this.f2295b = dkVar2.f3732a;
        if (this.f2295b == null) {
            if (dkVar2.f3733b) {
                a(-1, (String) null);
                a(2, 0);
                return;
            }
            throw new IllegalStateException("Received no challenge.");
        }
        if (this.f2295b.d != null) {
            a(2, (String) null);
            a(5, 0);
        } else if (this.f2295b.e != null) {
            a(3, (String) null);
            a(6, 0);
        } else {
            if (this.f2295b.m != null) {
                a(4, (String) null);
                a(3, 1);
                return;
            }
            throw new IllegalStateException("Received unknown challenge.");
        }
    }

    @Override // com.google.android.finsky.e.u, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        this.f2294a = FinskyApp.a().b(this.r.getString("authAccount"));
        this.e = FinskyApp.a().c(this.f2294a.b());
        super.a(bundle);
    }

    private void a(int i, String str) {
        com.google.android.finsky.a.b c = new com.google.android.finsky.a.b(518).c(str);
        if (i != -1) {
            c.a(i);
        }
        this.e.b(c.f1473a);
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        Document b2 = this.d.b();
        if (b2 == null) {
            this.c = f_(R.string.item_unavailable_message);
            a(3, 0);
        } else if (b2.f1963a.T) {
            a(4, 0);
        } else {
            a(7, 0);
        }
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.c("Volley error received: %s", volleyError);
        a(1, volleyError.getClass().getSimpleName());
        this.c = aw.a(FinskyApp.a(), volleyError);
        a(3, 0);
    }
}
