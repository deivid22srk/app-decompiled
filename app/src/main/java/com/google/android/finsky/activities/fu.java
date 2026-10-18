package com.google.android.finsky.activities;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.transition.Fade;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.adapters.CardRecyclerViewAdapter;
import com.google.android.finsky.layout.ContentFrame;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.layout.play.PlayRecyclerView;
import com.google.android.finsky.navigationmanager.NavigationState;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ik;
import com.google.android.play.headerlist.PlayHeaderListLayout;

/* loaded from: classes.dex */
public final class fu extends com.google.android.finsky.epkg.q {

    /* renamed from: a, reason: collision with root package name */
    private com.google.android.finsky.api.model.m f1751a;
    private boolean ai;
    private boolean aj;
    private Button ak;
    private com.google.android.finsky.layout.play.cy al;

    /* renamed from: b, reason: collision with root package name */
    private PlayRecyclerView f1752b;
    private CardRecyclerViewAdapter c;
    private com.google.android.finsky.utils.ac d;
    private String e;
    private String f;
    private int g;
    private boolean i;
    private boolean h = false;
    private Bundle am = new Bundle();
    private com.google.android.finsky.apkg.ai an = com.google.android.finsky.apkg.i.a(3);

    public static fu a(String str, String str2, int i) {
        fu fuVar = new fu();
        fuVar.a("finsky.PageFragment.toc", FinskyApp.a().g);
        fuVar.b("SearchFragment.searchUrl", str2);
        if (str == null) {
            str = "";
        }
        fuVar.b("SearchFragment.query", str);
        if (i < 0) {
            i = 0;
        }
        fuVar.r.putInt("SearchFragment.backendId", i);
        return fuVar;
    }

