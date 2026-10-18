package com.google.android.finsky.k;

import android.animation.Animator;

/* loaded from: classes.dex */
final class g implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    private final Animator f2908a;

    /* renamed from: b, reason: collision with root package name */
    private final Animator.AnimatorListener f2909b;

    public g(Animator animator, Animator.AnimatorListener animatorListener) {
        this.f2908a = animator;
        this.f2909b = animatorListener;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2909b.onAnimationStart(this.f2908a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2909b.onAnimationEnd(this.f2908a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2909b.onAnimationCancel(this.f2908a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        this.f2909b.onAnimationRepeat(this.f2908a);
    }
}
