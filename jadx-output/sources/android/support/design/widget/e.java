package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class e extends Drawable {
    float d;
    int e;
    int f;
    int g;
    int h;
    float j;
    private ColorStateList k;
    private int l;

    /* renamed from: b, reason: collision with root package name */
    final Rect f134b = new Rect();
    final RectF c = new RectF();
    boolean i = true;

    /* renamed from: a, reason: collision with root package name */
    final Paint f133a = new Paint(1);

    public e() {
        this.f133a.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.i) {
            Paint paint = this.f133a;
            copyBounds(this.f134b);
            float height = this.d / r3.height();
            paint.setShader(new LinearGradient(0.0f, r3.top, 0.0f, r3.bottom, new int[]{android.support.v4.c.a.a(this.e, this.l), android.support.v4.c.a.a(this.f, this.l), android.support.v4.c.a.a(android.support.v4.c.a.b(this.f, 0), this.l), android.support.v4.c.a.a(android.support.v4.c.a.b(this.h, 0), this.l), android.support.v4.c.a.a(this.h, this.l), android.support.v4.c.a.a(this.g, this.l)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.i = false;
        }
        float strokeWidth = this.f133a.getStrokeWidth() / 2.0f;
        RectF rectF = this.c;
        copyBounds(this.f134b);
        rectF.set(this.f134b);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.j, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.f133a);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int round = Math.round(this.d);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f133a.setAlpha(i);
        invalidateSelf();
    }

    final void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.l = colorStateList.getColorForState(getState(), this.l);
        }
        this.k = colorStateList;
        this.i = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f133a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.d > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.i = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return (this.k != null && this.k.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        if (this.k != null && (colorForState = this.k.getColorForState(iArr, this.l)) != this.l) {
            this.i = true;
            this.l = colorForState;
        }
        if (this.i) {
            invalidateSelf();
        }
        return this.i;
    }
}
