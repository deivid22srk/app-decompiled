package com.google.android.finsky.layout;

import android.annotation.TargetApi;
import android.os.Build;

/* loaded from: classes.dex */
final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f3148a;

    /* renamed from: b, reason: collision with root package name */
    private long f3149b = System.nanoTime();
    private float c;
    private float d;

    public b(a aVar, float f, long j) {
        this.f3148a = aVar;
        this.c = j / 1000.0f;
        this.d = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float nanoTime = (System.nanoTime() - this.f3149b) / 1.0E9f;
        if (nanoTime > this.c) {
            nanoTime = this.c;
        } else {
            a();
        }
        float abs = (Math.abs(this.d) * nanoTime) - ((nanoTime * (this.f3148a.e * nanoTime)) / 2.0f);
        if (this.d < 0.0f) {
            abs = -abs;
        }
        this.f3148a.d(Math.round(abs) + this.f3148a.f3105b);
    }

    @TargetApi(16)
    final void a() {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3148a.postOnAnimation(this);
        } else {
            this.f3148a.post(this);
        }
    }
}
