package com.google.android.finsky.activities;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.layout.play.PlayRecyclerView;

/* loaded from: classes.dex */
public final class av implements hc {

    /* renamed from: a, reason: collision with root package name */
    private final LayoutInflater f1558a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f1559b;
    private final com.google.android.finsky.navigationmanager.b c;
    private final DfeToc d;
    private final com.google.android.play.image.e e;
    private final com.google.android.finsky.protos.ax[] f;
    private final com.google.android.finsky.protos.ba[] g;
    private final String h;
    private final String i;
    private final int j;
    private final String k;
    private boolean l;
    private android.support.v7.widget.dt m;
    private ViewGroup n;
    private PlayRecyclerView o;
    private com.google.android.finsky.utils.dx p = com.google.android.finsky.utils.dx.f4838a;
    private com.google.android.finsky.layout.play.de q;
    private final int r;

    public av(Context context, com.google.android.finsky.navigationmanager.b bVar, com.google.android.play.image.e eVar, LayoutInflater layoutInflater, gs gsVar, DfeToc dfeToc, int i) {
        this.f1559b = context;
        this.c = bVar;
        this.e = eVar;
        this.f1558a = layoutInflater;
        this.d = dfeToc;
        com.google.android.finsky.protos.az azVar = gsVar.f1780a;
        this.h = azVar.f3617a;
        this.i = azVar.k;
        this.j = azVar.o;
        this.k = azVar.m;
        this.f = azVar.j;
        this.g = azVar.e;
        this.q = gsVar.f;
        this.r = i;
    }

    @Override // com.google.android.finsky.activities.hc
    public final View a() {
        com.google.android.finsky.utils.dx dxVar;
        if (this.n == null) {
            this.n = (ViewGroup) this.f1558a.inflate(R.layout.category_tab, (ViewGroup) null);
            this.o = (PlayRecyclerView) this.n.findViewById(R.id.tab_recycler_view);
            this.o.setVisibility(0);
            com.google.android.finsky.adapters.s sVar = new com.google.android.finsky.adapters.s(this.f1559b, this.f, this.c, this.j, this.d, this.e, this.g, this.i, this.k, this.r, this.q);
            this.m = sVar;
            if (this.p.a("CategoryTab.AdapterInstanceState") && (dxVar = (com.google.android.finsky.utils.dx) this.p.b("CategoryTab.AdapterInstanceState")) != null) {
                sVar.k = (Bundle) dxVar.b("CategoryAdapterV2.QuickLinksViewState");
            }
            android.support.v7.widget.ci ciVar = new android.support.v7.widget.ci();
            this.o.setLayoutManager(ciVar);
            ciVar.g = new aw(this, sVar);
            this.o.a(new ax(sVar));
            this.o.a(new com.google.android.finsky.adapters.c(this.f1559b));
            this.o.setAdapter(this.m);
            if (this.p.a("CategoryTab.RecyclerViewState")) {
                this.o.a((Parcelable) this.p.b("CategoryTab.RecyclerViewState"));
            }
        }
        return this.n;
    }

    @Override // com.google.android.finsky.activities.hc
    public final void b() {
    }

    @Override // com.google.android.finsky.activities.hc
    public final void a(boolean z) {
        if (z != this.l) {
            if (z) {
                com.google.android.finsky.a.i.c(this.q);
                this.q.a(true);
                if (this.q.getPlayStoreUiElement().f.length == 0) {
                    com.google.android.finsky.a.i.a(this.n);
                }
            } else {
                this.q.a(false);
            }
            this.l = z;
        }
    }

    @Override // com.google.android.finsky.activities.hc
    public final com.google.android.finsky.utils.dx c() {
        com.google.android.finsky.utils.dx dxVar = new com.google.android.finsky.utils.dx();
        if (this.o != null && this.m != null) {
            dxVar.a("CategoryTab.RecyclerViewState", this.o.n());
            if (this.m instanceof com.google.android.finsky.adapters.s) {
                com.google.android.finsky.adapters.s sVar = (com.google.android.finsky.adapters.s) this.m;
                for (android.support.v7.widget.eq eqVar : (android.support.v7.widget.eq[]) sVar.l.toArray(new android.support.v7.widget.eq[sVar.l.size()])) {
                    sVar.a(eqVar);
                }
                com.google.android.finsky.utils.dx dxVar2 = new com.google.android.finsky.utils.dx();
                dxVar2.a("CategoryAdapterV2.QuickLinksViewState", sVar.k);
                dxVar.a("CategoryTab.AdapterInstanceState", dxVar2);
            }
        }
        this.m = null;
        this.n = null;
        return dxVar;
    }

    @Override // com.google.android.finsky.activities.hc
    public final void a(com.google.android.finsky.utils.dx dxVar) {
        if (dxVar != null) {
            this.p = dxVar;
        }
    }
}
