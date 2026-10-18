package com.google.android.wallet.ui.expander;

import android.annotation.TargetApi;
import android.transition.Transition;

@TargetApi(19)
/* loaded from: classes2.dex */
final class b implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f7546a;

    private b(a aVar) {
        this.f7546a = aVar;
    }

    /* synthetic */ b(a aVar, byte b2) {
        this(aVar);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.f7546a.n();
        this.f7546a.f(true);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
