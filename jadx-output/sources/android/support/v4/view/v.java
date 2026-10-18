package android.support.v4.view;

import android.graphics.Rect;
import android.os.Build;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    static final w f404a;

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            f404a = new y();
        } else {
            f404a = new x();
        }
    }

    public static void a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        f404a.a(i, i2, i3, rect, rect2, i4);
    }

    public static int a(int i, int i2) {
        return f404a.a(i, i2);
    }
}
