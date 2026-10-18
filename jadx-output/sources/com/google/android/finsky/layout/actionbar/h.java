package com.google.android.finsky.layout.actionbar;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes.dex */
final class h extends LayerDrawable {
    h(Drawable[] drawableArr) {
        super(drawableArr);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        rect.top = 0;
        rect.bottom = 0;
        rect.left = 0;
        rect.right = 0;
        return false;
    }
}
