package android.support.v4.widget;

import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
class ax extends aw {
    ax() {
    }

    @Override // android.support.v4.widget.av, android.support.v4.widget.ay
    public final void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        popupWindow.showAsDropDown(view, i, i2, i3);
    }
}
