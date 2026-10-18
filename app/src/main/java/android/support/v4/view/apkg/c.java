package android.support.v4.view.apkg;

import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public final class c extends b {
    c() {
    }

    @Override // android.support.v4.view.apkg.d, android.support.v4.view.apkg.e
    public final void a(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }

    @Override // android.support.v4.view.apkg.d, android.support.v4.view.apkg.e
    public final int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }
}
