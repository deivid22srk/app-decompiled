package com.google.android.play.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f7040a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PlaySearch f7041b;

    g(PlaySearch playSearch, Runnable runnable) {
        this.f7041b = playSearch;
        this.f7040a = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.f7040a != null) {
            this.f7040a.run();
        }
    }
}
