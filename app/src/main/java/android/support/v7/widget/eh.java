package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class eh {

    /* renamed from: a, reason: collision with root package name */
    final ArrayList<eq> f785a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    ArrayList<eq> f786b = null;
    final ArrayList<eq> c = new ArrayList<>();
    final List<eq> d = Collections.unmodifiableList(this.f785a);
    int e = 2;
    eg f;
    eo g;
    final /* synthetic */ RecyclerView h;

    public eh(RecyclerView recyclerView) {
        this.h = recyclerView;
    }

    public final void a() {
        this.f785a.clear();
        b();
    }

    public final int a(int i) {
        if (i < 0 || i >= this.h.n.a()) {
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + this.h.n.a());
        }
        return !this.h.n.g ? i : this.h.f628b.b(i);
    }

    final View b(int i) {
        eq eqVar;
        boolean z;
        eq eqVar2;
        boolean z2;
        boolean z3;
        er erVar;
        ed edVar;
        boolean z4;
        eq eqVar3;
        boolean z5;
        View a2;
        boolean z6;
        if (i < 0 || i >= this.h.n.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + this.h.n.a());
        }
        if (this.h.n.g) {
            eq d = d(i);
            z = d != null;
            eqVar = d;
        } else {
            eqVar = null;
            z = false;
        }
        if (eqVar == null && (eqVar = e(i)) != null) {
            if (!eqVar.m()) {
                if (eqVar.f796b < 0 || eqVar.f796b >= this.h.x.a()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + eqVar);
                }
                if (this.h.n.g || this.h.x.a(eqVar.f796b) == eqVar.e) {
                    z6 = !this.h.x.f775b || eqVar.d == this.h.x.b(eqVar.f796b);
                } else {
                    z6 = false;
                }
            } else {
                z6 = this.h.n.g;
            }
            if (z6) {
                z = true;
            } else {
                eqVar.b(4);
                if (eqVar.e()) {
                    this.h.removeDetachedView(eqVar.f795a, false);
                    eqVar.f();
                } else if (eqVar.g()) {
                    eqVar.h();
                }
                a(eqVar);
                eqVar = null;
            }
        }
        if (eqVar == null) {
            int b2 = this.h.f628b.b(i);
            if (b2 >= 0 && b2 < this.h.x.a()) {
                int a3 = this.h.x.a(b2);
                if (!this.h.x.f775b || (eqVar = a(this.h.x.b(b2), a3)) == null) {
                    z4 = z;
                } else {
                    eqVar.f796b = b2;
                    z4 = true;
                }
                if (eqVar == null && this.g != null && (a2 = this.g.a()) != null) {
                    eqVar = this.h.a(a2);
                    if (eqVar == null) {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
                    }
                    if (eqVar.b()) {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                    }
                }
                if (eqVar == null) {
                    ArrayList<eq> arrayList = c().f783a.get(a3);
                    if (arrayList == null || arrayList.isEmpty()) {
                        eqVar3 = null;
                    } else {
                        int size = arrayList.size() - 1;
                        eqVar3 = arrayList.get(size);
                        arrayList.remove(size);
                    }
                    if (eqVar3 != null) {
                        eqVar3.q();
                        z5 = RecyclerView.q;
                        if (z5 && (eqVar3.f795a instanceof ViewGroup)) {
                            a((ViewGroup) eqVar3.f795a, false);
                        }
                    }
                    eqVar = eqVar3;
                }
                if (eqVar == null) {
                    dt dtVar = this.h.x;
                    RecyclerView recyclerView = this.h;
                    android.support.v4.os.f.a("RV CreateView");
                    eq a4 = dtVar.a(recyclerView, a3);
                    a4.e = a3;
                    android.support.v4.os.f.a();
                    z2 = z4;
                    eqVar2 = a4;
                } else {
                    z2 = z4;
                    eqVar2 = eqVar;
                }
            } else {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + b2 + ").state:" + this.h.n.a());
            }
        } else {
            eqVar2 = eqVar;
            z2 = z;
        }
        if (z2 && !this.h.n.g && eqVar2.a(8192)) {
            eqVar2.a(0, 8192);
            if (this.h.n.h) {
                dx.d(eqVar2);
                dx dxVar = this.h.m;
                en enVar = this.h.n;
                eqVar2.p();
                this.h.a(eqVar2, new dz().a(eqVar2));
            }
        }
        if (this.h.n.g && eqVar2.l()) {
            eqVar2.f = i;
            z3 = false;
        } else if (!eqVar2.l() || eqVar2.k() || eqVar2.j()) {
            int b3 = this.h.f628b.b(i);
            eqVar2.k = this.h;
            dt dtVar2 = this.h.x;
            eqVar2.f796b = b3;
            if (dtVar2.f775b) {
                eqVar2.d = dtVar2.b(b3);
            }
            eqVar2.a(1, 519);
            android.support.v4.os.f.a("RV OnBindView");
            eqVar2.p();
            dtVar2.a((dt) eqVar2, b3);
            eqVar2.o();
            android.support.v4.os.f.a();
            View view = eqVar2.f795a;
            if (this.h.g()) {
                if (android.support.v4.view.by.e(view) == 0) {
                    android.support.v4.view.by.c(view, 1);
                }
                if (!android.support.v4.view.by.b(view)) {
                    erVar = this.h.ag;
                    android.support.v4.view.by.a(view, erVar.c);
                }
            }
            if (this.h.n.g) {
                eqVar2.f = i;
            }
            z3 = true;
        } else {
            z3 = false;
        }
        ViewGroup.LayoutParams layoutParams = eqVar2.f795a.getLayoutParams();
        if (layoutParams == null) {
            edVar = (ed) this.h.generateDefaultLayoutParams();
            eqVar2.f795a.setLayoutParams(edVar);
        } else if (!this.h.checkLayoutParams(layoutParams)) {
            edVar = (ed) this.h.generateLayoutParams(layoutParams);
            eqVar2.f795a.setLayoutParams(edVar);
        } else {
            edVar = (ed) layoutParams;
        }
        edVar.c = eqVar2;
        edVar.f = z2 && z3;
        return eqVar2.f795a;
    }

    private void a(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, true);
            }
        }
        if (z) {
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
            } else {
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }
    }

    public final void a(View view) {
        eq b2 = RecyclerView.b(view);
        if (b2.n()) {
            this.h.removeDetachedView(view, false);
        }
        if (b2.e()) {
            b2.f();
        } else if (b2.g()) {
            b2.h();
        }
        a(b2);
    }

    final void b() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            c(size);
        }
        this.c.clear();
    }

    final void c(int i) {
        c(this.c.get(i));
        this.c.remove(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void a(android.support.v7.widget.eq r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            boolean r2 = r6.e()
            if (r2 != 0) goto L10
            android.view.View r2 = r6.f795a
            android.view.ViewParent r2 = r2.getParent()
            if (r2 == 0) goto L3d
        L10:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Scrapped or attached views may not be recycled. isScrap:"
            r3.<init>(r4)
            boolean r4 = r6.e()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " isAttached:"
            java.lang.StringBuilder r3 = r3.append(r4)
            android.view.View r4 = r6.f795a
            android.view.ViewParent r4 = r4.getParent()
            if (r4 == 0) goto L3b
        L2f:
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L3b:
            r0 = r1
            goto L2f
        L3d:
            boolean r2 = r6.n()
            if (r2 == 0) goto L58
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L58:
            boolean r2 = r6.b()
            if (r2 == 0) goto L66
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
            r0.<init>(r1)
            throw r0
        L66:
            boolean r3 = android.support.v7.widget.eq.c(r6)
            android.support.v7.widget.RecyclerView r2 = r5.h
            android.support.v7.widget.dt r2 = android.support.v7.widget.RecyclerView.h(r2)
            if (r2 == 0) goto Lc2
            if (r3 == 0) goto Lc2
            android.support.v7.widget.RecyclerView r2 = r5.h
            android.support.v7.widget.dt r2 = android.support.v7.widget.RecyclerView.h(r2)
            boolean r2 = r2.b()
            if (r2 == 0) goto Lc2
            r2 = r0
        L81:
            if (r2 != 0) goto L89
            boolean r2 = r6.r()
            if (r2 == 0) goto Lc8
        L89:
            r2 = 14
            boolean r2 = r6.a(r2)
            if (r2 != 0) goto Lc6
            java.util.ArrayList<android.support.v7.widget.eq> r2 = r5.c
            int r2 = r2.size()
            int r4 = r5.e
            if (r2 != r4) goto La0
            if (r2 <= 0) goto La0
            r5.c(r1)
        La0:
            int r4 = r5.e
            if (r2 >= r4) goto Lc6
            java.util.ArrayList<android.support.v7.widget.eq> r2 = r5.c
            r2.add(r6)
            r2 = r0
        Laa:
            if (r2 != 0) goto Lc4
            r5.c(r6)
            r1 = r0
            r0 = r2
        Lb1:
            android.support.v7.widget.RecyclerView r2 = r5.h
            android.support.v7.widget.gi r2 = r2.d
            r2.c(r6)
            if (r0 != 0) goto Lc1
            if (r1 != 0) goto Lc1
            if (r3 == 0) goto Lc1
            r0 = 0
            r6.k = r0
        Lc1:
            return
        Lc2:
            r2 = r1
            goto L81
        Lc4:
            r0 = r2
            goto Lb1
        Lc6:
            r2 = r1
            goto Laa
        Lc8:
            r0 = r1
            goto Lb1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.eh.a(android.support.v7.widget.eq):void");
    }

    private void c(eq eqVar) {
        ei eiVar;
        ei unused;
        android.support.v4.view.by.a(eqVar.f795a, (android.support.v4.view.a) null);
        eiVar = this.h.y;
        if (eiVar != null) {
            unused = this.h.y;
        }
        if (this.h.x != null) {
            this.h.x.a((dt) eqVar);
        }
        if (this.h.n != null) {
            this.h.d.c(eqVar);
        }
        eqVar.k = null;
        eg c = c();
        int i = eqVar.e;
        ArrayList<eq> arrayList = c.f783a.get(i);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            c.f783a.put(i, arrayList);
            if (c.f784b.indexOfKey(i) < 0) {
                c.f784b.put(i, 5);
            }
        }
        if (c.f784b.get(i) <= arrayList.size()) {
            return;
        }
        eqVar.q();
        arrayList.add(eqVar);
    }

    final void b(View view) {
        eq b2 = RecyclerView.b(view);
        eq.d(b2);
        eq.e(b2);
        b2.h();
        a(b2);
    }

    final void c(View view) {
        eq b2 = RecyclerView.b(view);
        if (b2.a(12) || !b2.s() || RecyclerView.a(this.h, b2)) {
            if (b2.j() && !b2.m() && !this.h.x.f775b) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
            }
            b2.a(this, false);
            this.f785a.add(b2);
            return;
        }
        if (this.f786b == null) {
            this.f786b = new ArrayList<>();
        }
        b2.a(this, true);
        this.f786b.add(b2);
    }

    final void b(eq eqVar) {
        boolean z;
        z = eqVar.p;
        if (z) {
            this.f786b.remove(eqVar);
        } else {
            this.f785a.remove(eqVar);
        }
        eq.d(eqVar);
        eq.e(eqVar);
        eqVar.h();
    }

    private eq d(int i) {
        int size;
        int a2;
        if (this.f786b == null || (size = this.f786b.size()) == 0) {
            return null;
        }
        for (int i2 = 0; i2 < size; i2++) {
            eq eqVar = this.f786b.get(i2);
            if (!eqVar.g() && eqVar.c() == i) {
                eqVar.b(32);
                return eqVar;
            }
        }
        if (this.h.x.f775b && (a2 = this.h.f628b.a(i, 0)) > 0 && a2 < this.h.x.a()) {
            long b2 = this.h.x.b(a2);
            for (int i3 = 0; i3 < size; i3++) {
                eq eqVar2 = this.f786b.get(i3);
                if (!eqVar2.g() && eqVar2.d == b2) {
                    eqVar2.b(32);
                    return eqVar2;
                }
            }
        }
        return null;
    }

    private eq e(int i) {
        View view;
        int size = this.f785a.size();
        for (int i2 = 0; i2 < size; i2++) {
            eq eqVar = this.f785a.get(i2);
            if (!eqVar.g() && eqVar.c() == i && !eqVar.j() && (this.h.n.g || !eqVar.m())) {
                eqVar.b(32);
                return eqVar;
            }
        }
        bn bnVar = this.h.c;
        int size2 = bnVar.c.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                view = null;
                break;
            }
            View view2 = bnVar.c.get(i3);
            eq b2 = bnVar.f706a.b(view2);
            if (b2.c() == i && !b2.j() && !b2.m()) {
                view = view2;
                break;
            }
            i3++;
        }
        if (view != null) {
            eq b3 = RecyclerView.b(view);
            bn bnVar2 = this.h.c;
            int a2 = bnVar2.f706a.a(view);
            if (a2 < 0) {
                throw new IllegalArgumentException("view is not a child, cannot hide " + view);
            }
            if (!bnVar2.f707b.c(a2)) {
                throw new RuntimeException("trying to unhide a view that was not hidden" + view);
            }
            bnVar2.f707b.b(a2);
            bnVar2.b(view);
            int c = this.h.c.c(view);
            if (c == -1) {
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + b3);
            }
            this.h.c.d(c);
            c(view);
            b3.b(8224);
            return b3;
        }
        int size3 = this.c.size();
        for (int i4 = 0; i4 < size3; i4++) {
            eq eqVar2 = this.c.get(i4);
            if (!eqVar2.j() && eqVar2.c() == i) {
                this.c.remove(i4);
                return eqVar2;
            }
        }
        return null;
    }

    private eq a(long j, int i) {
        for (int size = this.f785a.size() - 1; size >= 0; size--) {
            eq eqVar = this.f785a.get(size);
            if (eqVar.d == j && !eqVar.g()) {
                if (i == eqVar.e) {
                    eqVar.b(32);
                    if (eqVar.m() && !this.h.n.g) {
                        eqVar.a(2, 14);
                        return eqVar;
                    }
                    return eqVar;
                }
                this.f785a.remove(size);
                this.h.removeDetachedView(eqVar.f795a, false);
                b(eqVar.f795a);
            }
        }
        for (int size2 = this.c.size() - 1; size2 >= 0; size2--) {
            eq eqVar2 = this.c.get(size2);
            if (eqVar2.d == j) {
                if (i == eqVar2.e) {
                    this.c.remove(size2);
                    return eqVar2;
                }
                c(size2);
            }
        }
        return null;
    }

    final eg c() {
        if (this.f == null) {
            this.f = new eg();
        }
        return this.f;
    }
}
