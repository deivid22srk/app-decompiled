package com.google.android.play.layout;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.support.v4.view.by;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import com.google.android.play.m;
import com.google.android.play.o;
import java.text.NumberFormat;

/* loaded from: classes.dex */
public class StarRatingBar extends View {
    private static NumberFormat v;
    private static SparseArray<String> w;

    /* renamed from: a, reason: collision with root package name */
    private float f6978a;

    /* renamed from: b, reason: collision with root package name */
    private float f6979b;
    private final float c;
    private boolean d;
    private boolean e;
    private final float f;
    private final double g;
    private final double h;
    private final double i;
    private final PointF[] j;
    private final Path k;
    private final Path l;
    private final Path m;
    private final Paint n;
    private final Paint o;
    private final TextPaint p;
    private int q;
    private final int r;
    private final int s;
    private float t;
    private String u;

    public StarRatingBar(Context context) {
        this(context, null);
    }

    public StarRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.StarRatingBar);
        this.c = obtainStyledAttributes.getDimensionPixelSize(o.StarRatingBar_gap, 0);
        this.f6978a = obtainStyledAttributes.getFloat(o.StarRatingBar_rating, 0.0f);
        this.g = obtainStyledAttributes.getDimensionPixelSize(o.StarRatingBar_star_height, resources.getDimensionPixelSize(com.google.android.play.i.play_star_height_default));
        this.f6979b = obtainStyledAttributes.getInt(o.StarRatingBar_range, 5);
        this.d = obtainStyledAttributes.getBoolean(o.StarRatingBar_show_empty_stars, true);
        this.e = obtainStyledAttributes.getBoolean(o.StarRatingBar_compact_mode, false);
        this.q = obtainStyledAttributes.getDimensionPixelSize(o.StarRatingBar_text_size, resources.getDimensionPixelSize(com.google.android.play.i.play_medium_size));
        int color = obtainStyledAttributes.getColor(o.StarRatingBar_star_color, resources.getColor(com.google.android.play.h.play_white));
        int color2 = obtainStyledAttributes.getColor(o.StarRatingBar_star_bg_color, resources.getColor(com.google.android.play.h.play_transparent));
        obtainStyledAttributes.recycle();
        this.n = new Paint(1);
        this.n.setColor(color);
        this.n.setStyle(Paint.Style.FILL);
        this.o = new Paint(1);
        this.o.setColor(color2);
        this.o.setStyle(Paint.Style.FILL);
        this.k = new Path();
        this.k.setFillType(Path.FillType.EVEN_ODD);
        this.l = new Path();
        this.l.setFillType(Path.FillType.EVEN_ODD);
        this.m = new Path();
        this.m.setFillType(Path.FillType.EVEN_ODD);
        this.h = this.g / (1.0d + Math.sin(0.9424777960769379d));
        this.i = (Math.sin(0.39269908169872414d) * this.h) / Math.sin(2.1205750411731104d);
        this.f = (float) (this.h * Math.sin(1.2566370614359172d));
        this.j = new PointF[10];
        for (int i = 0; i < 10; i++) {
            this.j[i] = new PointF();
        }
        this.p = new TextPaint(1);
        this.p.density = resources.getDisplayMetrics().density;
        this.p.setTextSize(this.q);
        this.p.setFakeBoldText(false);
        Paint.FontMetrics fontMetrics = this.p.getFontMetrics();
        this.r = (int) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom));
        this.s = (int) Math.abs(fontMetrics.top);
        b();
        this.j[0].x = 0.0f;
        this.j[0].y = (-1.0f) * ((float) this.h);
        this.j[1].x = (float) (this.i * Math.sin(0.6283185307179586d));
        this.j[1].y = (-1.0f) * ((float) (this.i * Math.cos(0.6283185307179586d)));
        this.j[2].x = (float) (this.h * Math.sin(1.2566370614359172d));
        this.j[2].y = (-1.0f) * ((float) (this.h * Math.cos(1.2566370614359172d)));
        this.j[3].x = (float) (this.i * Math.sin(1.2566370614359172d));
        this.j[3].y = (float) (this.i * Math.cos(1.2566370614359172d));
        this.j[4].x = (float) (this.h * Math.sin(0.6283185307179586d));
        this.j[4].y = (float) (((float) this.h) * Math.cos(0.6283185307179586d));
        this.j[5].x = 0.0f;
        this.j[5].y = (float) this.i;
        this.j[6].x = (-1.0f) * this.j[4].x;
        this.j[6].y = this.j[4].y;
        this.j[7].x = (-1.0f) * this.j[3].x;
        this.j[7].y = this.j[3].y;
        this.j[8].x = (-1.0f) * this.j[2].x;
        this.j[8].y = this.j[2].y;
        this.j[9].x = (-1.0f) * this.j[1].x;
        this.j[9].y = this.j[1].y;
        a();
        setWillNotDraw(false);
    }

    public float getRating() {
        return this.f6978a;
    }

    public void setRating(float f) {
        if (this.f6978a != f) {
            this.f6978a = f;
            b();
            setContentDescription(getResources().getString(m.play_star_rating_content_description, this.u));
            if (this.e || !this.d) {
                requestLayout();
            }
            invalidate();
        }
    }

    public void setCompactMode(boolean z) {
        if (this.e != z) {
            this.e = z;
            requestLayout();
            invalidate();
        }
    }

    public void setShowEmptyStars(boolean z) {
        if (this.d != z) {
            this.d = z;
            requestLayout();
            invalidate();
        }
    }

    public void setTextSize(int i) {
        if (this.q != i) {
            this.q = i;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.e ? getPaddingTop() + this.s : getMeasuredHeight();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int save = canvas.save(1);
        if (by.h(this) == 1 && !this.e) {
            canvas.translate(getWidth(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        int paddingTop = getPaddingTop();
        int n = by.n(this);
        if (this.e) {
            float f = n;
            float f2 = paddingTop;
            canvas.save();
            canvas.translate(f, f2);
            canvas.drawText(this.u, f, f2 + this.s, this.p);
            canvas.restore();
            canvas.save();
            canvas.translate(f + this.f + this.t + (this.c * 2.0f), (((paddingTop - getPaddingBottom()) + getMeasuredHeight()) - (this.r / 2)) + ((float) (this.h - this.f)));
            canvas.drawPath(this.k, this.n);
            canvas.restore();
        } else {
            int i = (int) this.f6978a;
            int numOfHalfStars = getNumOfHalfStars();
            int i2 = 0;
            float f3 = n + this.f;
            float f4 = paddingTop + ((float) this.h);
            while (i2 < i) {
                canvas.save();
                canvas.translate((i2 * ((this.f * 2.0f) + this.c)) + f3, f4);
                canvas.drawPath(this.k, this.n);
                canvas.restore();
                i2++;
            }
            if (numOfHalfStars == 1) {
                canvas.save();
                canvas.translate((i2 * ((this.f * 2.0f) + this.c)) + f3, f4);
                canvas.drawPath(this.l, this.n);
                canvas.drawPath(this.m, this.o);
                canvas.restore();
                i2++;
            }
            if (this.d) {
                while (i2 < this.f6979b) {
                    canvas.save();
                    canvas.translate((i2 * ((this.f * 2.0f) + this.c)) + f3, f4);
                    canvas.drawPath(this.k, this.o);
                    canvas.restore();
                    i2++;
                }
            }
        }
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int paddingLeft;
        int paddingTop;
        if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (this.e) {
            this.t = this.p.measureText(this.u);
            paddingLeft = (int) (getPaddingLeft() + getPaddingRight() + this.t + (this.c * 2.0f) + (this.f * 2.0f));
            paddingTop = (int) (getPaddingTop() + getPaddingBottom() + Math.max(this.r, this.g));
        } else {
            float numOfHalfStars = this.d ? (int) this.f6979b : this.f6978a + getNumOfHalfStars();
            paddingLeft = (int) (((numOfHalfStars - 1.0f) * this.c) + getPaddingLeft() + getPaddingRight() + (numOfHalfStars * 2.0f * this.f));
            paddingTop = (int) (getPaddingTop() + getPaddingBottom() + this.g);
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    private int getNumOfHalfStars() {
        return Float.compare(this.f6978a % 1.0f, 0.0f) > 0 ? 1 : 0;
    }

    private void a() {
        this.k.reset();
        this.k.moveTo(this.j[0].x, this.j[0].y);
        for (int i = 1; i < this.j.length; i++) {
            this.k.lineTo(this.j[i].x, this.j[i].y);
        }
        this.k.close();
        this.l.reset();
        this.l.moveTo(this.j[0].x, this.j[0].y);
        for (int i2 = 5; i2 < this.j.length; i2++) {
            this.l.lineTo(this.j[i2].x, this.j[i2].y);
        }
        this.l.close();
        this.m.reset();
        this.m.moveTo(this.j[0].x, this.j[0].y);
        for (int i3 = 1; i3 <= 5; i3++) {
            this.m.lineTo(this.j[i3].x, this.j[i3].y);
        }
        this.m.close();
    }

    private void b() {
        if (v == null) {
            NumberFormat numberInstance = NumberFormat.getNumberInstance();
            v = numberInstance;
            numberInstance.setMinimumFractionDigits(1);
            v.setMaximumFractionDigits(1);
            w = new SparseArray<>();
        }
        int round = Math.round(this.f6978a * 10.0f);
        this.u = w.get(round);
        if (this.u == null) {
            this.u = v.format(this.f6978a);
            w.put(round, this.u);
        }
    }
}
