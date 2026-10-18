package android.support.v4.view.a;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
class p extends n {
    p() {
    }

    @Override // android.support.v4.view.a.t, android.support.v4.view.a.o
    public final boolean s(Object obj) {
        return ((AccessibilityNodeInfo) obj).isVisibleToUser();
    }

    @Override // android.support.v4.view.a.t, android.support.v4.view.a.o
    public final void i(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setVisibleToUser(z);
    }

    @Override // android.support.v4.view.a.t, android.support.v4.view.a.o
    public final boolean t(Object obj) {
        return ((AccessibilityNodeInfo) obj).isAccessibilityFocused();
    }

    @Override // android.support.v4.view.a.t, android.support.v4.view.a.o
    public final void j(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setAccessibilityFocused(z);
    }
}
