package android.support.v4.f;

import android.net.ConnectivityManager;
import android.os.Build;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final c f272a;

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f272a = new f();
            return;
        }
        if (Build.VERSION.SDK_INT >= 13) {
            f272a = new e();
        } else if (Build.VERSION.SDK_INT >= 8) {
            f272a = new d();
        } else {
            f272a = new b();
        }
    }

    public static boolean a(ConnectivityManager connectivityManager) {
        return f272a.a(connectivityManager);
    }
}
