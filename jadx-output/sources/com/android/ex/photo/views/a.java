package com.android.ex.photo.views;

import android.graphics.RectF;

/* loaded from: classes.dex */
final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PhotoView f1176a;

    a(PhotoView photoView) {
        this.f1176a = photoView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float scale;
        float f;
        float f2;
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        RectF rectF4;
        float min;
        float min2;
        c cVar;
        float f3;
        scale = this.f1176a.getScale();
        f = this.f1176a.K;
        if (scale > f) {
            f2 = this.f1176a.K;
            float f4 = 1.0f / (1.0f - (f2 / scale));
            float f5 = 1.0f - f4;
            float width = this.f1176a.getWidth() / 2;
            float height = this.f1176a.getHeight() / 2;
            rectF = this.f1176a.n;
            float f6 = rectF.left * f5;
            rectF2 = this.f1176a.n;
            float f7 = rectF2.top * f5;
            rectF3 = this.f1176a.n;
            float width2 = (this.f1176a.getWidth() * f4) + (rectF3.right * f5);
            rectF4 = this.f1176a.n;
            float height2 = (f4 * this.f1176a.getHeight()) + (f5 * rectF4.bottom);
            if (width2 > f6) {
                min = (width2 + f6) / 2.0f;
            } else {
                min = Math.min(Math.max(width2, width), f6);
            }
            if (height2 > f7) {
                min2 = (height2 + f7) / 2.0f;
            } else {
                min2 = Math.min(Math.max(height2, height), f7);
            }
            cVar = this.f1176a.h;
            f3 = this.f1176a.K;
            cVar.a(scale, f3, min, min2);
        }
    }
}
