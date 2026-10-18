package android.support.v4.view;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class ao {

    /* renamed from: a, reason: collision with root package name */
    static final ap f338a;

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            f338a = new ar();
        } else {
            f338a = new aq();
        }
    }

    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return f338a.a(marginLayoutParams);
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return f338a.b(marginLayoutParams);
    }

    public static void a(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        f338a.a(marginLayoutParams, i);
    }

    public static void b(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        f338a.b(marginLayoutParams, i);
    }
}
