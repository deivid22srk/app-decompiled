package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class MaxSizeLinearLayout extends MaxWidthLinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private int f3018a;

    public MaxSizeLinearLayout(Context context) {
        this(context, null);
    }

    public MaxSizeLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.android.vending.b.MaxSizeLayoutHeight);
        this.f3018a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public void setMaxHeight(int i) {
        if (i != this.f3018a) {
            this.f3018a = i;
            requestLayout();
        }
    }

    @Override // com.google.android.finsky.layout.MaxWidthLinearLayout, android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        if (this.f3018a > 0 && this.f3018a < size) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.f3018a, View.MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
    }
}
