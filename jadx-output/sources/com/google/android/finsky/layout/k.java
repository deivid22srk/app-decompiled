package com.google.android.finsky.layout;

import android.view.animation.Animation;
import android.widget.ImageView;

/* loaded from: classes.dex */
final class k implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AppScreenshot f3285a;

    private k(AppScreenshot appScreenshot) {
        this.f3285a = appScreenshot;
    }

    /* synthetic */ k(AppScreenshot appScreenshot, byte b2) {
        this(appScreenshot);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ImageView imageView;
        imageView = this.f3285a.c;
        imageView.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
