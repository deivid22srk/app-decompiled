package android.support.v4.view;

import android.view.ViewGroup;

/* loaded from: classes.dex */
final class aq implements ap {
    aq() {
    }

    @Override // android.support.v4.view.ap
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // android.support.v4.view.ap
    public final int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // android.support.v4.view.ap
    public final void a(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.leftMargin = i;
    }

    @Override // android.support.v4.view.ap
    public final void b(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.rightMargin = i;
    }
}
