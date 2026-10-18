package android.support.v4.widget;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
final class au extends at {
    au() {
    }

    @Override // android.support.v4.widget.at, android.support.v4.widget.av, android.support.v4.widget.ay
    public final void a(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    @Override // android.support.v4.widget.aw, android.support.v4.widget.av, android.support.v4.widget.ay
    public final void a(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }
}
