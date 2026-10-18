package android.support.v4.view.b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class e implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f347a;

    /* renamed from: b, reason: collision with root package name */
    private final float[] f348b;

    public e(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.f347a = new float[i];
        this.f348b = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((i2 * length) / (i - 1), fArr, null);
            this.f347a[i2] = fArr[0];
            this.f348b[i2] = fArr[1];
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.f347a.length - 1;
        int i = 0;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f347a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f2 = this.f347a[length] - this.f347a[i];
        if (f2 == 0.0f) {
            return this.f348b[i];
        }
        float f3 = (f - this.f347a[i]) / f2;
        float f4 = this.f348b[i];
        return (f3 * (this.f348b[length] - f4)) + f4;
    }
}
