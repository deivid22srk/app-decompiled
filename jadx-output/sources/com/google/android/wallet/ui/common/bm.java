package com.google.android.wallet.ui.common;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes2.dex */
final class bm extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f7514a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f7515b;

    bm(View view, int i) {
        this.f7514a = view;
        this.f7515b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        bj.c(this.f7514a, true);
        this.f7514a.setVisibility(this.f7515b);
        this.f7514a.setAlpha(1.0f);
        this.f7514a.animate().setListener(null);
    }
}
