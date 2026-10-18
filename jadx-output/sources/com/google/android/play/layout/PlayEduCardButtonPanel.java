package com.google.android.play.layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v4.view.by;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.play.n;
import com.google.android.play.o;

/* loaded from: classes.dex */
public class PlayEduCardButtonPanel extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private static final int f6972a;

    /* renamed from: b, reason: collision with root package name */
    private int f6973b;
    private boolean c;

    static {
        f6972a = Build.VERSION.SDK_INT >= 11 ? 16777216 : 0;
    }

    public PlayEduCardButtonPanel(Context context) {
        this(context, null, 0);
    }

    public PlayEduCardButtonPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayEduCardButtonPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i, n.PlayEduCardButtonPanel);
    }

    @TargetApi(21)
    public PlayEduCardButtonPanel(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.PlayEduCardButtonPanel, i, i2);
        this.f6973b = obtainStyledAttributes.getDimensionPixelOffset(o.PlayEduCardButtonPanel_playSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    public int getSpacing() {
        return this.f6973b;
    }

    public void setSpacing(int i) {
        if (this.f6973b != i) {
            this.f6973b = i;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        if (childCount == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i3 = this.f6973b * (childCount - 1);
        int i4 = 0;
        int a2 = a(mode, size, paddingLeft);
        int a3 = a(mode2, size2, paddingTop);
        boolean z = false;
        int i5 = i3;
        int i6 = i3;
        int i7 = 0;
        boolean z2 = false;
        int i8 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            childAt.measure(a2, a3);
            int j = by.j(childAt);
            int i9 = 16777215 & j;
            int i10 = i6 + i9;
            int max = Math.max(i8, i9);
            boolean z3 = z || (16777216 & j) != 0;
            int k = by.k(childAt);
            int i11 = k & 16777215;
            int i12 = i5 + i11;
            i4 = Math.max(i4, i11);
            i7++;
            z2 = z2 || (k & 16777216) != 0;
            i5 = i12;
            i8 = max;
            z = z3;
            i6 = i10;
        }
        int i13 = i6 + paddingLeft;
        int i14 = i8 + paddingLeft;
        if (mode == 0) {
            this.c = false;
        } else if (i13 <= size) {
            if (mode == 1073741824) {
                i13 = size;
            }
            this.c = false;
        } else if (i14 <= size) {
            if (mode != 1073741824) {
                size = i14;
            }
            this.c = true;
            i13 = size;
        } else {
            i13 = f6972a | size;
            this.c = true;
        }
        if (z) {
            i13 |= f6972a;
        }
        int i15 = (this.c ? i5 : i4) + paddingTop;
        if (mode2 != 0) {
            if (i15 <= size2) {
                if (mode2 == 1073741824) {
                    i15 = size2;
                }
            } else {
                i15 = f6972a | size2;
            }
        }
        if (z2) {
            i15 |= f6972a;
        }
        setMeasuredDimension(i13, i15);
    }

    private static int a(int i, int i2, int i3) {
        return i == 0 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(Math.max(0, i2 - i3), Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int childCount = getChildCount();
        if (childCount != 0) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = (i3 - i) - getPaddingRight();
            int paddingTop = getPaddingTop();
            boolean z2 = by.h(this) == 1;
            int i8 = 0;
            while (i8 < childCount) {
                View childAt = getChildAt(this.c ? i8 : (childCount - 1) - i8);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (z2) {
                    childAt.layout(paddingLeft, paddingTop, paddingLeft + measuredWidth, paddingTop + measuredHeight);
                } else {
                    childAt.layout(paddingRight - measuredWidth, paddingTop, paddingRight, paddingTop + measuredHeight);
                }
                if (this.c) {
                    i6 = this.f6973b + measuredHeight + paddingTop;
                    i7 = paddingRight;
                    i5 = paddingLeft;
                } else if (z2) {
                    int i9 = paddingTop;
                    i7 = paddingRight;
                    i5 = this.f6973b + measuredWidth + paddingLeft;
                    i6 = i9;
                } else {
                    int i10 = paddingRight - (this.f6973b + measuredWidth);
                    i5 = paddingLeft;
                    i6 = paddingTop;
                    i7 = i10;
                }
                i8++;
                paddingLeft = i5;
                paddingRight = i7;
                paddingTop = i6;
            }
        }
    }
}
