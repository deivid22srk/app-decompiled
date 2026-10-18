package android.support.v4.view.a;

import android.view.accessibility.AccessibilityRecord;

/* loaded from: classes.dex */
class al extends ak {
    al() {
    }

    @Override // android.support.v4.view.a.ao, android.support.v4.view.a.am
    public final void f(Object obj, int i) {
        ((AccessibilityRecord) obj).setMaxScrollX(i);
    }

    @Override // android.support.v4.view.a.ao, android.support.v4.view.a.am
    public final void g(Object obj, int i) {
        ((AccessibilityRecord) obj).setMaxScrollY(i);
    }
}
