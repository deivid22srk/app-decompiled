package com.google.android.finsky.k;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
import android.view.View;

/* loaded from: classes.dex */
final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f2912a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TransitionValues f2913b;
    final /* synthetic */ h c;

    i(h hVar, View view, TransitionValues transitionValues) {
        this.c = hVar;
        this.f2912a = view;
        this.f2913b = transitionValues;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2912a.setTranslationZ(((Integer) this.f2913b.values.get("pageFade:translationZ")).intValue());
    }
}
