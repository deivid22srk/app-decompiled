package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class bt extends fo {
    private ArrayList<eq> n = new ArrayList<>();
    private ArrayList<eq> o = new ArrayList<>();
    private ArrayList<cd> p = new ArrayList<>();
    private ArrayList<cc> q = new ArrayList<>();

    /* renamed from: a, reason: collision with root package name */
    ArrayList<ArrayList<eq>> f710a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    ArrayList<ArrayList<cd>> f711b = new ArrayList<>();
    ArrayList<ArrayList<cc>> c = new ArrayList<>();
    ArrayList<eq> d = new ArrayList<>();
    ArrayList<eq> e = new ArrayList<>();
    ArrayList<eq> f = new ArrayList<>();
    ArrayList<eq> g = new ArrayList<>();

    @Override // android.support.v7.widget.dx
    public final void a() {
        boolean z = !this.n.isEmpty();
        boolean z2 = !this.p.isEmpty();
        boolean z3 = !this.q.isEmpty();
        boolean z4 = !this.o.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<eq> it = this.n.iterator();
            while (it.hasNext()) {
                eq next = it.next();
                android.support.v4.view.dy t = android.support.v4.view.by.t(next.f795a);
                this.f.add(next);
                t.a(this.j).a(0.0f).a(new bx(this, next, t)).b();
            }
            this.n.clear();
            if (z2) {
                ArrayList<cd> arrayList = new ArrayList<>();
                arrayList.addAll(this.p);
                this.f711b.add(arrayList);
                this.p.clear();
                bu buVar = new bu(this, arrayList);
                if (z) {
                    android.support.v4.view.by.a(arrayList.get(0).f731a.f795a, buVar, this.j);
                } else {
                    buVar.run();
                }
            }
            if (z3) {
                ArrayList<cc> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.q);
                this.c.add(arrayList2);
                this.q.clear();
                bv bvVar = new bv(this, arrayList2);
                if (z) {
                    android.support.v4.view.by.a(arrayList2.get(0).f729a.f795a, bvVar, this.j);
                } else {
                    bvVar.run();
                }
            }
            if (z4) {
                ArrayList<eq> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.o);
                this.f710a.add(arrayList3);
                this.o.clear();
                bw bwVar = new bw(this, arrayList3);
                if (z || z2 || z3) {
                    android.support.v4.view.by.a(arrayList3.get(0).f795a, bwVar, (z ? this.j : 0L) + Math.max(z2 ? this.k : 0L, z3 ? this.l : 0L));
                } else {
                    bwVar.run();
                }
            }
        }
    }

    @Override // android.support.v7.widget.fo
    public final boolean a(eq eqVar) {
        g(eqVar);
        this.n.add(eqVar);
        return true;
    }

    @Override // android.support.v7.widget.fo
    public final boolean b(eq eqVar) {
        g(eqVar);
        android.support.v4.view.by.c(eqVar.f795a, 0.0f);
        this.o.add(eqVar);
        return true;
    }

    @Override // android.support.v7.widget.fo
    public final boolean a(eq eqVar, int i, int i2, int i3, int i4) {
        View view = eqVar.f795a;
        int p = (int) (i + android.support.v4.view.by.p(eqVar.f795a));
        int q = (int) (i2 + android.support.v4.view.by.q(eqVar.f795a));
        g(eqVar);
        int i5 = i3 - p;
        int i6 = i4 - q;
        if (i5 != 0 || i6 != 0) {
            if (i5 != 0) {
                android.support.v4.view.by.a(view, -i5);
            }
            if (i6 != 0) {
                android.support.v4.view.by.b(view, -i6);
            }
            this.p.add(new cd(eqVar, p, q, i3, i4, (byte) 0));
            return true;
        }
        e(eqVar);
        return false;
    }

    @Override // android.support.v7.widget.fo
    public final boolean a(eq eqVar, eq eqVar2, int i, int i2, int i3, int i4) {
        if (eqVar == eqVar2) {
            return a(eqVar, i, i2, i3, i4);
        }
        float p = android.support.v4.view.by.p(eqVar.f795a);
        float q = android.support.v4.view.by.q(eqVar.f795a);
        float f = android.support.v4.view.by.f(eqVar.f795a);
        g(eqVar);
        int i5 = (int) ((i3 - i) - p);
        int i6 = (int) ((i4 - i2) - q);
        android.support.v4.view.by.a(eqVar.f795a, p);
        android.support.v4.view.by.b(eqVar.f795a, q);
        android.support.v4.view.by.c(eqVar.f795a, f);
        if (eqVar2 != null) {
            g(eqVar2);
            android.support.v4.view.by.a(eqVar2.f795a, -i5);
            android.support.v4.view.by.b(eqVar2.f795a, -i6);
            android.support.v4.view.by.c(eqVar2.f795a, 0.0f);
        }
        this.q.add(new cc(eqVar, eqVar2, i, i2, i3, i4, (byte) 0));
        return true;
    }

    private void a(List<cc> list, eq eqVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            cc ccVar = list.get(size);
            if (a(ccVar, eqVar) && ccVar.f729a == null && ccVar.f730b == null) {
                list.remove(ccVar);
            }
        }
    }

    private void a(cc ccVar) {
        if (ccVar.f729a != null) {
            a(ccVar, ccVar.f729a);
        }
        if (ccVar.f730b != null) {
            a(ccVar, ccVar.f730b);
        }
    }

    private boolean a(cc ccVar, eq eqVar) {
        if (ccVar.f730b == eqVar) {
            ccVar.f730b = null;
        } else if (ccVar.f729a == eqVar) {
            ccVar.f729a = null;
        } else {
            return false;
        }
        android.support.v4.view.by.c(eqVar.f795a, 1.0f);
        android.support.v4.view.by.a(eqVar.f795a, 0.0f);
        android.support.v4.view.by.b(eqVar.f795a, 0.0f);
        e(eqVar);
        return true;
    }

    @Override // android.support.v7.widget.dx
    public final void c(eq eqVar) {
        View view = eqVar.f795a;
        android.support.v4.view.by.t(view).a();
        for (int size = this.p.size() - 1; size >= 0; size--) {
            if (this.p.get(size).f731a == eqVar) {
                android.support.v4.view.by.b(view, 0.0f);
                android.support.v4.view.by.a(view, 0.0f);
                e(eqVar);
                this.p.remove(size);
            }
        }
        a(this.q, eqVar);
        if (this.n.remove(eqVar)) {
            android.support.v4.view.by.c(view, 1.0f);
            e(eqVar);
        }
        if (this.o.remove(eqVar)) {
            android.support.v4.view.by.c(view, 1.0f);
            e(eqVar);
        }
        for (int size2 = this.c.size() - 1; size2 >= 0; size2--) {
            ArrayList<cc> arrayList = this.c.get(size2);
            a(arrayList, eqVar);
            if (arrayList.isEmpty()) {
                this.c.remove(size2);
            }
        }
        for (int size3 = this.f711b.size() - 1; size3 >= 0; size3--) {
            ArrayList<cd> arrayList2 = this.f711b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f731a != eqVar) {
                    size4--;
                } else {
                    android.support.v4.view.by.b(view, 0.0f);
                    android.support.v4.view.by.a(view, 0.0f);
                    e(eqVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f711b.remove(size3);
                    }
                }
            }
        }
        for (int size5 = this.f710a.size() - 1; size5 >= 0; size5--) {
            ArrayList<eq> arrayList3 = this.f710a.get(size5);
            if (arrayList3.remove(eqVar)) {
                android.support.v4.view.by.c(view, 1.0f);
                e(eqVar);
                if (arrayList3.isEmpty()) {
                    this.f710a.remove(size5);
                }
            }
        }
        this.f.remove(eqVar);
        this.d.remove(eqVar);
        this.g.remove(eqVar);
        this.e.remove(eqVar);
        c();
    }

    private void g(eq eqVar) {
        android.support.v4.a.a.a(eqVar.f795a);
        c(eqVar);
    }

    @Override // android.support.v7.widget.dx
    public final boolean b() {
        return (this.o.isEmpty() && this.q.isEmpty() && this.p.isEmpty() && this.n.isEmpty() && this.e.isEmpty() && this.f.isEmpty() && this.d.isEmpty() && this.g.isEmpty() && this.f711b.isEmpty() && this.f710a.isEmpty() && this.c.isEmpty()) ? false : true;
    }

    final void c() {
        if (!b()) {
            e();
        }
    }

    @Override // android.support.v7.widget.dx
    public final void d() {
        for (int size = this.p.size() - 1; size >= 0; size--) {
            cd cdVar = this.p.get(size);
            View view = cdVar.f731a.f795a;
            android.support.v4.view.by.b(view, 0.0f);
            android.support.v4.view.by.a(view, 0.0f);
            e(cdVar.f731a);
            this.p.remove(size);
        }
        for (int size2 = this.n.size() - 1; size2 >= 0; size2--) {
            e(this.n.get(size2));
            this.n.remove(size2);
        }
        for (int size3 = this.o.size() - 1; size3 >= 0; size3--) {
            eq eqVar = this.o.get(size3);
            android.support.v4.view.by.c(eqVar.f795a, 1.0f);
            e(eqVar);
            this.o.remove(size3);
        }
        for (int size4 = this.q.size() - 1; size4 >= 0; size4--) {
            a(this.q.get(size4));
        }
        this.q.clear();
        if (b()) {
            for (int size5 = this.f711b.size() - 1; size5 >= 0; size5--) {
                ArrayList<cd> arrayList = this.f711b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    cd cdVar2 = arrayList.get(size6);
                    View view2 = cdVar2.f731a.f795a;
                    android.support.v4.view.by.b(view2, 0.0f);
                    android.support.v4.view.by.a(view2, 0.0f);
                    e(cdVar2.f731a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f711b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f710a.size() - 1; size7 >= 0; size7--) {
                ArrayList<eq> arrayList2 = this.f710a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    eq eqVar2 = arrayList2.get(size8);
                    android.support.v4.view.by.c(eqVar2.f795a, 1.0f);
                    e(eqVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f710a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.c.size() - 1; size9 >= 0; size9--) {
                ArrayList<cc> arrayList3 = this.c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    a(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.c.remove(arrayList3);
                    }
                }
            }
            a(this.f);
            a(this.e);
            a(this.d);
            a(this.g);
            e();
        }
    }

    private static void a(List<eq> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            android.support.v4.view.by.t(list.get(size).f795a).a();
        }
    }

    @Override // android.support.v7.widget.dx
    public final boolean a(eq eqVar, List<Object> list) {
        return !list.isEmpty() || super.a(eqVar, list);
    }
}
