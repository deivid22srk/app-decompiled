package android.support.v4.view.a;

import android.os.Build;
import java.util.List;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    private static final x f330b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f331a;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f330b = new aa();
        } else if (Build.VERSION.SDK_INT >= 16) {
            f330b = new y();
        } else {
            f330b = new ac();
        }
    }

    public w() {
        this.f331a = f330b.a(this);
    }

    public w(Object obj) {
        this.f331a = obj;
    }

    public static j a() {
        return null;
    }

    public static boolean b() {
        return false;
    }

    public static List<j> c() {
        return null;
    }

    public static j d() {
        return null;
    }
}
