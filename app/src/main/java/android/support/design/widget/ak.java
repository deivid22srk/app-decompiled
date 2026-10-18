package android.support.design.widget;

import android.view.animation.Animation;

/* loaded from: classes.dex */
final class ak implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f83a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Snackbar f84b;

    ak(Snackbar snackbar, int i) {
        this.f84b = snackbar;
        this.f83a = i;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f84b.c();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
