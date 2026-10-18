package android.support.design.widget;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
final class k implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CoordinatorLayout f137a;

    k(CoordinatorLayout coordinatorLayout) {
        this.f137a = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener;
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener2;
        onHierarchyChangeListener = this.f137a.x;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener2 = this.f137a.x;
            onHierarchyChangeListener2.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener;
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener2;
        boolean z;
        CoordinatorLayout coordinatorLayout = this.f137a;
        int size = coordinatorLayout.g.size();
        int i = 0;
        boolean z2 = false;
        while (i < size) {
            View view3 = coordinatorLayout.g.get(i);
            if (view3 == view2) {
                z = true;
            } else {
                if (z2) {
                    view3.getLayoutParams();
                }
                z = z2;
            }
            i++;
            z2 = z;
        }
        onHierarchyChangeListener = this.f137a.x;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener2 = this.f137a.x;
            onHierarchyChangeListener2.onChildViewRemoved(view, view2);
        }
    }
}
