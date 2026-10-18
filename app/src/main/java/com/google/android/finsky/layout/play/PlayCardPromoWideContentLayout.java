package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.deivid22srk.store.R;
import com.google.android.finsky.utils.ik;
import com.google.android.play.layout.CardLinearLayout;

/* loaded from: classes.dex */
public class PlayCardPromoWideContentLayout extends CardLinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private FrameLayout f3329a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.play.layout.a f3330b;
    private View c;
    private int d;
    private int e;

    public PlayCardPromoWideContentLayout(Context context) {
        this(context, null);
    }

    public PlayCardPromoWideContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.d = resources.getDimensionPixelSize(R.dimen.play_card_default_inset);
        this.e = ik.c(resources);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3329a = (FrameLayout) findViewById(R.id.play_promo_cluster_content);
        this.f3330b = (com.google.android.play.layout.a) findViewById(R.id.play_card);
        this.c = findViewById(R.id.separator);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int i3 = size / this.e;
        this.f3330b.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), 0);
        int measuredHeight = this.f3330b.getMeasuredHeight() - (this.d * 2);
        int i4 = size - i3;
        if (this.c.getVisibility() != 8) {
            this.c.measure(View.MeasureSpec.makeMeasureSpec(this.c.getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            i4 -= this.c.getMeasuredWidth();
        }
        this.f3329a.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        setMeasuredDimension(size, this.f3330b.getMeasuredHeight());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = android.support.v4.view.by.h(this) == 0;
        int width = getWidth();
        int n = android.support.v4.view.by.n(this);
        int o = android.support.v4.view.by.o(this);
        int measuredWidth = this.f3329a.getMeasuredWidth();
        int paddingTop = getPaddingTop() + this.d;
        int i5 = n + this.d;
        int a2 = com.google.android.play.utils.j.a(width, measuredWidth, z2, i5);
        int measuredHeight = this.f3329a.getMeasuredHeight() + paddingTop;
        int measuredWidth2 = this.f3330b.getMeasuredWidth();
        int i6 = paddingTop - this.d;
        int b2 = com.google.android.play.utils.j.b(width, measuredWidth2, z2, o);
        this.f3329a.layout(a2, paddingTop, a2 + measuredWidth, measuredHeight);
        if (this.c.getVisibility() == 0) {
            int i7 = i5 + measuredWidth;
            int measuredWidth3 = this.c.getMeasuredWidth();
            int a3 = com.google.android.play.utils.j.a(width, measuredWidth3, z2, i7);
            this.c.layout(a3, paddingTop, a3 + measuredWidth3, measuredHeight);
        }
        this.f3330b.layout(b2, i6, b2 + measuredWidth2, this.f3330b.getMeasuredHeight() + i6);
    }
}
