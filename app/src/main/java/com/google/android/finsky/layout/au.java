package com.google.android.finsky.layout;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class au implements com.google.android.play.image.p {

    /* renamed from: a, reason: collision with root package name */
    private static au f3142a = new au();

    private au() {
    }

    @Override // com.google.android.play.image.p
    public final int a(int i, int i2) {
        return com.google.android.play.image.a.a(FinskyApp.a().getResources()).a(i, i2);
    }

    @Override // com.google.android.play.image.p
    public final Bitmap a(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(height, height, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, (-(width - height)) / 2, 0.0f, (Paint) null);
        return com.google.android.play.image.a.a(FinskyApp.a().getResources()).a(createBitmap, i, i2);
    }

    @Override // com.google.android.play.image.p
    public final void a(Canvas canvas, int i, int i2) {
    }

    @Override // com.google.android.play.image.p
    public final void b(Canvas canvas, int i, int i2) {
    }
}
