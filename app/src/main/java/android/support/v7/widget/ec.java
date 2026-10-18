package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public abstract class ec {
    bn p;
    RecyclerView q;
    el r;
    int v;
    int w;

    /* renamed from: a, reason: collision with root package name */
    private boolean f782a = false;
    boolean s = false;
    boolean t = false;
    boolean u = true;

    public abstract ed f();

    static /* synthetic */ boolean c(ec ecVar) {
        ecVar.f782a = false;
        return false;
    }

    final void b(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.q = null;
            this.p = null;
            this.v = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
            this.w = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
            return;
        }
        this.q = recyclerView;
        this.p = recyclerView.c;
        this.v = View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824);
        this.w = View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824);
    }

    final void b(int i, int i2) {
        this.v = i;
        this.w = i2;
    }

    final void c(int i, int i2) {
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        int q = q();
        if (q == 0) {
            this.q.e(i, i2);
            return;
        }
        int i5 = 0;
        int i6 = Integer.MIN_VALUE;
        int i7 = Integer.MAX_VALUE;
        while (i5 < q) {
            View f = f(i5);
            ed edVar = (ed) f.getLayoutParams();
            int d = d(f) - edVar.leftMargin;
            int f2 = edVar.rightMargin + f(f);
            int e = e(f) - edVar.topMargin;
            int g = edVar.bottomMargin + g(f);
            if (d >= i7) {
                d = i7;
            }
            if (f2 <= i6) {
                f2 = i6;
            }
            if (e >= i3) {
                e = i3;
            }
            if (g <= i4) {
                g = i4;
            }
            i5++;
            i6 = f2;
            i3 = e;
            i7 = d;
            i4 = g;
        }
        this.q.w.set(i7, i3, i6, i4);
        a(this.q.w, i, i2);
    }

    public void a(Rect rect, int i, int i2) {
        e(a(i, rect.width() + r() + t(), android.support.v4.view.by.r(this.q)), a(i2, rect.height() + s() + u(), android.support.v4.view.by.s(this.q)));
    }

    public final void p() {
        if (this.q != null) {
            this.q.requestLayout();
        }
    }

    public static int a(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        switch (mode) {
            case Integer.MIN_VALUE:
                i2 = Math.min(size, i2);
                break;
            case 1073741824:
                return size;
        }
        return Math.max(i2, i3);
    }

    public void a(String str) {
        if (this.q != null) {
            this.q.a(str);
        }
    }

    public boolean g() {
        return false;
    }

    final void b(RecyclerView recyclerView, eh ehVar) {
        this.s = false;
        a(recyclerView, ehVar);
    }

    public void a(RecyclerView recyclerView, eh ehVar) {
    }

    public void c(eh ehVar, en enVar) {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public boolean a(ed edVar) {
        return edVar != null;
    }

    public ed a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ed) {
            return new ed((ed) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new ed((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new ed(layoutParams);
    }

    public ed a(Context context, AttributeSet attributeSet) {
        return new ed(context, attributeSet);
    }

    public int a(int i, eh ehVar, en enVar) {
        return 0;
    }

    public int b(int i, eh ehVar, en enVar) {
        return 0;
    }

    public boolean i() {
        return false;
    }

    public boolean j() {
        return false;
    }

    public void b(int i) {
    }

    public void a(RecyclerView recyclerView) {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    public final void a(el elVar) {
        if (this.r != null && elVar != this.r && this.r.k) {
            this.r.b();
        }
        this.r = elVar;
        el elVar2 = this.r;
        elVar2.h = this.q;
        elVar2.i = this;
        if (elVar2.g == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        elVar2.h.n.f791a = elVar2.g;
        elVar2.k = true;
        elVar2.j = true;
        elVar2.l = elVar2.h.e.a(elVar2.g);
        elVar2.h.ab.a();
    }

    final void a(View view, int i, boolean z) {
        eq b2 = RecyclerView.b(view);
        if (z || b2.m()) {
            this.q.d.a(b2);
        } else {
            this.q.d.b(b2);
        }
        ed edVar = (ed) view.getLayoutParams();
        if (b2.g() || b2.e()) {
            if (b2.e()) {
                b2.f();
            } else {
                b2.h();
            }
            this.p.a(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.q) {
            int c = this.p.c(view);
            if (i == -1) {
                i = this.p.a();
            }
            if (c == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.q.indexOfChild(view));
            }
            if (c != i) {
                ec ecVar = this.q.e;
                View f = ecVar.f(c);
                if (f == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + c);
                }
                ecVar.e(c);
                ed edVar2 = (ed) f.getLayoutParams();
                eq b3 = RecyclerView.b(f);
                if (b3.m()) {
                    ecVar.q.d.a(b3);
                } else {
                    ecVar.q.d.b(b3);
                }
                ecVar.p.a(f, i, edVar2, b3.m());
            }
        } else {
            this.p.a(view, i, false);
            edVar.e = true;
            if (this.r != null && this.r.k) {
                el elVar = this.r;
                if (RecyclerView.d(view) == elVar.g) {
                    elVar.l = view;
                }
            }
        }
        if (edVar.f) {
            b2.f795a.invalidate();
            edVar.f = false;
        }
    }

    public final void d(int i) {
        bn bnVar;
        int a2;
        View b2;
        if (f(i) == null || (b2 = bnVar.f706a.b((a2 = (bnVar = this.p).a(i)))) == null) {
            return;
        }
        if (bnVar.f707b.d(a2)) {
            bnVar.b(b2);
        }
        bnVar.f706a.a(a2);
    }

    public static int a(View view) {
        return ((ed) view.getLayoutParams()).c.c();
    }

    public View a(int i) {
        int q = q();
        for (int i2 = 0; i2 < q; i2++) {
            View f = f(i2);
            eq b2 = RecyclerView.b(f);
            if (b2 != null && b2.c() == i && !b2.b() && (this.q.n.g || !b2.m())) {
                return f;
            }
        }
        return null;
    }

    public final void e(int i) {
        f(i);
        this.p.d(i);
    }

    public final void a(int i, eh ehVar) {
        View f = f(i);
        d(i);
        ehVar.a(f);
    }

    public final int q() {
        if (this.p != null) {
            return this.p.a();
        }
        return 0;
    }

    public final View f(int i) {
        if (this.p != null) {
            return this.p.b(i);
        }
        return null;
    }

    public final int r() {
        if (this.q != null) {
            return this.q.getPaddingLeft();
        }
        return 0;
    }

    public final int s() {
        if (this.q != null) {
            return this.q.getPaddingTop();
        }
        return 0;
    }

    public final int t() {
        if (this.q != null) {
            return this.q.getPaddingRight();
        }
        return 0;
    }

    public final int u() {
        if (this.q != null) {
            return this.q.getPaddingBottom();
        }
        return 0;
    }

    public final int v() {
        dt adapter = this.q != null ? this.q.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    final boolean a(View view, int i, int i2, ed edVar) {
        return (!view.isLayoutRequested() && this.u && b(view.getWidth(), i, edVar.width) && b(view.getHeight(), i2, edVar.height)) ? false : true;
    }

    static boolean b(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        switch (mode) {
            case Integer.MIN_VALUE:
                if (size >= i) {
                    break;
                }
                break;
            case 0:
                break;
            case 1073741824:
                if (size == i) {
                    break;
                }
                break;
        }
        return false;
    }

    public static int a(int i, int i2, int i3, int i4, boolean z) {
        int i5 = 0;
        int max = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i5 = 1073741824;
                max = i4;
            } else if (i4 == -1) {
                switch (i2) {
                    case Integer.MIN_VALUE:
                    case 1073741824:
                        i5 = i2;
                        break;
                    case 0:
                    default:
                        max = 0;
                        break;
                }
            } else {
                if (i4 == -2) {
                    max = 0;
                }
                max = 0;
            }
        } else if (i4 >= 0) {
            i5 = 1073741824;
            max = i4;
        } else if (i4 == -1) {
            i5 = i2;
        } else {
            if (i4 == -2) {
                if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                    i5 = Integer.MIN_VALUE;
                }
            }
            max = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(max, i5);
    }

    public static int b(View view) {
        Rect rect = ((ed) view.getLayoutParams()).d;
        return rect.right + view.getMeasuredWidth() + rect.left;
    }

    public static int c(View view) {
        Rect rect = ((ed) view.getLayoutParams()).d;
        return rect.bottom + view.getMeasuredHeight() + rect.top;
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        Rect rect = ((ed) view.getLayoutParams()).d;
        view.layout(rect.left + i, rect.top + i2, i3 - rect.right, i4 - rect.bottom);
    }

    public static int d(View view) {
        return view.getLeft() - ((ed) view.getLayoutParams()).d.left;
    }

    public static int e(View view) {
        return view.getTop() - ((ed) view.getLayoutParams()).d.top;
    }

    public static int f(View view) {
        return ((ed) view.getLayoutParams()).d.right + view.getRight();
    }

    public static int g(View view) {
        return ((ed) view.getLayoutParams()).d.bottom + view.getBottom();
    }

    public View a(View view, int i, eh ehVar, en enVar) {
        return null;
    }

    public View a(View view, int i) {
        return null;
    }

    public void b() {
    }

    public void a() {
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public int c(en enVar) {
        return 0;
    }

    public int a(en enVar) {
        return 0;
    }

    public int e(en enVar) {
        return 0;
    }

    public int d(en enVar) {
        return 0;
    }

    public int b(en enVar) {
        return 0;
    }

    public int f(en enVar) {
        return 0;
    }

    public final void d(int i, int i2) {
        this.q.e(i, i2);
    }

    public final void e(int i, int i2) {
        this.q.setMeasuredDimension(i, i2);
    }

    public Parcelable h() {
        return null;
    }

    public void a(Parcelable parcelable) {
    }

    final void w() {
        if (this.r != null) {
            this.r.b();
        }
    }

    public final void b(eh ehVar) {
        for (int q = q() - 1; q >= 0; q--) {
            if (!RecyclerView.b(f(q)).b()) {
                a(q, ehVar);
            }
        }
    }

    public void a(AccessibilityEvent accessibilityEvent) {
        boolean z = true;
        eh ehVar = this.q.f627a;
        en enVar = this.q.n;
        android.support.v4.view.apkg.aj a2 = android.support.v4.view.apkg.a.a(accessibilityEvent);
        if (this.q == null) {
            return;
        }
        if (!android.support.v4.view.by.b((View) this.q, 1) && !android.support.v4.view.by.b((View) this.q, -1) && !android.support.v4.view.by.a((View) this.q, -1) && !android.support.v4.view.by.a((View) this.q, 1)) {
            z = false;
        }
        a2.a(z);
        if (this.q.x != null) {
            a2.a(this.q.x.a());
        }
    }

    final void a(View view, android.support.v4.view.apkg.j jVar) {
        eq b2 = RecyclerView.b(view);
        if (b2 != null && !b2.m() && !this.p.d(b2.f795a)) {
            a(this.q.f627a, this.q.n, view, jVar);
        }
    }

    public void a(eh ehVar, en enVar, View view, android.support.v4.view.apkg.j jVar) {
        jVar.a(android.support.v4.view.apkg.v.a(j() ? a(view) : 0, 1, i() ? a(view) : 0, 1, false));
    }

    public int a(eh ehVar, en enVar) {
        if (this.q == null || this.q.x == null || !j()) {
            return 1;
        }
        return this.q.x.a();
    }

    public int b(eh ehVar, en enVar) {
        if (this.q == null || this.q.x == null || !i()) {
            return 1;
        }
        return this.q.x.a();
    }

    final void c(RecyclerView recyclerView) {
        b(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    boolean m() {
        return false;
    }

    final void a(eh ehVar) {
        int size = ehVar.f785a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ehVar.f785a.get(i).f795a;
            eq b2 = RecyclerView.b(view);
            if (!b2.b()) {
                b2.a(false);
                if (b2.n()) {
                    this.q.removeDetachedView(view, false);
                }
                if (this.q.m != null) {
                    this.q.m.c(b2);
                }
                b2.a(true);
                ehVar.b(view);
            }
        }
        ehVar.f785a.clear();
        if (ehVar.f786b != null) {
            ehVar.f786b.clear();
        }
        if (size > 0) {
            this.q.invalidate();
        }
    }

    static /* synthetic */ void a(ec ecVar, el elVar) {
        if (ecVar.r != elVar) {
            return;
        }
        ecVar.r = null;
    }
}
