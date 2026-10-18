package com.google.android.wallet.ui.common;

import android.view.animation.Animation;

/* loaded from: classes2.dex */
final class bl implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f7513a;

    bl(Runnable runnable) {
        this.f7513a = runnable;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f7513a.run();
    }
}
