package com.google.android.play.layout;

import android.content.Context;
import android.support.v4.view.by;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class PlayRatingBadgeContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private View f6974a;

    /* renamed from: b, reason: collision with root package name */
    private View f6975b;

    public PlayRatingBadgeContainer(Context context) {
        this(context, null);
    }

    public PlayRatingBadgeContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f6974a = findViewById(com.google.android.play.k.li_rating);
        this.f6975b = findViewById(com.google.android.play.k.li_badge);
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.f6975b.getVisibility() != 8) {
            return this.f6975b.getBaseline();
        }
        if (this.f6974a.getVisibility() != 8) {
            return this.f6974a.getBaseline();
        }
        return getMeasuredHeight();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        if (this.f6974a.getVisibility() != 8) {
            this.f6974a.measure(0, 0);
            if (this.f6974a.getMeasuredWidth() > size) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
                this.f6974a.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 = this.f6974a.getMeasuredWidth();
            i3 = this.f6974a.getMeasuredHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.f6975b.getVisibility() != 8) {
            this.f6975b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), 0);
            i4 = Math.max(i4, this.f6975b.getMeasuredWidth());
            i3 = Math.max(i3, this.f6975b.getMeasuredHeight());
        }
        setMeasuredDimension(i4, i3);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = by.h(this) == 0;
        int width = getWidth();
        if (this.f6974a.getVisibility() != 8) {
            int measuredWidth = this.f6974a.getMeasuredWidth();
            int a2 = com.google.android.play.utils.j.a(width, measuredWidth, z2, 0);
            this.f6974a.layout(a2, 0, measuredWidth + a2, this.f6974a.getMeasuredHeight());
        }
        if (this.f6975b.getVisibility() != 8) {
            int measuredWidth2 = this.f6975b.getMeasuredWidth();
            int a3 = com.google.android.play.utils.j.a(width, measuredWidth2, z2, 0);
            this.f6975b.layout(a3, 0, measuredWidth2 + a3, this.f6975b.getMeasuredHeight());
        }
    }
}
