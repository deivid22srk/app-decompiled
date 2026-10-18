package com.google.android.play.search;

import android.view.View;
import android.view.animation.Animation;

/* loaded from: classes.dex */
final class j implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f7044a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PlaySearch f7045b;

    j(PlaySearch playSearch, boolean z) {
        this.f7045b = playSearch;
        this.f7044a = z;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        View view;
        if (!this.f7044a) {
            view = this.f7045b.h;
            view.setVisibility(8);
        }
    }
}
