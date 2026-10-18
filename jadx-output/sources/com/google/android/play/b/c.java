package com.google.android.play.b;

import android.view.animation.Animation;

/* loaded from: classes.dex */
public final class c implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ float f6816a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f6817b;

    public c(a aVar, float f) {
        this.f6817b = aVar;
        this.f6816a = f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f6817b.d = this.f6816a;
    }
}
