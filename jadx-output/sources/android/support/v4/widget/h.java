package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
class h implements i {
    h() {
    }

    @Override // android.support.v4.widget.i
    public Drawable a(CompoundButton compoundButton) {
        return k.a(compoundButton);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.widget.i
    public void a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (!(compoundButton instanceof bx)) {
            return;
        }
        ((bx) compoundButton).setSupportButtonTintList(colorStateList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.widget.i
    public void a(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (!(compoundButton instanceof bx)) {
            return;
        }
        ((bx) compoundButton).setSupportButtonTintMode(mode);
    }
}
