package com.android.ex.photo.views;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final PhotoView f1181a;

    /* renamed from: b, reason: collision with root package name */
    float f1182b;
    float c;
    long d = -1;
    boolean e;
    boolean f;

    public d(PhotoView photoView) {
        this.f1181a = photoView;
    }

    public final void a() {
        this.e = false;
        this.f = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            r8 = -1
            r7 = 1092616192(0x41200000, float:10.0)
            r6 = 1120403456(0x42c80000, float:100.0)
            r1 = 0
            boolean r0 = r11.f
            if (r0 == 0) goto Lc
        Lb:
            return
        Lc:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r11.d
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 == 0) goto L58
            long r4 = r11.d
            long r4 = r2 - r4
            float r0 = (float) r4
        L1b:
            long r4 = r11.d
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L23
            r11.d = r2
        L23:
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 < 0) goto L5a
            float r0 = r11.f1182b
        L29:
            float r2 = r11.c
            r10 = r2
            r2 = r0
            r0 = r10
        L2e:
            com.android.ex.photo.views.PhotoView r3 = r11.f1181a
            com.android.ex.photo.views.PhotoView.a(r3, r2, r0)
            float r3 = r11.f1182b
            float r2 = r3 - r2
            r11.f1182b = r2
            float r2 = r11.c
            float r0 = r2 - r0
            r11.c = r0
            float r0 = r11.f1182b
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L4e
            float r0 = r11.c
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L4e
            r11.a()
        L4e:
            boolean r0 = r11.f
            if (r0 != 0) goto Lb
            com.android.ex.photo.views.PhotoView r0 = r11.f1181a
            r0.post(r11)
            goto Lb
        L58:
            r0 = r1
            goto L1b
        L5a:
            float r2 = r11.f1182b
            float r3 = r6 - r0
            float r2 = r2 / r3
            float r2 = r2 * r7
            float r3 = r11.c
            float r0 = r6 - r0
            float r0 = r3 / r0
            float r3 = r0 * r7
            float r0 = java.lang.Math.abs(r2)
            float r4 = r11.f1182b
            float r4 = java.lang.Math.abs(r4)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L7c
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 == 0) goto L95
        L7c:
            float r0 = r11.f1182b
        L7e:
            float r2 = java.lang.Math.abs(r3)
            float r4 = r11.c
            float r4 = java.lang.Math.abs(r4)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L29
            boolean r2 = java.lang.Float.isNaN(r3)
            if (r2 != 0) goto L29
            r2 = r0
            r0 = r3
            goto L2e
        L95:
            r0 = r2
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ex.photo.views.d.run():void");
    }
}
