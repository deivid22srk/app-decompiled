package com.google.android.finsky.utils.hats;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
final class c implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f4937a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ HappinessSurveyController f4938b;

    c(HappinessSurveyController happinessSurveyController, View view) {
        this.f4938b = happinessSurveyController;
        this.f4937a = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        viewGroup = this.f4938b.d;
        viewGroup.removeView(this.f4937a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ViewGroup viewGroup;
        viewGroup = this.f4938b.d;
        viewGroup.removeView(this.f4937a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
