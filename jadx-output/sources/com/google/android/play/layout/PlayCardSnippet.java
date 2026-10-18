package com.google.android.play.layout;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ao;
import android.support.v4.view.by;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class PlayCardSnippet extends j {

    /* renamed from: a, reason: collision with root package name */
    private int f6966a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f6967b;
    private ImageView c;
    private final int d;
    private final int e;
    private int f;
    private final int g;
    private final int h;
    private int i;
    private int j;

    public PlayCardSnippet(Context context) {
        this(context, null);
    }

    public PlayCardSnippet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.d = resources.getDimensionPixelSize(com.google.android.play.i.play_card_snippet_avatar_size);
        this.e = resources.getDimensionPixelSize(com.google.android.play.i.play_card_snippet_avatar_large_size);
        this.g = resources.getDimensionPixelSize(com.google.android.play.i.play_snippet_regular_size);
        this.h = resources.getDimensionPixelSize(com.google.android.play.i.play_snippet_large_size);
        this.f6966a = 0;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f6967b = (TextView) findViewById(com.google.android.play.k.li_snippet_text);
        this.c = (ImageView) findViewById(com.google.android.play.k.li_snippet_avatar);
        a();
    }

    private void a() {
        this.f = this.f6966a == 0 ? this.d : this.e;
        this.f6967b.setTextSize(0, this.f6966a == 0 ? this.g : this.h);
    }

    public void setSizeMode(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Unsupported size mode: " + i);
        }
        if (this.f6966a != i) {
            this.f6966a = i;
            a();
            requestLayout();
            invalidate();
        }
    }

    public ImageView getImageView() {
        return this.c;
    }

    public final void a(CharSequence charSequence, int i, int i2) {
        this.f6967b.setText(charSequence);
        this.i = i;
        this.j = i2;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (this.c.getVisibility() == 8) {
            i3 = paddingLeft - this.i;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f, 1073741824);
            this.c.measure(makeMeasureSpec, makeMeasureSpec);
            i3 = paddingLeft - ((marginLayoutParams.rightMargin + this.f) + this.j);
        }
        this.f6967b.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), 0);
        setMeasuredDimension(size, Math.max(this.f, this.f6967b.getMeasuredHeight()) + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = by.h(this) == 0;
        int height = getHeight();
        int width = getWidth();
        int paddingTop = getPaddingTop();
        int measuredHeight = this.f6967b.getMeasuredHeight();
        int measuredWidth = this.f6967b.getMeasuredWidth();
        if (this.c.getVisibility() == 8) {
            int i5 = (((height - measuredHeight) - paddingTop) / 2) + paddingTop;
            int a2 = com.google.android.play.utils.j.a(width, measuredWidth, z2, this.i);
            this.f6967b.layout(a2, i5, a2 + measuredWidth, i5 + measuredHeight);
            return;
        }
        int measuredHeight2 = this.c.getMeasuredHeight();
        int measuredWidth2 = this.c.getMeasuredWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
        int a3 = com.google.android.play.utils.j.a(width, measuredWidth2, z2, this.j);
        int b2 = ao.b(marginLayoutParams) + this.j + measuredWidth2;
        if (measuredHeight2 > measuredHeight) {
            int i6 = (((height - measuredHeight2) - paddingTop) / 2) + paddingTop;
            this.c.layout(a3, i6, measuredWidth2 + a3, measuredHeight2 + i6);
            int i7 = (((height - measuredHeight) - paddingTop) / 2) + paddingTop;
            int a4 = com.google.android.play.utils.j.a(width, measuredWidth, z2, b2);
            this.f6967b.layout(a4, i7, a4 + measuredWidth, i7 + measuredHeight);
            return;
        }
        int i8 = (((height - measuredHeight) - paddingTop) / 2) + paddingTop;
        this.c.layout(a3, i8, measuredWidth2 + a3, measuredHeight2 + i8);
        int a5 = com.google.android.play.utils.j.a(width, measuredWidth, z2, b2);
        this.f6967b.layout(a5, i8, a5 + measuredWidth, i8 + measuredHeight);
    }
}
