package com.google.android.finsky.activities.c;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.android.volley.s;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.adapters.CardRecyclerViewAdapter;
import com.google.android.finsky.adapters.ab;
import com.google.android.finsky.adapters.bc;
import com.google.android.finsky.api.model.d;
import com.google.android.finsky.api.model.i;
import com.google.android.finsky.api.model.x;
import com.google.android.finsky.e.q;
import com.google.android.finsky.g.h;
import com.google.android.finsky.layout.ContentFrame;
import com.google.android.finsky.layout.bi;
import com.google.android.finsky.layout.bv;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.layout.play.PlayRecyclerView;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.js;
import com.google.android.play.headerlist.PlayHeaderListLayout;

/* loaded from: classes.dex */
public final class a extends q {

    /* renamed from: a, reason: collision with root package name */
    private String f1639a;

    /* renamed from: b, reason: collision with root package name */
    private h f1640b;
    private PlayRecyclerView c;
    private bc d;
    private i e;
    private boolean f;
    private long h;
    private Bundle g = new Bundle();
    private ai i = com.google.android.finsky.a.i.a(5);

    public static a N_() {
        a aVar = new a();
        aVar.a("finsky.PageFragment.toc", FinskyApp.a().g);
        return aVar;
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        k();
        this.f1640b = FinskyApp.a().p;
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ContentFrame contentFrame = (ContentFrame) super.a(layoutInflater, viewGroup, bundle);
        FinskyHeaderListLayout finskyHeaderListLayout = (FinskyHeaderListLayout) this.av;
        finskyHeaderListLayout.a(new b(this, finskyHeaderListLayout.getContext()));
        return contentFrame;
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        this.f1639a = this.ap.getString(R.string.menu_wishlist);
        this.c = (PlayRecyclerView) this.av.findViewById(R.id.tab_recycler_view);
        this.c.setVisibility(0);
        this.c.setSaveEnabled(false);
        this.c.setLayoutManager(new LinearLayoutManager());
        this.c.setAdapter(new ab());
        o_();
        if (js.a(this.h)) {
            H();
            this.g.clear();
        }
        if (!(this.e == null ? false : this.e.a())) {
            y();
            N();
        } else {
            I();
        }
        this.at.p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final bv a(ContentFrame contentFrame) {
        return new bi(contentFrame, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final int w() {
        return R.layout.header_list_container;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final void y() {
        H();
        this.e = new i(this.aq, this.aq.a(0, "u-wl", 7, this.f1640b.a(FinskyApp.a().i()).i("u-wl")), true);
        this.e.a((x) this);
        this.e.a((s) this);
        this.e.q();
        this.h = System.currentTimeMillis();
    }

    private void H() {
        if (this.e != null) {
            this.e.b((x) this);
            this.e.b((s) this);
            this.e = null;
        }
    }

    @Override // com.google.android.finsky.e.q, com.google.android.finsky.api.model.x
    public final void m_() {
        super.m_();
        I();
    }

    @Override // com.google.android.finsky.e.q
    public final void o_() {
        this.ao.b_(this.f1639a);
        this.ao.a(0, true);
        this.ao.s_();
    }

    private void I() {
        if (this.c == null) {
            FinskyLog.c("Recycler view null, ignoring.", new Object[0]);
            return;
        }
        boolean a2 = CardRecyclerViewAdapter.a(this.g);
        if (this.d == null) {
            com.google.android.finsky.a.i.a(this.i, ((d) this.e).f1970a.f1963a.R);
            this.d = new bc(this.ap, this.aq, this.as, this.ar, this.ax, FinskyApp.a().a(FinskyApp.a().j()), new com.google.android.finsky.api.model.s(this.e), this, a2);
            js.a(this.d);
        }
        if (!this.f) {
            this.f = true;
            this.c.setAdapter(this.d);
            if (a2) {
                this.d.b(this.c, this.g);
                this.g.clear();
            }
            this.c.setEmptyView(this.av.findViewById(R.id.no_results_view));
            return;
        }
        this.d.a((bc) this.e);
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d() {
        if (this.c != null && this.c.getVisibility() == 0 && this.d != null) {
            this.d.a(this.c, this.g);
        }
        this.c = null;
        if (this.d != null) {
            this.d.r();
            js.b(this.d);
            this.d = null;
            this.f = false;
        }
        if (this.av instanceof PlayHeaderListLayout) {
            ((PlayHeaderListLayout) this.av).d();
        }
        super.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final int E() {
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final void u() {
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.i;
    }
}
