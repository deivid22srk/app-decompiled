package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public class DetailsButtonLayout extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private final int f2945a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2946b;
    private boolean c;
    private final boolean d;

    public DetailsButtonLayout(Context context) {
        this(context, null);
    }

    public DetailsButtonLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
        Resources resources = context.getResources();
        this.f2945a = (resources.getDimensionPixelSize(R.dimen.details_new_content_margin) * 2) / 3;
        this.f2946b = resources.getDimensionPixelSize(R.dimen.details_button_row_padding);
        this.d = resources.getBoolean(R.bool.use_wide_layout);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 0) {
                i5++;
                childAt.measure(0, 0);
                i4 += childAt.getMeasuredWidth();
                i3 = Math.max(i3, childAt.getMeasuredHeight());
            }
        }
        if (i5 > 0) {
            i4 += this.f2945a * (i5 - 1);
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE && i4 <= size) {
            setMeasuredDimension(i4, i3 + paddingTop);
            return;
        }
        int i7 = size - i4;
        if (i7 > 0 && (i5 == 1 || this.d)) {
            i7 = 0;
        }
        if (i7 < 0) {
            this.c = true;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            i3 = 0;
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt2 = getChildAt(i8);
                if (childAt2.getVisibility() == 0) {
                    i3 += childAt2.getMeasuredHeight();
                    childAt2.measure(makeMeasureSpec, 0);
                }
            }
            if (i5 > 0) {
                i3 += this.f2946b * (i5 - 1);
            }
        } else if (i7 > 0 && i5 > 0) {
            int i9 = i7 / i5;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt3 = getChildAt(i10);
                if (childAt3.getVisibility() == 0) {
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredWidth() + i9, 1073741824), 0);
                }
            }
        }
        setMeasuredDimension(size, i3 + paddingTop);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = android.support.v4.view.by.h(this) == 0;
        int width = getWidth();
        int childCount = getChildCount() - 1;
        int paddingTop = getPaddingTop();
        int i5 = 0;
        for (int i6 = childCount; i6 >= 0; i6--) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 0) {
                int measuredWidth = childAt.getMeasuredWidth();
                int b2 = com.google.android.play.utils.j.b(width, measuredWidth, z2, i5);
                int measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                childAt.layout(b2, paddingTop, b2 + measuredWidth, childAt.getMeasuredHeight() + paddingTop);
                if (this.c) {
                    paddingTop += this.f2946b + measuredHeight;
                } else {
                    i5 += this.f2945a + measuredWidth;
                }
            }
        }
    }
}
