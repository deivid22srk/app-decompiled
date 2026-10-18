package com.google.android.play.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlaySearch f7043a;

    i(PlaySearch playSearch) {
        this.f7043a = playSearch;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        super.onAnimationEnd(animator);
        this.f7043a.setVisibility(4);
        view = this.f7043a.h;
        view.setVisibility(8);
    }
}
