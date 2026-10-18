package android.support.v4.view;

import android.os.Build;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class cq {

    /* renamed from: a, reason: collision with root package name */
    static final cv f368a;

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            f368a = new cu();
            return;
        }
        if (Build.VERSION.SDK_INT >= 11) {
            f368a = new ct();
        } else if (Build.VERSION.SDK_INT >= 8) {
            f368a = new cs();
        } else {
            f368a = new cr();
        }
    }

    public static int a(ViewConfiguration viewConfiguration) {
        return f368a.a(viewConfiguration);
    }

    public static boolean b(ViewConfiguration viewConfiguration) {
        return f368a.b(viewConfiguration);
    }
}
