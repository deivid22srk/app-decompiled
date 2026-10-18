package com.android.ex.photo.views;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final PhotoView f1179a;

    /* renamed from: b, reason: collision with root package name */
    private float f1180b;
    private float c;
    private boolean d;
    private float e;
    private float f;
    private float g;
    private long h;
    private boolean i;
    private boolean j;

    public c(PhotoView photoView) {
        this.f1179a = photoView;
    }

    public final boolean a(float f, float f2, float f3, float f4) {
        if (this.i) {
            return false;
        }
        this.f1180b = f3;
        this.c = f4;
        this.e = f2;
        this.h = System.currentTimeMillis();
        this.f = f;
        this.d = this.e > this.f;
        this.g = (this.e - this.f) / 200.0f;
        this.i = true;
        this.j = false;
        this.f1179a.post(this);
        return true;
    }

    public final void a() {
        this.i = false;
        this.j = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r4.d == (r0 > r4.e)) goto L11;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r4 = this;
            boolean r0 = r4.j
            if (r0 == 0) goto L5
        L4:
            return
        L5:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.h
            long r0 = r0 - r2
            float r2 = r4.f
            float r3 = r4.g
            float r0 = (float) r0
            float r0 = r0 * r3
            float r0 = r0 + r2
            com.android.ex.photo.views.PhotoView r1 = r4.f1179a
            float r2 = r4.f1180b
            float r3 = r4.c
            com.android.ex.photo.views.PhotoView.a(r1, r0, r2, r3)
            float r1 = r4.e
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto L2d
            boolean r1 = r4.d
            float r2 = r4.e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L45
            r0 = 1
        L2b:
            if (r1 != r0) goto L3b
        L2d:
            com.android.ex.photo.views.PhotoView r0 = r4.f1179a
            float r1 = r4.e
            float r2 = r4.f1180b
            float r3 = r4.c
            com.android.ex.photo.views.PhotoView.a(r0, r1, r2, r3)
            r4.a()
        L3b:
            boolean r0 = r4.j
            if (r0 != 0) goto L4
            com.android.ex.photo.views.PhotoView r0 = r4.f1179a
            r0.post(r4)
            goto L4
        L45:
            r0 = 0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ex.photo.views.c.run():void");
    }
}
