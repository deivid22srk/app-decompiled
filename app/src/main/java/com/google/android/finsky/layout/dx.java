package com.google.android.finsky.layout;

import android.view.animation.Animation;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
final class dx implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ScreenshotView f3245a;

    private dx(ScreenshotView screenshotView) {
        this.f3245a = screenshotView;
    }

    /* synthetic */ dx(ScreenshotView screenshotView, byte b2) {
        this(screenshotView);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ProgressBar progressBar;
        progressBar = this.f3245a.f3075b;
        progressBar.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
