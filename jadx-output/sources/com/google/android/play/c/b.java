package com.google.android.play.c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class b extends a {
    protected ColorStateList k;
    private Path p;
    private RectF q;
    private Paint r;
    private int s;

    b(Resources resources, int i, float f, float f2, float f3, float f4, int i2, int i3, int i4) {
        super(resources, resources.getColorStateList(i), f, f2, f3, f4, i2, i3, i4);
        this.p = new Path();
        this.q = new RectF();
        this.k = resources.getColorStateList(com.google.android.play.h.play_overlay_highlight_outline);
        this.s = this.k.getDefaultColor();
        this.r = new Paint(5);
        this.r.setColor(this.s);
        this.r.setStrokeWidth(resources.getDimension(com.google.android.play.i.play_highlight_outline_thickness));
        this.r.setStyle(Paint.Style.STROKE);
    }

    @Override // com.google.android.play.c.h, android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.k != null && this.k.isStateful()) {
            this.r.setColor(this.k.getColorForState(iArr, this.s));
            invalidateSelf();
            return true;
        }
        return onStateChange;
    }

    @Override // com.google.android.play.c.h, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || (this.k != null && this.k.isStateful());
    }

    @Override // com.google.android.play.c.a
    protected final void a(Rect rect) {
        super.a(rect);
        this.p.reset();
        this.p.setFillType(Path.FillType.EVEN_ODD);
        this.p.moveTo(this.f6823a.left + this.n, this.f6823a.top);
        if (this.f6824b == 48) {
            this.p.lineTo(this.i - (this.h / 2.0f), this.f6823a.top);
            this.q.set(this.i - this.n, (this.f6823a.top - this.e) + (this.f / 2.0f), this.i + this.n, (this.f6823a.top - this.e) + (this.f / 2.0f) + (this.n * 2.0f));
            this.p.lineTo(this.q.left, this.q.top + (this.n / 2.0f));
            this.p.arcTo(this.q, 225.0f, 90.0f, false);
            this.p.lineTo(this.i + (this.h / 2.0f), this.f6823a.top);
        }
        this.p.lineTo(this.f6823a.right - this.n, this.f6823a.top);
        if (this.n > 0.0f) {
            this.q.set(this.f6823a.right - (this.n * 2.0f), this.f6823a.top, this.f6823a.right, this.f6823a.top + (this.n * 2.0f));
            this.p.arcTo(this.q, 270.0f, 90.0f, false);
        }
        if (this.f6824b == 5) {
            this.p.lineTo(this.f6823a.right, this.j - (this.h / 2.0f));
            this.q.set(((this.f6823a.right + this.e) - (this.f / 2.0f)) - (this.n * 2.0f), this.j - this.n, (this.f6823a.right + this.e) - (this.f / 2.0f), this.j + this.n);
            this.p.lineTo(this.q.right - (this.n / 2.0f), this.q.top);
            this.p.arcTo(this.q, 315.0f, 90.0f, false);
            this.p.lineTo(this.f6823a.right, this.j + (this.h / 2.0f));
        }
        this.p.lineTo(this.f6823a.right, this.f6823a.bottom - this.n);
        if (this.n > 0.0f) {
            this.q.set(this.f6823a.right - (this.n * 2.0f), this.f6823a.bottom - (this.n * 2.0f), this.f6823a.right, this.f6823a.bottom);
            this.p.arcTo(this.q, 0.0f, 90.0f, false);
        }
        if (this.f6824b == 80) {
            this.p.lineTo(this.i + (this.h / 2.0f), this.f6823a.bottom);
            this.q.set(this.i - this.n, ((this.f6823a.bottom + this.e) - (this.f / 2.0f)) - (this.n * 2.0f), this.i + this.n, (this.f6823a.bottom + this.e) - (this.f / 2.0f));
            this.p.lineTo(this.q.right, this.q.bottom - (this.n / 2.0f));
            this.p.arcTo(this.q, 45.0f, 90.0f, false);
            this.p.lineTo(this.i - (this.h / 2.0f), this.f6823a.bottom);
        }
        this.p.lineTo(this.f6823a.left + this.n, this.f6823a.bottom);
        if (this.n > 0.0f) {
            this.q.set(this.f6823a.left, this.f6823a.bottom - (this.n * 2.0f), this.f6823a.left + (this.n * 2.0f), this.f6823a.bottom);
            this.p.arcTo(this.q, 90.0f, 90.0f, false);
        }
        if (this.f6824b == 3) {
            this.p.lineTo(this.f6823a.left, this.j + (this.h / 2.0f));
            this.q.set((this.f6823a.left - this.e) + (this.f / 2.0f), this.j - this.n, (this.f6823a.left - this.e) + (this.f / 2.0f) + (this.n * 2.0f), this.j + this.n);
            this.p.lineTo(this.q.left + (this.n / 2.0f), this.q.bottom);
            this.p.arcTo(this.q, 135.0f, 90.0f, false);
            this.p.lineTo(this.f6823a.left, this.j - (this.h / 2.0f));
        }
        this.p.lineTo(this.f6823a.left, this.f6823a.top + this.n);
        if (this.n > 0.0f) {
            this.q.set(this.f6823a.left, this.f6823a.top, this.f6823a.left + (this.n * 2.0f), this.f6823a.top + (this.n * 2.0f));
            this.p.arcTo(this.q, 180.0f, 90.0f, false);
        }
        this.p.close();
    }

    @Override // com.google.android.play.c.a, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.g) {
            a(getBounds());
            this.g = false;
        }
        canvas.drawPath(this.p, this.m);
        canvas.drawPath(this.p, this.r);
    }
}
