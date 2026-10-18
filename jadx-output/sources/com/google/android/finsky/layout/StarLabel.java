package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public class StarLabel extends View {

    /* renamed from: a, reason: collision with root package name */
    private int f3091a;

    /* renamed from: b, reason: collision with root package name */
    private int f3092b;
    private int c;
    private final int d;
    private final Drawable e;

    public StarLabel(Context context) {
        this(context, null);
    }

    public StarLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setNumStars(0);
        setWillNotDraw(false);
        Resources resources = context.getResources();
        this.e = android.support.v4.b.g.a(context, R.drawable.ic_star_rating_graph);
        this.d = resources.getDimensionPixelSize(R.dimen.details_histogram_star_padding);
    }

    public void setNumStars(int i) {
        this.f3091a = i;
    }

    public void setMaxStars(int i) {
        this.f3092b = i;
    }

    public void setStarHeight(int i) {
        this.c = i;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension((this.e.getIntrinsicWidth() * this.f3092b) + ((this.f3092b - 1) * this.d), this.c);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f3092b > 0) {
            int intrinsicWidth = this.e.getIntrinsicWidth();
            int width = getWidth();
            int height = (getHeight() - intrinsicWidth) / 2;
            for (int i = 0; i < this.f3091a; i++) {
                this.e.setBounds(width - intrinsicWidth, height, width, height + intrinsicWidth);
                this.e.draw(canvas);
                width -= this.d + intrinsicWidth;
            }
        }
    }
}
