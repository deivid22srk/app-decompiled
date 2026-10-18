package com.google.android.finsky.layout.play;

import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;

/* loaded from: classes.dex */
final class bp extends TranslateAnimation {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f3446a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PlayCardRateAndSuggestContentScroller f3447b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bp(PlayCardRateAndSuggestContentScroller playCardRateAndSuggestContentScroller, float f, int i) {
        super(0.0f, 0.0f, f, 0.0f);
        this.f3447b = playCardRateAndSuggestContentScroller;
        this.f3446a = i;
    }

    @Override // android.view.animation.TranslateAnimation, android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        this.f3447b.scrollTo((int) (this.f3446a * f), 0);
    }
}
