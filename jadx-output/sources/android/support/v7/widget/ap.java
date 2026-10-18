package android.support.v7.widget;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* loaded from: classes.dex */
final class ap extends android.support.v4.h.g<Integer, PorterDuffColorFilter> {
    public ap() {
        super(6);
    }

    static int a(int i, PorterDuff.Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }
}
