package com.google.android.wallet.ui.expander;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes2.dex */
final class f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f7549a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f7550b;

    f(d dVar, View view) {
        this.f7550b = dVar;
        this.f7549a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7549a.setAlpha(1.0f);
        this.f7549a.setTranslationY(0.0f);
        animator.removeListener(this);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f7549a.setAlpha(1.0f);
        this.f7549a.setTranslationY(0.0f);
        animator.removeListener(this);
    }
}
