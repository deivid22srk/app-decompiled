package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;

/* loaded from: classes.dex */
public class InlineDetailsSummary extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private View f3007a;

    /* renamed from: b, reason: collision with root package name */
    private View f3008b;
    private View c;
    private View d;
    private final int e;
    private final int f;

    public InlineDetailsSummary(Context context) {
        this(context, null);
    }

    public InlineDetailsSummary(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.e = resources.getDimensionPixelSize(R.dimen.details_new_content_margin);
        this.f = resources.getDimensionPixelSize(R.dimen.details_title_offset);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3007a = findViewById(R.id.title_title);
        this.f3008b = findViewById(R.id.title_creator_panel);
        this.c = findViewById(R.id.title_extra_labels);
        this.d = findViewById(R.id.title_details_summary_dynamic);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = size - (this.e * 2);
        int i4 = this.e;
        this.f3007a.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), 0);
        int measuredHeight = i4 + (this.f3007a.getMeasuredHeight() - this.f);
        if (this.f3008b.getVisibility() != 8) {
            this.f3008b.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), 0);
            measuredHeight += this.f3008b.getMeasuredHeight();
        }
        if (this.c.getVisibility() == 0) {
            this.c.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), 0);
            measuredHeight += this.c.getMeasuredHeight();
        }
        if (this.d.getVisibility() != 8) {
            this.d.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), 0);
            measuredHeight = Math.max(measuredHeight, 0) + this.d.getMeasuredHeight();
        }
        setMeasuredDimension(size, measuredHeight + this.e + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = android.support.v4.view.by.h(this) == 0;
        int width = getWidth();
        int height = getHeight();
        int i5 = this.e;
        int paddingTop = (getPaddingTop() + this.e) - this.f;
        int measuredWidth = this.f3007a.getMeasuredWidth();
        int a2 = com.google.android.play.utils.j.a(width, measuredWidth, z2, i5);
        this.f3007a.layout(a2, paddingTop, measuredWidth + a2, this.f3007a.getMeasuredHeight() + paddingTop);
        int measuredHeight = paddingTop + this.f3007a.getMeasuredHeight();
        if (this.f3008b.getVisibility() != 8) {
            int measuredWidth2 = this.f3008b.getMeasuredWidth();
            int a3 = com.google.android.play.utils.j.a(width, measuredWidth2, z2, i5);
            this.f3008b.layout(a3, measuredHeight, measuredWidth2 + a3, this.f3008b.getMeasuredHeight() + measuredHeight);
            measuredHeight += this.f3008b.getMeasuredHeight();
        }
        if (this.c.getVisibility() != 8) {
            int measuredWidth3 = this.c.getMeasuredWidth();
            int b2 = com.google.android.play.utils.j.b(width, measuredWidth3, z2, this.e);
            this.c.layout(b2, measuredHeight, measuredWidth3 + b2, this.c.getMeasuredHeight() + measuredHeight);
        }
        int paddingBottom = (height - getPaddingBottom()) - this.e;
        if (this.d.getVisibility() != 8) {
            int measuredHeight2 = this.d.getMeasuredHeight();
            int measuredWidth4 = this.d.getMeasuredWidth();
            int b3 = com.google.android.play.utils.j.b(width, measuredWidth4, z2, this.e);
            this.d.layout(b3, paddingBottom - measuredHeight2, measuredWidth4 + b3, paddingBottom);
        }
    }
}
