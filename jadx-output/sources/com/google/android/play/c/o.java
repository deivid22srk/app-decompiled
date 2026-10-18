package com.google.android.play.c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;

/* loaded from: classes.dex */
public final class o extends h {

    /* renamed from: a, reason: collision with root package name */
    private static RectF f6833a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f6834b;
    private Paint c;
    private Path d;
    private final RectF e;
    private float f;
    private float g;
    private boolean h;
    private final int i;
    private final int j;

    public o(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        super(colorStateList, f, f3);
        this.h = true;
        this.i = resources.getColor(com.google.android.play.h.play_card_shadow_start_color);
        this.j = resources.getColor(com.google.android.play.h.play_card_shadow_end_color);
        a(f2);
        this.f6834b = new Paint(5);
        this.f6834b.setStyle(Paint.Style.FILL);
        this.f6834b.setDither(true);
        this.e = new RectF();
        this.c = new Paint(this.f6834b);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.m.setAlpha(i);
        this.f6834b.setAlpha(i);
        this.c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.h = true;
    }

    final void a(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        if (this.g != f) {
            this.g = f;
            this.f = 1.5f * f;
            this.h = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.m.setColorFilter(colorFilter);
        this.f6834b.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
    }

    @Override // com.google.android.play.c.h, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.h) {
            this.e.set(getBounds());
            this.e.inset(this.o, this.o);
            RectF rectF = new RectF(-this.n, -this.n, this.n, this.n);
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(-this.f, -this.f);
            if (this.d == null) {
                this.d = new Path();
            } else {
                this.d.reset();
            }
            this.d.setFillType(Path.FillType.EVEN_ODD);
            this.d.moveTo(-this.n, 0.0f);
            this.d.rLineTo(-this.f, 0.0f);
            this.d.arcTo(rectF2, 180.0f, 90.0f, false);
            this.d.arcTo(rectF, 270.0f, -90.0f, false);
            this.d.close();
            float f = this.n / (this.n + this.f);
            if (this.n + this.f > 0.0f) {
                this.f6834b.setShader(new RadialGradient(0.0f, 0.0f, this.n + this.f, new int[]{this.i, this.i, this.j}, new float[]{0.0f, f, 1.0f}, Shader.TileMode.CLAMP));
            }
            this.c.setShader(new LinearGradient(0.0f, (-this.n) + this.f, 0.0f, (-this.n) - this.f, new int[]{this.i, this.i, this.j}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.h = false;
        }
        canvas.translate(0.0f, this.g / 2.0f);
        float f2 = (-this.n) - this.f;
        float f3 = this.n + (this.g / 2.0f);
        boolean z = this.e.width() - (2.0f * f3) > 0.0f;
        boolean z2 = this.e.height() - (2.0f * f3) > 0.0f;
        int save = canvas.save();
        canvas.translate(this.e.left + f3, this.e.top + f3);
        canvas.drawPath(this.d, this.f6834b);
        if (z) {
            canvas.drawRect(0.0f, f2, this.e.width() - (2.0f * f3), -this.n, this.c);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        canvas.translate(this.e.right - f3, this.e.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.d, this.f6834b);
        if (z) {
            canvas.drawRect(0.0f, f2, this.e.width() - (2.0f * f3), this.f + (-this.n), this.c);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(this.e.left + f3, this.e.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.d, this.f6834b);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.e.height() - (2.0f * f3), -this.n, this.c);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        canvas.translate(this.e.right - f3, this.e.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.d, this.f6834b);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.e.height() - (2.0f * f3), -this.n, this.c);
        }
        canvas.restoreToCount(save4);
        canvas.translate(0.0f, (-this.g) / 2.0f);
        if (Build.VERSION.SDK_INT >= 17) {
            canvas.drawRoundRect(this.e, this.n, this.n, this.m);
            return;
        }
        if (f6833a == null) {
            f6833a = new RectF();
        }
        float f4 = this.n * 2.0f;
        float width = this.e.width() - f4;
        float height = this.e.height() - f4;
        f6833a.set(this.e.left, this.e.top, this.e.left + (this.n * 2.0f), this.e.top + (this.n * 2.0f));
        canvas.drawArc(f6833a, 180.0f, 90.0f, true, this.m);
        f6833a.offset(width, 0.0f);
        canvas.drawArc(f6833a, 270.0f, 90.0f, true, this.m);
        f6833a.offset(0.0f, height);
        canvas.drawArc(f6833a, 0.0f, 90.0f, true, this.m);
        f6833a.offset(-width, 0.0f);
        canvas.drawArc(f6833a, 90.0f, 90.0f, true, this.m);
        canvas.drawRect(this.n + this.e.left, this.e.top, this.e.right - this.n, this.n + this.e.top, this.m);
        canvas.drawRect(this.n + this.e.left, this.e.bottom - this.n, this.e.right - this.n, this.e.bottom, this.m);
        canvas.drawRect(this.e.left, this.n + this.e.top, this.e.right, this.e.bottom - this.n, this.m);
    }
}
