package com.google.android.finsky.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.protos.qm;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class gr extends android.support.v4.view.bn implements bf, com.google.android.libraries.bind.b.a {
    public boolean d;
    boolean e;
    private final int f;
    private final Context g;
    private final LayoutInflater h;
    private final com.google.android.finsky.navigationmanager.b i;
    private final com.google.android.finsky.layout.actionbar.c j;
    private final DfeToc k;
    private final com.google.android.finsky.api.b l;
    private final com.google.android.play.image.e m;
    private final com.google.android.finsky.utils.ac n;
    private final gt o;
    private final qm p;
    private final gq q;
    private final FinskyHeaderListLayout r;
    private final com.google.android.finsky.layout.play.cy s;

    /* renamed from: b, reason: collision with root package name */
    List<gs> f1779b = new ArrayList();
    final gu c = new gu(0);
    private int t = -1;

    public gr(Context context, LayoutInflater layoutInflater, com.google.android.finsky.navigationmanager.b bVar, DfeToc dfeToc, com.google.android.finsky.api.b bVar2, com.google.android.finsky.utils.ac acVar, qm qmVar, com.google.android.play.image.e eVar, com.google.android.finsky.protos.az[] azVarArr, int i, com.google.android.finsky.utils.dx dxVar, com.google.android.finsky.layout.play.cy cyVar, com.google.android.finsky.layout.actionbar.c cVar, gt gtVar, gq gqVar, FinskyHeaderListLayout finskyHeaderListLayout) {
        List list;
        List list2;
        this.g = context;
        this.h = layoutInflater;
        this.i = bVar;
        this.k = dfeToc;
        this.l = bVar2;
        this.p = qmVar;
        this.n = acVar;
        this.m = eVar;
        this.q = gqVar;
        this.r = finskyHeaderListLayout;
        this.f = i;
        this.s = cyVar;
        this.j = cVar;
        this.o = gtVar;
        this.f1779b.clear();
        for (com.google.android.finsky.protos.az azVar : azVarArr) {
            boolean z = azVar.j.length > 0;
            gs gsVar = new gs(azVar, z);
            gsVar.f = new com.google.android.finsky.layout.play.de(z ? 401 : 403, azVar.c, this.s);
            this.f1779b.add(gsVar);
        }
        if (dxVar == null || !dxVar.a("TabbedAdapter.TabInstanceStates")) {
            list = null;
        } else {
            list = dxVar.d("TabbedAdapter.TabInstanceStates");
        }
        if (dxVar == null || !dxVar.a("TabbedAdapter.TabDfeLists")) {
            list2 = null;
        } else {
            List<com.google.android.finsky.api.model.s> d = dxVar.d("TabbedAdapter.TabDfeLists");
            if (d != null) {
                for (com.google.android.finsky.api.model.s sVar : d) {
                    if (sVar != null) {
                        com.google.android.finsky.api.b bVar3 = this.l;
                        if (sVar.f1988a != 0) {
                            sVar.f1988a.a(bVar3);
                        }
                        for (com.google.android.finsky.api.model.i iVar : sVar.f1989b.values()) {
                            if (iVar != null) {
                                iVar.a(bVar3);
                            }
                        }
                    }
                }
            }
            list2 = d;
        }
        boolean z2 = list2 != null && list2.size() == this.f1779b.size();
        boolean z3 = list != null && list.size() == this.f1779b.size();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= azVarArr.length) {
                break;
            }
            gs gsVar2 = this.f1779b.get(i3);
            if (z2) {
                gsVar2.f1781b = (com.google.android.finsky.api.model.s) list2.get(i3);
            }
            if (z3) {
                gsVar2.d = (com.google.android.finsky.utils.dx) list.get(i3);
            }
            i2 = i3 + 1;
        }
        this.d = !com.google.android.play.utils.j.b(this.g);
        this.e = false;
    }

    @Override // android.support.v4.view.bn
    public final void a(ViewGroup viewGroup, int i, Object obj) {
        int a2 = com.google.android.libraries.bind.b.c.a(this, i);
        hc hcVar = (hc) obj;
        viewGroup.removeView(hcVar.a());
        gs gsVar = this.f1779b.get(a2);
        if (gsVar.f1781b != null) {
            gsVar.f1781b.a();
        }
        if (!this.e) {
            gsVar.d = gsVar.c.c();
        }
        gsVar.c = null;
        hcVar.b();
    }

    final ArrayList<com.google.android.finsky.api.model.s> f() {
        if (this.f1779b == null || this.f1779b.isEmpty()) {
            return null;
        }
        ArrayList<com.google.android.finsky.api.model.s> arrayList = new ArrayList<>();
        Iterator<gs> it = this.f1779b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f1781b);
        }
        return arrayList;
    }

    @Override // android.support.v4.view.bn
    public final int a() {
        return this.f1779b.size();
    }

    @Override // android.support.v4.view.bn
    public final Object a(ViewGroup viewGroup, int i) {
        com.google.android.finsky.protos.bb bbVar;
        com.google.android.finsky.layout.eq eqVar;
        hc edVar;
        int a2 = com.google.android.libraries.bind.b.c.a(this, i);
        gs gsVar = this.f1779b.get(a2);
        com.google.android.finsky.protos.az azVar = gsVar.f1780a;
        boolean z = this.c.f1782a;
        int i2 = a() > 1 ? 0 : 2;
        if (gsVar.e) {
            edVar = new av(this.g, this.i, this.m, this.h, gsVar, this.k, i2);
        } else {
            if (gsVar.f1781b == null) {
                gsVar.f1781b = new com.google.android.finsky.api.model.s(new com.google.android.finsky.api.model.i(this.l, azVar.f, true, this.p));
            }
            com.google.android.finsky.protos.bb bbVar2 = azVar.q;
            com.google.android.finsky.d.d e = FinskyApp.a().e();
            if (this.i.q() == 1 && azVar.p && azVar.o == 3 && e.a(12605729L)) {
                com.google.android.finsky.protos.bb bbVar3 = new com.google.android.finsky.protos.bb();
                bbVar3.f3621a = com.google.android.finsky.utils.ai.a(this.g, this.k);
                bbVar3.f3622b = true;
                bbVar = bbVar3;
            } else {
                bbVar = bbVar2;
            }
            if (bbVar == null) {
                eqVar = null;
            } else {
                int i3 = 0;
                while (true) {
                    int i4 = i3;
                    if (i4 < this.f1779b.size()) {
                        com.google.android.finsky.protos.az azVar2 = this.f1779b.get(i4).f1780a;
                        if (!azVar2.p || azVar2.o != 13) {
                            i3 = i4 + 1;
                        } else {
                            eqVar = new com.google.android.finsky.layout.eq(i4, bbVar.f3621a);
                            break;
                        }
                    } else {
                        FinskyLog.e("Failed to find an entertainment tab for tab bubble", new Object[0]);
                        eqVar = null;
                        break;
                    }
                }
            }
            com.google.android.finsky.layout.em emVar = null;
            if (eqVar != null && !this.n.f && ed.f1710a) {
                emVar = new com.google.android.finsky.layout.em(this.g, eqVar, this.n, this.r, gsVar.f);
            }
            edVar = new ed(this.g, this.i, this.m, this.l, this.h, gsVar, this.k, this.n, z, this.j, i2, this.o, this.q, emVar);
        }
        edVar.a(gsVar.d);
        edVar.a(this.t == a2);
        gsVar.c = edVar;
        viewGroup.addView(edVar.a());
        if (z && (edVar instanceof ed)) {
            this.c.c.add((ed) edVar);
        }
        return edVar;
    }

    @Override // android.support.v4.view.bn
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final String a(int i) {
        return i >= this.f1779b.size() ? "" : this.f1779b.get(i).f1780a.f3617a.toUpperCase();
    }

    public final void f(int i) {
        for (int i2 = 0; i2 < this.f1779b.size(); i2++) {
            gs gsVar = this.f1779b.get(i2);
            if (gsVar.c != null && i2 != i) {
                gsVar.c.a(false);
            }
        }
        gs gsVar2 = this.f1779b.get(i);
        if (gsVar2.c != null) {
            gsVar2.c.a(true);
        }
        this.t = i;
    }

    public final com.google.android.finsky.layout.play.cy g(int i) {
        return this.f1779b.get(com.google.android.libraries.bind.b.c.a(this, i)).f;
    }

    @Override // android.support.v4.view.bn
    public final boolean a(View view, Object obj) {
        return ((hc) obj).a() == view;
    }

    @Override // android.support.v4.view.bn
    public final float b(int i) {
        if (i == 0 && this.f1779b.size() > 1 && this.f1779b.get(0).e) {
            return this.g.getResources().getInteger(R.integer.category_tab_width_in_percent) / 100.0f;
        }
        return 1.0f;
    }

    @Override // android.support.v4.view.bn
    public final void b() {
    }

    @Override // com.google.android.finsky.activities.bf
    public final View c(int i) {
        return this.f1779b.get(com.google.android.libraries.bind.b.c.a(this, i)).c.a();
    }

    @Override // com.google.android.finsky.activities.bf
    public final boolean d(int i) {
        return this.t == com.google.android.libraries.bind.b.c.a(this, i);
    }

    @Override // com.google.android.libraries.bind.b.a
    public final boolean e() {
        return this.d;
    }

    @Override // com.google.android.libraries.bind.b.a
    public final void a(boolean z) {
        if (this.d != z) {
            this.d = z;
            d();
        }
    }
}
