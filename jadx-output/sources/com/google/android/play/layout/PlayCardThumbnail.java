package com.google.android.play.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.by;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.play.o;

/* loaded from: classes.dex */
public class PlayCardThumbnail extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private ImageView f6968a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6969b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public PlayCardThumbnail(Context context) {
        this(context, null);
    }

    public PlayCardThumbnail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.PlayCardThumbnail);
        this.f6969b = obtainStyledAttributes.getResourceId(o.PlayCardThumbnail_thumbnail_id, com.google.android.play.k.li_thumbnail);
        this.g = obtainStyledAttributes.getDimensionPixelSize(o.PlayCardThumbnail_app_thumbnail_padding, 0);
        obtainStyledAttributes.recycle();
        this.c = by.n(this);
        this.d = getPaddingTop();
        this.e = by.o(this);
        this.f = getPaddingBottom();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f6968a = (ImageView) findViewById(this.f6969b);
    }

    @Override // android.view.View
    public int getBaseline() {
        return getPaddingTop() + this.f6968a.getMeasuredHeight();
    }

    public ImageView getImageView() {
        return this.f6968a;
    }

    public final void a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i == 3) {
            i2 = this.g;
            i3 = this.g;
            i4 = this.g;
            i5 = this.g;
        } else {
            i2 = this.c;
            i3 = this.d;
            i4 = this.e;
            i5 = this.f;
        }
        if ((i2 == getPaddingLeft() && i3 == getPaddingTop() && i4 == getPaddingRight() && i5 == getPaddingBottom()) ? false : true) {
            by.a(this, i2, i3, i4, i5);
            requestLayout();
        }
    }
}
