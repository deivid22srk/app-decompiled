package com.google.android.finsky.layout;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.widget.ImageView;
import com.deivid22srk.store.R;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public final class dy implements com.google.android.play.image.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SetupWizardIllustration f3246a;

    public dy(SetupWizardIllustration setupWizardIllustration) {
        this.f3246a = setupWizardIllustration;
    }

    @Override // com.google.android.play.image.t
    public final void a(FifeImageView fifeImageView, Bitmap bitmap) {
        FifeImageView fifeImageView2;
        FifeImageView fifeImageView3;
        FifeImageView fifeImageView4;
        boolean z;
        int max;
        FifeImageView fifeImageView5;
        FifeImageView fifeImageView6;
        if (bitmap != null) {
            fifeImageView2 = this.f3246a.f3081b;
            fifeImageView2.setScaleType(ImageView.ScaleType.MATRIX);
            fifeImageView3 = this.f3246a.f3081b;
            int width = fifeImageView3.getWidth();
            fifeImageView4 = this.f3246a.f3081b;
            int height = fifeImageView4.getHeight();
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            float f = width2 / height2;
            z = this.f3246a.f;
            if (z) {
                fifeImageView6 = this.f3246a.f3081b;
                fifeImageView6.setBackgroundResource(R.drawable.setup_wizard_illustration_bg_tablet);
                max = (int) (height * f);
            } else {
                max = Math.max(width, (int) (height * f));
                height = Math.max(height, (int) (width / f));
            }
            RectF rectF = new RectF(0.0f, 0.0f, width2, height2);
            RectF rectF2 = new RectF(0.0f, 0.0f, max, height);
            Matrix matrix = new Matrix();
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            SetupWizardIllustration.a(this.f3246a, fifeImageView, matrix, rectF2);
            fifeImageView5 = this.f3246a.f3081b;
            fifeImageView5.setImageMatrix(matrix);
        }
    }

    @Override // com.google.android.play.image.t
    public final void a(FifeImageView fifeImageView) {
    }
}
