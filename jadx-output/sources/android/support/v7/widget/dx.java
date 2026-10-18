package android.support.v7.widget;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class dx {
    dy h = null;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<Object> f776a = new ArrayList<>();
    long i = 120;
    long j = 120;
    long k = 250;
    long l = 250;

    public abstract void a();

    public abstract boolean a(eq eqVar, dz dzVar, dz dzVar2);

    public abstract boolean a(eq eqVar, eq eqVar2, dz dzVar, dz dzVar2);

    public abstract boolean b();

    public abstract boolean b(eq eqVar, dz dzVar, dz dzVar2);

    public abstract void c(eq eqVar);

    public abstract boolean c(eq eqVar, dz dzVar, dz dzVar2);

    public abstract void d();

    static int d(eq eqVar) {
        int i;
        i = eqVar.l;
        int i2 = i & 14;
        if (eqVar.j()) {
            return 4;
        }
        if ((i2 & 4) != 0) {
            return i2;
        }
        int i3 = eqVar.c;
        int d = eqVar.d();
        if (i3 != -1 && d != -1 && i3 != d) {
            return i2 | 2048;
        }
        return i2;
    }

    public final void e(eq eqVar) {
        if (this.h != null) {
            this.h.a(eqVar);
        }
    }

    public boolean f(eq eqVar) {
        return true;
    }

    public boolean a(eq eqVar, List<Object> list) {
        return f(eqVar);
    }

    public final void e() {
        int size = this.f776a.size();
        for (int i = 0; i < size; i++) {
            this.f776a.get(i);
        }
        this.f776a.clear();
    }
}
