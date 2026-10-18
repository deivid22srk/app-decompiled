package com.google.android.play.c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;

/* loaded from: classes.dex */
public class a extends h {
    private static final float k = (float) Math.tan(0.7853981633974483d);
    private static final float p = (float) Math.sin(0.7853981633974483d);
    private static RectF q;
    private static RectF r;
    private float A;

    /* renamed from: a, reason: collision with root package name */
    protected final RectF f6823a;

    /* renamed from: b, reason: collision with root package name */
    protected int f6824b;
    protected int c;
    protected int d;
    protected float e;
    protected float f;
    protected boolean g;
    protected float h;
    protected float i;
    protected float j;
    private final Matrix s;
    private final Path t;
    private final int u;
    private final int v;
    private Paint w;
    private Paint x;
    private float y;
    private Path z;

    a(Resources resources, ColorStateList colorStateList, float f, float f2, float f3, float f4, int i, int i2, int i3) {
        super(colorStateList, f, f2);
        this.g = true;
        this.f6823a = new RectF();
        this.z = new Path();
        this.u = resources.getColor(com.google.android.play.h.play_card_shadow_start_color);
        this.v = resources.getColor(com.google.android.play.h.play_card_shadow_end_color);
        this.f6824b = i;
        this.c = i2;
        this.d = i3;
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        if (this.y != f3) {
            this.y = f3;
            this.f = 1.5f * f3;
            this.g = true;
            invalidateSelf();
        }
        if (f4 > 0.0f) {
            if (this.e != f4) {
                this.e = f4;
                this.g = true;
                invalidateSelf();
            }
            this.w = new Paint(5);
            this.w.setStyle(Paint.Style.FILL);
            this.w.setDither(true);
            this.x = new Paint(this.w);
            this.s = new Matrix();
            this.t = new Path();
            return;
        }
        throw new IllegalArgumentException("invalid bubble size");
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.g = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        super.setBounds(rect);
        this.g = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.g) {
            a(getBounds());
            this.g = false;
        }
        canvas.translate(0.0f, this.y / 2.0f);
        float f = (-this.n) - this.f;
        float f2 = this.n + (this.y / 2.0f);
        boolean z = this.f6823a.width() - (2.0f * f2) > 0.0f;
        boolean z2 = this.f6823a.height() - (2.0f * f2) > 0.0f;
        int save = canvas.save();
        canvas.translate(this.f6823a.left + f2, this.f6823a.top + f2);
        canvas.drawPath(this.t, this.w);
        if (z) {
            canvas.drawRect(0.0f, f, this.f6823a.width() - (2.0f * f2), -this.n, this.x);
        }
        canvas.restoreToCount(save);
        if (this.f6824b == 48) {
            int save2 = canvas.save();
            canvas.translate(this.i, this.f + f2);
            a(canvas, f, f2);
            canvas.restoreToCount(save2);
        }
        int save3 = canvas.save();
        canvas.translate(this.f6823a.right - f2, this.f6823a.bottom - f2);
        canvas.rotate(180.0f);
        canvas.drawPath(this.t, this.w);
        if (z) {
            canvas.drawRect(0.0f, f, this.f6823a.width() - (2.0f * f2), this.f + (-this.n), this.x);
        }
        canvas.restoreToCount(save3);
        if (this.f6824b == 5) {
            int save4 = canvas.save();
            canvas.translate(this.f6823a.right + this.e, this.j);
            a(canvas, f, f2);
            canvas.restoreToCount(save4);
        }
        int save5 = canvas.save();
        canvas.translate(this.f6823a.left + f2, this.f6823a.bottom - f2);
        canvas.rotate(270.0f);
        canvas.drawPath(this.t, this.w);
        if (z2) {
            canvas.drawRect(0.0f, f, this.f6823a.height() - (2.0f * f2), -this.n, this.x);
        }
        canvas.restoreToCount(save5);
        if (this.f6824b == 3) {
            int save6 = canvas.save();
            canvas.translate(this.o, this.j);
            a(canvas, f, f2);
            canvas.restoreToCount(save6);
        }
        int save7 = canvas.save();
        canvas.translate(this.f6823a.right - f2, this.f6823a.top + f2);
        canvas.rotate(90.0f);
        canvas.drawPath(this.t, this.w);
        if (z2) {
            canvas.drawRect(0.0f, f, this.f6823a.height() - (2.0f * f2), -this.n, this.x);
        }
        canvas.restoreToCount(save7);
        if (this.f6824b == 80) {
            int save8 = canvas.save();
            canvas.translate(this.i, this.f6823a.bottom + this.e);
            a(canvas, f, f2);
            canvas.restoreToCount(save8);
        }
        canvas.translate(0.0f, (-this.y) / 2.0f);
        if (Build.VERSION.SDK_INT >= 17) {
            canvas.drawRoundRect(this.f6823a, this.n, this.n, this.m);
        } else {
            if (q == null) {
                q = new RectF();
            }
            float f3 = this.n * 2.0f;
            float width = this.f6823a.width() - f3;
            float height = this.f6823a.height() - f3;
            q.set(this.f6823a.left, this.f6823a.top, this.f6823a.left + (this.n * 2.0f), this.f6823a.top + (this.n * 2.0f));
            canvas.drawArc(q, 180.0f, 90.0f, true, this.m);
            q.offset(width, 0.0f);
            canvas.drawArc(q, 270.0f, 90.0f, true, this.m);
            q.offset(0.0f, height);
            canvas.drawArc(q, 0.0f, 90.0f, true, this.m);
            q.offset(-width, 0.0f);
            canvas.drawArc(q, 90.0f, 90.0f, true, this.m);
            canvas.drawRect(this.n + this.f6823a.left, this.f6823a.top, this.f6823a.right - this.n, this.n + this.f6823a.top, this.m);
            canvas.drawRect(this.n + this.f6823a.left, this.f6823a.bottom - this.n, this.f6823a.right - this.n, this.f6823a.bottom, this.m);
            canvas.drawRect(this.f6823a.left, this.n + this.f6823a.top, this.f6823a.right, this.f6823a.bottom - this.n, this.m);
        }
        int save9 = canvas.save();
        canvas.translate(this.i, this.j);
        canvas.drawPath(this.z, this.m);
        canvas.restoreToCount(save9);
    }

    public final float a() {
        return this.e;
    }

    public final void a(int i) {
        this.c = i;
        this.g = true;
        invalidateSelf();
    }

    public final void b(int i) {
        this.f6824b = i;
        this.g = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    protected void a(Rect rect) {
        this.f6823a.set(rect);
        this.f6823a.inset(this.o, this.o);
        this.h = (this.n + ((this.e - this.n) / k)) * 2.0f;
        int i = this.c;
        int i2 = ((int) this.h) / 2;
        if (this.f6824b == 48 || this.f6824b == 80) {
            if (this.d == 0) {
                i = (int) (i - (this.f6823a.width() / 2.0f));
            } else if (this.d == 2) {
                i = (int) (i + (this.f6823a.width() / 2.0f));
            }
            int width = (((int) this.f6823a.width()) / 2) - i2;
            int i3 = (-(((int) this.f6823a.width()) / 2)) + i2;
            if (width < i) {
                i = width;
            } else if (i3 > i) {
                i = i3;
            }
        } else if (this.f6824b == 3 || this.f6824b == 5) {
            if (this.d == 0) {
                i = (int) (i - (this.f6823a.height() / 2.0f));
            } else if (this.d == 2) {
                i = (int) (i + (this.f6823a.height() / 2.0f));
            }
            int height = (((int) this.f6823a.height()) / 2) - i2;
            int i4 = (-(((int) this.f6823a.height()) / 2)) + i2;
            if (height < i) {
                i = height;
            } else if (i4 > i) {
                i = i4;
            }
        }
        switch (this.f6824b) {
            case 3:
                this.A = -90.0f;
                this.f6823a.left += this.e;
                this.i = this.f6823a.left - (this.e / 2.0f);
                this.j = i + this.f6823a.top + (this.f6823a.height() / 2.0f);
                break;
            case 5:
                this.A = 90.0f;
                this.f6823a.right -= this.e;
                this.i = this.f6823a.right + (this.e / 2.0f);
                this.j = i + this.f6823a.top + (this.f6823a.height() / 2.0f);
                break;
            case 48:
                this.A = 0.0f;
                this.f6823a.top += this.e;
                this.j = this.f6823a.top - (this.e / 2.0f);
                this.i = i + this.f6823a.left + (this.f6823a.width() / 2.0f);
                break;
            case 80:
                this.A = 180.0f;
                this.f6823a.bottom -= this.e;
                this.j = this.f6823a.bottom + (this.e / 2.0f);
                this.i = i + this.f6823a.left + (this.f6823a.width() / 2.0f);
                break;
            default:
                throw new IllegalArgumentException("Bubble gravity can only be on of TOP, BOTTOM, LEFT or RIGHT");
        }
        this.s.reset();
        this.s.setRotate(this.A);
        RectF rectF = new RectF(-this.n, -this.n, this.n, this.n);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(-this.f, -this.f);
        this.t.reset();
        this.t.setFillType(Path.FillType.EVEN_ODD);
        this.t.moveTo(-this.n, 0.0f);
        this.t.rLineTo(-this.f, 0.0f);
        this.t.arcTo(rectF2, 180.0f, 90.0f, false);
        this.t.arcTo(rectF, 270.0f, -90.0f, false);
        this.t.close();
        float f = this.n / (this.n + this.f);
        if (this.n + this.f > 0.0f) {
            this.w.setShader(new RadialGradient(0.0f, 0.0f, this.n + this.f, new int[]{this.u, this.u, this.v}, new float[]{0.0f, f, 1.0f}, Shader.TileMode.CLAMP));
        }
        this.x.setShader(new LinearGradient(0.0f, (-this.n) + this.f, 0.0f, (-this.n) - this.f, new int[]{this.u, this.u, this.v}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        if (q == null) {
            q = new RectF();
        }
        if (r == null) {
            r = new RectF();
        }
        this.z.reset();
        this.z.setFillType(Path.FillType.EVEN_ODD);
        float f2 = (this.e / 2.0f) + 1.0f;
        float f3 = (this.f / 2.0f) + ((f2 - this.e) - 1.0f);
        float f4 = (-this.h) / 2.0f;
        r.set(-this.n, f3, this.n, (this.n * 2.0f) + f3);
        this.z.moveTo(f4, f2);
        this.z.lineTo(r.left, r.top + (this.n / 2.0f));
        this.z.arcTo(r, 225.0f, 90.0f, false);
        this.z.lineTo(f4 + this.h, f2);
        this.z.close();
        if (this.A == 0.0f) {
            return;
        }
        this.z.transform(this.s);
    }

    private void a(Canvas canvas, float f, float f2) {
        canvas.rotate(this.A);
        canvas.translate((((-this.h) / 2.0f) + (f2 / 2.0f)) - this.f, (this.e - (f / 2.0f)) + this.f);
        canvas.rotate(-45.0f);
        float f3 = ((this.e + this.f) / p) - this.n;
        canvas.drawRect(0.0f, f, f3, -this.n, this.x);
        canvas.translate(f3, 0.0f);
        canvas.rotate(90.0f);
        canvas.drawPath(this.t, this.w);
        canvas.drawRect(0.0f, f, f3, -this.n, this.x);
    }
}
