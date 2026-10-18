package android.support.v4.view;

import android.view.ScaleGestureDetector;

/* loaded from: classes.dex */
final class bq implements br {
    private bq() {
    }

    /* synthetic */ bq(byte b2) {
        this();
    }

    @Override // android.support.v4.view.br
    public final boolean a(Object obj) {
        return ((ScaleGestureDetector) obj).isQuickScaleEnabled();
    }
}
