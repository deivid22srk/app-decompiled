package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
class bk {

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f701b = {android.R.attr.textAppearance, android.R.attr.drawableLeft, android.R.attr.drawableTop, android.R.attr.drawableRight, android.R.attr.drawableBottom};
    private static final int[] c = {android.support.v7.b.b.textAllCaps};

    /* renamed from: a, reason: collision with root package name */
    final TextView f702a;
    private fv d;
    private fv e;
    private fv f;
    private fv g;

    static bk a(TextView textView) {
        return Build.VERSION.SDK_INT >= 17 ? new bl(textView) : new bk(textView);
    }

    bk(TextView textView) {
        this.f702a = textView;
    }

    void a(AttributeSet attributeSet, int i) {
        boolean z;
        Context context = this.f702a.getContext();
        ao a2 = ao.a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f701b, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (obtainStyledAttributes.hasValue(1)) {
            this.d = a(context, a2, obtainStyledAttributes.getResourceId(1, 0));
        }
        if (obtainStyledAttributes.hasValue(2)) {
            this.e = a(context, a2, obtainStyledAttributes.getResourceId(2, 0));
        }
        if (obtainStyledAttributes.hasValue(3)) {
            this.f = a(context, a2, obtainStyledAttributes.getResourceId(3, 0));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            this.g = a(context, a2, obtainStyledAttributes.getResourceId(4, 0));
        }
        obtainStyledAttributes.recycle();
        if (!(this.f702a.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            if (resourceId != -1) {
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, android.support.v7.b.l.TextAppearance);
                z = obtainStyledAttributes2.hasValue(android.support.v7.b.l.TextAppearance_textAllCaps) ? obtainStyledAttributes2.getBoolean(android.support.v7.b.l.TextAppearance_textAllCaps, false) : false;
                obtainStyledAttributes2.recycle();
            } else {
                z = false;
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, c, i, 0);
            if (obtainStyledAttributes3.hasValue(0)) {
                z = obtainStyledAttributes3.getBoolean(0, false);
            }
            obtainStyledAttributes3.recycle();
            if (z) {
                a(true);
            }
        }
    }

    final void a(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, c);
        if (obtainStyledAttributes.getBoolean(0, false)) {
            a(true);
        }
        obtainStyledAttributes.recycle();
    }

    final void a(boolean z) {
        this.f702a.setTransformationMethod(z ? new android.support.v7.e.a(this.f702a.getContext()) : null);
    }

    void a() {
        if (this.d != null || this.e != null || this.f != null || this.g != null) {
            Drawable[] compoundDrawables = this.f702a.getCompoundDrawables();
            a(compoundDrawables[0], this.d);
            a(compoundDrawables[1], this.e);
            a(compoundDrawables[2], this.f);
            a(compoundDrawables[3], this.g);
        }
    }

    final void a(Drawable drawable, fv fvVar) {
        if (drawable != null && fvVar != null) {
            ao.a(drawable, fvVar, this.f702a.getDrawableState());
        }
    }

    protected static fv a(Context context, ao aoVar, int i) {
        ColorStateList b2 = aoVar.b(context, i);
        if (b2 == null) {
            return null;
        }
        fv fvVar = new fv();
        fvVar.d = true;
        fvVar.f833a = b2;
        return fvVar;
    }
}
