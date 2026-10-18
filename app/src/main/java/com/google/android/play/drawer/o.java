package com.google.android.play.drawer;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
final class o implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f6871a;

    o(n nVar) {
        this.f6871a = nVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6871a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
