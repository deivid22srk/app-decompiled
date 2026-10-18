package com.caverock.androidsvg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class cu extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private final at f1352a;

    /* renamed from: b, reason: collision with root package name */
    private q f1353b;
    private Picture c;
    private Bitmap e;
    private Paint f = new Paint();
    private Rect d = new Rect();

    public cu(q qVar, at atVar) {
        this.f1353b = qVar;
        this.f1352a = atVar;
        this.c = this.f1353b.a(this.f1352a);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.equals(this.d)) {
            copyBounds(this.d);
            int width = bounds.width();
            int height = bounds.height();
            this.e = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            new Canvas(this.e).drawPicture(this.c, new Rect(0, 0, width, height));
        }
        canvas.drawBitmap(this.e, 0.0f, 0.0f, this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) Math.ceil(this.f1353b.a());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.ceil(this.f1353b.b());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }
}
