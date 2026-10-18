package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
final class bo extends Animation {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SwipeRefreshLayout f446a;

    bo(SwipeRefreshLayout swipeRefreshLayout) {
        this.f446a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        float f2;
        float f3;
        f2 = this.f446a.B;
        f3 = this.f446a.B;
        this.f446a.setAnimationProgress(f2 + ((-f3) * f));
        r0.a((r0.f414b + ((int) ((r0.c - r0.f414b) * f))) - this.f446a.z.getTop(), false);
    }
}
