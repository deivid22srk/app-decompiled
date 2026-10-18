package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public class bm extends TextView implements android.support.v4.view.bt {

    /* renamed from: a, reason: collision with root package name */
    private ao f704a;

    /* renamed from: b, reason: collision with root package name */
    private aj f705b;
    private bk c;

    public bm(Context context) {
        this(context, null);
    }

    public bm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public bm(Context context, AttributeSet attributeSet, int i) {
        super(fu.a(context), attributeSet, i);
        this.f704a = ao.a();
        this.f705b = new aj(this, this.f704a);
        this.f705b.a(attributeSet, i);
        this.c = bk.a(this);
        this.c.a(attributeSet, i);
        this.c.a();
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f705b != null) {
            this.f705b.a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f705b == null) {
            return;
        }
        this.f705b.b(null);
    }

    @Override // android.support.v4.view.bt
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f705b != null) {
            this.f705b.a(colorStateList);
        }
    }

    @Override // android.support.v4.view.bt
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f705b != null) {
            return this.f705b.a();
        }
        return null;
    }

    @Override // android.support.v4.view.bt
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f705b != null) {
            this.f705b.a(mode);
        }
    }

    @Override // android.support.v4.view.bt
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f705b != null) {
            return this.f705b.b();
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.c != null) {
            this.c.a(context, i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f705b != null) {
            this.f705b.c();
        }
        if (this.c != null) {
            this.c.a();
        }
    }
}
