package com.google.android.finsky.detailspage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
final class ab extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aa f2529a;

    ab(aa aaVar) {
        this.f2529a = aaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2529a.f2528a.ai != null) {
            this.f2529a.f2528a.ai.setClipChildren(true);
        }
    }
}
