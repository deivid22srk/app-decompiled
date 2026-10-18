package android.support.v4.view;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class dr {

    /* renamed from: a, reason: collision with root package name */
    static final dt f377a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f377a = new dv();
            return;
        }
        if (i >= 19) {
            f377a = new du();
        } else if (i >= 14) {
            f377a = new ds();
        } else {
            f377a = new dw();
        }
    }

    public static boolean a(ViewParent viewParent, View view, View view2, int i) {
        return f377a.a(viewParent, view, view2, i);
    }

    public static void b(ViewParent viewParent, View view, View view2, int i) {
        f377a.b(viewParent, view, view2, i);
    }

    public static void a(ViewParent viewParent, View view) {
        f377a.a(viewParent, view);
    }

    public static void a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        f377a.a(viewParent, view, i, i2, i3, i4);
    }

    public static void a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        f377a.a(viewParent, view, i, i2, iArr);
    }

    public static boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return f377a.a(viewParent, view, f, f2, z);
    }

    public static boolean a(ViewParent viewParent, View view, float f, float f2) {
        return f377a.a(viewParent, view, f, f2);
    }
}
