package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.vending.R;

/* loaded from: classes.dex */
public class MarginBox extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    protected int f3016a;

    /* renamed from: b, reason: collision with root package name */
    protected int f3017b;

    public MarginBox(Context context) {
        this(context, null);
    }

    public MarginBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.f3016a = resources.getDimensionPixelSize(R.dimen.play_collection_max_width);
        this.f3017b = resources.getDimensionPixelSize(R.dimen.play_collection_edge_padding) - resources.getDimensionPixelSize(R.dimen.play_collection_card_spacing);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(this.f3016a, size - (this.f3017b * 2)), 1073741824);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getLayoutParams().height == -1) {
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else {
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i6 = (width - measuredWidth) / 2;
            int i7 = (height - measuredHeight) / 2;
            childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
        }
    }
}
