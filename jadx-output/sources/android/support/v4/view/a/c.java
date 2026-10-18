package android.support.v4.view.a;

import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
final class c extends b {
    c() {
    }

    @Override // android.support.v4.view.a.d, android.support.v4.view.a.e
    public final void a(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }

    @Override // android.support.v4.view.a.d, android.support.v4.view.a.e
    public final int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }
}
