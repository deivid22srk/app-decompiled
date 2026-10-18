package android.support.v4.view;

import android.view.MotionEvent;

/* loaded from: classes.dex */
class be extends bd {
    be() {
    }

    @Override // android.support.v4.view.bd, android.support.v4.view.bh
    public final int a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    @Override // android.support.v4.view.bd, android.support.v4.view.bh
    public final int b(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Override // android.support.v4.view.bd, android.support.v4.view.bh
    public final float c(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    @Override // android.support.v4.view.bd, android.support.v4.view.bh
    public final float d(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    @Override // android.support.v4.view.bd, android.support.v4.view.bh
    public final int a(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }
}
