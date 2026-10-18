package com.google.android.play.image;

import android.view.animation.Animation;

/* loaded from: classes.dex */
final class q implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FifeImageView f6948a;

    q(FifeImageView fifeImageView) {
        this.f6948a = fifeImageView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f6948a.b();
    }
}
