package android.support.design.widget;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
final class bs implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bo f121a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ br f122b;

    bs(br brVar, bo boVar) {
        this.f122b = brVar;
        this.f121a = boVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f121a.a();
    }
}
