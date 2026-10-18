package android.support.v4.view;

import android.view.ViewGroup;

/* loaded from: classes.dex */
final class ar implements ap {
    ar() {
    }

    @Override // android.support.v4.view.ap
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    @Override // android.support.v4.view.ap
    public final int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    @Override // android.support.v4.view.ap
    public final void a(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginStart(i);
    }

    @Override // android.support.v4.view.ap
    public final void b(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginEnd(i);
    }
}
