package android.support.v4.view;

import android.view.VelocityTracker;

/* loaded from: classes.dex */
final class bw implements bx {
    bw() {
    }

    @Override // android.support.v4.view.bx
    public final float a(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getXVelocity(i);
    }

    @Override // android.support.v4.view.bx
    public final float b(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getYVelocity(i);
    }
}
