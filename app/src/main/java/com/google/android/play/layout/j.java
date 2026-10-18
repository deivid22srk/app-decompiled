package com.google.android.play.layout;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.view.by;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.google.android.play.o;

/* loaded from: classes.dex */
public class j extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6994a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6995b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final Paint h;

    public j(Context context) {
        this(context, null, 0);
    }

    public j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public j(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        this.f6994a = false;
        Resources resources = context.getResources();
        this.f = resources.getDimensionPixelSize(com.google.android.play.i.play_hairline_separator_thickness);
        this.g = (this.f + 1) / 2;
        this.h = new Paint();
        this.h.setColor(resources.getColor(com.google.android.play.h.play_reason_separator));
        this.h.setStrokeWidth(this.f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.PlaySeparatorLayout);
        this.f6995b = obtainStyledAttributes.getDimensionPixelSize(o.PlaySeparatorLayout_separator_padding_top, 0);
        this.c = obtainStyledAttributes.getDimensionPixelSize(o.PlaySeparatorLayout_separator_padding_bottom, 0);
        this.d = obtainStyledAttributes.getDimensionPixelSize(o.PlaySeparatorLayout_separator_padding_left, 0);
        this.e = obtainStyledAttributes.getDimensionPixelSize(o.PlaySeparatorLayout_separator_padding_right, 0);
        obtainStyledAttributes.recycle();
    }

    public void setSeparatorVisible(boolean z) {
        if (this.f6994a != z) {
            this.f6994a = z;
            by.a(this, 0, z ? this.f6995b + this.c + this.f : 0, 0, 0);
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f6994a) {
            int i = this.f6995b + this.g;
            canvas.drawLine(this.d, i, getWidth() - this.e, i, this.h);
        }
    }
}
