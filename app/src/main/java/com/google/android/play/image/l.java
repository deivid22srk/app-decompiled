package com.google.android.play.image;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class l extends com.android.volley.apkg.v {
    private static final Matrix j = new Matrix();
    private boolean k;

    public l(String str, int i, int i2, Bitmap.Config config, com.android.volley.t<Bitmap> tVar, com.android.volley.s sVar) {
        super(str, tVar, i, i2, ImageView.ScaleType.CENTER_INSIDE, config, sVar);
    }

    @Override // com.android.volley.apkg.v, com.android.volley.l
    public com.android.volley.r<Bitmap> a(com.android.volley.k kVar) {
        com.android.volley.r<Bitmap> a2 = super.a(kVar);
        if (!a2.a() || !com.google.android.play.utils.bpkg.j.v.b().booleanValue()) {
            return a2;
        }
        Bitmap bitmap = a2.f1255a;
        int length = kVar.f1244b.length / 1024;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, j, null);
        Paint paint = new Paint(8);
        paint.setColor(b().contains("ggpht.com") ? -16711681 : -65281);
        paint.setStrokeWidth(3.0f);
        paint.setTextAlign(Paint.Align.LEFT);
        String format = String.format("%dk", Integer.valueOf(length));
        String format2 = String.format("%dh", Integer.valueOf(bitmap.getHeight()));
        String format3 = String.format("%dw", Integer.valueOf(bitmap.getWidth()));
        float f = 40.0f;
        while (true) {
            paint.setTextSize(f);
            if (f * 3.1d > canvas.getHeight() || Math.max(Math.max(paint.measureText(format2), paint.measureText(format3)), paint.measureText(format)) * 1.1d >= canvas.getWidth()) {
                f = (float) (0.8d * f);
            } else {
                float height = (canvas.getHeight() / 2) - f;
                canvas.drawText(format, 4.0f, height, paint);
                float f2 = 5.0f + f + height;
                canvas.drawText(format2, 4.0f, f2, paint);
                canvas.drawText(format3, 4.0f, f + 5.0f + f2, paint);
                bitmap.recycle();
                return com.android.volley.r.a(createBitmap, a2.f1256b);
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.android.volley.apkg.v, com.android.volley.l
    public void a(Bitmap bitmap) {
        if (!this.k) {
            this.k = true;
            super.a(bitmap);
        }
    }
}
