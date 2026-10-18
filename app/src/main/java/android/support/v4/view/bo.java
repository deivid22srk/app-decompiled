package android.support.v4.view;

import android.os.Build;

/* loaded from: classes.dex */
public final class bo {

    /* renamed from: a, reason: collision with root package name */
    static final br f357a;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f357a = new bq((byte) 0);
        } else {
            f357a = new bp((byte) 0);
        }
    }

    public static boolean a(Object obj) {
        return f357a.a(obj);
    }
}
