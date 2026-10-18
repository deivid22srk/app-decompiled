package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class av extends ImageView implements android.support.v4.view.bt {

    /* renamed from: a, reason: collision with root package name */
    private aj f672a;

    /* renamed from: b, reason: collision with root package name */
    private au f673b;

    public av(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public av(Context context, AttributeSet attributeSet, int i) {
        super(fu.a(context), attributeSet, i);
        ao a2 = ao.a();
        this.f672a = new aj(this, a2);
        this.f672a.a(attributeSet, i);
        this.f673b = new au(this, a2);
        this.f673b.a(attributeSet, i);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f673b.a(i);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f672a != null) {
            this.f672a.a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f672a == null) {
            return;
        }
        this.f672a.b(null);
    }

    @Override // android.support.v4.view.bt
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f672a != null) {
            this.f672a.a(colorStateList);
        }
    }

    @Override // android.support.v4.view.bt
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f672a != null) {
            return this.f672a.a();
        }
        return null;
    }

    @Override // android.support.v4.view.bt
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f672a != null) {
            this.f672a.a(mode);
        }
    }

    @Override // android.support.v4.view.bt
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f672a != null) {
            return this.f672a.b();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f672a != null) {
            this.f672a.c();
        }
    }
}
