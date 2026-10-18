package android.support.v4.view;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
final class en implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ eq f390a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f391b;

    en(eq eqVar, View view) {
        this.f390a = eqVar;
        this.f391b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f390a.a();
    }
}
