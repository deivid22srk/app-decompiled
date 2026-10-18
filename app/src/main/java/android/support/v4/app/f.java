package android.support.v4.app;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final h f218a;

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            f218a = new g((byte) 0);
        } else {
            f218a = new h((byte) 0);
        }
    }

    public static String a(String str) {
        return f218a.a(str);
    }

    public static int a(Context context, String str, String str2) {
        return f218a.a(context, str, str2);
    }
}
