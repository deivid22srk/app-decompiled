package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
final class ac extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f76a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ af f77b = null;
    final /* synthetic */ aa c;

    ac(aa aaVar, boolean z, af afVar) {
        this.c = aaVar;
        this.f76a = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.c.k.a(0, this.f76a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
