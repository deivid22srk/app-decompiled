package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class MaxWidthLinearLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private int f3019a;

    public MaxWidthLinearLayout(Context context) {
        this(context, null);
    }

    public MaxWidthLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.deivid22srk.store.b.MaxWidthView);
        this.f3019a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public void setMaxWidth(int i) {
        if (i != this.f3019a) {
            this.f3019a = i;
            requestLayout();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (this.f3019a > 0 && this.f3019a < size) {
            i = View.MeasureSpec.makeMeasureSpec(this.f3019a, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }
}
