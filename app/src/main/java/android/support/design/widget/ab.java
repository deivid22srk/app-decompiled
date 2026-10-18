package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
final class ab extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f74a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ af f75b = null;
    final /* synthetic */ aa c;
    private boolean d;

    ab(aa aaVar, boolean z, af afVar) {
        this.c = aaVar;
        this.f74a = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.c.n = true;
        this.d = false;
        this.c.k.a(0, this.f74a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.c.n = false;
        this.d = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.n = false;
        if (!this.d) {
            this.c.k.a(8, this.f74a);
        }
    }
}
