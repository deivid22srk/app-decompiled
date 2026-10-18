package android.support.v4.widget;

import android.widget.OverScroller;

/* loaded from: classes.dex */
final class bg extends bf {
    bg() {
    }

    @Override // android.support.v4.widget.bf, android.support.v4.widget.bd
    public final float d(Object obj) {
        return ((OverScroller) obj).getCurrVelocity();
    }
}
