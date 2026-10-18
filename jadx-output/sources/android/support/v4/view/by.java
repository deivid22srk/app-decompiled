package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class by {

    /* renamed from: a, reason: collision with root package name */
    static final cl f359a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            f359a = new ck();
            return;
        }
        if (i >= 21) {
            f359a = new cj();
            return;
        }
        if (i >= 19) {
            f359a = new ci();
            return;
        }
        if (i >= 17) {
            f359a = new cg();
            return;
        }
        if (i >= 16) {
            f359a = new cf();
            return;
        }
        if (i >= 15) {
            f359a = new cd();
            return;
        }
        if (i >= 14) {
            f359a = new ce();
            return;
        }
        if (i >= 11) {
            f359a = new cc();
            return;
        }
        if (i >= 9) {
            f359a = new cb();
        } else if (i >= 7) {
            f359a = new ca();
        } else {
            f359a = new bz();
        }
    }

    public static boolean a(View view, int i) {
        return f359a.a(view, i);
    }

    public static boolean b(View view, int i) {
        return f359a.b(view, i);
    }

    public static int a(View view) {
        return f359a.a(view);
    }

    public static void a(View view, a aVar) {
        f359a.a(view, aVar);
    }

    public static boolean b(View view) {
        return f359a.b(view);
    }

    public static boolean c(View view) {
        return f359a.c(view);
    }

    public static void d(View view) {
        f359a.d(view);
    }

    public static void a(View view, Runnable runnable) {
        f359a.a(view, runnable);
    }

    public static void a(View view, Runnable runnable, long j) {
        f359a.a(view, runnable, j);
    }

    public static int e(View view) {
        return f359a.e(view);
    }

    public static void c(View view, int i) {
        f359a.c(view, i);
    }

    public static float f(View view) {
        return f359a.f(view);
    }

    public static void a(View view, int i, Paint paint) {
        f359a.a(view, i, paint);
    }

    public static int g(View view) {
        return f359a.g(view);
    }

    public static int h(View view) {
        return f359a.h(view);
    }

    public static ViewParent i(View view) {
        return f359a.i(view);
    }

    public static int a(int i, int i2, int i3) {
        return f359a.a(i, i2, i3);
    }

    public static int j(View view) {
        return f359a.j(view);
    }

    public static int k(View view) {
        return f359a.k(view);
    }

    public static int l(View view) {
        return f359a.l(view);
    }

    public static int a(int i, int i2) {
        return f359a.a(i, i2);
    }

    public static void m(View view) {
        f359a.m(view);
    }

    public static int n(View view) {
        return f359a.n(view);
    }

    public static int o(View view) {
        return f359a.o(view);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f359a.a(view, i, i2, i3, i4);
    }

    public static float p(View view) {
        return f359a.q(view);
    }

    public static float q(View view) {
        return f359a.r(view);
    }

    public static int r(View view) {
        return f359a.t(view);
    }

    public static int s(View view) {
        return f359a.u(view);
    }

    public static dy t(View view) {
        return f359a.v(view);
    }

    public static void a(View view, float f) {
        f359a.a(view, f);
    }

    public static void b(View view, float f) {
        f359a.b(view, f);
    }

    public static void c(View view, float f) {
        f359a.c(view, f);
    }

    public static void d(View view, float f) {
        f359a.d(view, f);
    }

    public static void e(View view, float f) {
        f359a.e(view, f);
    }

    public static float u(View view) {
        return f359a.s(view);
    }

    public static void f(View view, float f) {
        f359a.f(view, f);
    }

    public static float v(View view) {
        return f359a.y(view);
    }

    public static void g(View view, float f) {
        f359a.g(view, f);
    }

    public static int w(View view) {
        return f359a.w(view);
    }

    public static void x(View view) {
        f359a.x(view);
    }

    public static void a(ViewGroup viewGroup) {
        f359a.a(viewGroup);
    }

    public static boolean y(View view) {
        return f359a.A(view);
    }

    public static void z(View view) {
        f359a.B(view);
    }

    public static void a(View view, bm bmVar) {
        f359a.a(view, bmVar);
    }

    public static er a(View view, er erVar) {
        return f359a.a(view, erVar);
    }

    public static er b(View view, er erVar) {
        return f359a.b(view, erVar);
    }

    public static void A(View view) {
        f359a.C(view);
    }

    public static void a(View view, boolean z) {
        f359a.a(view, z);
    }

    public static boolean B(View view) {
        return f359a.p(view);
    }

    public static boolean C(View view) {
        return f359a.D(view);
    }

    public static ColorStateList D(View view) {
        return f359a.F(view);
    }

    public static void a(View view, ColorStateList colorStateList) {
        f359a.a(view, colorStateList);
    }

    public static PorterDuff.Mode E(View view) {
        return f359a.G(view);
    }

    public static void a(View view, PorterDuff.Mode mode) {
        f359a.a(view, mode);
    }

    public static boolean F(View view) {
        return f359a.E(view);
    }

    public static void G(View view) {
        f359a.H(view);
    }

    public static boolean H(View view) {
        return f359a.I(view);
    }

    public static float I(View view) {
        return f359a.J(view);
    }

    public static boolean J(View view) {
        return f359a.K(view);
    }

    public static boolean K(View view) {
        return f359a.L(view);
    }

    public static void d(View view, int i) {
        f359a.d(view, i);
    }
}
