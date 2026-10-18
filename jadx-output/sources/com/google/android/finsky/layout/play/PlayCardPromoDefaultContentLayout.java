package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.deivid22srk.store.R;
import com.google.android.play.layout.CardLinearLayout;

/* loaded from: classes.dex */
public class PlayCardPromoDefaultContentLayout extends CardLinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private FrameLayout f3327a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.play.layout.a f3328b;
    private View c;
    private int d;

    public PlayCardPromoDefaultContentLayout(Context context) {
        this(context, null);
    }

    public PlayCardPromoDefaultContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.play_card_default_inset);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3327a = (FrameLayout) findViewById(R.id.play_promo_cluster_content);
        this.c = findViewById(R.id.separator);
        this.f3328b = (com.google.android.play.layout.a) findViewById(R.id.play_card);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        this.f3327a.getLayoutParams().height = (int) (paddingLeft * 0.5625f);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3327a.getLayoutParams();
        this.f3327a.measure(View.MeasureSpec.makeMeasureSpec((paddingLeft - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.height, 1073741824));
        if (this.c.getVisibility() == 8) {
            i3 = 0;
        } else {
            this.c.measure(i, View.MeasureSpec.makeMeasureSpec(this.c.getLayoutParams().height, 1073741824));
            i3 = this.c.getMeasuredHeight();
        }
        this.f3328b.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f3328b.getLayoutParams().height, 1073741824));
        setMeasuredDimension(size, (((i3 + paddingTop) + this.f3327a.getMeasuredHeight()) + this.f3328b.getMeasuredHeight()) - this.d);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = android.support.v4.view.by.h(this) == 0;
        int width = getWidth();
        int n = android.support.v4.view.by.n(this);
        int a2 = android.support.v4.view.ao.a((ViewGroup.MarginLayoutParams) this.f3327a.getLayoutParams()) + getPaddingLeft();
        int measuredWidth = this.f3327a.getMeasuredWidth();
        int a3 = com.google.android.play.utils.j.a(width, measuredWidth, z2, a2);
        int paddingTop = getPaddingTop();
        int measuredHeight = paddingTop + this.f3327a.getMeasuredHeight();
        int i5 = measuredHeight - this.d;
        int measuredWidth2 = this.f3328b.getMeasuredWidth();
        int a4 = com.google.android.play.utils.j.a(width, measuredWidth2, z2, n);
        this.f3327a.layout(a3, paddingTop, a3 + measuredWidth, measuredHeight);
        if (this.c.getVisibility() == 0) {
            this.c.layout(0, measuredHeight, getMeasuredWidth(), this.c.getMeasuredHeight() + measuredHeight);
            i5 += this.c.getMeasuredHeight();
        }
        this.f3328b.layout(a4, i5, a4 + measuredWidth2, this.f3328b.getMeasuredHeight() + i5);
    }
}
