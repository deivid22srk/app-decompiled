package android.support.v4.view;

import android.os.Build;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class bc {

    /* renamed from: a, reason: collision with root package name */
    static final bh f350a;

    static {
        if (Build.VERSION.SDK_INT >= 12) {
            f350a = new bg();
            return;
        }
        if (Build.VERSION.SDK_INT >= 9) {
            f350a = new bf();
        } else if (Build.VERSION.SDK_INT >= 5) {
            f350a = new be();
        } else {
            f350a = new bd();
        }
    }

    public static int a(MotionEvent motionEvent) {
        return motionEvent.getAction() & 255;
    }

    public static int b(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 65280) >> 8;
    }

    public static int a(MotionEvent motionEvent, int i) {
        return f350a.a(motionEvent, i);
    }

    public static int b(MotionEvent motionEvent, int i) {
        return f350a.b(motionEvent, i);
    }

    public static float c(MotionEvent motionEvent, int i) {
        return f350a.c(motionEvent, i);
    }

    public static float d(MotionEvent motionEvent, int i) {
        return f350a.d(motionEvent, i);
    }

    public static int c(MotionEvent motionEvent) {
        return f350a.a(motionEvent);
    }

    public static int d(MotionEvent motionEvent) {
        return f350a.b(motionEvent);
    }

    public static float e(MotionEvent motionEvent, int i) {
        return f350a.e(motionEvent, i);
    }
}
