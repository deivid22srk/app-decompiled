package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;

/* loaded from: classes.dex */
public class DetailsExpandedFrame extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private View f2955a;

    /* renamed from: b, reason: collision with root package name */
    private View f2956b;
    private View c;
    private int d;

    public DetailsExpandedFrame(Context context) {
        this(context, null);
    }

    public DetailsExpandedFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2955a = findViewById(R.id.left_bar);
        this.f2956b = findViewById(R.id.right_bar);
        this.c = findViewById(R.id.details_expanded_scroller);
    }

    public void setScrollerWidth(int i) {
        this.d = i;
    }

    public void setSideBarProportion(float f) {
        int width = (getWidth() - this.d) / 2;
        int i = width - ((int) (width * f));
        android.support.v4.view.by.a(this, i, 0, i, 0);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int min = Math.min(this.d, size);
        this.c.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        int i3 = (size - min) / 2;
        if (i3 == 0) {
            this.f2955a.setVisibility(8);
            this.f2956b.setVisibility(8);
        } else {
            this.f2955a.setVisibility(0);
            this.f2956b.setVisibility(0);
            this.f2955a.measure(View.MeasureSpec.makeMeasureSpec(i3 - getPaddingLeft(), 1073741824), i2);
            this.f2956b.measure(View.MeasureSpec.makeMeasureSpec(i3 - getPaddingRight(), 1073741824), i2);
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = this.c.getMeasuredWidth();
        int i5 = (width - measuredWidth) / 2;
        this.c.layout(i5, 0, i5 + measuredWidth, height);
        if (this.f2955a.getVisibility() == 0) {
            this.f2955a.layout(i5 - this.f2955a.getMeasuredWidth(), 0, i5, height);
        }
        if (this.f2956b.getVisibility() == 0) {
            this.f2956b.layout(i5 + measuredWidth, 0, i5 + measuredWidth + this.f2956b.getMeasuredWidth(), height);
        }
    }
}
