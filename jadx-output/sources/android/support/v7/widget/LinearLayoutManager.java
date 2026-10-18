package android.support.v7.widget;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public class LinearLayoutManager extends ec {

    /* renamed from: a, reason: collision with root package name */
    private cr f623a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f624b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    public int i;
    dk j;
    boolean k;
    int l;
    int m;
    SavedState n;
    final cp o;

    public LinearLayoutManager() {
        this(1);
    }

    public LinearLayoutManager(int i) {
        this.c = false;
        this.k = false;
        this.d = false;
        this.e = true;
        this.l = -1;
        this.m = Integer.MIN_VALUE;
        this.n = null;
        this.o = new cp(this);
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        a((String) null);
        if (i != this.i) {
            this.i = i;
            this.j = null;
            p();
        }
        a((String) null);
        if (this.c) {
            this.c = false;
            p();
        }
        this.t = true;
    }

    @Override // android.support.v7.widget.ec
    public ed f() {
        return new ed(-2, -2);
    }

    @Override // android.support.v7.widget.ec
    public final void a(RecyclerView recyclerView, eh ehVar) {
        super.a(recyclerView, ehVar);
        if (this.f) {
            b(ehVar);
            ehVar.a();
        }
    }

    @Override // android.support.v7.widget.ec
    public final void a(AccessibilityEvent accessibilityEvent) {
        super.a(accessibilityEvent);
        if (q() > 0) {
            android.support.v4.view.a.aj a2 = android.support.v4.view.a.a.a(accessibilityEvent);
            a2.b(n());
            a2.c(o());
        }
    }

    @Override // android.support.v7.widget.ec
    public final Parcelable h() {
        if (this.n != null) {
            return new SavedState(this.n);
        }
        SavedState savedState = new SavedState();
        if (q() > 0) {
            l();
            boolean z = this.f624b ^ this.k;
            savedState.c = z;
            if (z) {
                View z2 = z();
                savedState.f626b = this.j.c() - this.j.b(z2);
                savedState.f625a = a(z2);
                return savedState;
            }
            View y = y();
            savedState.f625a = a(y);
            savedState.f626b = this.j.a(y) - this.j.b();
            return savedState;
        }
        savedState.f625a = -1;
        return savedState;
    }

    @Override // android.support.v7.widget.ec
    public final void a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.n = (SavedState) parcelable;
            p();
        }
    }

    @Override // android.support.v7.widget.ec
    public final boolean i() {
        return this.i == 0;
    }

    @Override // android.support.v7.widget.ec
    public final boolean j() {
        return this.i == 1;
    }

    private void x() {
        boolean z = true;
        if (this.i == 1 || !k()) {
            z = this.c;
        } else if (this.c) {
            z = false;
        }
        this.k = z;
    }

    @Override // android.support.v7.widget.ec
    public final View a(int i) {
        int q = q();
        if (q == 0) {
            return null;
        }
        int a2 = i - a(f(0));
        if (a2 >= 0 && a2 < q) {
            View f = f(a2);
            if (a(f) == i) {
                return f;
            }
        }
        return super.a(i);
    }

    @Override // android.support.v7.widget.ec
    public final void a(RecyclerView recyclerView) {
        co coVar = new co(this, recyclerView.getContext());
        coVar.g = 0;
        a(coVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    @Override // android.support.v7.widget.ec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.support.v7.widget.eh r13, android.support.v7.widget.en r14) {
        /*
            Method dump skipped, instructions count: 1375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.c(android.support.v7.widget.eh, android.support.v7.widget.en):void");
    }

    void a(eh ehVar, en enVar, cp cpVar) {
    }

    private int a(int i, eh ehVar, en enVar, boolean z) {
        int c;
        int c2 = this.j.c() - i;
        if (c2 > 0) {
            int i2 = -c(-c2, ehVar, enVar);
            int i3 = i + i2;
            if (z && (c = this.j.c() - i3) > 0) {
                this.j.a(c);
                return i2 + c;
            }
            return i2;
        }
        return 0;
    }

    private int b(int i, eh ehVar, en enVar, boolean z) {
        int b2;
        int b3 = i - this.j.b();
        if (b3 > 0) {
            int i2 = -c(b3, ehVar, enVar);
            int i3 = i + i2;
            if (z && (b2 = i3 - this.j.b()) > 0) {
                this.j.a(-b2);
                return i2 - b2;
            }
            return i2;
        }
        return 0;
    }

    private void a(cp cpVar) {
        f(cpVar.f742a, cpVar.f743b);
    }

    private void f(int i, int i2) {
        this.f623a.c = this.j.c() - i2;
        this.f623a.e = this.k ? -1 : 1;
        this.f623a.d = i;
        this.f623a.f = 1;
        this.f623a.f747b = i2;
        this.f623a.g = Integer.MIN_VALUE;
    }

    private void b(cp cpVar) {
        g(cpVar.f742a, cpVar.f743b);
    }

    private void g(int i, int i2) {
        this.f623a.c = i2 - this.j.b();
        this.f623a.d = i;
        this.f623a.e = this.k ? 1 : -1;
        this.f623a.f = -1;
        this.f623a.f747b = i2;
        this.f623a.g = Integer.MIN_VALUE;
    }

    final void l() {
        dk dmVar;
        if (this.f623a == null) {
            this.f623a = new cr();
        }
        if (this.j != null) {
            return;
        }
        switch (this.i) {
            case 0:
                dmVar = new dl(this);
                break;
            case 1:
                dmVar = new dm(this);
                break;
            default:
                throw new IllegalArgumentException("invalid orientation");
        }
        this.j = dmVar;
    }

    @Override // android.support.v7.widget.ec
    public final void b(int i) {
        this.l = i;
        this.m = Integer.MIN_VALUE;
        if (this.n != null) {
            this.n.f625a = -1;
        }
        p();
    }

    public final void a(int i, int i2) {
        this.l = i;
        this.m = i2;
        if (this.n != null) {
            this.n.f625a = -1;
        }
        p();
    }

    @Override // android.support.v7.widget.ec
    public int a(int i, eh ehVar, en enVar) {
        if (this.i == 1) {
            return 0;
        }
        return c(i, ehVar, enVar);
    }

    @Override // android.support.v7.widget.ec
    public int b(int i, eh ehVar, en enVar) {
        if (this.i == 0) {
            return 0;
        }
        return c(i, ehVar, enVar);
    }

    @Override // android.support.v7.widget.ec
    public final int a(en enVar) {
        return h(enVar);
    }

    @Override // android.support.v7.widget.ec
    public final int b(en enVar) {
        return h(enVar);
    }

    @Override // android.support.v7.widget.ec
    public final int c(en enVar) {
        return i(enVar);
    }

    @Override // android.support.v7.widget.ec
    public final int d(en enVar) {
        return i(enVar);
    }

    @Override // android.support.v7.widget.ec
    public final int e(en enVar) {
        return j(enVar);
    }

    @Override // android.support.v7.widget.ec
    public final int f(en enVar) {
        return j(enVar);
    }

    private int h(en enVar) {
        if (q() == 0) {
            return 0;
        }
        l();
        dk dkVar = this.j;
        View a2 = a(!this.e);
        View b2 = b(this.e ? false : true);
        boolean z = this.e;
        boolean z2 = this.k;
        if (q() == 0 || enVar.a() == 0 || a2 == null || b2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (enVar.a() - Math.max(ec.a(a2), ec.a(b2))) - 1) : Math.max(0, Math.min(ec.a(a2), ec.a(b2)));
        if (z) {
            return Math.round((dkVar.b() - dkVar.a(a2)) + ((Math.abs(dkVar.b(b2) - dkVar.a(a2)) / (Math.abs(ec.a(a2) - ec.a(b2)) + 1)) * max));
        }
        return max;
    }

    private int i(en enVar) {
        if (q() == 0) {
            return 0;
        }
        l();
        dk dkVar = this.j;
        View a2 = a(!this.e);
        View b2 = b(this.e ? false : true);
        boolean z = this.e;
        if (q() == 0 || enVar.a() == 0 || a2 == null || b2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(ec.a(a2) - ec.a(b2)) + 1;
        }
        return Math.min(dkVar.e(), dkVar.b(b2) - dkVar.a(a2));
    }

    private int j(en enVar) {
        if (q() == 0) {
            return 0;
        }
        l();
        dk dkVar = this.j;
        View a2 = a(!this.e);
        View b2 = b(this.e ? false : true);
        boolean z = this.e;
        if (q() == 0 || enVar.a() == 0 || a2 == null || b2 == null) {
            return 0;
        }
        if (!z) {
            return enVar.a();
        }
        return (int) (((dkVar.b(b2) - dkVar.a(a2)) / (Math.abs(ec.a(a2) - ec.a(b2)) + 1)) * enVar.a());
    }

    private void a(int i, int i2, boolean z, en enVar) {
        int b2;
        this.f623a.l = this.j.g() == 0;
        this.f623a.h = g(enVar);
        this.f623a.f = i;
        if (i == 1) {
            this.f623a.h += this.j.f();
            View z2 = z();
            this.f623a.e = this.k ? -1 : 1;
            this.f623a.d = a(z2) + this.f623a.e;
            this.f623a.f747b = this.j.b(z2);
            b2 = this.j.b(z2) - this.j.c();
        } else {
            View y = y();
            this.f623a.h += this.j.b();
            this.f623a.e = this.k ? 1 : -1;
            this.f623a.d = a(y) + this.f623a.e;
            this.f623a.f747b = this.j.a(y);
            b2 = (-this.j.a(y)) + this.j.b();
        }
        this.f623a.c = i2;
        if (z) {
            this.f623a.c -= b2;
        }
        this.f623a.g = b2;
    }

    private int c(int i, eh ehVar, en enVar) {
        if (q() == 0 || i == 0) {
            return 0;
        }
        this.f623a.f746a = true;
        l();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        a(i2, abs, true, enVar);
        int a2 = this.f623a.g + a(ehVar, this.f623a, enVar, false);
        if (a2 < 0) {
            return 0;
        }
        if (abs > a2) {
            i = i2 * a2;
        }
        this.j.a(-i);
        this.f623a.j = i;
        return i;
    }

    @Override // android.support.v7.widget.ec
    public final void a(String str) {
        if (this.n == null) {
            super.a(str);
        }
    }

    private void a(eh ehVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    a(i3, ehVar);
                }
                return;
            }
            while (i > i2) {
                a(i, ehVar);
                i--;
            }
        }
    }

    private void a(eh ehVar, cr crVar) {
        if (crVar.f746a && !crVar.l) {
            if (crVar.f == -1) {
                int i = crVar.g;
                int q = q();
                if (i >= 0) {
                    int d = this.j.d() - i;
                    if (this.k) {
                        for (int i2 = 0; i2 < q; i2++) {
                            if (this.j.a(f(i2)) < d) {
                                a(ehVar, 0, i2);
                                return;
                            }
                        }
                        return;
                    }
                    for (int i3 = q - 1; i3 >= 0; i3--) {
                        if (this.j.a(f(i3)) < d) {
                            a(ehVar, q - 1, i3);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            int i4 = crVar.g;
            if (i4 >= 0) {
                int q2 = q();
                if (this.k) {
                    for (int i5 = q2 - 1; i5 >= 0; i5--) {
                        if (this.j.b(f(i5)) > i4) {
                            a(ehVar, q2 - 1, i5);
                            return;
                        }
                    }
                    return;
                }
                for (int i6 = 0; i6 < q2; i6++) {
                    if (this.j.b(f(i6)) > i4) {
                        a(ehVar, 0, i6);
                        return;
                    }
                }
            }
        }
    }

    private int a(eh ehVar, cr crVar, en enVar, boolean z) {
        int i = crVar.c;
        if (crVar.g != Integer.MIN_VALUE) {
            if (crVar.c < 0) {
                crVar.g += crVar.c;
            }
            a(ehVar, crVar);
        }
        int i2 = crVar.c + crVar.h;
        cq cqVar = new cq();
        while (true) {
            if ((!crVar.l && i2 <= 0) || !crVar.a(enVar)) {
                break;
            }
            cqVar.f744a = 0;
            cqVar.f745b = false;
            cqVar.c = false;
            cqVar.d = false;
            a(ehVar, enVar, crVar, cqVar);
            if (!cqVar.f745b) {
                crVar.f747b += cqVar.f744a * crVar.f;
                if (!cqVar.c || this.f623a.k != null || !enVar.g) {
                    crVar.c -= cqVar.f744a;
                    i2 -= cqVar.f744a;
                }
                if (crVar.g != Integer.MIN_VALUE) {
                    crVar.g += cqVar.f744a;
                    if (crVar.c < 0) {
                        crVar.g += crVar.c;
                    }
                    a(ehVar, crVar);
                }
                if (z && cqVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - crVar.c;
    }

    void a(eh ehVar, en enVar, cr crVar, cq cqVar) {
        int s;
        int d;
        int i;
        int i2;
        int r;
        int d2;
        View a2 = crVar.a(ehVar);
        if (a2 == null) {
            cqVar.f745b = true;
            return;
        }
        ed edVar = (ed) a2.getLayoutParams();
        if (crVar.k == null) {
            if (this.k == (crVar.f == -1)) {
                super.a(a2, -1, false);
            } else {
                super.a(a2, 0, false);
            }
        } else {
            if (this.k == (crVar.f == -1)) {
                super.a(a2, -1, true);
            } else {
                super.a(a2, 0, true);
            }
        }
        ed edVar2 = (ed) a2.getLayoutParams();
        Rect e = this.q.e(a2);
        int i3 = e.left + e.right + 0;
        int i4 = e.bottom + e.top + 0;
        int a3 = ec.a(View.MeasureSpec.getSize(this.v), View.MeasureSpec.getMode(this.v), i3 + r() + t() + edVar2.leftMargin + edVar2.rightMargin, edVar2.width, i());
        int a4 = ec.a(View.MeasureSpec.getSize(this.w), View.MeasureSpec.getMode(this.w), i4 + s() + u() + edVar2.topMargin + edVar2.bottomMargin, edVar2.height, j());
        if (a(a2, a3, a4, edVar2)) {
            a2.measure(a3, a4);
        }
        cqVar.f744a = this.j.c(a2);
        if (this.i == 1) {
            if (k()) {
                d2 = View.MeasureSpec.getSize(this.v) - t();
                r = d2 - this.j.d(a2);
            } else {
                r = r();
                d2 = this.j.d(a2) + r;
            }
            if (crVar.f == -1) {
                int i5 = crVar.f747b;
                s = crVar.f747b - cqVar.f744a;
                i = r;
                i2 = d2;
                d = i5;
            } else {
                s = crVar.f747b;
                i = r;
                i2 = d2;
                d = crVar.f747b + cqVar.f744a;
            }
        } else {
            s = s();
            d = this.j.d(a2) + s;
            if (crVar.f == -1) {
                i2 = crVar.f747b;
                i = crVar.f747b - cqVar.f744a;
            } else {
                i = crVar.f747b;
                i2 = crVar.f747b + cqVar.f744a;
            }
        }
        a(a2, i + edVar.leftMargin, s + edVar.topMargin, i2 - edVar.rightMargin, d - edVar.bottomMargin);
        if (edVar.c.m() || edVar.c.s()) {
            cqVar.c = true;
        }
        cqVar.d = a2.isFocusable();
    }

    final int c(int i) {
        switch (i) {
            case 1:
                return -1;
            case 2:
                return 1;
            case 17:
                return this.i != 0 ? Integer.MIN_VALUE : -1;
            case 33:
                return this.i != 1 ? Integer.MIN_VALUE : -1;
            case 66:
                return this.i == 0 ? 1 : Integer.MIN_VALUE;
            case 130:
                return this.i == 1 ? 1 : Integer.MIN_VALUE;
            default:
                return Integer.MIN_VALUE;
        }
    }

    private View y() {
        return f(this.k ? q() - 1 : 0);
    }

    private View z() {
        return f(this.k ? 0 : q() - 1);
    }

    private View a(boolean z) {
        return this.k ? a(q() - 1, -1, z) : a(0, q(), z);
    }

    private View b(boolean z) {
        return this.k ? a(0, q(), z) : a(q() - 1, -1, z);
    }

    private View d(eh ehVar, en enVar) {
        return this.k ? f(ehVar, enVar) : g(ehVar, enVar);
    }

    private View e(eh ehVar, en enVar) {
        return this.k ? g(ehVar, enVar) : f(ehVar, enVar);
    }

    private View f(eh ehVar, en enVar) {
        return a(ehVar, enVar, 0, q(), enVar.a());
    }

    private View g(eh ehVar, en enVar) {
        return a(ehVar, enVar, q() - 1, -1, enVar.a());
    }

    View a(eh ehVar, en enVar, int i, int i2, int i3) {
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
            if (a2 >= 0 && a2 < i3) {
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

    public final int n() {
        View a2 = a(0, q(), false);
        if (a2 == null) {
            return -1;
        }
        return a(a2);
    }

    public final int o() {
        View a2 = a(q() - 1, -1, false);
        if (a2 == null) {
            return -1;
        }
        return a(a2);
    }

    private View a(int i, int i2, boolean z) {
        l();
        int b2 = this.j.b();
        int c = this.j.c();
        int i3 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View f = f(i);
            int a2 = this.j.a(f);
            int b3 = this.j.b(f);
            if (a2 < c && b3 > b2) {
                if (z) {
                    if (a2 < b2 || b3 > c) {
                        if (view == null) {
                            i += i3;
                            view = f;
                        }
                    } else {
                        return f;
                    }
                } else {
                    return f;
                }
            }
            f = view;
            i += i3;
            view = f;
        }
        return view;
    }

    @Override // android.support.v7.widget.ec
    public View a(View view, int i, eh ehVar, en enVar) {
        int c;
        View d;
        View z;
        x();
        if (q() == 0 || (c = c(i)) == Integer.MIN_VALUE) {
            return null;
        }
        l();
        if (c == -1) {
            d = e(ehVar, enVar);
        } else {
            d = d(ehVar, enVar);
        }
        if (d == null) {
            return null;
        }
        l();
        a(c, (int) (0.33333334f * this.j.e()), false, enVar);
        this.f623a.g = Integer.MIN_VALUE;
        this.f623a.f746a = false;
        a(ehVar, this.f623a, enVar, true);
        if (c == -1) {
            z = y();
        } else {
            z = z();
        }
        if (z == d || !z.isFocusable()) {
            return null;
        }
        return z;
    }

    @Override // android.support.v7.widget.ec
    public boolean g() {
        return this.n == null && this.f624b == this.d;
    }

    public class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new cs();

        /* renamed from: a, reason: collision with root package name */
        int f625a;

        /* renamed from: b, reason: collision with root package name */
        int f626b;
        boolean c;

        public SavedState() {
        }

        SavedState(Parcel parcel) {
            this.f625a = parcel.readInt();
            this.f626b = parcel.readInt();
            this.c = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f625a = savedState.f625a;
            this.f626b = savedState.f626b;
            this.c = savedState.c;
        }

        final boolean a() {
            return this.f625a >= 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f625a);
            parcel.writeInt(this.f626b);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    private int g(en enVar) {
        if (enVar.f791a != -1) {
            return this.j.e();
        }
        return 0;
    }

    protected final boolean k() {
        return android.support.v4.view.by.h(this.q) == 1;
    }

    @Override // android.support.v7.widget.ec
    final boolean m() {
        boolean z;
        if (View.MeasureSpec.getMode(this.w) != 1073741824 && View.MeasureSpec.getMode(this.v) != 1073741824) {
            int q = q();
            int i = 0;
            while (true) {
                if (i >= q) {
                    z = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = f(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
