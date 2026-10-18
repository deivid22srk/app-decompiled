package android.support.design.widget;

import android.view.animation.Animation;

/* loaded from: classes.dex */
final class as implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Snackbar f93a;

    as(Snackbar snackbar) {
        this.f93a = snackbar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Snackbar.f(this.f93a);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
