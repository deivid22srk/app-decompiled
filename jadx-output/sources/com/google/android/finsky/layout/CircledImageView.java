package com.google.android.finsky.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class CircledImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f2940a;

    /* renamed from: b, reason: collision with root package name */
    private final RectF f2941b;
    private float c;
    private int d;

    public CircledImageView(Context context) {
        this(context, null);
    }

    public CircledImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        setWillNotDraw(false);
        this.f2940a = new Paint();
        this.f2940a.setAntiAlias(true);
        this.f2940a.setStyle(Paint.Style.FILL);
        this.f2941b = new RectF();
    }

    public void setColor(int i) {
        if (this.d != i) {
            this.d = i;
            this.f2940a.setColor(this.d);
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f2941b.set(0.0f, 0.0f, i, i2);
        this.c = i2 / 2.0f;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.d != 0) {
            canvas.drawRoundRect(this.f2941b, this.c, this.c, this.f2940a);
        }
        super.onDraw(canvas);
    }
}
