package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public class LightPurchaseButtonBarLayout extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private View f3012a;

    /* renamed from: b, reason: collision with root package name */
    private View f3013b;
    private View c;
    private View d;
    private View e;
    private int f;
    private final int g;
    private final int h;
    private final int i;
    private final Rect j;
    private final Rect k;
    private final Rect l;
    private final Rect m;

    public LightPurchaseButtonBarLayout(Context context) {
        this(context, null);
    }

    public LightPurchaseButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        this.g = resources.getDimensionPixelSize(R.dimen.light_purchase_dialog_footer_horizontal_item_gap);
        this.h = resources.getDimensionPixelSize(R.dimen.light_purchase_dialog_footer_vertical_item_gap);
        this.i = resources.getDimensionPixelSize(R.dimen.standard_button_touch_target_minsize);
        this.j = new Rect();
        this.k = new Rect();
        this.l = new Rect();
        this.m = new Rect();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3012a = findViewById(R.id.logo);
        this.f3013b = findViewById(R.id.continue_button_frame);
        this.c = findViewById(R.id.continue_button);
        this.d = findViewById(R.id.secondary_button_frame);
        this.e = findViewById(R.id.secondary_button);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int measuredHeight;
        this.f3013b.setVisibility(this.c.getVisibility());
        if (this.d != null && this.e != null) {
            this.d.setVisibility(this.e.getVisibility());
            if (this.c.getVisibility() == 0 && this.e.getVisibility() == 0) {
                this.f3012a.setVisibility(8);
            } else {
                this.f3012a.setVisibility(0);
            }
        }
        int size = View.MeasureSpec.getSize(i);
        int n = (size - android.support.v4.view.by.n(this)) - android.support.v4.view.by.o(this);
        if (a()) {
            this.f3012a.measure(0, 0);
            i4 = this.g + this.f3012a.getMeasuredWidth();
            i3 = this.f3012a.getMeasuredHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        this.f3013b.measure(0, 0);
        int measuredWidth = this.f3013b.getMeasuredWidth();
        int measuredHeight2 = this.f3013b.getMeasuredHeight();
        if (b()) {
            this.d.measure(0, 0);
            int measuredWidth2 = this.d.getMeasuredWidth();
            measuredHeight2 = Math.max(measuredHeight2, this.d.getMeasuredHeight());
            measuredWidth += measuredWidth2 + this.g;
        }
        if (i4 + measuredWidth <= n) {
            this.f = 0;
            measuredHeight = Math.max(i3, measuredHeight2);
        } else if (!b()) {
            this.f3013b.measure(View.MeasureSpec.makeMeasureSpec(n, Integer.MIN_VALUE), 0);
            this.f = 0;
            measuredHeight = this.f3013b.getMeasuredHeight();
        } else {
            this.f3013b.measure(View.MeasureSpec.makeMeasureSpec(n, Integer.MIN_VALUE), 0);
            this.d.measure(View.MeasureSpec.makeMeasureSpec(n, Integer.MIN_VALUE), 0);
            this.f = 2;
            measuredHeight = this.f3013b.getMeasuredHeight() + this.h + this.d.getMeasuredHeight();
        }
        setMeasuredDimension(size, measuredHeight + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        int i5;
        int i6;
        boolean z2 = android.support.v4.view.by.h(this) == 0;
        int width = getWidth();
        int n = android.support.v4.view.by.n(this);
        int o = android.support.v4.view.by.o(this);
        int height = getHeight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (height - paddingTop) - getPaddingBottom();
        if (a()) {
            int measuredWidth = this.f3012a.getMeasuredWidth();
            int measuredHeight2 = this.f3012a.getMeasuredHeight();
            int i7 = this.f == 0 ? ((paddingBottom - measuredHeight2) / 2) + paddingTop : paddingTop;
            int a2 = com.google.android.play.utils.j.a(width, measuredWidth, z2, n);
            this.f3012a.layout(a2, i7, measuredWidth + a2, measuredHeight2 + i7);
        }
        int measuredWidth2 = this.f3013b.getMeasuredWidth();
        int measuredHeight3 = this.f3013b.getMeasuredHeight();
        if (this.f == 0) {
            measuredHeight = ((paddingBottom - measuredHeight3) / 2) + paddingTop;
        } else {
            measuredHeight = this.f == 1 ? this.f3012a.getMeasuredHeight() + paddingTop + this.h : paddingTop;
        }
        int b2 = com.google.android.play.utils.j.b(width, measuredWidth2, z2, o);
        this.f3013b.layout(b2, measuredHeight, b2 + measuredWidth2, measuredHeight + measuredHeight3);
        if (b()) {
            int measuredWidth3 = this.d.getMeasuredWidth();
            int measuredHeight4 = this.d.getMeasuredHeight();
            if (this.f == 0) {
                i5 = paddingTop + ((paddingBottom - measuredHeight4) / 2);
                i6 = this.g + measuredWidth3 + measuredWidth2;
            } else {
                i5 = measuredHeight + measuredHeight3 + this.h;
                i6 = measuredWidth3;
            }
            int b3 = com.google.android.play.utils.j.b(width, i6, z2, o);
            this.d.layout(b3, i5, measuredWidth3 + b3, i5 + measuredHeight4);
        }
        ik.a(this.c, this.j, this.k, this.i);
        ik.a(this.e, this.l, this.m, this.i);
    }

    private boolean a() {
        return this.f3012a.getVisibility() == 0;
    }

    private boolean b() {
        return this.d != null && this.d.getVisibility() == 0;
    }
}
