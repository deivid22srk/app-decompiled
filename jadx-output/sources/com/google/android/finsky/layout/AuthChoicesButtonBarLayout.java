package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public class AuthChoicesButtonBarLayout extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private View f2927a;

    /* renamed from: b, reason: collision with root package name */
    private View f2928b;
    private View c;
    private View d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final Rect i;
    private final Rect j;
    private final Rect k;
    private final Rect l;

    public AuthChoicesButtonBarLayout(Context context) {
        this(context, null);
    }

    public AuthChoicesButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        this.e = resources.getDimensionPixelSize(R.dimen.light_purchase_dialog_footer_top_bottom_padding);
        this.f = resources.getDimensionPixelSize(R.dimen.light_purchase_dialog_footer_vertical_item_gap);
        this.g = resources.getDimensionPixelSize(R.dimen.light_purchase_dialog_footer_horizontal_item_gap);
        this.h = getResources().getDimensionPixelSize(R.dimen.standard_button_touch_target_minsize);
        this.i = new Rect();
        this.j = new Rect();
        this.k = new Rect();
        this.l = new Rect();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2927a = findViewById(R.id.choice_everytime_frame);
        this.f2928b = findViewById(R.id.choice_everytime_button);
        this.c = findViewById(R.id.choice_session_frame);
        this.d = findViewById(R.id.choice_session_button);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int n = (size - android.support.v4.view.by.n(this)) - android.support.v4.view.by.o(this);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        this.c.measure(0, 0);
        this.f2927a.measure(0, 0);
        if (this.c.getMeasuredWidth() + this.g + this.f2927a.getMeasuredWidth() <= n) {
            this.c.setPadding(this.c.getPaddingLeft(), this.e, this.c.getPaddingRight(), this.e);
            this.f2927a.setPadding(this.f2927a.getPaddingLeft(), this.e, this.f2927a.getPaddingRight(), this.e);
            this.c.measure(0, 0);
            this.f2927a.measure(0, 0);
            setMeasuredDimension(size, Math.max(this.c.getMeasuredHeight(), this.f2927a.getMeasuredHeight()) + paddingTop);
            return;
        }
        this.c.setPadding(this.c.getPaddingLeft(), this.e, this.c.getPaddingRight(), this.f / 2);
        this.f2927a.setPadding(this.f2927a.getPaddingLeft(), this.f / 2, this.f2927a.getPaddingRight(), this.e);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(n, Integer.MIN_VALUE);
        this.c.measure(makeMeasureSpec, 0);
        this.f2927a.measure(makeMeasureSpec, 0);
        setMeasuredDimension(size, this.c.getMeasuredHeight() + paddingTop + this.f2927a.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = android.support.v4.view.by.h(this) == 0;
        int width = getWidth();
        int n = android.support.v4.view.by.n(this);
        int o = android.support.v4.view.by.o(this);
        int i5 = (width - n) - o;
        int height = getHeight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (height - paddingTop) - getPaddingBottom();
        int measuredWidth = this.f2927a.getMeasuredWidth();
        int measuredHeight = this.f2927a.getMeasuredHeight();
        int measuredWidth2 = this.c.getMeasuredWidth();
        int measuredHeight2 = this.c.getMeasuredHeight();
        int b2 = com.google.android.play.utils.j.b(width, measuredWidth2, z2, o);
        if (this.g + measuredWidth + measuredWidth2 <= i5) {
            int b3 = com.google.android.play.utils.j.b(width, measuredWidth, z2, o + measuredWidth2 + this.g);
            int i6 = ((paddingBottom - measuredHeight2) / 2) + paddingTop;
            this.c.layout(b2, i6, b2 + measuredWidth2, i6 + measuredHeight2);
            int i7 = ((paddingBottom - measuredHeight) / 2) + paddingTop;
            this.f2927a.layout(b3, i7, b3 + measuredWidth, i7 + measuredHeight);
        } else {
            int b4 = com.google.android.play.utils.j.b(width, measuredWidth, z2, o);
            this.c.layout(b2, paddingTop, b2 + measuredWidth2, paddingTop + measuredHeight2);
            int i8 = paddingTop + measuredHeight2;
            this.f2927a.layout(b4, i8, b4 + measuredWidth, i8 + measuredHeight);
        }
        if (this.f2927a != null && this.f2928b != null && this.f2928b.getVisibility() != 8 && (this.f2928b.getHeight() < this.h || this.f2928b.getWidth() < this.h)) {
            ik.a(this.f2928b, this.i, this.h, this.h);
            if (!this.i.equals(this.j)) {
                this.f2927a.setTouchDelegate(new com.google.android.play.utils.i(this.i, this.f2928b));
                this.j.set(this.i);
            }
        } else {
            this.j.setEmpty();
            this.f2927a.setTouchDelegate(null);
        }
        if (this.c != null && this.d != null && this.d.getVisibility() != 8 && (this.d.getHeight() < this.h || this.d.getWidth() < this.h)) {
            ik.a(this.d, this.k, this.h, this.h);
            if (!this.k.equals(this.l)) {
                this.c.setTouchDelegate(new com.google.android.play.utils.i(this.k, this.d));
                this.l.set(this.k);
                return;
            }
            return;
        }
        this.l.setEmpty();
        this.c.setTouchDelegate(null);
    }
}
