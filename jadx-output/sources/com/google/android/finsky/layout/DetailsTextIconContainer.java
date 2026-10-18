package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;

/* loaded from: classes.dex */
public class DetailsTextIconContainer extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private final int f2968a;

    public DetailsTextIconContainer(Context context) {
        this(context, null);
    }

    public DetailsTextIconContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2968a = context.getResources().getDimensionPixelSize(R.dimen.details_text_section_icon_gap);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int n = android.support.v4.view.by.n(this);
        int o = android.support.v4.view.by.o(this);
        int size = (((int) (View.MeasureSpec.getSize(i) * 0.75f)) - n) - o;
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams.width <= size) {
                childAt.setVisibility(0);
                childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                size -= layoutParams.width + this.f2968a;
                i4 += layoutParams.width + this.f2968a;
                i3 = Math.max(i3, layoutParams.height);
            } else {
                childAt.setVisibility(8);
            }
        }
        setMeasuredDimension(i4 + n + o, i3 + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        int childCount = getChildCount();
        int n = android.support.v4.view.by.n(this);
        int o = android.support.v4.view.by.o(this);
        boolean z2 = android.support.v4.view.by.h(this) == 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 0) {
                i6++;
                i5 += childAt.getMeasuredWidth();
            }
        }
        if (i6 > 1) {
            i5 += (i6 - 1) * this.f2968a;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = (height - paddingTop) - getPaddingBottom();
        int i8 = n + ((((width - i5) - n) - o) / 2);
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            if (childAt2.getVisibility() == 0) {
                int measuredWidth = childAt2.getMeasuredWidth();
                int measuredHeight = childAt2.getMeasuredHeight();
                int i10 = ((paddingBottom - measuredHeight) / 2) + paddingTop;
                int a2 = com.google.android.play.utils.j.a(width, measuredWidth, z2, i8);
                childAt2.layout(a2, i10, a2 + measuredWidth, measuredHeight + i10);
                i8 += this.f2968a + measuredWidth;
            }
        }
    }
}
