package com.google.android.play.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class a extends Drawable implements Animatable {
    protected final long d;
    protected long e;
    protected boolean f;
    protected final long c = 800;

    /* renamed from: a, reason: collision with root package name */
    protected final float f7090a = Math.max(0.0f, 0.1f);

    /* renamed from: b, reason: collision with root package name */
    protected final float f7091b = Math.min(1.0f, 1.0f) - 0.1f;
    protected final Paint g = new Paint();

    public a(int i, long j) {
        this.d = j;
        this.g.setAntiAlias(true);
        this.g.setColor(i);
        this.g.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        canvas.saveLayerAlpha(0.0f, 0.0f, width, height, 255, 31);
        canvas.drawCircle(width / 2.0f, height / 2.0f, (((((((float) Math.sin((((System.currentTimeMillis() + this.d) % this.c) / this.c) * 6.283185307179586d)) * 0.5f) + 0.5f) * this.f7091b) + this.f7090a) * Math.min(width, height)) / 2.0f, this.g);
        canvas.restore();
        if (isRunning()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.g.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (!isRunning()) {
            this.e = System.currentTimeMillis();
            this.f = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f = false;
    }
}
