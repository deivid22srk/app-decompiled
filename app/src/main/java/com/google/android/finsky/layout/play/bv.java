package com.google.android.finsky.layout.play;

import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;

/* loaded from: classes.dex */
final class bv implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayCardViewRate f3456a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PlayCardRateClusterView f3457b;

    bv(PlayCardRateClusterView playCardRateClusterView, PlayCardViewRate playCardViewRate) {
        this.f3457b = playCardRateClusterView;
        this.f3456a = playCardViewRate;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        new Handler(Looper.myLooper()).postDelayed(new bw(this), 50L);
    }
}
