package android.support.v4.view.b;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
abstract class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f345a;

    /* renamed from: b, reason: collision with root package name */
    private final float f346b;

    public d(float[] fArr) {
        this.f345a = fArr;
        this.f346b = 1.0f / (this.f345a.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) ((this.f345a.length - 1) * f), this.f345a.length - 2);
        return ((this.f345a[min + 1] - this.f345a[min]) * ((f - (min * this.f346b)) / this.f346b)) + this.f345a[min];
    }
}
