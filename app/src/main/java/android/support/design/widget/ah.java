package android.support.design.widget;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class ah extends android.support.v7.c.a.a {

    /* renamed from: a, reason: collision with root package name */
    static final double f81a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b, reason: collision with root package name */
    final Paint f82b;
    final Paint c;
    final RectF d;
    float e;
    Path f;
    float g;
    float h;
    float i;
    float j;
    boolean k;
    float l;
    private boolean n;
    private final int o;
    private final int p;
    private final int q;
    private boolean r;

    public ah(Resources resources, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.n = true;
        this.k = true;
        this.r = false;
        this.o = resources.getColor(android.support.design.d.design_fab_shadow_start_color);
        this.p = resources.getColor(android.support.design.d.design_fab_shadow_mid_color);
        this.q = resources.getColor(android.support.design.d.design_fab_shadow_end_color);
        this.f82b = new Paint(5);
        this.f82b.setStyle(Paint.Style.FILL);
        this.e = Math.round(f);
        this.d = new RectF();
        this.c = new Paint(this.f82b);
        this.c.setAntiAlias(false);
        a(f2, f3);
    }

    private static int a(float f) {
        int round = Math.round(f);
        return round % 2 == 1 ? round - 1 : round;
    }

    @Override // android.support.v7.c.a.a, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.f82b.setAlpha(i);
        this.c.setAlpha(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.c.a.a, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.n = true;
    }

    final void a(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float a2 = a(f);
        float a3 = a(f2);
        if (a2 > a3) {
            if (!this.r) {
                this.r = true;
            }
            a2 = a3;
        }
        if (this.j != a2 || this.h != a3) {
            this.j = a2;
            this.h = a3;
            this.i = Math.round(a2 * 1.5f);
            this.g = a3;
            this.n = true;
            invalidateSelf();
        }
    }

    @Override // android.support.v7.c.a.a, android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(a(this.h, this.e, this.k));
        int ceil2 = (int) Math.ceil(b(this.h, this.e, this.k));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public static float a(float f, float f2, boolean z) {
        return z ? (float) ((1.5f * f) + ((1.0d - f81a) * f2)) : 1.5f * f;
    }

    public static float b(float f, float f2, boolean z) {
        if (z) {
            return (float) (f + ((1.0d - f81a) * f2));
        }
        return f;
    }

    @Override // android.support.v7.c.a.a, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.support.v7.c.a.a, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.n) {
            Rect bounds = getBounds();
            float f = this.h * 1.5f;
            this.d.set(bounds.left + this.h, bounds.top + f, bounds.right - this.h, bounds.bottom - f);
            this.m.setBounds((int) this.d.left, (int) this.d.top, (int) this.d.right, (int) this.d.bottom);
            RectF rectF = new RectF(-this.e, -this.e, this.e, this.e);
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(-this.i, -this.i);
            if (this.f == null) {
                this.f = new Path();
            } else {
                this.f.reset();
            }
            this.f.setFillType(Path.FillType.EVEN_ODD);
            this.f.moveTo(-this.e, 0.0f);
            this.f.rLineTo(-this.i, 0.0f);
            this.f.arcTo(rectF2, 180.0f, 90.0f, false);
            this.f.arcTo(rectF, 270.0f, -90.0f, false);
            this.f.close();
            float f2 = -rectF2.top;
            if (f2 > 0.0f) {
                float f3 = this.e / f2;
                this.f82b.setShader(new RadialGradient(0.0f, 0.0f, f2, new int[]{0, this.o, this.p, this.q}, new float[]{0.0f, f3, f3 + ((1.0f - f3) / 2.0f), 1.0f}, Shader.TileMode.CLAMP));
            }
            this.c.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.o, this.p, this.q}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.c.setAntiAlias(false);
            this.n = false;
        }
        int save = canvas.save();
        canvas.rotate(this.l, this.d.centerX(), this.d.centerY());
        float f4 = (-this.e) - this.i;
        float f5 = this.e;
        boolean z = this.d.width() - (2.0f * f5) > 0.0f;
        boolean z2 = this.d.height() - (2.0f * f5) > 0.0f;
        float f6 = this.j - (this.j * 0.25f);
        float f7 = f5 / ((this.j - (this.j * 0.5f)) + f5);
        float f8 = f5 / (f6 + f5);
        float f9 = f5 / (f5 + (this.j - (this.j * 1.0f)));
        int save2 = canvas.save();
        canvas.translate(this.d.left + f5, this.d.top + f5);
        canvas.scale(f7, f8);
        canvas.drawPath(this.f, this.f82b);
        if (z) {
            canvas.scale(1.0f / f7, 1.0f);
            canvas.drawRect(0.0f, f4, this.d.width() - (2.0f * f5), -this.e, this.c);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(this.d.right - f5, this.d.bottom - f5);
        canvas.scale(f7, f9);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f, this.f82b);
        if (z) {
            canvas.scale(1.0f / f7, 1.0f);
            canvas.drawRect(0.0f, f4, this.d.width() - (2.0f * f5), this.i + (-this.e), this.c);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        canvas.translate(this.d.left + f5, this.d.bottom - f5);
        canvas.scale(f7, f9);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f, this.f82b);
        if (z2) {
            canvas.scale(1.0f / f9, 1.0f);
            canvas.drawRect(0.0f, f4, this.d.height() - (2.0f * f5), -this.e, this.c);
        }
        canvas.restoreToCount(save4);
        int save5 = canvas.save();
        canvas.translate(this.d.right - f5, this.d.top + f5);
        canvas.scale(f7, f8);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f, this.f82b);
        if (z2) {
            canvas.scale(1.0f / f8, 1.0f);
            canvas.drawRect(0.0f, f4, this.d.height() - (2.0f * f5), -this.e, this.c);
        }
        canvas.restoreToCount(save5);
        canvas.restoreToCount(save);
        super.draw(canvas);
    }
}
