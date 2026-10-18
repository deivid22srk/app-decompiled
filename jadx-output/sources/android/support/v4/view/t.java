package android.support.v4.view;

import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes.dex */
final class t extends Handler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f402a;

    t(s sVar) {
        this.f402a = sVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        GestureDetector.OnDoubleTapListener onDoubleTapListener;
        boolean z;
        GestureDetector.OnDoubleTapListener onDoubleTapListener2;
        MotionEvent motionEvent;
        GestureDetector.OnGestureListener onGestureListener;
        MotionEvent motionEvent2;
        switch (message.what) {
            case 1:
                onGestureListener = this.f402a.i;
                motionEvent2 = this.f402a.p;
                onGestureListener.onShowPress(motionEvent2);
                return;
            case 2:
                s.c(this.f402a);
                return;
            case 3:
                onDoubleTapListener = this.f402a.j;
                if (onDoubleTapListener != null) {
                    z = this.f402a.k;
                    if (!z) {
                        onDoubleTapListener2 = this.f402a.j;
                        motionEvent = this.f402a.p;
                        onDoubleTapListener2.onSingleTapConfirmed(motionEvent);
                        return;
                    }
                    s.f(this.f402a);
                    return;
                }
                return;
            default:
                throw new RuntimeException("Unknown message " + message);
        }
    }
}
