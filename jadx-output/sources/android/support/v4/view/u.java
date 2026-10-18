package android.support.v4.view;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes.dex */
final class u implements r {

    /* renamed from: a, reason: collision with root package name */
    private final GestureDetector f403a;

    public u(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f403a = new GestureDetector(context, onGestureListener, null);
    }

    @Override // android.support.v4.view.r
    public final boolean a(MotionEvent motionEvent) {
        return this.f403a.onTouchEvent(motionEvent);
    }
}
