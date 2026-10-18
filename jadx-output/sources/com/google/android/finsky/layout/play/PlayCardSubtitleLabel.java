package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.android.vending.R;

/* loaded from: classes.dex */
public class PlayCardSubtitleLabel extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    protected View f3335a;

    /* renamed from: b, reason: collision with root package name */
    protected View f3336b;

    public PlayCardSubtitleLabel(Context context) {
        this(context, null);
    }

    public PlayCardSubtitleLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3335a = findViewById(R.id.li_subtitle);
        this.f3336b = findViewById(R.id.li_label);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        this.f3336b.measure(View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), Integer.MIN_VALUE), 0);
        this.f3335a.measure(0, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3335a.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f3336b.getLayoutParams();
        this.f3335a.measure(View.MeasureSpec.makeMeasureSpec(Math.min(this.f3335a.getMeasuredWidth(), ((((size - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin) - this.f3336b.getMeasuredWidth()) - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin), 1073741824), 0);
        setMeasuredDimension(size, this.f3335a.getMeasuredHeight());
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = android.support.v4.view.by.h(this) == 0;
        int width = getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3335a.getLayoutParams();
        int measuredWidth = this.f3335a.getMeasuredWidth();
        int a2 = com.google.android.play.utils.j.a(width, measuredWidth, z2, android.support.v4.view.ao.a(marginLayoutParams));
        this.f3335a.layout(a2, 0, measuredWidth + a2, this.f3335a.getMeasuredHeight());
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f3336b.getLayoutParams();
        int baseline = this.f3335a.getBaseline() - this.f3336b.getBaseline();
        int measuredWidth2 = this.f3336b.getMeasuredWidth();
        int b2 = com.google.android.play.utils.j.b(width, measuredWidth2, z2, android.support.v4.view.ao.b(marginLayoutParams2));
        this.f3336b.layout(b2, baseline, b2 + measuredWidth2, this.f3336b.getMeasuredHeight() + baseline);
    }
}
