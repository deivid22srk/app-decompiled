package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
final class ds implements ag {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RecyclerView f773a;

    ds(RecyclerView recyclerView) {
        this.f773a = recyclerView;
    }

    @Override // android.support.v7.widget.ag
    public final eq a(int i) {
        eq eqVar;
        RecyclerView recyclerView = this.f773a;
        int b2 = recyclerView.c.b();
        int i2 = 0;
        while (true) {
            if (i2 < b2) {
                eqVar = RecyclerView.b(recyclerView.c.c(i2));
                if (eqVar != null && !eqVar.m() && eqVar.f796b == i) {
                    break;
                }
                i2++;
            } else {
                eqVar = null;
                break;
            }
        }
        if (eqVar == null || this.f773a.c.d(eqVar.f795a)) {
            return null;
        }
        return eqVar;
    }

    @Override // android.support.v7.widget.ag
    public final void a(int i, int i2) {
        this.f773a.a(i, i2, true);
        this.f773a.o = true;
        this.f773a.n.e += i2;
    }

    @Override // android.support.v7.widget.ag
    public final void b(int i, int i2) {
        this.f773a.a(i, i2, false);
        this.f773a.o = true;
    }

    @Override // android.support.v7.widget.ag
    public final void a(int i, int i2, Object obj) {
        int c;
        RecyclerView recyclerView = this.f773a;
        int b2 = recyclerView.c.b();
        int i3 = i + i2;
        for (int i4 = 0; i4 < b2; i4++) {
            View c2 = recyclerView.c.c(i4);
            eq b3 = RecyclerView.b(c2);
            if (b3 != null && !b3.b() && b3.f796b >= i && b3.f796b < i3) {
                b3.b(2);
                b3.a(obj);
                ((ed) c2.getLayoutParams()).e = true;
            }
        }
        eh ehVar = recyclerView.f627a;
        int i5 = i + i2;
        for (int size = ehVar.c.size() - 1; size >= 0; size--) {
            eq eqVar = ehVar.c.get(size);
            if (eqVar != null && (c = eqVar.c()) >= i && c < i5) {
                eqVar.b(2);
                ehVar.c(size);
            }
        }
        this.f773a.p = true;
    }

    @Override // android.support.v7.widget.ag
    public final void a(ah ahVar) {
        c(ahVar);
    }

    private void c(ah ahVar) {
        switch (ahVar.f650a) {
            case 1:
                this.f773a.e.a();
                break;
            case 2:
                this.f773a.e.c();
                break;
            case 4:
                this.f773a.e.d();
                break;
            case 8:
                this.f773a.e.e();
                break;
        }
    }

    @Override // android.support.v7.widget.ag
    public final void b(ah ahVar) {
        c(ahVar);
    }

    @Override // android.support.v7.widget.ag
    public final void c(int i, int i2) {
        RecyclerView recyclerView = this.f773a;
        int b2 = recyclerView.c.b();
        for (int i3 = 0; i3 < b2; i3++) {
            eq b3 = RecyclerView.b(recyclerView.c.c(i3));
            if (b3 != null && !b3.b() && b3.f796b >= i) {
                b3.a(i2, false);
                recyclerView.n.f = true;
            }
        }
        eh ehVar = recyclerView.f627a;
        int size = ehVar.c.size();
        for (int i4 = 0; i4 < size; i4++) {
            eq eqVar = ehVar.c.get(i4);
            if (eqVar != null && eqVar.f796b >= i) {
                eqVar.a(i2, true);
            }
        }
        recyclerView.requestLayout();
        this.f773a.o = true;
    }

    @Override // android.support.v7.widget.ag
    public final void d(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = -1;
        RecyclerView recyclerView = this.f773a;
        int b2 = recyclerView.c.b();
        if (i < i2) {
            i3 = -1;
            i4 = i2;
            i5 = i;
        } else {
            i3 = 1;
            i4 = i;
            i5 = i2;
        }
        for (int i9 = 0; i9 < b2; i9++) {
            eq b3 = RecyclerView.b(recyclerView.c.c(i9));
            if (b3 != null && b3.f796b >= i5 && b3.f796b <= i4) {
                if (b3.f796b == i) {
                    b3.a(i2 - i, false);
                } else {
                    b3.a(i3, false);
                }
                recyclerView.n.f = true;
            }
        }
        eh ehVar = recyclerView.f627a;
        if (i < i2) {
            i6 = i2;
            i7 = i;
        } else {
            i8 = 1;
            i6 = i;
            i7 = i2;
        }
        int size = ehVar.c.size();
        for (int i10 = 0; i10 < size; i10++) {
            eq eqVar = ehVar.c.get(i10);
            if (eqVar != null && eqVar.f796b >= i7 && eqVar.f796b <= i6) {
                if (eqVar.f796b == i) {
                    eqVar.a(i2 - i, false);
                } else {
                    eqVar.a(i8, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.f773a.o = true;
    }
}
