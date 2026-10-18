package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public class ai extends AutoCompleteTextView implements android.support.v4.view.bt {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f652a = {android.R.attr.popupBackground};

    /* renamed from: b, reason: collision with root package name */
    private ao f653b;
    private aj c;
    private bk d;

    public ai(Context context) {
        this(context, null);
    }

    public ai(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.support.v7.b.b.autoCompleteTextViewStyle);
    }

    public ai(Context context, AttributeSet attributeSet, int i) {
        super(fu.a(context), attributeSet, i);
        this.f653b = ao.a();
        fx a2 = fx.a(getContext(), attributeSet, f652a, i);
        if (a2.e(0)) {
            setDropDownBackgroundDrawable(a2.a(0));
        }
        a2.f836a.recycle();
        this.c = new aj(this, this.f653b);
        this.c.a(attributeSet, i);
        this.d = bk.a(this);
        this.d.a(attributeSet, i);
        this.d.a();
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        if (this.f653b != null) {
            setDropDownBackgroundDrawable(this.f653b.a(getContext(), i, false));
        } else {
            super.setDropDownBackgroundResource(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.c != null) {
            this.c.a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.c == null) {
            return;
        }
        this.c.b(null);
    }

    @Override // android.support.v4.view.bt
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.c != null) {
            this.c.a(colorStateList);
        }
    }

    @Override // android.support.v4.view.bt
    public ColorStateList getSupportBackgroundTintList() {
        if (this.c != null) {
            return this.c.a();
        }
        return null;
    }

    @Override // android.support.v4.view.bt
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.c != null) {
            this.c.a(mode);
        }
    }

    @Override // android.support.v4.view.bt
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.c != null) {
            return this.c.b();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.c != null) {
            this.c.c();
        }
        if (this.d != null) {
            this.d.a();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.d != null) {
            this.d.a(context, i);
        }
    }
}
