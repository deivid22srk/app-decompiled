package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class BucketRow extends IdentifiableLinearLayout implements com.google.android.finsky.layout.play.ag {

    /* renamed from: a, reason: collision with root package name */
    private boolean f2931a;

    public BucketRow(Context context) {
        this(context, null);
    }

    public BucketRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.deivid22srk.store.b.BucketRow);
        this.f2931a = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    public void setSameChildHeight(boolean z) {
        this.f2931a = z;
    }

    public void setContentHorizontalPadding(int i) {
        android.support.v4.view.by.a(this, i, getPaddingTop(), i, getPaddingBottom());
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        if (childCount > 0) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((size - getPaddingLeft()) - getPaddingRight()) / childCount, 1073741824);
            int i4 = 0;
            i3 = 0;
            while (i4 < childCount) {
                View childAt = getChildAt(i4);
                childAt.measure(makeMeasureSpec, getChildMeasureSpec(0, 0, childAt.getLayoutParams().height));
                i4++;
                i3 = Math.max(i3, childAt.getMeasuredHeight());
            }
            if (this.f2931a) {
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt2 = getChildAt(i5);
                    if (childAt2.getMeasuredHeight() != i3) {
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredWidth(), 1073741824), makeMeasureSpec2);
                    }
                }
            }
        } else {
            i3 = 0;
        }
        setMeasuredDimension(size, i3 + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int n = android.support.v4.view.by.n(this);
        int width = getWidth();
        int height = getHeight() - getPaddingBottom();
        boolean z2 = android.support.v4.view.by.h(this) == 0;
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth();
            int a2 = com.google.android.play.utils.j.a(width, measuredWidth, z2, n + i5);
            childAt.layout(a2, (height - childAt.getMeasuredHeight()) - marginLayoutParams.bottomMargin, a2 + measuredWidth, height - marginLayoutParams.bottomMargin);
            i5 += measuredWidth;
        }
    }
}
