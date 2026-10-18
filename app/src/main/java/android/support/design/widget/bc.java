package android.support.design.widget;

import android.view.animation.Animation;

/* loaded from: classes.dex */
final class bc implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bb f104a;

    bc(bb bbVar) {
        this.f104a = bbVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.f104a.c != animation) {
            return;
        }
        this.f104a.c = null;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
