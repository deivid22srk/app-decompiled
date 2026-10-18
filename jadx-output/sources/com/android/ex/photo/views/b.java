package com.android.ex.photo.views;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final PhotoView f1177a;

    /* renamed from: b, reason: collision with root package name */
    float f1178b;
    float c;
    float d;
    long e;
    boolean f;
    boolean g;

    public b(PhotoView photoView) {
        this.f1177a = photoView;
    }

    public final void a() {
        this.f = false;
        this.g = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.g) {
            if (this.c != this.f1178b) {
                long currentTimeMillis = System.currentTimeMillis();
                float f = (this.e != -1 ? currentTimeMillis - this.e : 0L) * this.d;
                if ((this.c < this.f1178b && this.c + f > this.f1178b) || (this.c > this.f1178b && this.c + f < this.f1178b)) {
                    f = this.f1178b - this.c;
                }
                PhotoView.a(this.f1177a, f);
                this.c = f + this.c;
                if (this.c == this.f1178b) {
                    a();
                }
                this.e = currentTimeMillis;
            }
            if (!this.g) {
                this.f1177a.post(this);
            }
        }
    }
}
