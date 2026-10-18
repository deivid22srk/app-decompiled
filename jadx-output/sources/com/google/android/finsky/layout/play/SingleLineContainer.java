package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class SingleLineContainer extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final int f3376a;

    /* renamed from: b, reason: collision with root package name */
    private View f3377b;

    public SingleLineContainer(Context context) {
        this(context, null);
    }

    public SingleLineContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.android.vending.b.SingleLineContainer);
        this.f3376a = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (this.f3376a != 0) {
            this.f3377b = findViewById(this.f3376a);
        }
    }

    private static boolean a(View view) {
        return view.getBaseline() == -1 || (((LinearLayout.LayoutParams) view.getLayoutParams()).gravity & 112) == 16;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        int size = View.MeasureSpec.getSize(i);
        int n = (size - android.support.v4.view.by.n(this)) - android.support.v4.view.by.o(this);
        int childCount = getChildCount();
        int i8 = 0;
        int i9 = 0;
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                childAt.measure(0, 0);
                if (!a(childAt)) {
                    i6 = Math.max(i9, childAt.getBaseline());
                    i8++;
                    i9 = i6;
                }
            }
            i6 = i9;
            i8++;
            i9 = i6;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < childCount) {
            View childAt2 = getChildAt(i10);
            if (childAt2.getVisibility() != 8) {
                int measuredHeight = childAt2.getMeasuredHeight();
                if (a(childAt2)) {
                    int max = Math.max(i11, measuredHeight);
                    i3 = i7;
                    i4 = max;
                } else {
                    i3 = Math.max(i7, measuredHeight - childAt2.getBaseline());
                    i4 = i11;
                }
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                i5 = android.support.v4.view.ao.b(layoutParams) + childAt2.getMeasuredWidth() + android.support.v4.view.ao.a(layoutParams) + i12;
            } else {
                i3 = i7;
                i4 = i11;
                i5 = i12;
            }
            i10++;
            i12 = i5;
            i11 = i4;
            i7 = i3;
        }
        int max2 = Math.max(i9 + i7, i11) + getPaddingTop() + getPaddingBottom();
        if (i12 > n && this.f3377b != null && this.f3377b.getVisibility() != 8) {
            this.f3377b.measure(View.MeasureSpec.makeMeasureSpec(this.f3377b.getMeasuredWidth() - (i12 - n), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f3377b.getMeasuredHeight(), 1073741824));
        }
        setMeasuredDimension(size, max2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean z2 = android.support.v4.view.by.h(this) == 0;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int width = getWidth();
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            i7++;
            i6 = childAt.getVisibility() != 8 ? Math.max(i6, childAt.getBaseline()) : i6;
        }
        int n = android.support.v4.view.by.n(this);
        int i8 = 0;
        while (i8 < childCount) {
            View childAt2 = getChildAt(i8);
            if (childAt2.getVisibility() != 8) {
                int measuredWidth = childAt2.getMeasuredWidth();
                int measuredHeight = childAt2.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt2.getLayoutParams();
                int a2 = android.support.v4.view.ao.a(marginLayoutParams) + n;
                int baseline = a(childAt2) ? ((((height - paddingTop) - paddingBottom) - measuredHeight) / 2) + paddingTop : (paddingTop + i6) - childAt2.getBaseline();
                int a3 = com.google.android.play.utils.j.a(width, measuredWidth, z2, a2);
                childAt2.layout(a3, baseline, a3 + measuredWidth, childAt2.getMeasuredHeight() + baseline);
                i5 = android.support.v4.view.ao.b(marginLayoutParams) + measuredWidth + a2;
            } else {
                i5 = n;
            }
            i8++;
            n = i5;
        }
    }
}
