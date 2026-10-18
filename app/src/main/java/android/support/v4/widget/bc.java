package android.support.v4.widget;

import android.content.Context;
import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class bc {

    /* renamed from: a, reason: collision with root package name */
    Object f436a;

    /* renamed from: b, reason: collision with root package name */
    bd f437b;

    public static bc a(Context context, Interpolator interpolator) {
        return new bc(Build.VERSION.SDK_INT, context, interpolator);
    }

    private bc(int i, Context context, Interpolator interpolator) {
        if (i >= 14) {
            this.f437b = new bg();
        } else if (i >= 9) {
            this.f437b = new bf();
        } else {
            this.f437b = new be();
        }
        this.f436a = this.f437b.a(context, interpolator);
    }

    public final boolean a() {
        return this.f437b.a(this.f436a);
    }

    public final int b() {
        return this.f437b.b(this.f436a);
    }

    public final int c() {
        return this.f437b.c(this.f436a);
    }

    public final int d() {
        return this.f437b.g(this.f436a);
    }

    public final int e() {
        return this.f437b.h(this.f436a);
    }

    public final float f() {
        return this.f437b.d(this.f436a);
    }

    public final boolean g() {
        return this.f437b.e(this.f436a);
    }

    public final void a(int i, int i2, int i3, int i4, int i5) {
        this.f437b.a(this.f436a, i, i2, i3, i4, i5);
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.f437b.a(this.f436a, i, i2, i3, i4);
    }

    public final boolean a(int i, int i2, int i3) {
        return this.f437b.b(this.f436a, i, i2, i3);
    }

    public final void h() {
        this.f437b.f(this.f436a);
    }
}
