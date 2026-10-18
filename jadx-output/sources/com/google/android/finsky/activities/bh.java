package com.google.android.finsky.activities;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.Cdo;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jr;

/* loaded from: classes.dex */
public abstract class bh extends com.google.android.finsky.e.w {

    /* renamed from: a, reason: collision with root package name */
    public Document f1612a;

    /* renamed from: b, reason: collision with root package name */
    public com.google.android.finsky.api.model.h f1613b;
    public boolean f;
    private com.google.android.finsky.utils.dq g;
    private long h;
    protected Bundle c = new Bundle();
    private com.google.android.finsky.a.ai i = com.google.android.finsky.a.i.a(l_());
    protected com.google.android.finsky.layout.play.ad e = null;
    private boolean ai = false;
    public final com.google.android.finsky.g.h d = FinskyApp.a().p;

    public abstract void k_();

    public abstract int l_();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final void u() {
        com.google.android.finsky.a.i.a(this.i, this.f1613b.c());
        if (this.f1612a != null) {
            if (this.e == null) {
                this.e = new com.google.android.finsky.layout.play.ad(209, this);
            }
            this.e.a(this.f1612a.f1963a.R);
            if (x() && !this.ai) {
                a(this.e);
                this.ai = true;
            }
        }
        k_();
        FinskyLog.a("Page [class=%s] loaded in [%s ms] (hasDetailsDataLoaded? %b)", getClass().getSimpleName(), Long.valueOf(System.currentTimeMillis() - this.h), Boolean.valueOf(x()));
    }

    public final boolean x() {
        return this.f1613b != null && this.f1613b.a();
    }

    @Override // com.google.android.finsky.e.w, com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        this.h = System.currentTimeMillis();
        this.f1612a = (Document) this.r.getParcelable("finsky.DetailsDataBasedFragment.document");
        super.a(bundle);
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = super.a(layoutInflater, viewGroup, bundle);
        this.f = viewGroup.getResources().getBoolean(R.bool.use_wide_layout);
        return a2;
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public void d(Bundle bundle) {
        com.google.android.finsky.utils.dq drVar;
        byte b2 = 0;
        super.d(bundle);
        boolean hasSystemFeature = f().getPackageManager().hasSystemFeature("android.hardware.nfc");
        if (hasSystemFeature && Build.VERSION.SDK_INT >= 14) {
            drVar = new com.google.android.finsky.utils.dp(this, b2);
        } else if (hasSystemFeature && Build.VERSION.SDK_INT >= 10) {
            drVar = new Cdo(this, b2);
        } else {
            drVar = new com.google.android.finsky.utils.dr((byte) 0);
        }
        this.g = drVar;
        if (bundle != null) {
            this.c = bundle;
        }
        M();
        o_();
        if (this.f1613b == null) {
            y();
        } else {
            this.f1613b.a((com.google.android.finsky.api.model.x) this);
            this.f1613b.a((com.android.volley.s) this);
        }
        m_();
    }

    @Override // android.support.v4.app.Fragment
    public final void p() {
        super.p();
        com.google.android.finsky.j.b.a(this.as);
        this.g.b();
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void o() {
        super.o();
        this.g.c();
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        if (this.c != null) {
            bundle.putAll(this.c);
        }
        super.e(bundle);
    }

    @Override // com.google.android.finsky.e.q
    public void y() {
        if (this.f1613b != null) {
            this.f1613b.b((com.google.android.finsky.api.model.x) this);
            this.f1613b.b((com.android.volley.s) this);
        }
        this.f1613b = new com.google.android.finsky.api.model.h(this.aq, this.aA, false, jr.b(FinskyApp.a().p.a(this.aq.b())));
        this.f1613b.a((com.google.android.finsky.api.model.x) this);
        this.f1613b.a((com.android.volley.s) this);
    }

    @Override // com.google.android.finsky.e.q, com.google.android.finsky.api.model.x
    public final void m_() {
        if (q_()) {
            if (this.f1612a != null) {
                if (x()) {
                    if (this.f1613b.b() == null) {
                        this.ao.a(null, this.ap.getString(R.string.details_page_error), true);
                    } else {
                        this.f1612a = this.f1613b.b();
                        int i = Integer.MIN_VALUE;
                        if (this.f1612a.f1963a.g == 2) {
                            i = 3;
                        }
                        f().setVolumeControlStream(i);
                    }
                }
                this.g.d();
                super.m_();
            }
        }
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public void d() {
        if (this.f1613b != null) {
            this.f1613b.b((com.google.android.finsky.api.model.x) this);
            this.f1613b.b((com.android.volley.s) this);
            if (this instanceof com.google.android.finsky.detailspage.w) {
                this.f1613b = null;
            }
        }
        super.d();
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.i;
    }
}
