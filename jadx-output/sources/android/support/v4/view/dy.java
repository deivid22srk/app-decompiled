package android.support.v4.view;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class dy {

    /* renamed from: b, reason: collision with root package name */
    public static final eh f378b;

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<View> f379a;
    private Runnable c = null;
    private Runnable d = null;
    private int e = -1;

    static /* synthetic */ int c(dy dyVar) {
        dyVar.e = -1;
        return -1;
    }

    dy(View view) {
        this.f379a = new WeakReference<>(view);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f378b = new eg();
            return;
        }
        if (i >= 19) {
            f378b = new ef();
            return;
        }
        if (i >= 18) {
            f378b = new ed();
            return;
        }
        if (i >= 16) {
            f378b = new ee();
        } else if (i >= 14) {
            f378b = new eb();
        } else {
            f378b = new dz();
        }
    }

    public final dy a(long j) {
        View view = this.f379a.get();
        if (view != null) {
            f378b.a(view, j);
        }
        return this;
    }

    public final dy a(float f) {
        View view = this.f379a.get();
        if (view != null) {
            f378b.a(this, view, f);
        }
        return this;
    }

    public final dy b(float f) {
        View view = this.f379a.get();
        if (view != null) {
            f378b.b(this, view, f);
        }
        return this;
    }

    public final dy c(float f) {
        View view = this.f379a.get();
        if (view != null) {
            f378b.c(this, view, f);
        }
        return this;
    }

    public final dy a(Interpolator interpolator) {
        View view = this.f379a.get();
        if (view != null) {
            f378b.a(view, interpolator);
        }
        return this;
    }

    public final dy b(long j) {
        View view = this.f379a.get();
        if (view != null) {
            f378b.b(view, j);
        }
        return this;
    }

    public final void a() {
        View view = this.f379a.get();
        if (view != null) {
            f378b.a(this, view);
        }
    }

    public final void b() {
        View view = this.f379a.get();
        if (view != null) {
            f378b.b(this, view);
        }
    }

    public final dy a(eo eoVar) {
        View view = this.f379a.get();
        if (view != null) {
            f378b.a(this, view, eoVar);
        }
        return this;
    }

    public final dy a(eq eqVar) {
        View view = this.f379a.get();
        if (view != null) {
            f378b.a(view, eqVar);
        }
        return this;
    }
}
