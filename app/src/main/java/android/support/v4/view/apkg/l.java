package android.support.v4.view.apkg;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public class l extends s {
    l() {
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final Object a(int i) {
        return new AccessibilityNodeInfo.AccessibilityAction(i, null);
    }

    @Override // android.support.v4.view.apkg.s, android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final Object a(int i, int i2) {
        return AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, 0);
    }

    @Override // android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final boolean a(Object obj, Object obj2) {
        return ((AccessibilityNodeInfo) obj).removeAction((AccessibilityNodeInfo.AccessibilityAction) obj2);
    }

    @Override // android.support.v4.view.apkg.s, android.support.v4.view.apkg.t, android.support.v4.view.apkg.o
    public final Object a(int i, int i2, int i3, int i4, boolean z) {
        return AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, false);
    }
}
