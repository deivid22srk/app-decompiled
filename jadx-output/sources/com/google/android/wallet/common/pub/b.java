package com.google.android.wallet.common.pub;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.widget.ImageView;
import com.google.android.wallet.ui.common.v;

/* loaded from: classes.dex */
final class b implements v {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f7289a;

    b(a aVar) {
        this.f7289a = aVar;
    }

    @Override // com.google.android.wallet.ui.common.v
    public final void a(Bitmap bitmap) {
        int max;
        if (bitmap != null) {
            this.f7289a.f7285b.setScaleType(ImageView.ScaleType.MATRIX);
            int width = this.f7289a.f7285b.getWidth();
            int height = this.f7289a.f7285b.getHeight();
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            float f = width2 / height2;
            if (this.f7289a.g().getBoolean(com.google.android.wallet.instrumentmanager.c.wallet_uic_is_tablet)) {
                max = (int) (height * f);
            } else {
                max = Math.max(width, (int) (height * f));
                height = Math.max(height, (int) (width / f));
            }
            RectF rectF = new RectF(0.0f, 0.0f, width2, height2);
            RectF rectF2 = new RectF(0.0f, 0.0f, max, height);
            Matrix matrix = new Matrix();
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            this.f7289a.f7285b.setImageMatrix(matrix);
        }
    }
}
