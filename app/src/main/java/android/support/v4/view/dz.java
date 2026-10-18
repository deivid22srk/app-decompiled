package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class dz implements eh {

    /* renamed from: a, reason: collision with root package name */
    WeakHashMap<View, Runnable> f380a = null;

    dz() {
    }

    @Override // android.support.v4.view.eh
    public void a(View view, long j) {
    }

    @Override // android.support.v4.view.eh
    public void a(dy dyVar, View view, float f) {
        d(dyVar, view);
    }

    @Override // android.support.v4.view.eh
    public void b(dy dyVar, View view, float f) {
        d(dyVar, view);
    }

    @Override // android.support.v4.view.eh
    public void c(dy dyVar, View view, float f) {
        d(dyVar, view);
    }

    @Override // android.support.v4.view.eh
    public long a(View view) {
        return 0L;
    }

    @Override // android.support.v4.view.eh
    public void a(View view, Interpolator interpolator) {
    }

    @Override // android.support.v4.view.eh
    public void b(View view, long j) {
    }

    @Override // android.support.v4.view.eh
    public void a(dy dyVar, View view) {
        d(dyVar, view);
    }

    @Override // android.support.v4.view.eh
    public void a(dy dyVar, View view, eo eoVar) {
        view.setTag(2113929216, eoVar);
    }

    @Override // android.support.v4.view.eh
    public void a(View view, eq eqVar) {
    }

    final void c(dy dyVar, View view) {
        eo eoVar;
        Runnable runnable;
        Runnable runnable2;
        Object tag = view.getTag(2113929216);
        if (!(tag instanceof eo)) {
            eoVar = null;
        } else {
            eoVar = (eo) tag;
        }
        runnable = dyVar.c;
        runnable2 = dyVar.d;
        if (runnable != null) {
            runnable.run();
        }
        if (eoVar != null) {
            eoVar.a(view);
            eoVar.b(view);
        }
        if (runnable2 != null) {
            runnable2.run();
        }
        if (this.f380a != null) {
            this.f380a.remove(view);
        }
    }

    private void d(dy dyVar, View view) {
        Runnable runnable = null;
        if (this.f380a != null) {
            runnable = this.f380a.get(view);
        }
        if (runnable == null) {
            runnable = new ea(this, dyVar, view, (byte) 0);
            if (this.f380a == null) {
                this.f380a = new WeakHashMap<>();
            }
            this.f380a.put(view, runnable);
        }
        view.removeCallbacks(runnable);
        view.post(runnable);
    }

    @Override // android.support.v4.view.eh
    public void b(dy dyVar, View view) {
        Runnable runnable;
        if (this.f380a != null && (runnable = this.f380a.get(view)) != null) {
            view.removeCallbacks(runnable);
        }
        c(dyVar, view);
    }
}
