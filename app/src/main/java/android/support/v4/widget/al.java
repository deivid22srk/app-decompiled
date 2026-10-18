package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
final class al extends Animation {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ao f423a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ak f424b;

    al(ak akVar, ao aoVar) {
        this.f424b = akVar;
        this.f423a = aoVar;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        float b2;
        float f2;
        Interpolator interpolator;
        Interpolator interpolator2;
        if (!this.f424b.f422b) {
            b2 = ak.b(this.f423a);
            float f3 = this.f423a.l;
            float f4 = this.f423a.k;
            float f5 = this.f423a.m;
            ak.c(f, this.f423a);
            if (f <= 0.5f) {
                interpolator2 = ak.d;
                this.f423a.a(f4 + (interpolator2.getInterpolation(f / 0.5f) * (0.8f - b2)));
            }
            if (f > 0.5f) {
                interpolator = ak.d;
                this.f423a.b(((0.8f - b2) * interpolator.getInterpolation((f - 0.5f) / 0.5f)) + f3);
            }
            this.f423a.c((0.25f * f) + f5);
            f2 = this.f424b.k;
            this.f424b.c((216.0f * f) + (1080.0f * (f2 / 5.0f)));
            return;
        }
        ak.a(f, this.f423a);
    }
}
