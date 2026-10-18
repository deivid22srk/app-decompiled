package android.support.v4.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
final class dv extends du {
    dv() {
    }

    @Override // android.support.v4.view.dw, android.support.v4.view.dt
    public final boolean a(ViewParent viewParent, View view, View view2, int i) {
        return dx.a(viewParent, view, view2, i);
    }

    @Override // android.support.v4.view.dw, android.support.v4.view.dt
    public final boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return dx.a(viewParent, view, f, f2, z);
    }

    @Override // android.support.v4.view.dw, android.support.v4.view.dt
    public final boolean a(ViewParent viewParent, View view, float f, float f2) {
        return dx.a(viewParent, view, f, f2);
    }

    @Override // android.support.v4.view.dw, android.support.v4.view.dt
    public final void b(ViewParent viewParent, View view, View view2, int i) {
        try {
            viewParent.onNestedScrollAccepted(view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
        }
    }

    @Override // android.support.v4.view.dw, android.support.v4.view.dt
    public final void a(ViewParent viewParent, View view) {
        try {
            viewParent.onStopNestedScroll(view);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
        }
    }

    @Override // android.support.v4.view.dw, android.support.v4.view.dt
    public final void a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        try {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
        }
    }

    @Override // android.support.v4.view.dw, android.support.v4.view.dt
    public final void a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        try {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
        }
    }
}
