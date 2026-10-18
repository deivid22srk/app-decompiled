package com.google.android.finsky.download.inlineappinstaller;

import android.accounts.Account;
import android.os.Bundle;
import com.android.vending.R;
import com.android.volley.VolleyError;
import com.android.volley.s;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.api.model.h;
import com.google.android.finsky.api.model.x;
import com.google.android.finsky.e.u;
import com.google.android.finsky.installer.p;
import com.google.android.finsky.protos.gx;
import com.google.android.finsky.receivers.f;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.cr;
import com.google.android.finsky.utils.cy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends u implements s, x, p {

    /* renamed from: a, reason: collision with root package name */
    public Document f2714a;

    /* renamed from: b, reason: collision with root package name */
    String f2715b;
    public int c = -1;
    public final List<d> d = new ArrayList();
    private h e;
    private String f;

    @Override // com.google.android.finsky.e.u, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        Bundle bundle2 = this.r;
        this.f = bundle2.getString("authAccount");
        this.e = new h(FinskyApp.a().b(this.f), com.google.android.finsky.api.s.a(cr.a(((gx) ParcelableProto.a(bundle2, "InlineConsumptionAppInstallerSidecar.mediaDoc")).g)));
        this.e.a((x) this);
        this.e.a((s) this);
    }

    public final void u() {
        Account a2 = cy.a(this.f2714a, FinskyApp.a().p, new Account(this.f, "com.google"));
        f fVar = FinskyApp.a().k;
        fVar.a(this.f2714a.f1963a.c, this.f2714a.d(), a2.name, this.f2714a.f1963a.i, false, "content_dependency", 1, this.f2714a.t());
        fVar.a(this);
        a(7, 0);
    }

    public final void a(String str) {
        this.f2715b = str;
        a(3, 0);
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        this.f2714a = this.e.b();
        if (this.f2714a == null) {
            a(f_(R.string.generic_get_app_error));
        } else {
            a(5, 0);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void g_() {
        super.g_();
        this.e.a((x) this);
        this.e.a((s) this);
    }

    @Override // android.support.v4.app.Fragment
    public final void h_() {
        this.e.b((x) this);
        this.e.b((s) this);
        super.h_();
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        a(f_(R.string.generic_get_app_error));
    }

    @Override // com.google.android.finsky.installer.p
    public final void a(String str, int i, int i2) {
        if (str != null && str.equals(this.f2714a.f1963a.c)) {
            this.c = i;
            Iterator<d> it = this.d.iterator();
            while (it.hasNext()) {
                it.next().c_(i);
            }
        }
    }
}
