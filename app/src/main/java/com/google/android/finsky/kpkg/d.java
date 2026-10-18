package com.google.android.finsky.kpkg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2905b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;
    public final /* synthetic */ View e;
    public final /* synthetic */ a f;

    d(a aVar, ViewGroup viewGroup, View view, View view2, View view3, View view4) {
        this.f = aVar;
        this.f2904a = viewGroup;
        this.f2905b = view;
        this.c = view2;
        this.d = view3;
        this.e = view4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ViewGroupOverlay overlay = this.f2904a.getOverlay();
        overlay.remove(this.f2905b);
        overlay.remove(this.c);
        overlay.remove(this.d);
        overlay.remove(this.e);
    }
}
