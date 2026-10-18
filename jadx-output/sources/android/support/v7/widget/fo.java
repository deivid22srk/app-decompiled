package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
public abstract class fo extends dx {
    boolean m = true;

    public abstract boolean a(eq eqVar);

    public abstract boolean a(eq eqVar, int i, int i2, int i3, int i4);

    public abstract boolean a(eq eqVar, eq eqVar2, int i, int i2, int i3, int i4);

    public abstract boolean b(eq eqVar);

    @Override // android.support.v7.widget.dx
    public final boolean f(eq eqVar) {
        return !this.m || eqVar.j();
    }

    @Override // android.support.v7.widget.dx
    public final boolean a(eq eqVar, dz dzVar, dz dzVar2) {
        int i = dzVar.f777a;
        int i2 = dzVar.f778b;
        View view = eqVar.f795a;
        int left = dzVar2 == null ? view.getLeft() : dzVar2.f777a;
        int top = dzVar2 == null ? view.getTop() : dzVar2.f778b;
        if (!eqVar.m() && (i != left || i2 != top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            return a(eqVar, i, i2, left, top);
        }
        return a(eqVar);
    }

    @Override // android.support.v7.widget.dx
    public final boolean b(eq eqVar, dz dzVar, dz dzVar2) {
        return (dzVar == null || (dzVar.f777a == dzVar2.f777a && dzVar.f778b == dzVar2.f778b)) ? b(eqVar) : a(eqVar, dzVar.f777a, dzVar.f778b, dzVar2.f777a, dzVar2.f778b);
    }

    @Override // android.support.v7.widget.dx
    public final boolean c(eq eqVar, dz dzVar, dz dzVar2) {
        if (dzVar.f777a != dzVar2.f777a || dzVar.f778b != dzVar2.f778b) {
            return a(eqVar, dzVar.f777a, dzVar.f778b, dzVar2.f777a, dzVar2.f778b);
        }
        e(eqVar);
        return false;
    }

    @Override // android.support.v7.widget.dx
    public final boolean a(eq eqVar, eq eqVar2, dz dzVar, dz dzVar2) {
        int i;
        int i2;
        int i3 = dzVar.f777a;
        int i4 = dzVar.f778b;
        if (eqVar2.b()) {
            i = dzVar.f777a;
            i2 = dzVar.f778b;
        } else {
            i = dzVar2.f777a;
            i2 = dzVar2.f778b;
        }
        return a(eqVar, eqVar2, i3, i4, i, i2);
    }
}
