package android.support.v7.c.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.b.k;
import android.support.v7.b.l;

/* loaded from: classes.dex */
public class b extends Drawable {
    private static final float c = (float) Math.toRadians(45.0d);

    /* renamed from: a, reason: collision with root package name */
    public float f553a;
    private float d;
    private float e;
    private float f;
    private float g;
    private boolean h;
    private final int j;
    private float l;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f554b = new Paint();
    private final Path i = new Path();
    private boolean k = false;
    private int m = 2;

    public b(Context context) {
        this.f554b.setStyle(Paint.Style.STROKE);
        this.f554b.setStrokeJoin(Paint.Join.MITER);
        this.f554b.setStrokeCap(Paint.Cap.BUTT);
        this.f554b.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, l.DrawerArrowToggle, android.support.v7.b.b.drawerArrowStyle, k.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = obtainStyledAttributes.getColor(l.DrawerArrowToggle_color, 0);
        if (color != this.f554b.getColor()) {
            this.f554b.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(l.DrawerArrowToggle_thickness, 0.0f);
        if (this.f554b.getStrokeWidth() != dimension) {
            this.f554b.setStrokeWidth(dimension);
            this.l = (float) ((dimension / 2.0f) * Math.cos(c));
            invalidateSelf();
        }
        boolean z = obtainStyledAttributes.getBoolean(l.DrawerArrowToggle_spinBars, true);
        if (this.h != z) {
            this.h = z;
            invalidateSelf();
        }
        float round = Math.round(obtainStyledAttributes.getDimension(l.DrawerArrowToggle_gapBetweenBars, 0.0f));
        if (round != this.g) {
            this.g = round;
            invalidateSelf();
        }
        this.j = obtainStyledAttributes.getDimensionPixelSize(l.DrawerArrowToggle_drawableSize, 0);
        this.e = Math.round(obtainStyledAttributes.getDimension(l.DrawerArrowToggle_barLength, 0.0f));
        this.d = Math.round(obtainStyledAttributes.getDimension(l.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f = obtainStyledAttributes.getDimension(l.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public final void a(boolean z) {
        if (this.k != z) {
            this.k = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Rect bounds = getBounds();
        switch (this.m) {
            case 0:
                z = false;
                break;
            case 1:
                z = true;
                break;
            case 2:
            default:
                if (android.support.v4.c.apkg.a.e(this) != 1) {
                    z = false;
                    break;
                } else {
                    z = true;
                    break;
                }
            case 3:
                if (android.support.v4.c.apkg.a.e(this) != 0) {
                    z = false;
                    break;
                } else {
                    z = true;
                    break;
                }
        }
        float sqrt = (float) Math.sqrt(this.d * this.d * 2.0f);
        float f = this.e;
        float f2 = f + ((sqrt - f) * this.f553a);
        float f3 = this.e;
        float f4 = f3 + ((this.f - f3) * this.f553a);
        float round = Math.round(0.0f + ((this.l - 0.0f) * this.f553a));
        float f5 = 0.0f + ((c - 0.0f) * this.f553a);
        float f6 = z ? 0.0f : -180.0f;
        float f7 = (((z ? 180.0f : 0.0f) - f6) * this.f553a) + f6;
        float round2 = Math.round(f2 * Math.cos(f5));
        float round3 = Math.round(f2 * Math.sin(f5));
        this.i.rewind();
        float strokeWidth = this.g + this.f554b.getStrokeWidth();
        float f8 = strokeWidth + (((-this.l) - strokeWidth) * this.f553a);
        float f9 = (-f4) / 2.0f;
        this.i.moveTo(f9 + round, 0.0f);
        this.i.rLineTo(f4 - (round * 2.0f), 0.0f);
        this.i.moveTo(f9, f8);
        this.i.rLineTo(round2, round3);
        this.i.moveTo(f9, -f8);
        this.i.rLineTo(round2, -round3);
        this.i.close();
        canvas.save();
        canvas.translate(bounds.centerX(), (float) (((((int) ((bounds.height() - (3.0f * r2)) - (this.g * 2.0f))) / 4) * 2) + (this.f554b.getStrokeWidth() * 1.5d) + this.g));
        if (this.h) {
            canvas.rotate((z ^ this.k ? -1 : 1) * f7);
        } else if (z) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.i, this.f554b);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f554b.getAlpha()) {
            this.f554b.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f554b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void b(float f) {
        if (this.f553a != f) {
            this.f553a = f;
            invalidateSelf();
        }
    }
}
