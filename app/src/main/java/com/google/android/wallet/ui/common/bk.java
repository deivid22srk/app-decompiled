package com.google.android.wallet.ui.common;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes2.dex */
final class bk extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f7511a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f7512b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;

    bk(Runnable runnable, View view, long j, long j2) {
        this.f7511a = runnable;
        this.f7512b = view;
        this.c = j;
        this.d = j2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View findFocus;
        if (this.f7511a != null) {
            this.f7511a.run();
        }
        if (Boolean.TRUE == this.f7512b.getTag(com.google.android.wallet.e.g.view_is_animating_downwards) && (findFocus = this.f7512b.findFocus()) != null) {
            Rect rect = new Rect();
            findFocus.getDrawingRect(rect);
            findFocus.requestRectangleOnScreen(rect);
        }
        a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        a();
    }

    private void a() {
        ViewPropertyAnimator listener = this.f7512b.animate().setListener(null);
        if (this.c >= 0) {
            listener.setDuration(this.d);
        }
        this.f7512b.setTag(com.google.android.wallet.e.g.view_is_animating_downwards, null);
    }
}
