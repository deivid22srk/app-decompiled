package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class ci extends LinearLayoutManager {

    /* renamed from: a, reason: collision with root package name */
    boolean f735a;

    /* renamed from: b, reason: collision with root package name */
    int f736b;
    int[] c;
    View[] d;
    final SparseIntArray e = new SparseIntArray();
    final SparseIntArray f = new SparseIntArray();
    public cl g = new cj();
    final Rect h = new Rect();

    public ci() {
        this.f735a = false;
        this.f736b = -1;
        if (2 == this.f736b) {
            return;
        }
        this.f735a = true;
        this.f736b = 2;
        this.g.f739a.clear();
    }

    @Override // android.support.v7.widget.ec
    public final int a(eh ehVar, en enVar) {
        if (this.i == 0) {
            return this.f736b;
        }
        if (enVar.a() <= 0) {
            return 0;
        }
        return a(ehVar, enVar, enVar.a() - 1);
    }

    @Override // android.support.v7.widget.ec
    public final int b(eh ehVar, en enVar) {
        if (this.i == 1) {
            return this.f736b;
        }
        if (enVar.a() <= 0) {
            return 0;
        }
        return a(ehVar, enVar, enVar.a() - 1);
    }

    @Override // android.support.v7.widget.ec
    public final void a(eh ehVar, en enVar, View view, android.support.v4.view.a.j jVar) {
        boolean z = false;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ck)) {
            super.a(view, jVar);
            return;
        }
        ck ckVar = (ck) layoutParams;
        int a2 = a(ehVar, enVar, ckVar.c.c());
        if (this.i == 0) {
            jVar.a(android.support.v4.view.a.v.a(ckVar.f737a, ckVar.f738b, a2, 1, this.f736b > 1 && ckVar.f738b == this.f736b));
            return;
        }
        int i = ckVar.f737a;
        int i2 = ckVar.f738b;
        if (this.f736b > 1 && ckVar.f738b == this.f736b) {
            z = true;
        }
        jVar.a(android.support.v4.view.a.v.a(a2, 1, i, i2, z));
    }

    @Override // android.support.v7.widget.ec
    public final void a() {
        this.g.f739a.clear();
    }

    @Override // android.support.v7.widget.ec
    public final void b() {
        this.g.f739a.clear();
    }

    @Override // android.support.v7.widget.ec
    public final void c() {
        this.g.f739a.clear();
    }

    @Override // android.support.v7.widget.ec
    public final void d() {
        this.g.f739a.clear();
    }

    @Override // android.support.v7.widget.ec
    public final void e() {
        this.g.f739a.clear();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.ec
    public final ed f() {
        return this.i == 0 ? new ck(-2, -1) : new ck(-1, -2);
    }

    @Override // android.support.v7.widget.ec
    public final ed a(Context context, AttributeSet attributeSet) {
        return new ck(context, attributeSet);
    }

    @Override // android.support.v7.widget.ec
    public final ed a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new ck((ViewGroup.MarginLayoutParams) layoutParams) : new ck(layoutParams);
    }

    @Override // android.support.v7.widget.ec
    public final boolean a(ed edVar) {
        return edVar instanceof ck;
    }

    @Override // android.support.v7.widget.ec
    public final void a(Rect rect, int i, int i2) {
        int a2;
        int a3;
        if (this.c == null) {
            super.a(rect, i, i2);
        }
        if (this.i == 1) {
            a3 = a(i2, rect.height() + s() + u(), android.support.v4.view.by.s(this.q));
            a2 = a(i, this.c[this.c.length - 1], android.support.v4.view.by.r(this.q));
        } else {
            a2 = a(i, rect.width() + r() + t(), android.support.v4.view.by.r(this.q));
            a3 = a(i2, this.c[this.c.length - 1], android.support.v4.view.by.s(this.q));
        }
        e(a2, a3);
    }

    private void g(int i) {
        int i2;
        int i3 = 0;
        int[] iArr = this.c;
        int i4 = this.f736b;
        if (iArr == null || iArr.length != i4 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i4 + 1];
        }
        iArr[0] = 0;
        int i5 = i / i4;
        int i6 = i % i4;
        int i7 = 0;
        for (int i8 = 1; i8 <= i4; i8++) {
            i3 += i6;
            if (i3 <= 0 || i4 - i3 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i3 -= i4;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.c = iArr;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    final void a(eh ehVar, en enVar, cp cpVar) {
        super.a(ehVar, enVar, cpVar);
        x();
        if (enVar.a() > 0 && !enVar.g) {
            int b2 = b(ehVar, enVar, cpVar.f742a);
            while (b2 > 0 && cpVar.f742a > 0) {
                cpVar.f742a--;
                b2 = b(ehVar, enVar, cpVar.f742a);
            }
        }
        y();
    }

    private void y() {
        if (this.d == null || this.d.length != this.f736b) {
            this.d = new View[this.f736b];
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.ec
    public final int a(int i, eh ehVar, en enVar) {
        x();
        y();
        return super.a(i, ehVar, enVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.ec
    public final int b(int i, eh ehVar, en enVar) {
        x();
        y();
        return super.b(i, ehVar, enVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    final View a(eh ehVar, en enVar, int i, int i2, int i3) {
        View view;
        View view2 = null;
        l();
        int b2 = this.j.b();
        int c = this.j.c();
        int i4 = i2 > i ? 1 : -1;
        View view3 = null;
        while (i != i2) {
            View f = f(i);
            int a2 = a(f);
            if (a2 >= 0 && a2 < i3 && b(ehVar, enVar, a2) == 0) {
                if (((ed) f.getLayoutParams()).c.m()) {
                    if (view3 == null) {
                        view = view2;
                    }
                } else {
                    if (this.j.a(f) < c && this.j.b(f) >= b2) {
                        return f;
                    }
                    if (view2 == null) {
                        view = f;
                        f = view3;
                    }
                }
                i += i4;
                view2 = view;
                view3 = f;
            }
            view = view2;
            f = view3;
            i += i4;
            view2 = view;
            view3 = f;
        }
        return view2 != null ? view2 : view3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dd, code lost:
    
        r28.f745b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e2, code lost:
    
        return;
     */
    @Override // android.support.v7.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void a(android.support.v7.widget.eh r25, android.support.v7.widget.en r26, android.support.v7.widget.cr r27, android.support.v7.widget.cq r28) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ci.a(android.support.v7.widget.eh, android.support.v7.widget.en, android.support.v7.widget.cr, android.support.v7.widget.cq):void");
    }

    private void a(View view, int i, int i2, boolean z, boolean z2) {
        boolean a2;
        Rect rect = this.h;
        if (this.q == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(this.q.e(view));
        }
        ed edVar = (ed) view.getLayoutParams();
        if (z || this.i == 1) {
            i = c(i, edVar.leftMargin + this.h.left, edVar.rightMargin + this.h.right);
        }
        if (z || this.i == 0) {
            i2 = c(i2, edVar.topMargin + this.h.top, edVar.bottomMargin + this.h.bottom);
        }
        if (!z2) {
            a2 = a(view, i, i2, edVar);
        } else {
            a2 = (this.u && ec.b(view.getMeasuredWidth(), i, edVar.width) && ec.b(view.getMeasuredHeight(), i2, edVar.height)) ? false : true;
        }
        if (a2) {
            view.measure(i, i2);
        }
    }

    private static int c(int i, int i2, int i3) {
        if (i2 != 0 || i3 != 0) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                return View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - i2) - i3, mode);
            }
            return i;
        }
        return i;
    }

    private void a(eh ehVar, en enVar, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (z) {
            i3 = 1;
            i2 = 0;
        } else {
            i2 = i - 1;
            i3 = -1;
            i = -1;
        }
        if (this.i == 1 && k()) {
            i4 = this.f736b - 1;
            i5 = -1;
        } else {
            i4 = 0;
            i5 = 1;
        }
        int i9 = i4;
        for (int i10 = i2; i10 != i; i10 += i3) {
            View view = this.d[i10];
            ck ckVar = (ck) view.getLayoutParams();
            ckVar.f738b = c(ehVar, enVar, a(view));
            if (i5 == -1) {
                i7 = ckVar.f738b;
                if (i7 > 1) {
                    i8 = ckVar.f738b;
                    ckVar.f737a = i9 - (i8 - 1);
                    i6 = ckVar.f738b;
                    i9 += i6 * i5;
                }
            }
            ckVar.f737a = i9;
            i6 = ckVar.f738b;
            i9 += i6 * i5;
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.ec
    public final boolean g() {
        return this.n == null && !this.f735a;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.ec
    public final void c(eh ehVar, en enVar) {
        if (enVar.g) {
            int q = q();
            for (int i = 0; i < q; i++) {
                ck ckVar = (ck) f(i).getLayoutParams();
                int c = ckVar.c.c();
                this.e.put(c, ckVar.f738b);
                this.f.put(c, ckVar.f737a);
            }
        }
        super.c(ehVar, enVar);
        this.e.clear();
        this.f.clear();
        if (!enVar.g) {
            this.f735a = false;
        }
    }

    private void x() {
        int size;
        if (this.i == 1) {
            size = (View.MeasureSpec.getSize(this.v) - t()) - r();
        } else {
            size = (View.MeasureSpec.getSize(this.w) - u()) - s();
        }
        g(size);
    }

    private int a(eh ehVar, en enVar, int i) {
        if (!enVar.g) {
            return this.g.c(i, this.f736b);
        }
        int a2 = ehVar.a(i);
        if (a2 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        return this.g.c(a2, this.f736b);
    }

    private int b(eh ehVar, en enVar, int i) {
        if (!enVar.g) {
            return this.g.b(i, this.f736b);
        }
        int i2 = this.f.get(i, -1);
        if (i2 == -1) {
            int a2 = ehVar.a(i);
            if (a2 == -1) {
                Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
                return 0;
            }
            return this.g.b(a2, this.f736b);
        }
        return i2;
    }

    private int c(eh ehVar, en enVar, int i) {
        if (!enVar.g) {
            return this.g.a(i);
        }
        int i2 = this.e.get(i, -1);
        if (i2 == -1) {
            int a2 = ehVar.a(i);
            if (a2 == -1) {
                Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
                return 1;
            }
            return this.g.a(a2);
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x002c, code lost:
    
        r2 = r3;
     */
    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.ec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View a(android.view.View r21, int r22, android.support.v7.widget.eh r23, android.support.v7.widget.en r24) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ci.a(android.view.View, int, android.support.v7.widget.eh, android.support.v7.widget.en):android.view.View");
    }
}
