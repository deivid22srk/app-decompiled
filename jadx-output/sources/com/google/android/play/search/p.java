package com.google.android.play.search;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
final class p implements com.google.android.play.image.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f7051a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PlaySearchOneSuggestion f7052b;

    p(PlaySearchOneSuggestion playSearchOneSuggestion, v vVar) {
        this.f7052b = playSearchOneSuggestion;
        this.f7051a = vVar;
    }

    @Override // com.google.android.play.image.t
    public final void a(FifeImageView fifeImageView, Bitmap bitmap) {
        FifeImageView fifeImageView2;
        FifeImageView fifeImageView3;
        fifeImageView2 = this.f7052b.f7014b;
        fifeImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        fifeImageView3 = this.f7052b.f7014b;
        fifeImageView3.setBackgroundDrawable(this.f7051a.k);
    }

    @Override // com.google.android.play.image.t
    public final void a(FifeImageView fifeImageView) {
    }
}
