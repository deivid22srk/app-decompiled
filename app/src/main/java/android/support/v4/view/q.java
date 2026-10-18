package android.support.v4.view;

import android.content.Context;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final r f399a;

    public q(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, (byte) 0);
    }

    public q(Context context, GestureDetector.OnGestureListener onGestureListener, byte b2) {
        if (Build.VERSION.SDK_INT > 17) {
            this.f399a = new u(context, onGestureListener);
        } else {
            this.f399a = new s(context, onGestureListener);
        }
    }

    public final boolean a(MotionEvent motionEvent) {
        return this.f399a.a(motionEvent);
    }
}
