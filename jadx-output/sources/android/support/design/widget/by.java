package android.support.design.widget;

import android.os.Build;

/* loaded from: classes.dex */
final class by {

    /* renamed from: a, reason: collision with root package name */
    static final bm f126a = new bz();

    /* renamed from: b, reason: collision with root package name */
    private static final ca f127b;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f127b = new cc((byte) 0);
        } else {
            f127b = new cb((byte) 0);
        }
    }

    static bj a() {
        return f126a.a();
    }
}
