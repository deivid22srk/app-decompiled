package com.google.android.finsky.activities;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.PlayRecyclerView;
import com.google.android.finsky.protos.ny;

/* loaded from: classes.dex */
public final class fk extends com.google.android.finsky.epkg.q implements fe, fj, fp, com.google.android.finsky.adapters.au, com.google.android.finsky.adapters.aw {

    /* renamed from: a, reason: collision with root package name */
    protected Document f1744a;
    private PlayRecyclerView ai;
    private com.google.android.finsky.adapters.aq aj;

    /* renamed from: b, reason: collision with root package name */
    protected com.google.android.finsky.api.model.h f1745b;
    private com.google.android.finsky.apkg.ai c = com.google.android.finsky.apkg.i.a(302);
    private com.google.android.finsky.api.model.l d;
    private String e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;

    public static fk a(Document document, String str, boolean z) {
        fk fkVar = new fk();
        fkVar.a("finsky.PageFragment.toc", FinskyApp.a().g);
        fkVar.a("finsky.ReviewsFragment.document", document);
        if (str == null) {
            str = document.f1963a.H;
        }
        fkVar.b("finsky.ReviewsFragment.reviewsUrl", str);
        fkVar.b("finsky.ReviewsFragment.isRottenTomatoesReviews", z);
        return fkVar;
    }

    @Override // com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.f1744a = (Document) this.r.getParcelable("finsky.ReviewsFragment.document");
        this.e = this.r.getString("finsky.ReviewsFragment.reviewsUrl");
        this.f = this.r.getBoolean("finsky.ReviewsFragment.isRottenTomatoesReviews");
        k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final int w() {
        return R.layout.generic_reviews;
    }

    @Override // com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        int i = this.f ? -1 : 4;
        this.f1745b = new com.google.android.finsky.api.model.h(this.aq, this.f1744a.f1963a.D);
        if (this.d == null) {
            this.d = new com.google.android.finsky.api.model.l(this.aq, this.e, this.f1744a.d(), true);
            this.d.a((com.google.android.finsky.api.model.x) this);
            this.d.a((com.android.volley.s) this);
            this.d.d = i;
        }
        this.d.a(this.h, this.i);
        this.aj = new com.google.android.finsky.adapters.aq(f(), this.f1744a, this.d, this.f, this.ax, this, this, this.as, this.ar, this, this);
        this.ai.setAdapter(this.aj);
        if (!H()) {
            N();
            this.d.q();
        }
    }

    @Override // com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = super.a(layoutInflater, viewGroup, bundle);
        this.ai = (PlayRecyclerView) this.av.findViewById(R.id.all_reviews_list);
        PlayRecyclerView playRecyclerView = this.ai;
        this.ai.getContext();
        playRecyclerView.setLayoutManager(new LinearLayoutManager());
        if (H()) {
            m_();
        }
        this.g = false;
        return a2;
    }

    private boolean H() {
        return this.d != null && this.d.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final void u() {
        o_();
    }

    @Override // com.google.android.finsky.epkg.q
    public final void o_() {
        this.ao.a(this.f1744a.f1963a.g, false);
        this.ao.b_(this.f1744a.f1963a.i);
        this.ao.s_();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final void y() {
        this.d.q();
    }

    @Override // com.google.android.finsky.epkg.q, com.google.android.finsky.api.model.x
    public final void m_() {
        com.google.android.finsky.apkg.i.a(this.c, this.f1744a.f1963a.R);
        this.d.b((com.google.android.finsky.api.model.x) this);
        this.d.b((com.android.volley.s) this);
        this.d.g = null;
        if (this.ai != null) {
            this.ai.setEmptyView(this.av.findViewById(R.id.no_results_view));
        }
        super.m_();
    }

    @Override // com.google.android.finsky.epkg.q, com.android.volley.s
    public final void a(VolleyError volleyError) {
        super.a(volleyError);
        if (this.ai != null && this.aj != null) {
            this.aj.u();
        }
    }

    @Override // com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final void d() {
        if (this.d != null) {
            this.d.b((com.google.android.finsky.api.model.x) this);
            this.d.b((com.android.volley.s) this);
        }
        if (this.aj != null) {
            com.google.android.finsky.adapters.aq aqVar = this.aj;
            aqVar.d.b((com.google.android.finsky.api.model.x) aqVar);
            aqVar.d.b((com.android.volley.s) aqVar);
        }
        this.aj = null;
        this.ai = null;
        this.g = true;
        super.d();
    }

    @Override // com.google.android.finsky.activities.fj
    public final void a(boolean z, boolean z2) {
        this.h = z;
        this.i = z2;
        this.d.a(z, z2);
        this.d.b();
    }

    @Override // com.google.android.finsky.activities.fp
    public final void b(int i) {
        this.d.d = i;
        this.d.b();
    }

    @Override // com.google.android.finsky.adapters.au
    public final void B_() {
        if (this.d == null) {
            return;
        }
        android.support.v4.app.ad adVar = this.B;
        if (adVar.a("filter_options_dialog") == null) {
            fg a2 = fg.a(this.d.f1981a, this.d.f1982b);
            a2.a(this, 0);
            a2.a(adVar, "filter_options_dialog");
        }
    }

    @Override // com.google.android.finsky.adapters.au
    public final void C_() {
        if (this.d == null) {
            return;
        }
        android.support.v4.app.ad adVar = this.B;
        if (adVar.a("sorting_dialog") == null) {
            fn a2 = fn.a(this.d);
            a2.a(this, 0);
            a2.a(adVar, "sorting_dialog");
        }
    }

    @Override // com.google.android.finsky.activities.fe
    public final void a(String str, String str2, ff ffVar) {
        android.support.v4.app.t f = f();
        if (f != null) {
            f.setResult(-1);
        }
        boolean o = ReviewsActivity.o();
        boolean c = FinskyApp.a().a(FinskyApp.a().j()).c(str, str2, ffVar);
        if (!o || !c) {
            com.google.android.finsky.api.model.k kVar = new com.google.android.finsky.api.model.k(FinskyApp.a().b((String) null), str, str2, ffVar.d);
            kVar.a(new fl(this, o, ffVar));
            if (!o) {
                kVar.a(new fm(this));
            }
        }
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final com.google.android.finsky.apkg.ai getPlayStoreUiElement() {
        return this.c;
    }

    @Override // com.google.android.finsky.adapters.aw
    public final void a(ny nyVar) {
        android.support.v4.app.ad adVar = this.B;
        if (adVar.a("rate_review_dialog") == null) {
            fb a2 = fb.a(this.f1744a.f1963a.f3890a, nyVar);
            a2.a(this, 0);
            a2.a(adVar, "rate_review_dialog");
        }
    }

    static /* synthetic */ void b(fk fkVar) {
        FinskyApp.a().b((String) null).a(fkVar.e, fkVar.d.f1982b, fkVar.d.c(), fkVar.d.c, fkVar.d.d);
        fkVar.d.e();
        fkVar.N();
        fkVar.d.a((com.google.android.finsky.api.model.x) fkVar);
        fkVar.d.a((com.android.volley.s) fkVar);
        fkVar.d.q();
    }
}
