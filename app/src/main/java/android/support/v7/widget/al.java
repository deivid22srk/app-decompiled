package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* loaded from: classes.dex */
public class al extends CheckBox implements android.support.v4.widget.bx {

    /* renamed from: a, reason: collision with root package name */
    private ao f658a;

    /* renamed from: b, reason: collision with root package name */
    private an f659b;

    public al(Context context) {
        this(context, null);
    }

    public al(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.support.v7.b.b.checkboxStyle);
    }

    public al(Context context, AttributeSet attributeSet, int i) {
        super(fu.a(context), attributeSet, i);
        this.f658a = ao.a();
        this.f659b = new an(this, this.f658a);
        this.f659b.a(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f659b != null) {
            this.f659b.a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        Drawable a2;
        if (this.f658a == null) {
            a2 = android.support.v4.b.g.a(getContext(), i);
        } else {
            a2 = this.f658a.a(getContext(), i, false);
        }
        setButtonDrawable(a2);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.f659b != null ? this.f659b.a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // android.support.v4.widget.bx
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.f659b != null) {
            this.f659b.a(colorStateList);
        }
    }

    public ColorStateList getSupportButtonTintList() {
        if (this.f659b != null) {
            return this.f659b.f662a;
        }
        return null;
    }

    @Override // android.support.v4.widget.bx
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        if (this.f659b != null) {
            this.f659b.a(mode);
        }
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        if (this.f659b != null) {
            return this.f659b.f663b;
        }
        return null;
    }
}
