package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
class dw implements dt {
    dw() {
    }

    @Override // android.support.v4.view.dt
    public boolean a(ViewParent viewParent, View view, View view2, int i) {
        if (viewParent instanceof bk) {
            return ((bk) viewParent).onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // android.support.v4.view.dt
    public void b(ViewParent viewParent, View view, View view2, int i) {
        if (viewParent instanceof bk) {
            ((bk) viewParent).onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.support.v4.view.dt
    public void a(ViewParent viewParent, View view) {
        if (viewParent instanceof bk) {
            ((bk) viewParent).onStopNestedScroll(view);
        }
    }

    @Override // android.support.v4.view.dt
    public void a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        if (viewParent instanceof bk) {
            ((bk) viewParent).onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.support.v4.view.dt
    public void a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        if (viewParent instanceof bk) {
            ((bk) viewParent).onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.support.v4.view.dt
    public boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (viewParent instanceof bk) {
            return ((bk) viewParent).onNestedFling(view, f, f2, z);
        }
        return false;
    }

    @Override // android.support.v4.view.dt
    public boolean a(ViewParent viewParent, View view, float f, float f2) {
        if (viewParent instanceof bk) {
            return ((bk) viewParent).onNestedPreFling(view, f, f2);
        }
        return false;
    }
}
