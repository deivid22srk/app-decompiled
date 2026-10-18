package android.support.v4.view;

import android.view.KeyEvent;

/* loaded from: classes.dex */
final class ac extends ab {
    ac() {
    }

    @Override // android.support.v4.view.aa
    public final int a(int i) {
        return KeyEvent.normalizeMetaState(i);
    }

    @Override // android.support.v4.view.aa, android.support.v4.view.ad
    public final boolean b(int i) {
        return KeyEvent.metaStateHasModifiers(i, 1);
    }

    @Override // android.support.v4.view.aa, android.support.v4.view.ad
    public final boolean c(int i) {
        return KeyEvent.metaStateHasNoModifiers(i);
    }
}
