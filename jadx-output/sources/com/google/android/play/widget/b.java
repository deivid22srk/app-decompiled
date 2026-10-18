package com.google.android.play.widget;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f7092a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ScalingPageIndicator f7093b;

    b(ScalingPageIndicator scalingPageIndicator, View view) {
        this.f7093b = scalingPageIndicator;
        this.f7092a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f7092a.setScaleX(floatValue);
        this.f7092a.setScaleY(floatValue);
    }
}
