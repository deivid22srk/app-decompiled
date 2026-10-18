package com.google.android.finsky.widget.consumption;

import android.graphics.Bitmap;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class d implements com.google.android.play.image.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bitmap[] f5175a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Semaphore f5176b;
    final /* synthetic */ a c;

    d(a aVar, Bitmap[] bitmapArr, Semaphore semaphore) {
        this.c = aVar;
        this.f5175a = bitmapArr;
        this.f5176b = semaphore;
    }

    @Override // com.android.volley.t
    /* renamed from: a */
    public final void a_(com.google.android.play.image.j jVar) {
        this.f5175a[0] = jVar.f6944a;
        this.f5176b.release();
    }
}
