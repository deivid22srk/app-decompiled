package android.support.v4.widget;

import android.widget.EdgeEffect;

/* loaded from: classes.dex */
final class ah extends af {
    ah() {
    }

    @Override // android.support.v4.widget.af, android.support.v4.widget.ag
    public final boolean a(Object obj, float f, float f2) {
        ((EdgeEffect) obj).onPull(f, f2);
        return true;
    }
}
