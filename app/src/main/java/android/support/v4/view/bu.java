package android.support.v4.view;

import android.os.Build;
import android.view.VelocityTracker;

/* loaded from: classes.dex */
public final class bu {

    /* renamed from: a, reason: collision with root package name */
    static final bx f358a;

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            f358a = new bw();
        } else {
            f358a = new bv();
        }
    }

    public static float a(VelocityTracker velocityTracker, int i) {
        return f358a.a(velocityTracker, i);
    }

    public static float b(VelocityTracker velocityTracker, int i) {
        return f358a.b(velocityTracker, i);
    }
}
