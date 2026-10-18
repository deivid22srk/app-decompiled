package com.google.android.finsky.k;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f2914a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TransitionValues f2915b;
    final /* synthetic */ ViewGroup c;
    final /* synthetic */ View d;
    final /* synthetic */ h e;

    j(h hVar, View view, TransitionValues transitionValues, ViewGroup viewGroup, View view2) {
        this.e = hVar;
        this.f2914a = view;
        this.f2915b = transitionValues;
        this.c = viewGroup;
        this.d = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2914a.setTranslationZ(((Integer) this.f2915b.values.get("pageFade:translationZ")).intValue());
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.getOverlay().remove(this.d);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.c.getOverlay().remove(this.d);
    }
}