    @Override // com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.d = FinskyApp.a().a(FinskyApp.a().j());
        this.aj = this.d.e;
        this.e = this.r.getString("SearchFragment.query");
        this.f = a(this.r.getString("SearchFragment.searchUrl"));
        this.g = this.r.getInt("SearchFragment.backendId");
        com.google.android.finsky.utils.a.a(f(), (Runnable) null);
        k();
    }

    @Override // com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ContentFrame contentFrame = (ContentFrame) super.a(layoutInflater, viewGroup, bundle);
        FinskyHeaderListLayout finskyHeaderListLayout = (FinskyHeaderListLayout) this.av;
        finskyHeaderListLayout.a(new fv(this, finskyHeaderListLayout.getContext()));
        return contentFrame;
    }

    @Override // com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        if (this.f1751a != null && this.f1751a.f()) {
            this.ao.a(this.f1751a.c(), true);
        }
        this.f1752b = (PlayRecyclerView) this.av.findViewById(R.id.search_results_list);
        this.f1752b.setVisibility(0);
        this.f1752b.setSaveEnabled(false);
        this.f1752b.setLayoutManager(new LinearLayoutManager());
        o_();
        TextView textView = (TextView) this.av.findViewById(R.id.no_results_textview);
        if (this.aj) {
            textView.setText(g().getString(R.string.no_family_safe_results_for_query, this.e));
        } else {
            textView.setText(g().getString(R.string.no_results_for_query, this.e));
        }
        if (!I()) {
            N();
            y();
            o_();
        } else {
            H();
        }
        this.at.p();
        this.ak = (Button) this.av.findViewById(R.id.clear_family_search_filter);
        this.ak.setOnClickListener(new fw(this));
        if (this.aj) {
            this.d.e = this.aj;
        }
        if (this.ak != null) {
            if (this.aj) {
                this.ak.setVisibility(0);
                if (this.al == null) {
                    this.al = new com.google.android.finsky.layout.play.ad(298, this);
                    FinskyApp.a().h().a(0L, this.al);
                    return;
                }
                return;
            }
            this.ak.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final com.google.android.finsky.layout.bv a(ContentFrame contentFrame) {
        return new com.google.android.finsky.layout.bi(contentFrame, this);
    }

    private void H() {
        byte[] bArr;
        if (this.f1752b == null) {
            FinskyLog.c("RecyclerView null, ignoring.", new Object[0]);
            return;
        }
        if (I()) {
            boolean a2 = com.google.android.finsky.adapters.ax.a(this.am);
            if (this.c == null) {
                com.google.android.finsky.apkg.i.a(this.an, this.f1751a.n());
                if (((com.google.android.finsky.api.model.d) this.f1751a).f1970a == null) {
                    bArr = null;
                } else {
                    bArr = ((com.google.android.finsky.api.model.d) this.f1751a).f1970a.f1963a.R;
                }
                com.google.android.finsky.layout.play.ad adVar = new com.google.android.finsky.layout.play.ad(408, bArr, this);
                a(adVar);
                com.google.android.finsky.navigationmanager.b bVar = this.as;
                boolean m = this.f1751a.m();
                if (!bVar.c.isEmpty()) {
                    NavigationState peek = bVar.c.peek();
                    if (peek.f3536a == 7) {
                        peek.e = m;
                    }
                }
                this.c = new com.google.android.finsky.adapters.ax(this.ap, this.aq, this.as, this.ar, this.ax, FinskyApp.a().a(FinskyApp.a().j()), new com.google.android.finsky.api.model.s(this.f1751a), a2, this.aj, adVar);
            }
            if (!this.i) {
                this.i = true;
                this.f1752b.setAdapter(this.c);
                if (a2) {
                    this.c.b(this.f1752b, this.am);
                    this.am.clear();
                }
                this.f1752b.setEmptyView(this.av.findViewById(R.id.no_results_view));
                return;
            }
            this.c.a((CardRecyclerViewAdapter) this.f1751a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final int w() {
        return R.layout.header_list_container;
    }

    @Override // com.google.android.finsky.epkg.q, com.google.android.finsky.api.model.x
    public final void m_() {
        int i = R.string.no_results_for_query;
        if (this.f1751a.a() && ((com.google.android.finsky.api.model.d) this.f1751a).f1970a == null) {
            if (!this.h) {
                String a2 = a(com.google.android.finsky.api.s.a(this.e, 0));
                if (!a2.equals(this.f)) {
                    int c = this.f1751a.c();
                    Resources g = g();
                    switch (c) {
                        case 1:
                            i = R.string.no_results_for_query_books;
                            break;
                        case 2:
                            i = R.string.no_results_for_query_music;
                            break;
                        case 3:
                            i = R.string.no_results_for_query_apps;
                            break;
                        case 4:
                            i = R.string.no_results_for_query_movies;
                            break;
                        case 6:
                            i = R.string.no_results_for_query_newsstand;
                            break;
                    }
                    ik.a(this.ap, g.getString(i, this.e), this.f1752b);
                    this.h = true;
                    this.f = a2;
                    this.f1751a.b((com.google.android.finsky.api.model.x) this);
                    this.f1751a.b((com.android.volley.s) this);
                    this.f1751a = null;
                    this.ai = false;
                    y();
                    return;
                }
            }
            ik.a(this.ap, g().getString(R.string.no_results_for_query, this.e), this.f1752b);
        }
        FinskyApp.a().h().a(523, (byte[]) null);
        if (this.f1751a.a()) {
            super.m_();
        }
    }

    @Override // com.google.android.finsky.epkg.q, com.android.volley.s
    public final void a(VolleyError volleyError) {
        com.google.android.finsky.search.g.a(523, volleyError);
        super.a(volleyError);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final void u() {
        H();
        o_();
    }

    @Override // com.google.android.finsky.epkg.q
    public final void o_() {
        com.google.android.finsky.layout.actionbar.e o = ((MainActivity) this.ao).o();
        int c = (this.f1751a == null || !this.f1751a.f()) ? this.g : this.f1751a.c();
        if (c == 3 && this.e.startsWith("pub:")) {
            this.ao.b_(this.ap.getResources().getString(R.string.apps_by, this.e.replaceFirst("pub:", "")));
        } else {
            Resources g = g();
            this.ao.b_(g.getString(g.getBoolean(R.bool.use_wide_layout) ? R.string.search_result_title_long : R.string.search_result_title, this.e));
        }
        this.ao.a(c, true);
        this.ao.b(2);
        o.b(this.e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final void y() {
        if (this.f1751a == null) {
            this.f1751a = new com.google.android.finsky.api.model.m(this.aq, this.e, this.f);
            this.f1751a.a((com.google.android.finsky.api.model.x) this);
            this.f1751a.a((com.android.volley.s) this);
            if (!this.ai) {
                com.google.android.finsky.apkg.af e = com.google.android.finsky.apkg.i.e();
                if (this.e != null) {
                    e.f1447a = this.e;
                    e.f1448b = true;
                }
                if (this.f != null) {
                    e.c = this.f;
                    e.d = true;
                }
                com.google.android.finsky.apkg.i h = FinskyApp.a().h();
                if (com.google.android.finsky.apkg.i.a()) {
                    com.google.android.finsky.apkg.i.a(e);
                }
                com.google.android.finsky.apkg.ad b2 = h.f1485a.b();
                b2.d = e;
                h.a("5", b2);
                this.ai = true;
            }
        }
        this.f1751a.q();
    }

    @Override // com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final void d() {
        if (this.c != null && this.f1752b != null && this.f1752b.getVisibility() == 0) {
            this.c.a(this.f1752b, this.am);
        }
        if (this.f1752b != null) {
            this.f1752b.setRecyclerListener(null);
        }
        this.f1752b = null;
        if (this.c != null) {
            this.c.r();
            this.c = null;
        }
        this.i = false;
        this.ak = null;
        ((MainActivity) this.ao).o().b("");
        if (this.av instanceof PlayHeaderListLayout) {
            ((PlayHeaderListLayout) this.av).d();
        }
        super.d();
    }

    private boolean I() {
        return this.f1751a != null && this.f1751a.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    @TargetApi(22)
    public final Transition v() {
        return new Fade();
    }

    @Override // com.google.android.finsky.epkg.q
    public final int B() {
        return g().getColor(R.color.play_transparent);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final com.google.android.finsky.apkg.ai getPlayStoreUiElement() {
        return this.an;
    }

    @Override // com.google.android.finsky.epkg.q, com.google.android.finsky.layout.actionbar.d
    public final void z() {
    }

    @Override // com.google.android.finsky.epkg.q, com.google.android.finsky.layout.actionbar.d
    public final void A() {
    }

    private String a(String str) {
        if (this.aj) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter("fss", Boolean.toString(this.aj));
            return buildUpon.build().toString();
        }
        return str;
    }
}
