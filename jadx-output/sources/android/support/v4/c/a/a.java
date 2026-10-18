package android.support.v4.c.a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    static final c f263a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            f263a = new i();
            return;
        }
        if (i >= 21) {
            f263a = new h();
            return;
        }
        if (i >= 19) {
            f263a = new g();
            return;
        }
        if (i >= 17) {
            f263a = new f();
            return;
        }
        if (i >= 11) {
            f263a = new e();
        } else if (i >= 5) {
            f263a = new d();
        } else {
            f263a = new b();
        }
    }

    public static void a(Drawable drawable) {
        f263a.a(drawable);
    }

    public static void a(Drawable drawable, boolean z) {
        f263a.a(drawable, z);
    }

    public static boolean b(Drawable drawable) {
        return f263a.b(drawable);
    }

    public static void a(Drawable drawable, float f, float f2) {
        f263a.a(drawable, f, f2);
    }

    public static void a(Drawable drawable, int i, int i2, int i3, int i4) {
        f263a.a(drawable, i, i2, i3, i4);
    }

    public static void a(Drawable drawable, int i) {
        f263a.a(drawable, i);
    }

    public static void a(Drawable drawable, ColorStateList colorStateList) {
        f263a.a(drawable, colorStateList);
    }

    public static void a(Drawable drawable, PorterDuff.Mode mode) {
        f263a.a(drawable, mode);
    }

    public static Drawable c(Drawable drawable) {
        return f263a.c(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T d(Drawable drawable) {
        if (drawable instanceof k) {
            return (T) ((k) drawable).a();
        }
        return drawable;
    }

    public static void b(Drawable drawable, int i) {
        f263a.b(drawable, i);
    }

    public static int e(Drawable drawable) {
        return f263a.d(drawable);
    }
}
