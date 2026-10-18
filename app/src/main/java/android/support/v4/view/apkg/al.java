package android.support.v4.view.apkg;

import android.view.accessibility.AccessibilityRecord;

/* loaded from: classes.dex */
public class al extends ak {
    al() {
    }

    @Override // android.support.v4.view.apkg.ao, android.support.v4.view.apkg.am
    public final void f(Object obj, int i) {
        ((AccessibilityRecord) obj).setMaxScrollX(i);
    }

    @Override // android.support.v4.view.apkg.ao, android.support.v4.view.apkg.am
    public final void g(Object obj, int i) {
        ((AccessibilityRecord) obj).setMaxScrollY(i);
    }
}
