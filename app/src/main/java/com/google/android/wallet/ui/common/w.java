package com.google.android.wallet.ui.common;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
final class w implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FocusedViewToTopScrollView f7530a;

    w(FocusedViewToTopScrollView focusedViewToTopScrollView) {
        this.f7530a = focusedViewToTopScrollView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        FocusedViewToTopScrollView.a(this.f7530a, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
