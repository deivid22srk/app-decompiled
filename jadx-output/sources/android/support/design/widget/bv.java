package android.support.design.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
final class bv implements bu {
    private bv() {
    }

    /* synthetic */ bv(byte b2) {
        this();
    }

    @Override // android.support.design.widget.bu
    public final void a(ViewGroup viewGroup, View view, Rect rect) {
        viewGroup.offsetDescendantRectToMyCoords(view, rect);
        rect.offset(view.getScrollX(), view.getScrollY());
    }
}
