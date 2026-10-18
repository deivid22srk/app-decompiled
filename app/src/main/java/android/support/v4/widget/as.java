package android.support.v4.widget;

import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    static final ay f430a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            f430a = new au();
            return;
        }
        if (i >= 21) {
            f430a = new at();
            return;
        }
        if (i >= 19) {
            f430a = new ax();
        } else if (i >= 9) {
            f430a = new aw();
        } else {
            f430a = new av();
        }
    }

    public static void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        f430a.a(popupWindow, view, i, i2, i3);
    }

    public static void a(PopupWindow popupWindow, boolean z) {
        f430a.a(popupWindow, z);
    }

    public static void a(PopupWindow popupWindow, int i) {
        f430a.a(popupWindow, i);
    }
}
