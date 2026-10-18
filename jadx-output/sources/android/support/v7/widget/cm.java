package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public class cm extends ViewGroup {
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    public cm(Context context) {
        this(context, null);
    }

    public cm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        fx a2 = fx.a(context, attributeSet, android.support.v7.b.l.LinearLayoutCompat, i);
        int a3 = a2.a(android.support.v7.b.l.LinearLayoutCompat_android_orientation, -1);
        if (a3 >= 0) {
            setOrientation(a3);
        }
        int a4 = a2.a(android.support.v7.b.l.LinearLayoutCompat_android_gravity, -1);
        if (a4 >= 0) {
            setGravity(a4);
        }
        boolean a5 = a2.a(android.support.v7.b.l.LinearLayoutCompat_android_baselineAligned, true);
        if (!a5) {
            setBaselineAligned(a5);
        }
        this.mWeightSum = a2.f836a.getFloat(android.support.v7.b.l.LinearLayoutCompat_android_weightSum, -1.0f);
        this.mBaselineAlignedChildIndex = a2.a(android.support.v7.b.l.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.mUseLargestChild = a2.a(android.support.v7.b.l.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a2.a(android.support.v7.b.l.LinearLayoutCompat_divider));
        this.mShowDividers = a2.a(android.support.v7.b.l.LinearLayoutCompat_showDividers, 0);
        this.mDividerPadding = a2.c(android.support.v7.b.l.LinearLayoutCompat_dividerPadding, 0);
        a2.f836a.recycle();
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.mDivider) {
            this.mDivider = drawable;
            if (drawable != null) {
                this.mDividerWidth = drawable.getIntrinsicWidth();
                this.mDividerHeight = drawable.getIntrinsicHeight();
            } else {
                this.mDividerWidth = 0;
                this.mDividerHeight = 0;
            }
            setWillNotDraw(drawable == null);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.mDivider != null) {
            if (this.mOrientation == 1) {
                drawDividersVertical(canvas);
            } else {
                drawDividersHorizontal(canvas);
            }
        }
    }

    void drawDividersVertical(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View virtualChildAt = getVirtualChildAt(i);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((cn) virtualChildAt.getLayoutParams()).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.mDividerHeight;
            } else {
                bottom = ((cn) virtualChildAt2.getLayoutParams()).bottomMargin + virtualChildAt2.getBottom();
            }
            drawHorizontalDivider(canvas, bottom);
        }
    }

    void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int virtualChildCount = getVirtualChildCount();
        boolean a2 = gm.a(this);
        for (int i = 0; i < virtualChildCount; i++) {
            View virtualChildAt = getVirtualChildAt(i);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                cn cnVar = (cn) virtualChildAt.getLayoutParams();
                if (a2) {
                    left = cnVar.rightMargin + virtualChildAt.getRight();
                } else {
                    left = (virtualChildAt.getLeft() - cnVar.leftMargin) - this.mDividerWidth;
                }
                drawVerticalDivider(canvas, left);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                if (a2) {
                    right = getPaddingLeft();
                } else {
                    right = (getWidth() - getPaddingRight()) - this.mDividerWidth;
                }
            } else {
                cn cnVar2 = (cn) virtualChildAt2.getLayoutParams();
                if (a2) {
                    right = (virtualChildAt2.getLeft() - cnVar2.leftMargin) - this.mDividerWidth;
                } else {
                    right = cnVar2.rightMargin + virtualChildAt2.getRight();
                }
            }
            drawVerticalDivider(canvas, right);
        }
    }

    void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        int i2;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= this.mBaselineAlignedChildIndex) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(this.mBaselineAlignedChildIndex);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex != 0) {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            return -1;
        }
        int i3 = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i2 = this.mGravity & 112) != 48) {
            switch (i2) {
                case 16:
                    i = i3 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2);
                    break;
                case 80:
                    i = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
                    break;
            }
            return ((cn) childAt.getLayoutParams()).topMargin + i + baseline;
        }
        i = i3;
        return ((cn) childAt.getLayoutParams()).topMargin + i + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.mBaselineAlignedChildIndex = i;
    }

    View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(0.0f, f);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    protected boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    void measureVertical(int i, int i2) {
        int i3;
        int i4;
        float f;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        View view;
        int i9;
        int i10;
        float f2;
        boolean z2;
        int i11;
        int i12;
        boolean z3;
        int i13;
        int i14;
        boolean z4;
        this.mTotalLength = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z5 = true;
        float f3 = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        boolean z6 = false;
        boolean z7 = false;
        int i19 = this.mBaselineAlignedChildIndex;
        boolean z8 = this.mUseLargestChild;
        int i20 = Integer.MIN_VALUE;
        int i21 = 0;
        while (i21 < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i21);
            if (virtualChildAt == null) {
                this.mTotalLength += measureNullChild(i21);
            } else {
                if (virtualChildAt.getVisibility() != 8) {
                    if (hasDividerBeforeChildAt(i21)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                    cn cnVar = (cn) virtualChildAt.getLayoutParams();
                    float f4 = f3 + cnVar.g;
                    if (mode2 == 1073741824 && cnVar.height == 0 && cnVar.g > 0.0f) {
                        int i22 = this.mTotalLength;
                        this.mTotalLength = Math.max(i22, cnVar.topMargin + i22 + cnVar.bottomMargin);
                        z7 = true;
                    } else {
                        int i23 = Integer.MIN_VALUE;
                        if (cnVar.height == 0 && cnVar.g > 0.0f) {
                            i23 = 0;
                            cnVar.height = -2;
                        }
                        int i24 = i23;
                        measureChildBeforeLayout(virtualChildAt, i21, i, 0, i2, f4 == 0.0f ? this.mTotalLength : 0);
                        if (i24 != Integer.MIN_VALUE) {
                            cnVar.height = i24;
                        }
                        int measuredHeight = virtualChildAt.getMeasuredHeight();
                        int i25 = this.mTotalLength;
                        this.mTotalLength = Math.max(i25, i25 + measuredHeight + cnVar.topMargin + cnVar.bottomMargin + getNextLocationOffset(virtualChildAt));
                        if (z8) {
                            i20 = Math.max(measuredHeight, i20);
                        }
                    }
                    if (i19 >= 0 && i19 == i21 + 1) {
                        this.mBaselineChildTop = this.mTotalLength;
                    }
                    if (i21 < i19 && cnVar.g > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    boolean z9 = false;
                    if (mode == 1073741824 || cnVar.width != -1) {
                        z4 = z6;
                    } else {
                        z4 = true;
                        z9 = true;
                    }
                    int i26 = cnVar.rightMargin + cnVar.leftMargin;
                    int measuredWidth = virtualChildAt.getMeasuredWidth() + i26;
                    int max = Math.max(i15, measuredWidth);
                    int a2 = gm.a(i16, android.support.v4.view.by.l(virtualChildAt));
                    boolean z10 = z5 && cnVar.width == -1;
                    if (cnVar.g > 0.0f) {
                        int i27 = z9 ? i26 : measuredWidth;
                        z2 = z10;
                        i11 = Math.max(i18, i27);
                        i12 = i17;
                        f2 = f4;
                        i10 = i20;
                        i13 = a2;
                        z6 = z4;
                        z3 = z7;
                        i14 = max;
                    } else {
                        if (!z9) {
                            i26 = measuredWidth;
                        }
                        int max2 = Math.max(i17, i26);
                        z2 = z10;
                        i11 = i18;
                        i12 = max2;
                        f2 = f4;
                        i10 = i20;
                        i13 = a2;
                        z6 = z4;
                        z3 = z7;
                        i14 = max;
                    }
                } else {
                    i10 = i20;
                    f2 = f3;
                    z2 = z5;
                    i11 = i18;
                    i12 = i17;
                    z3 = z7;
                    i13 = i16;
                    i14 = i15;
                }
                i21 += getChildrenSkipCount(virtualChildAt, i21);
                z5 = z2;
                i18 = i11;
                i17 = i12;
                i16 = i13;
                i15 = i14;
                i20 = i10;
                z7 = z3;
                f3 = f2;
            }
            i21++;
        }
        if (this.mTotalLength > 0 && hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerHeight;
        }
        if (z8 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            this.mTotalLength = 0;
            int i28 = 0;
            while (i28 < virtualChildCount) {
                View virtualChildAt2 = getVirtualChildAt(i28);
                if (virtualChildAt2 == null) {
                    this.mTotalLength += measureNullChild(i28);
                    i9 = i28;
                } else if (virtualChildAt2.getVisibility() == 8) {
                    i9 = getChildrenSkipCount(virtualChildAt2, i28) + i28;
                } else {
                    cn cnVar2 = (cn) virtualChildAt2.getLayoutParams();
                    int i29 = this.mTotalLength;
                    this.mTotalLength = Math.max(i29, cnVar2.bottomMargin + i29 + i20 + cnVar2.topMargin + getNextLocationOffset(virtualChildAt2));
                    i9 = i28;
                }
                i28 = i9 + 1;
            }
        }
        this.mTotalLength += getPaddingTop() + getPaddingBottom();
        int a3 = android.support.v4.view.by.a(Math.max(this.mTotalLength, getSuggestedMinimumHeight()), i2, 0);
        int i30 = (16777215 & a3) - this.mTotalLength;
        if (z7 || (i30 != 0 && f3 > 0.0f)) {
            if (this.mWeightSum > 0.0f) {
                f3 = this.mWeightSum;
            }
            this.mTotalLength = 0;
            boolean z11 = z5;
            int i31 = i17;
            int i32 = i16;
            int i33 = i15;
            int i34 = 0;
            float f5 = f3;
            int i35 = i30;
            while (i34 < virtualChildCount) {
                View virtualChildAt3 = getVirtualChildAt(i34);
                if (virtualChildAt3.getVisibility() != 8) {
                    cn cnVar3 = (cn) virtualChildAt3.getLayoutParams();
                    float f6 = cnVar3.g;
                    if (f6 > 0.0f) {
                        int i36 = (int) ((i35 * f6) / f5);
                        float f7 = f5 - f6;
                        int i37 = i35 - i36;
                        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + cnVar3.leftMargin + cnVar3.rightMargin, cnVar3.width);
                        if (cnVar3.height != 0 || mode2 != 1073741824) {
                            i36 += virtualChildAt3.getMeasuredHeight();
                            if (i36 < 0) {
                                i36 = 0;
                            }
                            view = virtualChildAt3;
                        } else if (i36 > 0) {
                            view = virtualChildAt3;
                        } else {
                            i36 = 0;
                            view = virtualChildAt3;
                        }
                        view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i36, 1073741824));
                        i7 = i37;
                        i8 = gm.a(i32, android.support.v4.view.by.l(virtualChildAt3) & (-256));
                        f = f7;
                    } else {
                        f = f5;
                        i7 = i35;
                        i8 = i32;
                    }
                    int i38 = cnVar3.leftMargin + cnVar3.rightMargin;
                    int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i38;
                    int max3 = Math.max(i33, measuredWidth2);
                    if (!(mode != 1073741824 && cnVar3.width == -1)) {
                        i38 = measuredWidth2;
                    }
                    int max4 = Math.max(i31, i38);
                    z = z11 && cnVar3.width == -1;
                    int i39 = this.mTotalLength;
                    this.mTotalLength = Math.max(i39, cnVar3.bottomMargin + virtualChildAt3.getMeasuredHeight() + i39 + cnVar3.topMargin + getNextLocationOffset(virtualChildAt3));
                    i5 = max4;
                    i6 = max3;
                } else {
                    f = f5;
                    z = z11;
                    i5 = i31;
                    i6 = i33;
                    i7 = i35;
                    i8 = i32;
                }
                i34++;
                z11 = z;
                i31 = i5;
                i32 = i8;
                i33 = i6;
                i35 = i7;
                f5 = f;
            }
            this.mTotalLength += getPaddingTop() + getPaddingBottom();
            z5 = z11;
            i3 = i31;
            i16 = i32;
            i4 = i33;
        } else {
            int max5 = Math.max(i17, i18);
            if (z8 && mode2 != 1073741824) {
                int i40 = 0;
                while (true) {
                    int i41 = i40;
                    if (i41 >= virtualChildCount) {
                        break;
                    }
                    View virtualChildAt4 = getVirtualChildAt(i41);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((cn) virtualChildAt4.getLayoutParams()).g > 0.0f) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i20, 1073741824));
                    }
                    i40 = i41 + 1;
                }
            }
            i3 = max5;
            i4 = i15;
        }
        if (z5 || mode == 1073741824) {
            i3 = i4;
        }
        setMeasuredDimension(android.support.v4.view.by.a(Math.max(i3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, i16), a3);
        if (z6) {
            forceUniformWidth(virtualChildCount, i2);
        }
    }

    private void forceUniformWidth(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                cn cnVar = (cn) virtualChildAt.getLayoutParams();
                if (cnVar.width == -1) {
                    int i4 = cnVar.height;
                    cnVar.height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, makeMeasureSpec, 0, i2, 0);
                    cnVar.height = i4;
                }
            }
        }
    }

    void measureHorizontal(int i, int i2) {
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        int i10;
        float f2;
        int baseline;
        View view;
        int i11;
        int i12;
        float f3;
        boolean z2;
        int i13;
        int i14;
        boolean z3;
        int i15;
        int i16;
        boolean z4;
        this.mTotalLength = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        boolean z5 = true;
        float f4 = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        boolean z6 = false;
        boolean z7 = false;
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z8 = this.mBaselineAligned;
        boolean z9 = this.mUseLargestChild;
        boolean z10 = mode == 1073741824;
        int i21 = Integer.MIN_VALUE;
        int i22 = 0;
        while (i22 < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i22);
            if (virtualChildAt == null) {
                this.mTotalLength += measureNullChild(i22);
            } else {
                if (virtualChildAt.getVisibility() != 8) {
                    if (hasDividerBeforeChildAt(i22)) {
                        this.mTotalLength += this.mDividerWidth;
                    }
                    cn cnVar = (cn) virtualChildAt.getLayoutParams();
                    float f5 = f4 + cnVar.g;
                    if (mode == 1073741824 && cnVar.width == 0 && cnVar.g > 0.0f) {
                        if (z10) {
                            this.mTotalLength += cnVar.leftMargin + cnVar.rightMargin;
                        } else {
                            int i23 = this.mTotalLength;
                            this.mTotalLength = Math.max(i23, cnVar.leftMargin + i23 + cnVar.rightMargin);
                        }
                        if (z8) {
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            virtualChildAt.measure(makeMeasureSpec, makeMeasureSpec);
                        } else {
                            z7 = true;
                        }
                    } else {
                        int i24 = Integer.MIN_VALUE;
                        if (cnVar.width == 0 && cnVar.g > 0.0f) {
                            i24 = 0;
                            cnVar.width = -2;
                        }
                        int i25 = i24;
                        measureChildBeforeLayout(virtualChildAt, i22, i, f5 == 0.0f ? this.mTotalLength : 0, i2, 0);
                        if (i25 != Integer.MIN_VALUE) {
                            cnVar.width = i25;
                        }
                        int measuredWidth = virtualChildAt.getMeasuredWidth();
                        if (z10) {
                            this.mTotalLength += cnVar.leftMargin + measuredWidth + cnVar.rightMargin + getNextLocationOffset(virtualChildAt);
                        } else {
                            int i26 = this.mTotalLength;
                            this.mTotalLength = Math.max(i26, i26 + measuredWidth + cnVar.leftMargin + cnVar.rightMargin + getNextLocationOffset(virtualChildAt));
                        }
                        if (z9) {
                            i21 = Math.max(measuredWidth, i21);
                        }
                    }
                    boolean z11 = false;
                    if (mode2 == 1073741824 || cnVar.height != -1) {
                        z4 = z6;
                    } else {
                        z4 = true;
                        z11 = true;
                    }
                    int i27 = cnVar.bottomMargin + cnVar.topMargin;
                    int measuredHeight = virtualChildAt.getMeasuredHeight() + i27;
                    int a2 = gm.a(i18, android.support.v4.view.by.l(virtualChildAt));
                    if (z8) {
                        int baseline2 = virtualChildAt.getBaseline();
                        if (baseline2 != -1) {
                            int i28 = ((((cnVar.h < 0 ? this.mGravity : cnVar.h) & 112) >> 4) & (-2)) >> 1;
                            iArr[i28] = Math.max(iArr[i28], baseline2);
                            iArr2[i28] = Math.max(iArr2[i28], measuredHeight - baseline2);
                        }
                    }
                    int max = Math.max(i17, measuredHeight);
                    boolean z12 = z5 && cnVar.height == -1;
                    if (cnVar.g > 0.0f) {
                        int i29 = z11 ? i27 : measuredHeight;
                        z2 = z12;
                        i13 = Math.max(i20, i29);
                        i14 = i19;
                        f3 = f5;
                        i12 = i21;
                        i15 = a2;
                        z6 = z4;
                        z3 = z7;
                        i16 = max;
                    } else {
                        if (!z11) {
                            i27 = measuredHeight;
                        }
                        int max2 = Math.max(i19, i27);
                        z2 = z12;
                        i13 = i20;
                        i14 = max2;
                        f3 = f5;
                        i12 = i21;
                        i15 = a2;
                        z6 = z4;
                        z3 = z7;
                        i16 = max;
                    }
                } else {
                    i12 = i21;
                    f3 = f4;
                    z2 = z5;
                    i13 = i20;
                    i14 = i19;
                    z3 = z7;
                    i15 = i18;
                    i16 = i17;
                }
                i22 += getChildrenSkipCount(virtualChildAt, i22);
                z5 = z2;
                i20 = i13;
                i19 = i14;
                i18 = i15;
                i17 = i16;
                i21 = i12;
                z7 = z3;
                f4 = f3;
            }
            i22++;
        }
        if (this.mTotalLength > 0 && hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerWidth;
        }
        int max3 = (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) ? i17 : Math.max(i17, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        if (z9 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.mTotalLength = 0;
            int i30 = 0;
            while (i30 < virtualChildCount) {
                View virtualChildAt2 = getVirtualChildAt(i30);
                if (virtualChildAt2 == null) {
                    this.mTotalLength += measureNullChild(i30);
                    i11 = i30;
                } else if (virtualChildAt2.getVisibility() == 8) {
                    i11 = getChildrenSkipCount(virtualChildAt2, i30) + i30;
                } else {
                    cn cnVar2 = (cn) virtualChildAt2.getLayoutParams();
                    if (z10) {
                        this.mTotalLength = cnVar2.rightMargin + cnVar2.leftMargin + i21 + getNextLocationOffset(virtualChildAt2) + this.mTotalLength;
                        i11 = i30;
                    } else {
                        int i31 = this.mTotalLength;
                        this.mTotalLength = Math.max(i31, cnVar2.rightMargin + i31 + i21 + cnVar2.leftMargin + getNextLocationOffset(virtualChildAt2));
                        i11 = i30;
                    }
                }
                i30 = i11 + 1;
            }
        }
        this.mTotalLength += getPaddingLeft() + getPaddingRight();
        int a3 = android.support.v4.view.by.a(Math.max(this.mTotalLength, getSuggestedMinimumWidth()), i, 0);
        int i32 = (16777215 & a3) - this.mTotalLength;
        if (z7 || (i32 != 0 && f4 > 0.0f)) {
            if (this.mWeightSum > 0.0f) {
                f4 = this.mWeightSum;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            int i33 = -1;
            this.mTotalLength = 0;
            float f6 = f4;
            boolean z13 = z5;
            int i34 = i19;
            int i35 = i18;
            int i36 = 0;
            while (i36 < virtualChildCount) {
                View virtualChildAt3 = getVirtualChildAt(i36);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    f = f6;
                    i5 = i32;
                    i6 = i34;
                    z = z13;
                    i7 = i35;
                    i8 = i33;
                } else {
                    cn cnVar3 = (cn) virtualChildAt3.getLayoutParams();
                    float f7 = cnVar3.g;
                    if (f7 > 0.0f) {
                        int i37 = (int) ((i32 * f7) / f6);
                        float f8 = f6 - f7;
                        int i38 = i32 - i37;
                        int childMeasureSpec = getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + cnVar3.topMargin + cnVar3.bottomMargin, cnVar3.height);
                        if (cnVar3.width != 0 || mode != 1073741824) {
                            i37 += virtualChildAt3.getMeasuredWidth();
                            if (i37 < 0) {
                                i37 = 0;
                            }
                            view = virtualChildAt3;
                        } else if (i37 > 0) {
                            view = virtualChildAt3;
                        } else {
                            i37 = 0;
                            view = virtualChildAt3;
                        }
                        view.measure(View.MeasureSpec.makeMeasureSpec(i37, 1073741824), childMeasureSpec);
                        i10 = gm.a(i35, android.support.v4.view.by.l(virtualChildAt3) & (-16777216));
                        f2 = f8;
                        i9 = i38;
                    } else {
                        i9 = i32;
                        i10 = i35;
                        f2 = f6;
                    }
                    if (z10) {
                        this.mTotalLength += virtualChildAt3.getMeasuredWidth() + cnVar3.leftMargin + cnVar3.rightMargin + getNextLocationOffset(virtualChildAt3);
                    } else {
                        int i39 = this.mTotalLength;
                        this.mTotalLength = Math.max(i39, virtualChildAt3.getMeasuredWidth() + i39 + cnVar3.leftMargin + cnVar3.rightMargin + getNextLocationOffset(virtualChildAt3));
                    }
                    boolean z14 = mode2 != 1073741824 && cnVar3.height == -1;
                    int i40 = cnVar3.topMargin + cnVar3.bottomMargin;
                    int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i40;
                    int max4 = Math.max(i33, measuredHeight2);
                    int max5 = Math.max(i34, z14 ? i40 : measuredHeight2);
                    boolean z15 = z13 && cnVar3.height == -1;
                    if (z8 && (baseline = virtualChildAt3.getBaseline()) != -1) {
                        int i41 = ((((cnVar3.h < 0 ? this.mGravity : cnVar3.h) & 112) >> 4) & (-2)) >> 1;
                        iArr[i41] = Math.max(iArr[i41], baseline);
                        iArr2[i41] = Math.max(iArr2[i41], measuredHeight2 - baseline);
                    }
                    f = f2;
                    i6 = max5;
                    i7 = i10;
                    z = z15;
                    i8 = max4;
                    i5 = i9;
                }
                i36++;
                z13 = z;
                i34 = i6;
                i33 = i8;
                i35 = i7;
                f6 = f;
                i32 = i5;
            }
            this.mTotalLength += getPaddingLeft() + getPaddingRight();
            if (iArr[1] != -1 || iArr[0] != -1 || iArr[2] != -1 || iArr[3] != -1) {
                i33 = Math.max(i33, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            }
            z5 = z13;
            i3 = i34;
            i18 = i35;
            i4 = i33;
        } else {
            int max6 = Math.max(i19, i20);
            if (z9 && mode != 1073741824) {
                int i42 = 0;
                while (true) {
                    int i43 = i42;
                    if (i43 >= virtualChildCount) {
                        break;
                    }
                    View virtualChildAt4 = getVirtualChildAt(i43);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((cn) virtualChildAt4.getLayoutParams()).g > 0.0f) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(i21, 1073741824), View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), 1073741824));
                    }
                    i42 = i43 + 1;
                }
            }
            i3 = max6;
            i4 = max3;
        }
        if (z5 || mode2 == 1073741824) {
            i3 = i4;
        }
        setMeasuredDimension(((-16777216) & i18) | a3, android.support.v4.view.by.a(Math.max(i3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i18 << 16));
        if (z6) {
            forceUniformHeight(virtualChildCount, i);
        }
    }

    private void forceUniformHeight(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                cn cnVar = (cn) virtualChildAt.getLayoutParams();
                if (cnVar.height == -1) {
                    int i4 = cnVar.width;
                    cnVar.width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i2, 0, makeMeasureSpec, 0);
                    cnVar.width = i4;
                }
            }
        }
    }

    int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    int measureNullChild(int i) {
        return 0;
    }

    void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    int getLocationOffset(View view) {
        return 0;
    }

    int getNextLocationOffset(View view) {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    void layoutVertical(int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i8 = this.mGravity & 112;
        int i9 = this.mGravity & 8388615;
        switch (i8) {
            case 16:
                paddingTop = getPaddingTop() + (((i4 - i2) - this.mTotalLength) / 2);
                break;
            case 80:
                paddingTop = ((getPaddingTop() + i4) - i2) - this.mTotalLength;
                break;
            default:
                paddingTop = getPaddingTop();
                break;
        }
        int i10 = 0;
        int i11 = paddingTop;
        while (i10 < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i10);
            if (virtualChildAt == null) {
                i11 += measureNullChild(i10);
                i5 = i10;
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                cn cnVar = (cn) virtualChildAt.getLayoutParams();
                int i12 = cnVar.h;
                if (i12 < 0) {
                    i12 = i9;
                }
                switch (android.support.v4.view.v.a(i12, android.support.v4.view.by.h(this)) & 7) {
                    case 1:
                        i6 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + cnVar.leftMargin) - cnVar.rightMargin;
                        break;
                    case 5:
                        i6 = (paddingRight - measuredWidth) - cnVar.rightMargin;
                        break;
                    default:
                        i6 = paddingLeft + cnVar.leftMargin;
                        break;
                }
                int i13 = (hasDividerBeforeChildAt(i10) ? this.mDividerHeight + i11 : i11) + cnVar.topMargin;
                setChildFrame(virtualChildAt, i6, i13 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                i11 = i13 + cnVar.bottomMargin + measuredHeight + getNextLocationOffset(virtualChildAt);
                i5 = getChildrenSkipCount(virtualChildAt, i10) + i10;
            } else {
                i5 = i10;
            }
            i10 = i5 + 1;
        }
    }

    void layoutHorizontal(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean a2 = gm.a(this);
        int paddingTop = getPaddingTop();
        int i10 = i4 - i2;
        int paddingBottom = i10 - getPaddingBottom();
        int paddingBottom2 = (i10 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i11 = this.mGravity & 8388615;
        int i12 = this.mGravity & 112;
        boolean z = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        switch (android.support.v4.view.v.a(i11, android.support.v4.view.by.h(this))) {
            case 1:
                paddingLeft = getPaddingLeft() + (((i3 - i) - this.mTotalLength) / 2);
                break;
            case 5:
                paddingLeft = ((getPaddingLeft() + i3) - i) - this.mTotalLength;
                break;
            default:
                paddingLeft = getPaddingLeft();
                break;
        }
        if (!a2) {
            i5 = 1;
            i6 = 0;
        } else {
            i5 = -1;
            i6 = virtualChildCount - 1;
        }
        int i13 = 0;
        while (i13 < virtualChildCount) {
            int i14 = i6 + (i5 * i13);
            View virtualChildAt = getVirtualChildAt(i14);
            if (virtualChildAt == null) {
                paddingLeft += measureNullChild(i14);
                i7 = i13;
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                cn cnVar = (cn) virtualChildAt.getLayoutParams();
                if (!z || cnVar.height == -1) {
                    i8 = -1;
                } else {
                    i8 = virtualChildAt.getBaseline();
                }
                int i15 = cnVar.h;
                if (i15 < 0) {
                    i15 = i12;
                }
                switch (i15 & 112) {
                    case 16:
                        i9 = ((((paddingBottom2 - measuredHeight) / 2) + paddingTop) + cnVar.topMargin) - cnVar.bottomMargin;
                        break;
                    case 48:
                        i9 = paddingTop + cnVar.topMargin;
                        if (i8 != -1) {
                            i9 += iArr[1] - i8;
                            break;
                        }
                        break;
                    case 80:
                        i9 = (paddingBottom - measuredHeight) - cnVar.bottomMargin;
                        if (i8 != -1) {
                            i9 -= iArr2[2] - (virtualChildAt.getMeasuredHeight() - i8);
                            break;
                        }
                        break;
                    default:
                        i9 = paddingTop;
                        break;
                }
                int i16 = (hasDividerBeforeChildAt(i14) ? this.mDividerWidth + paddingLeft : paddingLeft) + cnVar.leftMargin;
                setChildFrame(virtualChildAt, i16 + getLocationOffset(virtualChildAt), i9, measuredWidth, measuredHeight);
                paddingLeft = i16 + cnVar.rightMargin + measuredWidth + getNextLocationOffset(virtualChildAt);
                i7 = getChildrenSkipCount(virtualChildAt, i14) + i13;
            } else {
                i7 = i13;
            }
            i13 = i7 + 1;
        }
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i + i3, i2 + i4);
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            int i2 = (8388615 & i) == 0 ? 8388611 | i : i;
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.mGravity = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        if ((this.mGravity & 8388615) != i2) {
            this.mGravity = i2 | (this.mGravity & (-8388616));
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        if ((this.mGravity & 112) != i2) {
            this.mGravity = i2 | (this.mGravity & (-113));
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public cn generateLayoutParams(AttributeSet attributeSet) {
        return new cn(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public cn generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new cn(-2, -2);
        }
        if (this.mOrientation == 1) {
            return new cn(-1, -2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public cn generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new cn(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof cn;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(cm.class.getName());
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(cm.class.getName());
        }
    }
}
