package com.google.android.finsky.utils.hats;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f4943a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f4944b;

    g(e eVar, View view) {
        this.f4944b = eVar;
        this.f4943a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f4943a.setVisibility(8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f4943a.setVisibility(8);
    }
}
