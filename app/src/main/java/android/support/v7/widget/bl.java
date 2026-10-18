package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
final class bl extends bk {

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f703b = {android.R.attr.drawableStart, android.R.attr.drawableEnd};
    private fv c;
    private fv d;

    bl(TextView textView) {
        super(textView);
    }

    @Override // android.support.v7.widget.bk
    final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        Context context = this.f702a.getContext();
        ao a2 = ao.a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f703b, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.c = a(context, a2, obtainStyledAttributes.getResourceId(0, 0));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.d = a(context, a2, obtainStyledAttributes.getResourceId(1, 0));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.support.v7.widget.bk
    final void a() {
        super.a();
        if (this.c != null || this.d != null) {
            Drawable[] compoundDrawablesRelative = this.f702a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.c);
            a(compoundDrawablesRelative[2], this.d);
        }
    }
}
