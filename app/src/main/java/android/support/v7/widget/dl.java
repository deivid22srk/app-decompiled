package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
final class dl extends dk {
    dl(ec ecVar) {
        super(ecVar, (byte) 0);
    }

    @Override // android.support.v7.widget.dk
    public final int c() {
        return View.MeasureSpec.getSize(this.f767a.v) - this.f767a.t();
    }

    @Override // android.support.v7.widget.dk
    public final int d() {
        return View.MeasureSpec.getSize(this.f767a.v);
    }

    @Override // android.support.v7.widget.dk
    public final void a(int i) {
        ec ecVar = this.f767a;
        if (ecVar.q == null) {
            return;
        }
        RecyclerView recyclerView = ecVar.q;
        int a2 = recyclerView.c.a();
        for (int i2 = 0; i2 < a2; i2++) {
            recyclerView.c.b(i2).offsetLeftAndRight(i);
        }
    }

    @Override // android.support.v7.widget.dk
    public final int b() {
        return this.f767a.r();
    }

    @Override // android.support.v7.widget.dk
    public final int c(View view) {
        ed edVar = (ed) view.getLayoutParams();
        return edVar.rightMargin + ec.b(view) + edVar.leftMargin;
    }

    @Override // android.support.v7.widget.dk
    public final int d(View view) {
        ed edVar = (ed) view.getLayoutParams();
        return edVar.bottomMargin + ec.c(view) + edVar.topMargin;
    }

    @Override // android.support.v7.widget.dk
    public final int b(View view) {
        ed edVar = (ed) view.getLayoutParams();
        return edVar.rightMargin + ec.f(view);
    }

    @Override // android.support.v7.widget.dk
    public final int a(View view) {
        return ec.d(view) - ((ed) view.getLayoutParams()).leftMargin;
    }

    @Override // android.support.v7.widget.dk
    public final int e() {
        return (View.MeasureSpec.getSize(this.f767a.v) - this.f767a.r()) - this.f767a.t();
    }

    @Override // android.support.v7.widget.dk
    public final int f() {
        return this.f767a.t();
    }

    @Override // android.support.v7.widget.dk
    public final int g() {
        return View.MeasureSpec.getMode(this.f767a.v);
    }

    @Override // android.support.v7.widget.dk
    public final int h() {
        return View.MeasureSpec.getMode(this.f767a.w);
    }
}
