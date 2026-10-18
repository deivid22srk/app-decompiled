package com.google.android.play.b;

import android.view.animation.Animation;

/* loaded from: classes.dex */
final class b implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ float f6814a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f6815b;

    b(a aVar, float f) {
        this.f6815b = aVar;
        this.f6814a = f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f6815b.f6813b = this.f6814a;
    }
}
