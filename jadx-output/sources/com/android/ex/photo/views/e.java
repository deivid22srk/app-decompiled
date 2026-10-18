package com.android.ex.photo.views;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final PhotoView f1183a;

    /* renamed from: b, reason: collision with root package name */
    float f1184b;
    float c;
    float d;
    float e;
    long f = -1;
    boolean g;
    boolean h;

    public e(PhotoView photoView) {
        this.f1183a = photoView;
    }

    public final void a() {
        this.g = false;
        this.h = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.h) {
            long currentTimeMillis = System.currentTimeMillis();
            float f = this.f != -1 ? (currentTimeMillis - this.f) / 1000.0f : 0.0f;
            int a2 = this.f1183a.a(this.f1184b * f, this.c * f);
            this.f = currentTimeMillis;
            float f2 = this.d * f;
            if (Math.abs(this.f1184b) > Math.abs(f2)) {
                this.f1184b -= f2;
            } else {
                this.f1184b = 0.0f;
            }
            float f3 = f * this.e;
            if (Math.abs(this.c) > Math.abs(f3)) {
                this.c -= f3;
            } else {
                this.c = 0.0f;
            }
            if ((this.f1184b == 0.0f && this.c == 0.0f) || a2 == 0) {
                a();
                this.f1183a.b();
            } else if (a2 == 1) {
                this.d = this.f1184b > 0.0f ? 20000.0f : -20000.0f;
                this.e = 0.0f;
                this.c = 0.0f;
            } else if (a2 == 2) {
                this.d = 0.0f;
                this.e = this.c <= 0.0f ? -20000.0f : 20000.0f;
                this.f1184b = 0.0f;
            }
            if (!this.h) {
                this.f1183a.post(this);
            }
        }
    }
}
