package com.google.android.finsky.widget.recommendation;

import android.graphics.Bitmap;
import com.google.android.play.image.j;
import com.google.android.play.image.k;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class g implements k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bitmap[] f5235a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Semaphore f5236b;

    g(Bitmap[] bitmapArr, Semaphore semaphore) {
        this.f5235a = bitmapArr;
        this.f5236b = semaphore;
    }

    @Override // com.android.volley.t
    /* renamed from: a */
    public final void a_(j jVar) {
        this.f5235a[0] = jVar.f6944a;
        this.f5236b.release();
    }
}
