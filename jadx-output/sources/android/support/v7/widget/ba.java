package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* loaded from: classes.dex */
public final class ba extends RadioButton implements android.support.v4.widget.bx {

    /* renamed from: a, reason: collision with root package name */
    private ao f684a;

    /* renamed from: b, reason: collision with root package name */
    private an f685b;

    public ba(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.support.v7.b.b.radioButtonStyle);
    }

    private ba(Context context, AttributeSet attributeSet, int i) {
        super(fu.a(context), attributeSet, i);
        this.f684a = ao.a();
        this.f685b = new an(this, this.f684a);
        this.f685b.a(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f685b != null) {
            this.f685b.a();
        }
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(int i) {
        Drawable a2;
        if (this.f684a == null) {
            a2 = android.support.v4.b.g.a(getContext(), i);
        } else {
            a2 = this.f684a.a(getContext(), i, false);
        }
        setButtonDrawable(a2);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.f685b != null ? this.f685b.a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // android.support.v4.widget.bx
    public final void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.f685b != null) {
            this.f685b.a(colorStateList);
        }
    }

    public final ColorStateList getSupportButtonTintList() {
        if (this.f685b != null) {
            return this.f685b.f662a;
        }
        return null;
    }

    @Override // android.support.v4.widget.bx
    public final void setSupportButtonTintMode(PorterDuff.Mode mode) {
        if (this.f685b != null) {
            this.f685b.a(mode);
        }
    }

    public final PorterDuff.Mode getSupportButtonTintMode() {
        if (this.f685b != null) {
            return this.f685b.f663b;
        }
        return null;
    }
}
