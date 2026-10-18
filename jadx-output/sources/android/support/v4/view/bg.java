package android.support.v4.view;

import android.view.MotionEvent;

/* loaded from: classes.dex */
final class bg extends bf {
    bg() {
    }

    @Override // android.support.v4.view.bd, android.support.v4.view.bh
    public final float e(MotionEvent motionEvent, int i) {
        return motionEvent.getAxisValue(i);
    }
}
