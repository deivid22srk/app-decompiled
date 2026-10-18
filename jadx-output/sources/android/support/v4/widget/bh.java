package android.support.v4.widget;

import android.view.animation.Animation;

/* loaded from: classes.dex */
final class bh implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SwipeRefreshLayout f438a;

    bh(SwipeRefreshLayout swipeRefreshLayout) {
        this.f438a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        boolean z;
        ak akVar;
        ak akVar2;
        boolean z2;
        d dVar;
        bp bpVar;
        bp unused;
        z = this.f438a.f413a;
        if (z) {
            akVar = this.f438a.C;
            akVar.setAlpha(255);
            akVar2 = this.f438a.C;
            akVar2.start();
            z2 = this.f438a.J;
            if (z2) {
                bpVar = this.f438a.f;
                if (bpVar != null) {
                    unused = this.f438a.f;
                }
            }
            SwipeRefreshLayout swipeRefreshLayout = this.f438a;
            dVar = this.f438a.z;
            swipeRefreshLayout.p = dVar.getTop();
            return;
        }
        this.f438a.a();
    }
}
