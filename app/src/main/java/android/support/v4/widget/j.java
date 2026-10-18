package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
class j extends h {
    j() {
    }

    @Override // android.support.v4.widget.h, android.support.v4.widget.i
    public final void a(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    @Override // android.support.v4.widget.h, android.support.v4.widget.i
    public final void a(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}
