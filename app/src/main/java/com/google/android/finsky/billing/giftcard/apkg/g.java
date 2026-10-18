package com.google.android.finsky.billing.giftcard.apkg;

import android.graphics.Bitmap;
import android.view.View;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.t;

/* loaded from: classes.dex */
public final class g implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f2217a;

    g(f fVar) {
        this.f2217a = fVar;
    }

    @Override // com.google.android.play.image.t
    public final void a(FifeImageView fifeImageView) {
    }

    @Override // com.google.android.play.image.t
    public final void a(FifeImageView fifeImageView, Bitmap bitmap) {
        View view;
        if (bitmap != null) {
            fifeImageView.getLayoutParams().height = (int) (r0.width / (bitmap.getWidth() / bitmap.getHeight()));
            view = this.f2217a.d;
            view.requestLayout();
        }
    }
}
