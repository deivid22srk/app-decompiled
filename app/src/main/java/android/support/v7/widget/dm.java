package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
final class dm extends dk {
    dm(ec ecVar) {
        super(ecVar, (byte) 0);
    }

    @Override // android.support.v7.widget.dk
    public final int c() {
        return View.MeasureSpec.getSize(this.f767a.w) - this.f767a.u();
    }

    @Override // android.support.v7.widget.dk
    public final int d() {
        return View.MeasureSpec.getSize(this.f767a.w);
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
            recyclerView.c.b(i2).offsetTopAndBottom(i);
        }
    }

    @Override // android.support.v7.widget.dk
    public final int b() {
        return this.f767a.s();
    }

    @Override // android.support.v7.widget.dk
    public final int c(View view) {
        ed edVar = (ed) view.getLayoutParams();
        return edVar.bottomMargin + ec.c(view) + edVar.topMargin;
    }

    @Override // android.support.v7.widget.dk
    public final int d(View view) {
        ed edVar = (ed) view.getLayoutParams();
        return edVar.rightMargin + ec.b(view) + edVar.leftMargin;
    }

    @Override // android.support.v7.widget.dk
    public final int b(View view) {
        ed edVar = (ed) view.getLayoutParams();
        return edVar.bottomMargin + ec.g(view);
    }

    @Override // android.support.v7.widget.dk
    public final int a(View view) {
        return ec.e(view) - ((ed) view.getLayoutParams()).topMargin;
    }

    @Override // android.support.v7.widget.dk
    public final int e() {
        return (View.MeasureSpec.getSize(this.f767a.w) - this.f767a.s()) - this.f767a.u();
    }

    @Override // android.support.v7.widget.dk
    public final int f() {
        return this.f767a.u();
    }

    @Override // android.support.v7.widget.dk
    public final int g() {
        return View.MeasureSpec.getMode(this.f767a.w);
    }

    @Override // android.support.v7.widget.dk
    public final int h() {
        return View.MeasureSpec.getMode(this.f767a.v);
    }
}
