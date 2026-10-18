package com.google.android.play.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class d extends Animation {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f7096a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ScalingPageIndicator f7097b;

    public d(ScalingPageIndicator scalingPageIndicator, int i) {
        this.f7097b = scalingPageIndicator;
        this.f7096a = i;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        this.f7097b.setSelectedPage((int) (this.f7096a * f));
    }
}
