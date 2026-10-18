package android.support.v7.view;

import android.support.v4.view.dy;
import android.support.v4.view.eo;
import android.support.v4.view.ep;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    eo f572b;
    boolean c;
    private Interpolator e;
    private long d = -1;
    private final ep f = new m(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<dy> f571a = new ArrayList<>();

    public final l a(dy dyVar) {
        if (!this.c) {
            this.f571a.add(dyVar);
        }
        return this;
    }

    public final void a() {
        if (!this.c) {
            Iterator<dy> it = this.f571a.iterator();
            while (it.hasNext()) {
                dy next = it.next();
                if (this.d >= 0) {
                    next.a(this.d);
                }
                if (this.e != null) {
                    next.a(this.e);
                }
                if (this.f572b != null) {
                    next.a(this.f);
                }
                next.b();
            }
            this.c = true;
        }
    }

    public final void b() {
        if (this.c) {
            Iterator<dy> it = this.f571a.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.c = false;
        }
    }

    public final l c() {
        if (!this.c) {
            this.d = 250L;
        }
        return this;
    }

    public final l a(Interpolator interpolator) {
        if (!this.c) {
            this.e = interpolator;
        }
        return this;
    }

    public final l a(eo eoVar) {
        if (!this.c) {
            this.f572b = eoVar;
        }
        return this;
    }
}
