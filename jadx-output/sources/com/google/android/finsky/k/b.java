package com.google.android.finsky.k;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f2900a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f2901b;
    final /* synthetic */ View c;
    final /* synthetic */ int d;
    final /* synthetic */ a e;

    b(a aVar, View view, View view2, View view3, int i) {
        this.e = aVar;
        this.f2900a = view;
        this.f2901b = view2;
        this.c = view3;
        this.d = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2900a.setVisibility(4);
        this.f2901b.setVisibility(4);
        this.c.setVisibility(0);
        int x = (int) (this.f2901b.getX() + (this.f2901b.getWidth() / 2));
        int y = (int) (this.f2901b.getY() + (this.f2901b.getHeight() / 2));
        this.c.setTranslationX(x - this.d);
        this.c.setTranslationY(y - this.d);
    }
}
