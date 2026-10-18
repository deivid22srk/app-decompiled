package com.google.android.finsky.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
final class f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AddressFieldsLayoutHoneycomb f3278a;

    f(AddressFieldsLayoutHoneycomb addressFieldsLayoutHoneycomb) {
        this.f3278a = addressFieldsLayoutHoneycomb;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3278a.c.setVisibility(8);
        this.f3278a.c.animate().setListener(null);
    }
}
