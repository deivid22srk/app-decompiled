package com.google.android.finsky.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
final class ac extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f3108a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ControlsContainerBackground f3109b;

    ac(ControlsContainerBackground controlsContainerBackground, View view) {
        this.f3109b = controlsContainerBackground;
        this.f3108a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3109b.removeView(this.f3108a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3109b.removeView(this.f3108a);
    }
}
