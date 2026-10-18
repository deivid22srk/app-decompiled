package android.support.v4.widget;

import android.view.animation.Animation;

/* loaded from: classes.dex */
final class bl implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SwipeRefreshLayout f443a;

    bl(SwipeRefreshLayout swipeRefreshLayout) {
        this.f443a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        boolean z;
        z = this.f443a.v;
        if (!z) {
            this.f443a.a((Animation.AnimationListener) null);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
