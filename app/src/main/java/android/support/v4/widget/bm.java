package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
final class bm extends Animation {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SwipeRefreshLayout f444a;

    bm(SwipeRefreshLayout swipeRefreshLayout) {
        this.f444a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        boolean z;
        float f2;
        int i;
        d dVar;
        ak akVar;
        float f3;
        z = this.f444a.M;
        if (!z) {
            f3 = this.f444a.I;
            i = (int) (f3 - Math.abs(this.f444a.c));
        } else {
            f2 = this.f444a.I;
            i = (int) f2;
        }
        int i2 = ((int) ((i - this.f444a.f414b) * f)) + this.f444a.f414b;
        dVar = this.f444a.z;
        this.f444a.a(i2 - dVar.getTop(), false);
        akVar = this.f444a.C;
        akVar.a(1.0f - f);
    }
}
