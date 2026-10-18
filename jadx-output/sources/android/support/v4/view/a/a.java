package android.support.v4.view.a;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final e f316a;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f316a = new c();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f316a = new b();
        } else {
            f316a = new d();
        }
    }

    public static aj a(AccessibilityEvent accessibilityEvent) {
        return new aj(accessibilityEvent);
    }

    public static void a(AccessibilityEvent accessibilityEvent, int i) {
        f316a.a(accessibilityEvent, i);
    }

    public static int b(AccessibilityEvent accessibilityEvent) {
        return f316a.a(accessibilityEvent);
    }
}
