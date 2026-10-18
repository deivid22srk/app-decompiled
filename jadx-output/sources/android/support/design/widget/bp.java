package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
final class bp extends bn {

    /* renamed from: a, reason: collision with root package name */
    private static final Handler f117a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private long f118b;
    private boolean c;
    private Interpolator g;
    private bo h;
    private float i;
    private final int[] d = new int[2];
    private final float[] e = new float[2];
    private int f = 200;
    private final Runnable j = new bq(this);

    /* JADX WARN: Type inference failed for: r0v3, types: [android.support.design.widget.bq, java.lang.Runnable] */
    bp() {
    }

    @Override // android.support.design.widget.bn
    public final void a() {
        if (!this.c) {
            if (this.g == null) {
                this.g = new AccelerateDecelerateInterpolator();
            }
            this.f118b = SystemClock.uptimeMillis();
            this.c = true;
            f117a.postDelayed(this.j, 10L);
        }
    }

    @Override // android.support.design.widget.bn
    public final boolean b() {
        return this.c;
    }

    @Override // android.support.design.widget.bn
    public final void a(Interpolator interpolator) {
        this.g = interpolator;
    }

    @Override // android.support.design.widget.bn
    public final void a(bo boVar) {
        this.h = boVar;
    }

    @Override // android.support.design.widget.bn
    public final void a(float f, float f2) {
        this.e[0] = f;
        this.e[1] = f2;
    }

    @Override // android.support.design.widget.bn
    public final float c() {
        return a.a(this.e[0], this.e[1], this.i);
    }

    @Override // android.support.design.widget.bn
    public final void d() {
        this.c = false;
        f117a.removeCallbacks(this.j);
    }
}
