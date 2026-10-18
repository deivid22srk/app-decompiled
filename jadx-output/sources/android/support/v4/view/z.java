package android.support.v4.view;

import android.os.Build;
import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    static final ad f405a;

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            f405a = new ac();
        } else {
            f405a = new aa();
        }
    }

    public static boolean a(KeyEvent keyEvent) {
        return f405a.b(keyEvent.getMetaState());
    }

    public static boolean b(KeyEvent keyEvent) {
        return f405a.c(keyEvent.getMetaState());
    }

    public static void c(KeyEvent keyEvent) {
        f405a.a(keyEvent);
    }
}
