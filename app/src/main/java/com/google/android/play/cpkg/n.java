package com.google.android.play.cpkg;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class n extends h {

    /* renamed from: a, reason: collision with root package name */
    public final RectF f6831a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f6832b;

    n(ColorStateList colorStateList, float f, float f2) {
        super(colorStateList, f, f2);
        this.f6831a = new RectF();
        this.f6832b = new Rect();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawRoundRect(this.f6831a, this.n, this.n, this.m);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f6832b.set(rect);
        this.f6832b.inset((int) Math.ceil(this.o), (int) Math.ceil(this.o));
        this.f6831a.set(this.f6832b);
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f6832b, this.n);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
