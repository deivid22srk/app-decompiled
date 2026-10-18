package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
final class bj extends Animation {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SwipeRefreshLayout f440a;

    bj(SwipeRefreshLayout swipeRefreshLayout) {
        this.f440a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.f440a.setAnimationProgress(1.0f - f);
    }
}
