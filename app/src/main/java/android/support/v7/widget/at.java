package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* loaded from: classes.dex */
public final class at extends ImageButton implements android.support.v4.view.bt {

    /* renamed from: a, reason: collision with root package name */
    private aj f668a;

    /* renamed from: b, reason: collision with root package name */
    private au f669b;

    public at(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.support.v7.b.b.imageButtonStyle);
    }

    private at(Context context, AttributeSet attributeSet, int i) {
        super(fu.a(context), attributeSet, i);
        ao a2 = ao.a();
        this.f668a = new aj(this, a2);
        this.f668a.a(attributeSet, i);
        this.f669b = new au(this, a2);
        this.f669b.a(attributeSet, i);
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.f669b.a(i);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f668a != null) {
            this.f668a.a(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f668a == null) {
            return;
        }
        this.f668a.b(null);
    }

    @Override // android.support.v4.view.bt
    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f668a != null) {
            this.f668a.a(colorStateList);
        }
    }

    @Override // android.support.v4.view.bt
    public final ColorStateList getSupportBackgroundTintList() {
        if (this.f668a != null) {
            return this.f668a.a();
        }
        return null;
    }

    @Override // android.support.v4.view.bt
    public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f668a != null) {
            this.f668a.a(mode);
        }
    }

    @Override // android.support.v4.view.bt
    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f668a != null) {
            return this.f668a.b();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f668a != null) {
            this.f668a.c();
        }
    }
}
