package com.google.android.play.layout;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ao;
import android.support.v4.view.by;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class PlayCardViewSmall extends a {
    protected View E;
    private int F;
    private int G;
    private final int H;
    private int I;

    /* renamed from: a, reason: collision with root package name */
    protected View f6971a;

    public PlayCardViewSmall(Context context) {
        this(context, null);
    }

    public PlayCardViewSmall(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = 1;
        this.G = -1;
        Resources resources = context.getResources();
        this.G = resources.getDimensionPixelSize(com.google.android.play.i.play_small_card_content_min_height);
        this.H = resources.getDimensionPixelSize(com.google.android.play.i.play_card_extra_vspace);
    }

    @Override // com.google.android.play.layout.a, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f6971a = findViewById(com.google.android.play.k.rating_badge_container);
        this.E = findViewById(com.google.android.play.k.li_ad_label_container);
    }

    private boolean c(int i) {
        return (this.F & i) != 0;
    }

    public void setTextContentFlags(int i) {
        int i2;
        if (i != this.F) {
            this.F = i;
            boolean c = c(2);
            this.B = !c;
            if (c) {
                i2 = 1;
            } else {
                i2 = c(4) ? 3 : 2;
            }
            if (c(8)) {
                i2++;
            }
            this.h.setSingleLine(i2 == 1);
            this.h.setMaxLines(i2);
            this.G = -1;
        }
    }

    private int getTextContentHeight() {
        if (this.G == -1) {
            this.G = getResources().getDimensionPixelSize(c(8) ? com.google.android.play.i.play_small_card_content_min_height_tall : com.google.android.play.i.play_small_card_content_min_height);
        }
        return this.G;
    }

    @Override // com.google.android.play.layout.a, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        a(i);
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i3 = (size - paddingLeft) - paddingRight;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b_.getLayoutParams();
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int max = (mode != 1073741824 || size2 <= 0) ? marginLayoutParams.height + paddingTop + Math.max(getTextContentHeight(), i3 / 2) + paddingBottom : size2;
        int i4 = (i3 - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        this.b_.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.height, 1073741824));
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.t.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) this.f6971a.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) this.x.getLayoutParams();
        if (this.E != null) {
            if (this.i != null && this.i.getVisibility() != 8) {
                this.E.setVisibility(0);
                this.E.measure(View.MeasureSpec.makeMeasureSpec((i4 - this.b_.getPaddingLeft()) - this.b_.getPaddingRight(), Integer.MIN_VALUE), 0);
            } else {
                this.E.setVisibility(8);
            }
        }
        this.t.measure(View.MeasureSpec.makeMeasureSpec((i3 - marginLayoutParams4.leftMargin) - marginLayoutParams4.rightMargin, Integer.MIN_VALUE), 0);
        int measuredWidth = this.t.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
        if (this.v != null) {
            this.v.measure(0, 0);
        }
        this.h.measure(View.MeasureSpec.makeMeasureSpec((i3 - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin, 1073741824), 0);
        if (this.y.getVisibility() != 0) {
            this.f6971a.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i3 - measuredWidth) - marginLayoutParams5.leftMargin) - marginLayoutParams5.rightMargin), Integer.MIN_VALUE), 0);
            boolean z = !c(2);
            if (this.k.getVisibility() != 8) {
                int i5 = z ? (i3 - marginLayoutParams3.leftMargin) - marginLayoutParams3.rightMargin : (i3 - marginLayoutParams3.leftMargin) - measuredWidth;
                if (i5 < 0) {
                    i5 = 0;
                }
                this.k.measure(0, 0);
                if (this.k.getMeasuredWidth() > i5) {
                    this.k.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), 0);
                }
            }
            if (this.x.getVisibility() != 8) {
                this.x.measure(View.MeasureSpec.makeMeasureSpec((i3 - marginLayoutParams6.leftMargin) - marginLayoutParams6.rightMargin, 1073741824), 1073741824);
            }
            int measuredHeight = marginLayoutParams2.bottomMargin + marginLayoutParams2.topMargin + this.h.getMeasuredHeight() + marginLayoutParams3.topMargin + this.k.getMeasuredHeight() + marginLayoutParams3.bottomMargin;
            if (z) {
                measuredHeight += marginLayoutParams4.topMargin + this.t.getMeasuredHeight() + marginLayoutParams4.bottomMargin;
            } else if (this.x.getVisibility() != 8) {
                measuredHeight += marginLayoutParams6.topMargin + this.x.getMeasuredHeight() + marginLayoutParams6.bottomMargin;
            }
            int i6 = (((max - paddingTop) - paddingBottom) - marginLayoutParams.height) - measuredHeight;
            this.I = i6 <= 0 ? i6 / 2 : Math.min(i6 / 4, this.H);
        } else {
            this.I = 0;
        }
        this.y.measure(0, 0);
        setMeasuredDimension(size, max);
    }

    @Override // com.google.android.play.layout.a, com.google.android.play.layout.ForegroundRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = by.h(this) == 0;
        int n = by.n(this);
        int o = by.o(this);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int width = getWidth();
        int height = getHeight();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b_.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.f6971a.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) this.t.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams6 = this.v != null ? (ViewGroup.MarginLayoutParams) this.v.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) this.x.getLayoutParams();
        int measuredWidth = this.b_.getMeasuredWidth();
        int a2 = ao.a(marginLayoutParams);
        int measuredHeight = this.b_.getMeasuredHeight();
        int a3 = com.google.android.play.utils.j.a(width, measuredWidth, z2, n + a2);
        this.b_.layout(a3, marginLayoutParams.topMargin + paddingTop, measuredWidth + a3, marginLayoutParams.topMargin + paddingTop + measuredHeight);
        if (this.E != null && this.E.getVisibility() != 8) {
            int measuredWidth2 = this.E.getMeasuredWidth();
            int n2 = by.n(this.b_);
            int paddingTop2 = ((paddingTop + measuredHeight) - this.b_.getPaddingTop()) - this.E.getMeasuredHeight();
            int a4 = com.google.android.play.utils.j.a(width, measuredWidth2, z2, n2 + n + a2);
            this.E.layout(a4, paddingTop2, measuredWidth2 + a4, this.E.getMeasuredHeight() + paddingTop2);
        }
        int measuredWidth3 = this.h.getMeasuredWidth();
        int a5 = ao.a(marginLayoutParams2);
        int i5 = paddingTop + measuredHeight + marginLayoutParams2.topMargin + this.I;
        int a6 = com.google.android.play.utils.j.a(width, measuredWidth3, z2, a5 + n);
        int measuredHeight2 = this.h.getMeasuredHeight();
        this.h.layout(a6, i5, measuredWidth3 + a6, i5 + measuredHeight2);
        if (this.v != null && this.v.getVisibility() != 8) {
            int measuredWidth4 = this.v.getMeasuredWidth();
            int b2 = ao.b(marginLayoutParams6);
            int i6 = marginLayoutParams6.topMargin + i5;
            int b3 = com.google.android.play.utils.j.b(width, measuredWidth4, z2, b2 + o);
            this.v.layout(b3, i6, measuredWidth4 + b3, this.v.getMeasuredHeight() + i6);
        }
        int max = Math.max(this.I, 0);
        boolean z3 = !c(2);
        int measuredWidth5 = this.t.getMeasuredWidth();
        int measuredHeight3 = this.t.getMeasuredHeight();
        int bottom = z3 ? (((height - paddingBottom) - marginLayoutParams5.bottomMargin) - measuredHeight3) - this.I : this.h.getBottom() + marginLayoutParams5.topMargin + max;
        int b4 = com.google.android.play.utils.j.b(width, measuredWidth5, z2, ao.b(marginLayoutParams5) + o);
        this.t.layout(b4, bottom, measuredWidth5 + b4, measuredHeight3 + bottom);
        if (this.k.getVisibility() != 8) {
            int measuredWidth6 = this.k.getMeasuredWidth();
            int a7 = ao.a(marginLayoutParams3);
            int baseline = z3 ? i5 + measuredHeight2 + marginLayoutParams2.bottomMargin + marginLayoutParams3.topMargin + max : (this.t.getBaseline() + bottom) - this.k.getBaseline();
            int a8 = com.google.android.play.utils.j.a(width, measuredWidth6, z2, n + a7);
            this.k.layout(a8, baseline, measuredWidth6 + a8, this.k.getMeasuredHeight() + baseline);
        }
        if (this.f6971a.getVisibility() != 8) {
            int measuredWidth7 = this.f6971a.getMeasuredWidth();
            int a9 = ao.a(marginLayoutParams4);
            int baseline2 = (this.t.getBaseline() + bottom) - this.f6971a.getBaseline();
            int a10 = com.google.android.play.utils.j.a(width, measuredWidth7, z2, a9 + n);
            this.f6971a.layout(a10, baseline2, this.f6971a.getMeasuredWidth() + a10, this.f6971a.getMeasuredHeight() + baseline2);
        }
        if (this.x.getVisibility() != 8) {
            int measuredWidth8 = this.x.getMeasuredWidth();
            int a11 = ao.a(marginLayoutParams7);
            int i7 = ((height - paddingBottom) - marginLayoutParams7.bottomMargin) - this.I;
            int a12 = com.google.android.play.utils.j.a(width, measuredWidth8, z2, a11 + n);
            this.x.layout(a12, i7 - this.x.getMeasuredHeight(), measuredWidth8 + a12, i7);
        }
        int measuredWidth9 = ((((width - n) - o) - this.y.getMeasuredWidth()) / 2) + n;
        int measuredHeight4 = ((((height - paddingTop) - paddingBottom) - this.y.getMeasuredHeight()) / 2) + paddingTop;
        this.y.layout(measuredWidth9, measuredHeight4, this.y.getMeasuredWidth() + measuredWidth9, this.y.getMeasuredHeight() + measuredHeight4);
        e();
    }

    @Override // com.google.android.play.layout.a
    public int getCardType() {
        return 1;
    }
}
