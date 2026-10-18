package android.support.v4.view.a;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final i f323a;

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            f323a = new g();
        } else {
            f323a = new h();
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager) {
        return f323a.a(accessibilityManager);
    }
}
