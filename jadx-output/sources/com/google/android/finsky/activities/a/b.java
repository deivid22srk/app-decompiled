package com.google.android.finsky.activities.a;

import android.accounts.Account;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.android.volley.VolleyError;
import com.android.volley.t;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.a.i;
import com.google.android.finsky.adapters.ab;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.api.n;
import com.google.android.finsky.billing.lightpurchase.LightPurchaseFlowActivity;
import com.google.android.finsky.e.q;
import com.google.android.finsky.layout.cx;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.layout.play.PlayRecyclerView;
import com.google.android.finsky.protos.ju;

/* loaded from: classes.dex */
public final class b extends q implements t<ju>, cx {

    /* renamed from: a, reason: collision with root package name */
    private final ai f1529a = i.a(16);

    /* renamed from: b, reason: collision with root package name */
    private n<?> f1530b;
    private ju c;
    private a d;
    private FinskyHeaderListLayout e;
    private PlayRecyclerView f;

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(ju juVar) {
        this.c = juVar;
        m_();
        FinskyApp.a().h().b(new com.google.android.finsky.a.b(1201).a(this.f1530b.n).f1473a);
    }

    public static b F_() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final int w() {
        return R.layout.header_list_container;
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        k();
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = super.a(layoutInflater, viewGroup, bundle);
        this.e = (FinskyHeaderListLayout) this.av;
        this.e.a(new c(this, this.e.getContext()));
        return a2;
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        this.f = (PlayRecyclerView) this.e.getCurrentListView();
        this.f.setLayoutManager(new LinearLayoutManager());
        this.f.setAdapter(new ab());
        if (!H()) {
            y();
            N();
        } else {
            u();
        }
        this.at.p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final void y() {
        this.f1530b = this.aq.i(this, this);
        FinskyApp.a().h().b(new com.google.android.finsky.a.b(1200).f1473a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final void u() {
        o_();
        if (this.d == null) {
            this.d = new a(g(), b(null), this.ar, this, this, this.c);
        }
        this.f.setAdapter(this.d);
    }

    @Override // com.google.android.finsky.e.q, com.android.volley.s
    public final void a(VolleyError volleyError) {
        super.a(volleyError);
        FinskyApp.a().h().b(new com.google.android.finsky.a.b(1201).a(this.f1530b.n).a(volleyError).f1473a);
        i();
    }

    @Override // com.google.android.finsky.layout.cx
    public final void a(Document document, String str) {
        i();
        com.google.android.finsky.navigationmanager.b bVar = this.as;
        Account b2 = this.aq.b();
        if (!bVar.k()) {
            return;
        }
        bVar.f3538a.startActivityForResult(LightPurchaseFlowActivity.a(b2, document, str, 1, null, document.f1963a.R, null, 1, null, false), 51);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final int E() {
        return 2;
    }

    private boolean H() {
        return this.c != null;
    }

    @Override // com.google.android.finsky.e.q
    public final void o_() {
        this.ao.b_(H() ? this.c.f4010a : null);
        this.ao.a(0, true);
        this.ao.s_();
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d() {
        if (this.e != null) {
            this.e.d();
        }
        this.d = null;
        this.e = null;
        this.f = null;
        super.d();
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.f1529a;
    }
}
