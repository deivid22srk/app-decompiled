package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.EditText;

/* loaded from: classes.dex */
public class as extends EditText implements android.support.v4.view.bt {

    /* renamed from: a, reason: collision with root package name */
    private ao f666a;

    /* renamed from: b, reason: collision with root package name */
    private aj f667b;
    private bk c;

    public as(Context context) {
        this(context, null);
    }

    public as(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.support.v7.b.b.editTextStyle);
    }

    public as(Context context, AttributeSet attributeSet, int i) {
        super(fu.a(context), attributeSet, i);
        this.f666a = ao.a();
        this.f667b = new aj(this, this.f666a);
        this.f667b.a(attributeSet, i);
        this.c = bk.a(this);
        this.c.a(attributeSet, i);
        this.c.a();
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f667b != null) {
            this.f667b.a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f667b == null) {
            return;
        }
        this.f667b.b(null);
    }

    @Override // android.support.v4.view.bt
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f667b != null) {
            this.f667b.a(colorStateList);
        }
    }

    @Override // android.support.v4.view.bt
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f667b != null) {
            return this.f667b.a();
        }
        return null;
    }

    @Override // android.support.v4.view.bt
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f667b != null) {
            this.f667b.a(mode);
        }
    }

    @Override // android.support.v4.view.bt
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f667b != null) {
            return this.f667b.b();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f667b != null) {
            this.f667b.c();
        }
        if (this.c != null) {
            this.c.a();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.c != null) {
            this.c.a(context, i);
        }
    }
}
