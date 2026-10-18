package com.google.android.finsky.activities;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.ContentFrame;
import com.google.android.finsky.layout.HeroGraphicView;
import com.google.android.finsky.layout.actionbar.FinskySearchToolbar;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.layout.play.PlayRecyclerView;

/* loaded from: classes.dex */
public final class ep extends bh {
    private HeroGraphicView ai;
    private er g = new er();
    private FinskyHeaderListLayout h;
    private com.google.android.finsky.layout.actionbar.a i;

    public static ep a(Document document, String str) {
        ep epVar = new ep();
        epVar.f(FinskyApp.a().j());
        epVar.a(FinskyApp.a().g, str);
        epVar.a("finsky.DetailsDataBasedFragment.document", document);
        return epVar;
    }

    @Override // com.google.android.finsky.activities.bh, com.google.android.finsky.e.w, com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        k();
    }

    @Override // com.google.android.finsky.activities.bh, com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ContentFrame contentFrame = (ContentFrame) super.a(layoutInflater, viewGroup, bundle);
        this.h = (FinskyHeaderListLayout) this.av;
        this.h.a(new eq(this, this.h.getContext()));
        this.h.setBackgroundViewForTouchPassthrough(this.ai);
        this.h.setShouldUseScrollLocking(false);
        this.i = new com.google.android.finsky.layout.actionbar.a(f().getWindow(), this.h);
        this.h.setOnLayoutChangedListener(this.i);
        this.i.b();
        return contentFrame;
    }

    @Override // com.google.android.finsky.activities.bh, com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        this.g.a(this.ap, this.aq, this.as, this.ar, this.ax, FinskyApp.a().a(FinskyApp.a().j()), this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final com.google.android.finsky.layout.bv a(ContentFrame contentFrame) {
        return new com.google.android.finsky.layout.bi(contentFrame, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final int w() {
        return R.layout.header_list_container;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.activities.bh
    public final void k_() {
        o_();
        this.at.p();
        er erVar = this.g;
        erVar.c = (PlayRecyclerView) this.av.findViewById(R.id.people_details_stream_list);
        if (erVar.c.getLayoutManager() == null) {
            erVar.c.setLayoutManager(new LinearLayoutManager());
        }
        if (erVar.c.getAdapter() == null) {
            erVar.c.setAdapter(new com.google.android.finsky.adapters.ab());
        }
        if (x()) {
            Document document = ((bh) this).f1612a;
            this.g.a(this.av, document);
            if (this.ai != null) {
                HeroGraphicView heroGraphicView = this.ai;
                com.google.android.play.image.e eVar = FinskyApp.a().d;
                com.google.android.finsky.protos.ds dsVar = document.b(15).get(0);
                if (dsVar == null) {
                    heroGraphicView.f2997a.setVisibility(8);
                    return;
                }
                heroGraphicView.setCorpusFillMode(1);
                heroGraphicView.setCorpusForFill(document.f1963a.g);
                heroGraphicView.f2997a.setVisibility(0);
                heroGraphicView.f2997a.a(dsVar.f, dsVar.l, eVar);
                heroGraphicView.a(dsVar, document);
                heroGraphicView.e = FinskySearchToolbar.a(heroGraphicView.getContext()) * 2;
                heroGraphicView.d = true;
            }
        }
    }

    @Override // com.google.android.finsky.e.q
    public final void o_() {
        this.ao.b_(((bh) this).f1612a.f1963a.i);
        this.ao.a(0, true);
        this.ao.s_();
    }

    @Override // com.google.android.finsky.activities.bh, com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d() {
        boolean z = false;
        er erVar = this.g;
        if (erVar.c != null && erVar.c.getVisibility() == 0 && erVar.f1725b != null) {
            erVar.f1725b.a(erVar.c, erVar.e);
        }
        erVar.c = null;
        if (erVar.f1725b != null) {
            erVar.f1725b.r();
            erVar.f1725b = null;
            erVar.d = false;
        }
        if (erVar.l != null && erVar.f1724a != null) {
            com.google.android.finsky.protos.gq L = erVar.l.L();
            if (L != null && L.f3876a) {
                z = true;
            }
            if (z) {
                com.google.android.finsky.utils.di.a(erVar.f1724a.o());
            }
        }
        erVar.m = null;
        if (this.h != null) {
            this.h.d();
        }
        if (this.i != null) {
            this.i.e();
            this.i = null;
        }
        super.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.activities.bh
    public final int l_() {
        return 4;
    }

    @Override // com.google.android.finsky.e.q, com.google.android.finsky.layout.actionbar.d
    public final void z() {
        this.i.a(true);
    }

    @Override // com.google.android.finsky.e.q, com.google.android.finsky.layout.actionbar.d
    public final void A() {
        this.i.a(false);
    }
}
