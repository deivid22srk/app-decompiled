package com.google.android.finsky.activities.myapps;

import android.support.v4.view.ViewPager;
import android.support.v4.view.bn;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.hc;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.dx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class aa extends bn implements com.google.android.libraries.bind.b.a {
    private final com.google.android.finsky.activities.d c;
    private final com.google.android.finsky.navigationmanager.b d;
    private final com.google.android.play.image.e e;
    private final com.google.android.finsky.api.b f;
    private final DfeToc g;
    private final boolean h;
    private final List<String> i;
    private final ac j;
    private final boolean k;
    private cy m;
    private boolean n;

    /* renamed from: b, reason: collision with root package name */
    protected final List<ab> f1804b = new ArrayList();
    private int l = 0;

    public aa(com.google.android.finsky.activities.d dVar, com.google.android.finsky.navigationmanager.b bVar, com.google.android.finsky.api.b bVar2, DfeToc dfeToc, com.google.android.play.image.e eVar, boolean z, dx dxVar, ac acVar, boolean z2, cy cyVar) {
        List list;
        this.c = dVar;
        this.d = bVar;
        this.e = eVar;
        this.f = bVar2;
        this.g = dfeToc;
        this.h = z;
        this.j = acVar;
        this.k = z2;
        this.m = cyVar;
        if (dxVar == null || !dxVar.a("MyAppsTabbedAdapter.TabBundles")) {
            list = null;
        } else {
            list = dxVar.d("MyAppsTabbedAdapter.TabBundles");
        }
        this.f1804b.clear();
        if (this.h) {
            this.f1804b.add(new ab(0, this.m, 404));
        }
        this.f1804b.add(new ab(1, this.m, 405));
        this.f1804b.add(new ab(2, this.m, 406));
        boolean z3 = list != null && list.size() == this.f1804b.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f1804b.size()) {
                break;
            }
            if (z3) {
                this.f1804b.get(i2).c = (dx) list.get(i2);
            }
            i = i2 + 1;
        }
        ArrayList arrayList = new ArrayList();
        if (this.h) {
            arrayList.add(this.c.getString(R.string.my_apps_tab_subscriptions).toUpperCase());
        }
        arrayList.add(this.c.getString(R.string.my_apps_tab_installed).toUpperCase());
        arrayList.add(this.c.getString(R.string.my_apps_tab_library).toUpperCase());
        this.i = arrayList;
        this.n = !com.google.android.play.utils.j.b(dVar);
    }

    @Override // android.support.v4.view.bn
    public final void a(ViewGroup viewGroup, int i, Object obj) {
        int a2 = com.google.android.libraries.bind.b.c.a(this, i);
        hc hcVar = (hc) obj;
        ((ViewPager) viewGroup).removeView(hcVar.a());
        ab abVar = this.f1804b.get(a2);
        abVar.c = abVar.f1806b.c();
        abVar.f1806b = null;
        hcVar.b();
    }

    public final void a(dx dxVar) {
        ArrayList arrayList;
        if (this.f1804b == null || this.f1804b.isEmpty()) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (ab abVar : this.f1804b) {
                if (abVar.f1806b != null) {
                    arrayList2.add(abVar.f1806b.c());
                } else {
                    arrayList2.add(abVar.c);
                }
            }
            arrayList = arrayList2;
        }
        dxVar.a("MyAppsTabbedAdapter.TabBundles", arrayList);
    }

    public final int c(int i) {
        return this.f1804b.get(i).f1805a;
    }

    @Override // android.support.v4.view.bn
    public final int a() {
        return this.f1804b.size();
    }

    final boolean f() {
        boolean z = false;
        Iterator<ab> it = this.f1804b.iterator();
        while (true) {
            boolean z2 = z;
            if (it.hasNext()) {
                y<?> yVar = it.next().f1806b;
                if (yVar != null && yVar.j()) {
                    z2 = true;
                }
                z = z2;
            } else {
                return z2;
            }
        }
    }

    @Override // android.support.v4.view.bn
    public final Object a(ViewGroup viewGroup, int i) {
        int a2 = com.google.android.libraries.bind.b.c.a(this, i);
        ab abVar = this.f1804b.get(a2);
        y<?> yVar = abVar.f1806b;
        if (yVar == null) {
            switch (abVar.f1805a) {
                case 0:
                    yVar = new x(this.c, this.f, this.g, this.d, this.e, abVar.d);
                    break;
                case 1:
                    yVar = new l(this.c, this.f, this.g, this.d, this.e, this.k, abVar.d);
                    break;
                case 2:
                    yVar = new o(this.c, this.f, this.g, this.d, this.e, this.j, FinskyApp.a().p.a(this.f.b()), abVar.d);
                    break;
            }
        }
        abVar.f1806b = yVar;
        viewGroup.addView(yVar.a());
        yVar.a(abVar.c);
        if (a2 == this.l) {
            f(a2);
        }
        yVar.k();
        return yVar;
    }

    @Override // android.support.v4.view.bn
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String a(int i) {
        return this.i.get(i);
    }

    public final void e(int i) {
        this.l = i;
        for (int i2 = 0; i2 < this.f1804b.size(); i2++) {
            f(i2);
        }
    }

    private void f(int i) {
        ab abVar = this.f1804b.get(i);
        if (abVar.f1806b != null) {
            boolean z = this.l == i;
            abVar.d.a(z);
            abVar.f1806b.a(z);
            if (z) {
                com.google.android.finsky.a.i.c(abVar.d);
                com.google.android.finsky.a.i.a((ViewGroup) abVar.f1806b.e());
            }
        }
    }

    @Override // android.support.v4.view.bn
    public final boolean a(View view, Object obj) {
        return ((hc) obj).a() == view;
    }

    @Override // android.support.v4.view.bn
    public final void b() {
    }

    public final void a(List<String> list) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f1804b.size()) {
                ab abVar = this.f1804b.get(i2);
                if (abVar.f1805a == 2) {
                    ((o) abVar.f1806b).a(list);
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.libraries.bind.b.a
    public final boolean e() {
        return this.n;
    }

    @Override // com.google.android.libraries.bind.b.a
    public final void a(boolean z) {
        if (this.n != z) {
            this.n = z;
            d();
        }
    }
}
