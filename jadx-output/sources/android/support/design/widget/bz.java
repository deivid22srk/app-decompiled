package android.support.design.widget;

import android.os.Build;

/* loaded from: classes.dex */
final class bz implements bm {
    bz() {
    }

    @Override // android.support.design.widget.bm
    public final bj a() {
        return new bj(Build.VERSION.SDK_INT >= 12 ? new br() : new bp());
    }
}
