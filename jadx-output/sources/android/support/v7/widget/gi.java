package android.support.v7.widget;

/* loaded from: classes.dex */
final class gi {

    /* renamed from: a, reason: collision with root package name */
    final android.support.v4.h.a<eq, gj> f851a = new android.support.v4.h.a<>();

    /* renamed from: b, reason: collision with root package name */
    final android.support.v4.h.f<eq> f852b = new android.support.v4.h.f<>();

    gi() {
    }

    final void a() {
        this.f851a.clear();
        this.f852b.b();
    }

    final void a(eq eqVar, dz dzVar) {
        gj gjVar = this.f851a.get(eqVar);
        if (gjVar == null) {
            gjVar = gj.a();
            this.f851a.put(eqVar, gjVar);
        }
        gjVar.f854b = dzVar;
        gjVar.f853a |= 4;
    }

    final void a(long j, eq eqVar) {
        this.f852b.a(j, eqVar);
    }

    final void a(eq eqVar) {
        gj gjVar = this.f851a.get(eqVar);
        if (gjVar == null) {
            gjVar = gj.a();
            this.f851a.put(eqVar, gjVar);
        }
        gjVar.f853a |= 1;
    }

    final void b(eq eqVar) {
        gj gjVar = this.f851a.get(eqVar);
        if (gjVar != null) {
            gjVar.f853a &= -2;
        }
    }

    final void a(gk gkVar) {
        for (int size = this.f851a.size() - 1; size >= 0; size--) {
            eq b2 = this.f851a.b(size);
            gj d = this.f851a.d(size);
            if ((d.f853a & 3) == 3) {
                gkVar.a(b2);
            } else if ((d.f853a & 1) != 0) {
                gkVar.a(b2, d.f854b, d.c);
            } else if ((d.f853a & 14) == 14) {
                gkVar.b(b2, d.f854b, d.c);
            } else if ((d.f853a & 12) == 12) {
                gkVar.c(b2, d.f854b, d.c);
            } else if ((d.f853a & 4) != 0) {
                gkVar.a(b2, d.f854b, null);
            } else if ((d.f853a & 8) != 0) {
                gkVar.b(b2, d.f854b, d.c);
            } else {
                int i = d.f853a;
            }
            gj.a(d);
        }
    }

    final void c(eq eqVar) {
        int a2 = this.f852b.a() - 1;
        while (true) {
            if (a2 < 0) {
                break;
            }
            if (eqVar != this.f852b.b(a2)) {
                a2--;
            } else {
                android.support.v4.h.f<eq> fVar = this.f852b;
                if (fVar.c[a2] != android.support.v4.h.f.f285a) {
                    fVar.c[a2] = android.support.v4.h.f.f285a;
                    fVar.f286b = true;
                }
            }
        }
        gj remove = this.f851a.remove(eqVar);
        if (remove != null) {
            gj.a(remove);
        }
    }
}
