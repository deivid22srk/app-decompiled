package android.support.v4.view.a;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
class s extends r {
    s() {
    }

    @Override // android.support.v4.view.a.t, android.support.v4.view.a.o
    public final void b(Object obj, Object obj2) {
        ((AccessibilityNodeInfo) obj).setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) obj2);
    }

    @Override // android.support.v4.view.a.t, android.support.v4.view.a.o
    public Object a(int i, int i2) {
        return AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false);
    }

    @Override // android.support.v4.view.a.t, android.support.v4.view.a.o
    public Object a(int i, int i2, int i3, int i4, boolean z) {
        return AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z);
    }

    @Override // android.support.v4.view.a.t, android.support.v4.view.a.o
    public final void c(Object obj, Object obj2) {
        ((AccessibilityNodeInfo) obj).setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) obj2);
    }
}
