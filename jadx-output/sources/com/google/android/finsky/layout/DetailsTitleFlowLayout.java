package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public class DetailsTitleFlowLayout extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private final int f2971a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2972b;
    private final Paint c;
    private final int d;
    private int[] e;

    public DetailsTitleFlowLayout(Context context) {
        this(context, null);
    }

    public DetailsTitleFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.deivid22srk.store.b.DetailsTitleFlowLayout);
        this.f2971a = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f2972b = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.d = obtainStyledAttributes.getInt(0, 8388611);
        obtainStyledAttributes.recycle();
        this.c = new Paint();
        this.c.setAntiAlias(true);
        this.c.setColor(resources.getColor(R.color.play_fg_secondary));
        this.c.setStyle(Paint.Style.FILL_AND_STROKE);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int n = android.support.v4.view.by.n(this);
        int o = android.support.v4.view.by.o(this);
        int mode = View.MeasureSpec.getMode(i);
        int max = Math.max((View.MeasureSpec.getSize(i) - n) - o, 0);
        boolean z = mode == 1073741824;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
        this.e = new int[childCount];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = paddingTop;
        int i8 = 0;
        int i9 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            childAt.measure(makeMeasureSpec, 0);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (i5 + measuredWidth > max) {
                i7 += i4;
                i4 = 0;
                i5 = 0;
                i9 = 0;
                if (i6 > 0) {
                    i3++;
                }
            }
            int i10 = i5 + this.f2971a + measuredWidth;
            int i11 = i9 + this.f2971a + measuredWidth;
            int max2 = Math.max(i4, measuredHeight);
            int max3 = Math.max(i11, i8);
            this.e[i3] = i11;
            i6++;
            i8 = max3;
            i4 = max2;
            i9 = i11;
            i5 = i10;
        }
        setMeasuredDimension((z ? max : i8 - this.f2971a) + n + o, i7 + i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width = getWidth();
        int n = android.support.v4.view.by.n(this);
        int o = android.support.v4.view.by.o(this);
        int i6 = (width - n) - o;
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        boolean z2 = android.support.v4.view.by.h(this) == 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = paddingTop;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (i10 + measuredWidth > i6) {
                i11 += i9;
                i9 = 0;
                i10 = 0;
                i8++;
            }
            switch (android.support.v4.view.v.a(this.d, android.support.v4.view.by.h(this))) {
                case 1:
                    i5 = ((width - this.e[i8]) / 2) + i10;
                    break;
                case 8388613:
                    i5 = ((i10 + width) - this.e[i8]) - o;
                    break;
                default:
                    i5 = i10 + n;
                    break;
            }
            int a2 = com.google.android.play.utils.j.a(width, measuredWidth, z2, i5);
            childAt.layout(a2, i11, a2 + measuredWidth, i11 + measuredHeight);
            int max = Math.max(i9, measuredHeight);
            i10 += this.f2971a + measuredWidth;
            i7++;
            i9 = max;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2972b > 0) {
            boolean z = android.support.v4.view.by.h(this) == 0;
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    if (z) {
                        int left = childAt.getLeft();
                        if (left > paddingLeft) {
                            int bottom = (childAt.getBottom() + childAt.getTop()) / 2;
                            int i2 = left - (this.f2971a / 2);
                            canvas.save();
                            canvas.drawCircle(i2, bottom, this.f2972b / 2, this.c);
                            canvas.restore();
                        }
                    } else {
                        int right = childAt.getRight();
                        if (right < width) {
                            int bottom2 = (childAt.getBottom() + childAt.getTop()) / 2;
                            int i3 = right + (this.f2971a / 2);
                            canvas.save();
                            canvas.drawCircle(i3, bottom2, this.f2972b / 2, this.c);
                            canvas.restore();
                        }
                    }
                }
            }
        }
    }
}
