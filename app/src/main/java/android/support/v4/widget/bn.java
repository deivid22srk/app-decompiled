package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
final class bn extends Animation {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SwipeRefreshLayout f445a;

    bn(SwipeRefreshLayout swipeRefreshLayout) {
        this.f445a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        r0.a((r0.f414b + ((int) ((r0.c - r0.f414b) * f))) - this.f445a.z.getTop(), false);
    }
}
