package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class PlayCardViewAvatar extends com.google.android.play.layout.a {
    public PlayCardViewAvatar(Context context) {
        this(context, null);
    }

    public PlayCardViewAvatar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.play.layout.a
    public com.google.android.play.cpkg.i getCardViewGroupDelegate() {
        return com.google.android.play.cpkg.j.f6830b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i3 = (size - paddingLeft) - paddingRight;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b_.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((i3 - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, 1073741824);
        this.b_.measure(makeMeasureSpec, makeMeasureSpec);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
        this.h.measure(View.MeasureSpec.makeMeasureSpec((i3 - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin, 1073741824), 0);
        int measuredHeight = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin + this.b_.getMeasuredHeight() + marginLayoutParams2.topMargin + this.h.getMeasuredHeight() + marginLayoutParams2.bottomMargin;
        this.y.measure(0, 0);
        setMeasuredDimension(size, measuredHeight + paddingTop + paddingBottom);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, com.google.android.play.layout.ForegroundRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = android.support.v4.view.by.h(this) == 0;
        int n = android.support.v4.view.by.n(this);
        int o = android.support.v4.view.by.o(this);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int width = getWidth();
        int height = getHeight();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b_.getLayoutParams();
        int measuredWidth = this.b_.getMeasuredWidth();
        int measuredHeight = this.b_.getMeasuredHeight();
        int a2 = com.google.android.play.utils.j.a(width, measuredWidth, z2, android.support.v4.view.ao.a(marginLayoutParams) + n);
        this.b_.layout(a2, marginLayoutParams.topMargin + paddingTop, measuredWidth + a2, marginLayoutParams.topMargin + paddingTop + measuredHeight);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
        int i5 = paddingTop + measuredHeight + marginLayoutParams2.topMargin;
        int a3 = android.support.v4.view.ao.a(marginLayoutParams2) + n;
        int measuredWidth2 = this.h.getMeasuredWidth();
        int measuredHeight2 = this.h.getMeasuredHeight();
        int a4 = com.google.android.play.utils.j.a(width, measuredWidth2, z2, a3);
        this.h.layout(a4, i5, measuredWidth2 + a4, measuredHeight2 + i5);
        int measuredWidth3 = this.y.getMeasuredWidth();
        int i6 = n + ((((width - n) - o) - measuredWidth3) / 2);
        int measuredHeight3 = ((((height - paddingTop) - paddingBottom) - this.y.getMeasuredHeight()) / 2) + paddingTop;
        int a5 = com.google.android.play.utils.j.a(width, measuredWidth3, z2, i6);
        this.y.layout(a5, measuredHeight3, measuredWidth3 + a5, this.y.getMeasuredHeight() + measuredHeight3);
    }

    @Override // com.google.android.play.layout.a
    public int getCardType() {
        return 16;
    }
}
