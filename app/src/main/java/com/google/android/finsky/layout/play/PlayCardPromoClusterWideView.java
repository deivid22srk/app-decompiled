package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class PlayCardPromoClusterWideView extends bg {
    public PlayCardPromoClusterWideView(Context context) {
        super(context);
    }

    public PlayCardPromoClusterWideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.layout.play.bg, com.google.android.finsky.layout.play.ci, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        this.f3434b.measure(View.MeasureSpec.makeMeasureSpec((size - paddingLeft) - paddingRight, 1073741824), 0);
        this.j.measure(i, 0);
        setMeasuredDimension(size, this.j.getMeasuredHeight() + this.f3434b.getMeasuredHeight() + paddingBottom);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = android.support.v4.view.by.h(this) == 0;
        int width = getWidth();
        int paddingTop = getPaddingTop();
        int n = android.support.v4.view.by.n(this);
        int measuredHeight = this.j.getMeasuredHeight() + paddingTop;
        int measuredWidth = this.j.getMeasuredWidth();
        int a2 = com.google.android.play.utils.j.a(width, measuredWidth, z2, n);
        int measuredWidth2 = this.f3434b.getMeasuredWidth();
        int a3 = com.google.android.play.utils.j.a(width, measuredWidth2, z2, n);
        this.j.layout(a2, paddingTop, a2 + measuredWidth, measuredHeight);
        this.f3434b.layout(a3, measuredHeight, a3 + measuredWidth2, this.f3434b.getMeasuredHeight() + measuredHeight);
    }
}
