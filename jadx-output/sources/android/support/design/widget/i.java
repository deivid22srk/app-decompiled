package android.support.design.widget;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public abstract class i<V extends View> {
    public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        return false;
    }

    public boolean a(MotionEvent motionEvent) {
        return false;
    }

    public boolean a(View view) {
        return false;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, View view) {
        return false;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i) {
        return false;
    }
}
