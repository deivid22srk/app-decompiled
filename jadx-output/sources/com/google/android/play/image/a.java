package com.google.android.play.image;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class a implements p {
    private static int u;
    private static a v;
    private static a w;
    private static android.support.v4.h.g<Integer, a> x = new android.support.v4.h.g<>(10);
    private static android.support.v4.h.g<Integer, a> y = new android.support.v4.h.g<>(10);

    /* renamed from: a, reason: collision with root package name */
    private final Paint f6922a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f6923b;
    private final Paint c;
    private final Paint d;
    private final RectF e;
    private final Paint f;
    private final Paint g;
    private final int h;
    private final int i;
    private final Paint j;
    private boolean k;
    private final Rect l;
    private final Rect m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final float r;
    private final float s;
    private final boolean t;

    public static synchronized a a(Resources resources) {
        a aVar;
        synchronized (a.class) {
            a(resources.getConfiguration());
            if (v == null) {
                v = new a(resources, true, resources.getColor(com.google.android.play.h.play_white), false);
            }
            aVar = v;
        }
        return aVar;
    }

    public static synchronized a b(Resources resources) {
        a aVar;
        synchronized (a.class) {
            a(resources.getConfiguration());
            if (w == null) {
                w = new a(resources, false, resources.getColor(com.google.android.play.h.play_white), false);
            }
            aVar = w;
        }
        return aVar;
    }

    public static synchronized a a(Resources resources, int i) {
        a a2;
        synchronized (a.class) {
            a(resources.getConfiguration());
            a2 = x.a((android.support.v4.h.g<Integer, a>) Integer.valueOf(i));
            if (a2 == null) {
                a2 = new a(resources, true, i, true);
                x.a(Integer.valueOf(i), a2);
            }
        }
        return a2;
    }

    public static synchronized a b(Resources resources, int i) {
        a a2;
        synchronized (a.class) {
            a(resources.getConfiguration());
            a2 = y.a((android.support.v4.h.g<Integer, a>) Integer.valueOf(i));
            if (a2 == null) {
                a2 = new a(resources, false, i, true);
                y.a(Integer.valueOf(i), a2);
            }
        }
        return a2;
    }

    private static synchronized void a(Configuration configuration) {
        synchronized (a.class) {
            int hashCode = configuration.hashCode();
            if (u != hashCode) {
                a();
                u = hashCode;
            }
        }
    }

    private static synchronized void a() {
        synchronized (a.class) {
            v = null;
            w = null;
            x.a(-1);
            y.a(-1);
        }
    }

    private a(Resources resources, boolean z, int i, boolean z2) {
        this.n = resources.getDimensionPixelSize(com.google.android.play.i.play_avatar_decoration_threshold_min);
        this.o = resources.getDimensionPixelSize(com.google.android.play.i.play_avatar_decoration_threshold_max);
        this.p = resources.getDimensionPixelSize(com.google.android.play.i.play_avatar_ring_size_min);
        this.q = resources.getDimensionPixelSize(com.google.android.play.i.play_avatar_ring_size_max);
        this.r = resources.getDimensionPixelSize(com.google.android.play.i.play_avatar_drop_shadow_min) * 0.5f;
        this.s = resources.getDimensionPixelSize(com.google.android.play.i.play_avatar_drop_shadow_max) * 0.5f;
        int color = resources.getColor(com.google.android.play.h.play_avatar_outline);
        int color2 = resources.getColor(com.google.android.play.h.play_white);
        float dimensionPixelSize = resources.getDimensionPixelSize(com.google.android.play.i.play_avatar_noring_outline) * 0.5f;
        this.f6922a = new Paint();
        this.f6922a.setColor(color);
        this.f6922a.setStrokeWidth(dimensionPixelSize);
        this.f6922a.setStyle(Paint.Style.STROKE);
        this.f6922a.setAntiAlias(true);
        this.f6923b = new Paint();
        this.f6923b.setColor(color2);
        this.f6923b.setStyle(Paint.Style.STROKE);
        this.f6923b.setAntiAlias(true);
        this.c = new Paint(2);
        this.c.setAntiAlias(true);
        this.d = new Paint(2);
        this.e = new RectF();
        this.f = new Paint();
        this.f.setColor(resources.getColor(com.google.android.play.h.play_avatar_pressed_fill));
        this.f.setAntiAlias(true);
        this.f.setStyle(Paint.Style.FILL);
        this.h = resources.getColor(com.google.android.play.h.play_avatar_pressed_outline);
        this.i = resources.getColor(com.google.android.play.h.play_avatar_focused_outline);
        this.g = new Paint();
        this.g.setAntiAlias(true);
        this.g.setStrokeWidth(dimensionPixelSize);
        this.g.setStyle(Paint.Style.STROKE);
        this.j = new Paint();
        this.j.setColor(i);
        this.j.setStyle(Paint.Style.FILL);
        this.k = z2;
        this.l = new Rect();
        this.m = new Rect();
        this.t = z;
    }

    private float b(int i, int i2) {
        int max = Math.max(i, i2);
        if (max < this.n) {
            return 0.0f;
        }
        return a(this.n, this.o, this.r, this.s, max);
    }

    private float c(int i, int i2) {
        return a(this.n, this.o, this.p, this.q, Math.max(i, i2));
    }

    @Override // com.google.android.play.image.p
    public final int a(int i, int i2) {
        if (Math.max(i, i2) < this.n) {
            return 0;
        }
        return (int) ((2.0f * c(i, i2)) + b(i, i2));
    }

    @Override // com.google.android.play.image.p
    public final Bitmap a(Bitmap bitmap, int i, int i2) {
        int width;
        if (!this.k && bitmap == null) {
            return null;
        }
        int max = Math.max(i, i2);
        boolean z = max >= this.n;
        float c = this.t ? c(i, i2) : 0.0f;
        float b2 = b(i, i2);
        int a2 = (int) a(this.n, this.o, 48.0f, 64.0f, max);
        int a3 = a(i, i2);
        int i3 = a2 << 24;
        int width2 = bitmap == null ? i : bitmap.getWidth();
        if (bitmap != null) {
            i2 = bitmap.getHeight();
        }
        int max2 = Math.max(width2, i2);
        int min = Math.min(width2, i2);
        if (Math.abs(width2 - i2) > 1 || max2 < max - a3 || min > max || this.k) {
            Bitmap createBitmap = Bitmap.createBitmap(max, max, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawRect(0.0f, 0.0f, max, max, this.j);
            if (bitmap != null) {
                this.l.set(0, 0, width2, i2);
                float max3 = max / Math.max(width2, i2);
                int i4 = (int) (width2 * max3);
                int i5 = (int) (max3 * i2);
                int i6 = (max - i4) / 2;
                int i7 = (max - i5) / 2;
                this.m.set(i6, i7, i4 + i6, i5 + i7);
                canvas.drawBitmap(bitmap, this.l, this.m, this.d);
            }
            width = createBitmap == null ? i : createBitmap.getWidth();
            bitmap = createBitmap;
        } else {
            width = width2;
        }
        this.c.setShader(new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        Bitmap createBitmap2 = Bitmap.createBitmap(max, max, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap2);
        float f = max / 2.0f;
        float f2 = 1.0f;
        if (z) {
            f2 = 1.0f + b2;
            canvas2.translate(b2 / 2.0f, 0.0f);
        }
        this.e.set(0.0f, 0.0f, i - f2, i - f2);
        if (z) {
            a(canvas2, b2, i3);
            a(canvas2, width, f, c, ((max - b2) - Math.max(1.0f, 2.0f * c)) / width);
            if (this.t) {
                float f3 = this.e.left;
                float f4 = this.e.right;
                float f5 = this.e.top;
                float f6 = this.e.bottom;
                this.f6923b.setStrokeWidth(c);
                float f7 = c / 2.0f;
                this.e.left += f7;
                this.e.top += f7;
                this.e.right -= f7;
                this.e.bottom -= f7;
                canvas2.drawOval(this.e, this.f6923b);
                this.e.left = f3;
                this.e.right = f4;
                this.e.top = f5;
                this.e.bottom = f6;
            }
        } else {
            a(canvas2, width, f, 0.0f, 1.0f);
            a(canvas2, 0.0f, 0);
        }
        this.c.setShader(null);
        return createBitmap2;
    }

    private static float a(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f) {
            return f3;
        }
        return f5 >= f2 ? f4 : f != f2 ? f3 + (((f5 - f) * (f4 - f3)) / (f2 - f)) : f3;
    }

    private void a(Canvas canvas, int i, float f, float f2, float f3) {
        float f4 = this.e.left;
        float f5 = this.e.right;
        float f6 = this.e.top;
        float f7 = this.e.bottom;
        this.e.left = 0.0f;
        this.e.top = 0.0f;
        this.e.right = i;
        this.e.bottom = i;
        canvas.save();
        canvas.scale(f3, f3);
        canvas.translate(f2, f2);
        canvas.drawRoundRect(this.e, f, f, this.c);
        canvas.restore();
        this.e.left = f4;
        this.e.right = f5;
        this.e.top = f6;
        this.e.bottom = f7;
    }

    private void a(Canvas canvas, float f, int i) {
        float f2 = this.e.left;
        float f3 = this.e.right;
        float f4 = this.e.top;
        float f5 = this.e.bottom;
        this.f6922a.setStrokeWidth(2.0f * f);
        float strokeWidth = this.f6922a.getStrokeWidth() / 2.0f;
        this.e.left += strokeWidth - (f / 3.0f);
        this.e.top += strokeWidth + f;
        this.e.right -= strokeWidth - (f / 3.0f);
        this.e.bottom -= strokeWidth - f;
        this.f6922a.setColor(i);
        canvas.drawOval(this.e, this.f6922a);
        this.e.left = f2;
        this.e.right = f3;
        this.e.top = f4;
        this.e.bottom = f5;
    }

    @Override // com.google.android.play.image.p
    public final void a(Canvas canvas, int i, int i2) {
        float b2 = b(i, i2);
        canvas.save();
        canvas.translate(b2 / 2.0f, 0.0f);
        float min = Math.min(((int) (i - b2)) / 2.0f, ((int) (i2 - b2)) / 2.0f);
        float strokeWidth = this.g.getStrokeWidth();
        this.g.setColor(this.i);
        canvas.drawCircle(min, min, min - (strokeWidth / 2.0f), this.g);
        canvas.restore();
    }

    @Override // com.google.android.play.image.p
    public final void b(Canvas canvas, int i, int i2) {
        float b2 = b(i, i2);
        canvas.save();
        canvas.translate(b2 / 2.0f, 0.0f);
        float min = Math.min(((int) (i - b2)) / 2.0f, ((int) (i2 - b2)) / 2.0f);
        canvas.drawCircle(min, min, min, this.f);
        float strokeWidth = this.g.getStrokeWidth();
        this.g.setColor(this.h);
        canvas.drawCircle(min, min, min - (strokeWidth / 2.0f), this.g);
        canvas.restore();
    }
}
