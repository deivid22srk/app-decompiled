package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public class PlayCardViewListingSmall extends com.google.android.play.layout.a {
    private final boolean E;

    /* renamed from: a, reason: collision with root package name */
    private View f3340a;

    public PlayCardViewListingSmall(Context context) {
        this(context, null);
    }

    public PlayCardViewListingSmall(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.deivid22srk.store.b.PlayCardViewListingSmall);
        this.E = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3340a = findViewById(R.id.rating_badge_container);
    }

    @Override // com.google.android.play.layout.a
    public final void a() {
        super.a();
        this.f3340a.setVisibility(8);
        this.s.setVisibility(8);
    }

    public void setSnippetVisible(boolean z) {
        this.x.setVisibility(z ? 0 : 8);
        this.B = z ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        b(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = 0;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b_.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.f3340a.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) this.t.getLayoutParams();
        this.s.getLayoutParams();
        this.x.getLayoutParams();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int min = Math.min(marginLayoutParams.height, (size2 - paddingTop) - paddingBottom);
        marginLayoutParams.width = min;
        marginLayoutParams.height = min;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        this.b_.measure(makeMeasureSpec, makeMeasureSpec);
        this.v.measure(0, 0);
        int i4 = (size - ((marginLayoutParams.width + paddingLeft) + marginLayoutParams.rightMargin)) - paddingRight;
        this.h.measure(View.MeasureSpec.makeMeasureSpec((i4 - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin, Integer.MIN_VALUE), 0);
        if (this.i != null && this.i.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
            this.i.measure(0, 0);
            i3 = marginLayoutParams6.rightMargin + this.i.getMeasuredWidth();
        }
        this.k.measure(View.MeasureSpec.makeMeasureSpec(((i4 - i3) - marginLayoutParams3.leftMargin) - marginLayoutParams3.rightMargin, Integer.MIN_VALUE), 0);
        if (this.l.getVisibility() != 8) {
            this.l.measure(View.MeasureSpec.makeMeasureSpec(i4 - com.google.android.play.utils.j.a(this.l), Integer.MIN_VALUE), 0);
        }
        this.t.measure(View.MeasureSpec.makeMeasureSpec((size - paddingLeft) - paddingRight, Integer.MIN_VALUE), 0);
        if (this.s.getVisibility() != 8) {
            this.s.measure(View.MeasureSpec.makeMeasureSpec((size - paddingLeft) - paddingRight, Integer.MIN_VALUE), 0);
        }
        this.f3340a.measure(View.MeasureSpec.makeMeasureSpec(((i4 - marginLayoutParams4.leftMargin) - marginLayoutParams4.rightMargin) - this.s.getMeasuredWidth(), 1073741824), 0);
        if (marginLayoutParams2.bottomMargin + marginLayoutParams2.topMargin + paddingTop + this.h.getMeasuredHeight() + marginLayoutParams3.topMargin + this.k.getMeasuredHeight() + marginLayoutParams3.bottomMargin + marginLayoutParams4.topMargin + this.f3340a.getMeasuredHeight() > ((getMeasuredHeight() - paddingBottom) - marginLayoutParams5.bottomMargin) - this.t.getMeasuredHeight()) {
            int measuredWidth = (((size - paddingRight) - marginLayoutParams5.leftMargin) - this.t.getMeasuredWidth()) - marginLayoutParams5.rightMargin;
            int measuredWidth2 = marginLayoutParams.rightMargin + marginLayoutParams.leftMargin + paddingLeft + this.b_.getMeasuredWidth() + marginLayoutParams4.leftMargin;
            if (this.f3340a.getMeasuredWidth() + measuredWidth2 + marginLayoutParams4.rightMargin > measuredWidth) {
                this.f3340a.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - measuredWidth2) - marginLayoutParams4.rightMargin, 1073741824), 0);
            }
        }
        if (this.x.getVisibility() != 8) {
            this.x.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), 0);
        }
        if (this.j != null && this.j.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) this.j.getLayoutParams();
            this.j.measure(View.MeasureSpec.makeMeasureSpec(((i4 - (this.s.getVisibility() != 8 ? this.s.getMeasuredWidth() : this.t.getMeasuredWidth())) - marginLayoutParams7.leftMargin) - marginLayoutParams7.rightMargin, 1073741824), 0);
        }
        this.y.measure(0, 0);
        setMeasuredDimension(size, size2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, com.google.android.play.layout.ForegroundRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int baseline;
        boolean z3 = android.support.v4.view.by.h(this) == 0;
        int n = android.support.v4.view.by.n(this);
        int o = android.support.v4.view.by.o(this);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int width = getWidth();
        int height = getHeight();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b_.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.f3340a.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) this.t.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) this.s.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) this.v.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) this.x.getLayoutParams();
        int measuredWidth = this.b_.getMeasuredWidth();
        int measuredHeight = this.b_.getMeasuredHeight();
        int a2 = com.google.android.play.utils.j.a(width, measuredWidth, z3, n);
        this.b_.layout(a2, paddingTop, measuredWidth + a2, measuredHeight + paddingTop);
        int b2 = marginLayoutParams.width + n + android.support.v4.view.ao.b(marginLayoutParams);
        int measuredWidth2 = this.h.getMeasuredWidth();
        int a3 = android.support.v4.view.ao.a(marginLayoutParams2);
        int i10 = marginLayoutParams2.topMargin + paddingTop;
        int a4 = com.google.android.play.utils.j.a(width, measuredWidth2, z3, a3 + b2);
        this.h.layout(a4, i10, measuredWidth2 + a4, this.h.getMeasuredHeight() + i10);
        int measuredHeight2 = this.h.getMeasuredHeight() + i10 + marginLayoutParams2.bottomMargin;
        int measuredWidth3 = this.v.getMeasuredWidth();
        int b3 = android.support.v4.view.ao.b(marginLayoutParams7);
        int i11 = marginLayoutParams7.topMargin + i10;
        int b4 = com.google.android.play.utils.j.b(width, measuredWidth3, z3, b3 + o);
        this.v.layout(b4, i11, measuredWidth3 + b4, this.v.getMeasuredHeight() + i11);
        if (this.i == null || this.i.getVisibility() == 8) {
            i5 = 0;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams9 = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
            i5 = this.i.getMeasuredWidth() + marginLayoutParams9.rightMargin;
            int measuredWidth4 = this.i.getMeasuredWidth();
            int a5 = android.support.v4.view.ao.a(marginLayoutParams9);
            int i12 = marginLayoutParams9.topMargin + measuredHeight2;
            int a6 = com.google.android.play.utils.j.a(width, measuredWidth4, z3, a5 + b2);
            this.i.layout(a6, i12, measuredWidth4 + a6, this.i.getMeasuredHeight() + i12);
        }
        if (this.k.getVisibility() != 8) {
            int measuredWidth5 = this.k.getMeasuredWidth();
            int paddingTop2 = (i5 != 0 ? this.i.getPaddingTop() : 0) + measuredHeight2 + marginLayoutParams3.topMargin;
            int a7 = com.google.android.play.utils.j.a(width, measuredWidth5, z3, android.support.v4.view.ao.a(marginLayoutParams3) + i5 + b2);
            this.k.layout(a7, paddingTop2, measuredWidth5 + a7, this.k.getMeasuredHeight() + paddingTop2);
            i6 = paddingTop2 + this.k.getMeasuredHeight() + marginLayoutParams3.bottomMargin;
        } else {
            i6 = measuredHeight2;
        }
        if (this.l.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams10 = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
            int measuredWidth6 = this.l.getMeasuredWidth();
            int i13 = i6 + marginLayoutParams10.topMargin;
            int a8 = com.google.android.play.utils.j.a(width, measuredWidth6, z3, i5 + b2 + android.support.v4.view.ao.a(marginLayoutParams10));
            this.l.layout(a8, i13, measuredWidth6 + a8, this.l.getMeasuredHeight() + i13);
            i6 = this.l.getMeasuredHeight() + i13 + marginLayoutParams10.bottomMargin;
        }
        if (this.j.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams11 = (ViewGroup.MarginLayoutParams) this.j.getLayoutParams();
            int measuredWidth7 = this.j.getMeasuredWidth();
            int a9 = android.support.v4.view.ao.a(marginLayoutParams11);
            int i14 = i6 + marginLayoutParams11.topMargin;
            int a10 = com.google.android.play.utils.j.a(width, measuredWidth7, z3, a9 + b2);
            this.j.layout(a10, i14, measuredWidth7 + a10, this.j.getMeasuredHeight() + i14);
            i6 = this.j.getMeasuredHeight() + i14 + marginLayoutParams11.bottomMargin;
        }
        int measuredWidth8 = this.t.getMeasuredWidth();
        int measuredHeight3 = this.t.getMeasuredHeight();
        int b5 = com.google.android.play.utils.j.b(width, measuredWidth8, z3, android.support.v4.view.ao.b(marginLayoutParams5) + o);
        int i15 = (height - paddingBottom) - marginLayoutParams5.bottomMargin;
        int i16 = i15 - measuredHeight3;
        if (this.f3340a.getVisibility() != 8) {
            int measuredWidth9 = this.f3340a.getMeasuredWidth();
            int a11 = android.support.v4.view.ao.a(marginLayoutParams4);
            if (this.l.getVisibility() == 8) {
                baseline = marginLayoutParams4.topMargin + i6;
            } else {
                baseline = (this.t.getBaseline() + i16) - this.f3340a.getBaseline();
            }
            int a12 = com.google.android.play.utils.j.a(width, measuredWidth9, z3, b2 + a11);
            this.f3340a.layout(a12, baseline, measuredWidth9 + a12, this.f3340a.getMeasuredHeight() + baseline);
            this.f3340a.getMeasuredHeight();
            int i17 = marginLayoutParams4.bottomMargin;
        }
        if (this.x.getVisibility() != 8) {
            if (this.k.getVisibility() != 8) {
                i7 = this.k.getTop();
            } else {
                i7 = (this.f3340a.getTop() + this.f3340a.getBaseline()) - this.t.getBaseline();
            }
            i9 = i7 + measuredHeight3;
            int measuredWidth10 = this.x.getMeasuredWidth();
            int a13 = android.support.v4.view.ao.a(marginLayoutParams8);
            int i18 = (height - paddingBottom) - marginLayoutParams8.bottomMargin;
            int a14 = com.google.android.play.utils.j.a(width, measuredWidth10, z3, a13 + b2);
            this.x.layout(a14, i18 - this.x.getMeasuredHeight(), measuredWidth10 + a14, i18);
            i8 = b5;
        } else {
            if (this.E) {
                if (z3) {
                    i8 = this.v.getLeft() - measuredWidth8;
                    z2 = i8 >= this.h.getRight();
                } else {
                    i8 = this.v.getRight();
                    z2 = i8 + measuredWidth8 <= this.h.getLeft();
                }
                if (z2) {
                    i7 = (this.v.getTop() + (this.v.getHeight() / 2)) - (measuredHeight3 / 2);
                    i9 = i7 + measuredHeight3;
                }
            }
            i7 = i16;
            i8 = b5;
            i9 = i15;
        }
        this.t.layout(i8, i7, i8 + measuredWidth8, i9);
        if (this.s.getVisibility() != 8) {
            View view = this.j.getVisibility() != 8 ? this.j : this.f3340a;
            int measuredWidth11 = this.s.getMeasuredWidth();
            int measuredHeight4 = this.s.getMeasuredHeight();
            int b6 = com.google.android.play.utils.j.b(width, measuredWidth11, z3, android.support.v4.view.ao.b(marginLayoutParams6) + o);
            int max = ((Math.max(view.getHeight(), this.r.getHeight()) / 2) + view.getTop()) - (measuredHeight4 / 2);
            this.s.layout(b6, max, measuredWidth11 + b6, measuredHeight4 + max);
        }
        int measuredWidth12 = ((((width - n) - o) - this.y.getMeasuredWidth()) / 2) + n;
        int measuredHeight5 = ((((height - paddingTop) - paddingBottom) - this.y.getMeasuredHeight()) / 2) + paddingTop;
        this.y.layout(measuredWidth12, measuredHeight5, this.y.getMeasuredWidth() + measuredWidth12, this.y.getMeasuredHeight() + measuredHeight5);
        e();
    }

    @Override // com.google.android.play.layout.a
    public int getCardType() {
        return 4;
    }
}
