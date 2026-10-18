package com.google.android.finsky.k;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* loaded from: classes.dex */
final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f2902a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f2903b;
    final /* synthetic */ View c;
    final /* synthetic */ ViewGroup d;
    final /* synthetic */ View e;
    final /* synthetic */ View f;
    final /* synthetic */ a g;

    c(a aVar, View view, View view2, View view3, ViewGroup viewGroup, View view4, View view5) {
        this.g = aVar;
        this.f2902a = view;
        this.f2903b = view2;
        this.c = view3;
        this.d = viewGroup;
        this.e = view4;
        this.f = view5;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2902a.setVisibility(4);
        this.f2903b.setAlpha(1.0f);
        this.c.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroupOverlay overlay = this.d.getOverlay();
        overlay.remove(this.e);
        overlay.remove(this.f2902a);
        overlay.remove(this.f);
        overlay.remove(this.c);
    }
}
