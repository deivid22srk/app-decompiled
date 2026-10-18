package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    private static final int r = ViewConfiguration.getTapTimeout();
    private final View c;
    private Runnable d;
    private int g;
    private int h;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;

    /* renamed from: a, reason: collision with root package name */
    private final b f415a = new b();

    /* renamed from: b, reason: collision with root package name */
    private final Interpolator f416b = new AccelerateInterpolator();
    private float[] e = {0.0f, 0.0f};
    private float[] f = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] i = {0.0f, 0.0f};
    private float[] j = {0.0f, 0.0f};
    private float[] k = {Float.MAX_VALUE, Float.MAX_VALUE};

    public abstract void a(int i);

    public abstract boolean b(int i);

    static /* synthetic */ boolean c(a aVar) {
        aVar.m = false;
        return false;
    }

    static /* synthetic */ boolean f(a aVar) {
        aVar.o = false;
        return false;
    }

    static /* synthetic */ boolean h(a aVar) {
        aVar.n = false;
        return false;
    }

    public a(View view) {
        this.c = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((1575.0f * displayMetrics.density) + 0.5f);
        int i2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        float f = i;
        this.k[0] = f / 1000.0f;
        this.k[1] = f / 1000.0f;
        float f2 = i2;
        this.j[0] = f2 / 1000.0f;
        this.j[1] = f2 / 1000.0f;
        this.g = 1;
        this.f[0] = Float.MAX_VALUE;
        this.f[1] = Float.MAX_VALUE;
        this.e[0] = 0.2f;
        this.e[1] = 0.2f;
        this.i[0] = 0.001f;
        this.i[1] = 0.001f;
        this.h = r;
        this.f415a.f432a = 500;
        this.f415a.f433b = 500;
    }

    public final a a(boolean z) {
        if (this.p && !z) {
            b();
        }
        this.p = z;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            boolean r2 = r6.p
            if (r2 != 0) goto L7
        L6:
            return r0
        L7:
            int r2 = android.support.v4.view.bc.a(r8)
            switch(r2) {
                case 0: goto L18;
                case 1: goto L7e;
                case 2: goto L1c;
                case 3: goto L7e;
                default: goto Le;
            }
        Le:
            boolean r2 = r6.q
            if (r2 == 0) goto L6
            boolean r2 = r6.o
            if (r2 == 0) goto L6
            r0 = r1
            goto L6
        L18:
            r6.n = r1
            r6.l = r0
        L1c:
            float r2 = r8.getX()
            int r3 = r7.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r6.c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r2 = r6.a(r0, r2, r3, r4)
            float r3 = r8.getY()
            int r4 = r7.getHeight()
            float r4 = (float) r4
            android.view.View r5 = r6.c
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r3 = r6.a(r1, r3, r4, r5)
            android.support.v4.widget.b r4 = r6.f415a
            r4.c = r2
            r4.d = r3
            boolean r2 = r6.o
            if (r2 != 0) goto Le
            boolean r2 = r6.a()
            if (r2 == 0) goto Le
            java.lang.Runnable r2 = r6.d
            if (r2 != 0) goto L5f
            android.support.v4.widget.c r2 = new android.support.v4.widget.c
            r2.<init>(r6, r0)
            r6.d = r2
        L5f:
            r6.o = r1
            r6.m = r1
            boolean r2 = r6.l
            if (r2 != 0) goto L78
            int r2 = r6.h
            if (r2 <= 0) goto L78
            android.view.View r2 = r6.c
            java.lang.Runnable r3 = r6.d
            int r4 = r6.h
            long r4 = (long) r4
            android.support.v4.view.by.a(r2, r3, r4)
        L75:
            r6.l = r1
            goto Le
        L78:
            java.lang.Runnable r2 = r6.d
            r2.run()
            goto L75
        L7e:
            r6.b()
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        b bVar = this.f415a;
        int abs = (int) (bVar.d / Math.abs(bVar.d));
        int abs2 = (int) (bVar.c / Math.abs(bVar.c));
        if (abs != 0 && b(abs)) {
            return true;
        }
        if (abs2 != 0) {
        }
        return false;
    }

    private void b() {
        if (this.m) {
            this.o = false;
            return;
        }
        b bVar = this.f415a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i = (int) (currentAnimationTimeMillis - bVar.e);
        int i2 = bVar.f433b;
        if (i <= i2) {
            i2 = i < 0 ? 0 : i;
        }
        bVar.k = i2;
        bVar.j = bVar.a(currentAnimationTimeMillis);
        bVar.i = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float a(int r6, float r7, float r8, float r9) {
        /*
            r5 = this;
            r1 = 0
            float[] r0 = r5.e
            r0 = r0[r6]
            float[] r2 = r5.f
            r2 = r2[r6]
            float r0 = r0 * r8
            float r0 = a(r0, r1, r2)
            float r2 = r5.a(r7, r0)
            float r3 = r8 - r7
            float r0 = r5.a(r3, r0)
            float r0 = r0 - r2
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L33
            android.view.animation.Interpolator r2 = r5.f416b
            float r0 = -r0
            float r0 = r2.getInterpolation(r0)
            float r0 = -r0
        L25:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = a(r0, r2, r3)
        L2d:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L40
            r0 = r1
        L32:
            return r0
        L33:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L3e
            android.view.animation.Interpolator r2 = r5.f416b
            float r0 = r2.getInterpolation(r0)
            goto L25
        L3e:
            r0 = r1
            goto L2d
        L40:
            float[] r2 = r5.i
            r2 = r2[r6]
            float[] r3 = r5.j
            r3 = r3[r6]
            float[] r4 = r5.k
            r4 = r4[r6]
            float r2 = r2 * r9
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L57
            float r0 = r0 * r2
            float r0 = a(r0, r3, r4)
            goto L32
        L57:
            float r0 = -r0
            float r0 = r0 * r2
            float r0 = a(r0, r3, r4)
            float r0 = -r0
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.a.a(int, float, float, float):float");
    }

    private float a(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.g) {
            case 0:
            case 1:
                if (f < f2) {
                    if (f < 0.0f) {
                        if (this.o && this.g == 1) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                break;
            case 2:
                if (f < 0.0f) {
                    break;
                }
                break;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float a(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    static /* synthetic */ void i(a aVar) {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        aVar.c.onTouchEvent(obtain);
        obtain.recycle();
    }
}
