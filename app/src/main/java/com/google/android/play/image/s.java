package com.google.android.play.image;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bitmap f6950a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f6951b;
    final /* synthetic */ FifeImageView c;

    s(FifeImageView fifeImageView, Bitmap bitmap, boolean z) {
        this.c = fifeImageView;
        this.f6950a = bitmap;
        this.f6951b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.f6950a, this.f6951b);
    }
}
