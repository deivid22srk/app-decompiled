package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.MultiAutoCompleteTextView;

/* loaded from: classes.dex */
public final class aw extends MultiAutoCompleteTextView implements android.support.v4.view.bt {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f674a = {R.attr.popupBackground};

    /* renamed from: b, reason: collision with root package name */
    private ao f675b;
    private aj c;
    private bk d;

    public aw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.support.v7.b.b.autoCompleteTextViewStyle);
    }

    private aw(Context context, AttributeSet attributeSet, int i) {
        super(fu.a(context), attributeSet, i);
        this.f675b = ao.a();
        fx a2 = fx.a(getContext(), attributeSet, f674a, i);
        if (a2.e(0)) {
            setDropDownBackgroundDrawable(a2.a(0));
        }
        a2.f836a.recycle();
        this.c = new aj(this, this.f675b);
        this.c.a(attributeSet, i);
        this.d = bk.a(this);
        this.d.a(attributeSet, i);
        this.d.a();
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i) {
        if (this.f675b != null) {
            setDropDownBackgroundDrawable(this.f675b.a(getContext(), i, false));
        } else {
            super.setDropDownBackgroundResource(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.c != null) {
            this.c.a(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.c == null) {
            return;
        }
        this.c.b(null);
    }

    @Override // android.support.v4.view.bt
    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.c != null) {
            this.c.a(colorStateList);
        }
    }

    @Override // android.support.v4.view.bt
    public final ColorStateList getSupportBackgroundTintList() {
        if (this.c != null) {
            return this.c.a();
        }
        return null;
    }

    @Override // android.support.v4.view.bt
    public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.c != null) {
            this.c.a(mode);
        }
    }

    @Override // android.support.v4.view.bt
    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.c != null) {
            return this.c.b();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.c != null) {
            this.c.c();
        }
        if (this.d != null) {
            this.d.a();
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.d != null) {
            this.d.a(context, i);
        }
    }
}
