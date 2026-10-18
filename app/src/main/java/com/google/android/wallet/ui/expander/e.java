package com.google.android.wallet.ui.expander;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes2.dex */
final class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f7547a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f7548b;
    final /* synthetic */ d c;

    e(d dVar, View view, int i) {
        this.c = dVar;
        this.f7547a = view;
        this.f7548b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7547a.setVisibility(this.f7548b);
        animator.removeListener(this);
    }
}
