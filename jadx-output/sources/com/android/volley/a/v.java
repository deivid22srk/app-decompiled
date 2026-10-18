package com.android.volley.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.android.volley.ParseError;

/* loaded from: classes.dex */
public class v extends com.android.volley.l<Bitmap> {
    private static final Object o = new Object();
    private final com.android.volley.t<Bitmap> j;
    private final Bitmap.Config k;
    private final int l;
    private final int m;
    private ImageView.ScaleType n;

    public v(String str, com.android.volley.t<Bitmap> tVar, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, com.android.volley.s sVar) {
        super(0, str, sVar);
        this.g = new com.android.volley.e(1000, 2, 2.0f);
        this.j = tVar;
        this.k = config;
        this.l = i;
        this.m = i2;
        this.n = scaleType;
    }

    @Override // com.android.volley.l
    public final com.android.volley.n l() {
        return com.android.volley.n.LOW;
    }

    private static int a(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        }
        if (i == 0) {
            return (int) ((i2 / i4) * i3);
        }
        if (i2 != 0) {
            double d = i4 / i3;
            if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                if (i * d < i2) {
                    return (int) (i2 / d);
                }
                return i;
            }
            if (i * d > i2) {
                return (int) (i2 / d);
            }
            return i;
        }
        return i;
    }

    @Override // com.android.volley.l
    public com.android.volley.r<Bitmap> a(com.android.volley.k kVar) {
        com.android.volley.r<Bitmap> a2;
        Bitmap bitmap;
        synchronized (o) {
            try {
                byte[] bArr = kVar.f1244b;
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (this.l == 0 && this.m == 0) {
                    options.inPreferredConfig = this.k;
                    bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                } else {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    int i = options.outWidth;
                    int i2 = options.outHeight;
                    int a3 = a(this.l, this.m, i, i2, this.n);
                    int a4 = a(this.m, this.l, i2, i, this.n);
                    options.inJustDecodeBounds = false;
                    options.inSampleSize = a(i, i2, a3, a4);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    if (decodeByteArray == null || (decodeByteArray.getWidth() <= a3 && decodeByteArray.getHeight() <= a4)) {
                        bitmap = decodeByteArray;
                    } else {
                        bitmap = Bitmap.createScaledBitmap(decodeByteArray, a3, a4, true);
                        decodeByteArray.recycle();
                    }
                }
                if (bitmap == null) {
                    a2 = com.android.volley.r.a(new ParseError(kVar));
                } else {
                    a2 = com.android.volley.r.a(bitmap, l.a(kVar));
                }
            } catch (OutOfMemoryError e) {
                com.android.volley.w.c("Caught OOM for %d byte image, url=%s", Integer.valueOf(kVar.f1244b.length), b());
                a2 = com.android.volley.r.a(new ParseError(e));
            }
        }
        return a2;
    }

    @Override // com.android.volley.l
    public void a(Bitmap bitmap) {
        this.j.a_(bitmap);
    }

    private static int a(int i, int i2, int i3, int i4) {
        float f = 1.0f;
        while (f * 2.0f <= Math.min(i / i3, i2 / i4)) {
            f *= 2.0f;
        }
        return (int) f;
    }
}
