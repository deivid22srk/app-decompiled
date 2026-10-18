package android.support.v4.widget;

import android.view.animation.Animation;

/* loaded from: classes.dex */
final class am implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ao f425a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ak f426b;

    am(ak akVar, ao aoVar) {
        this.f426b = akVar;
        this.f425a = aoVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.f426b.k = 0.0f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        float f;
        this.f425a.b();
        ao aoVar = this.f425a;
        aoVar.a(aoVar.a());
        this.f425a.a(this.f425a.e);
        if (this.f426b.f422b) {
            this.f426b.f422b = false;
            animation.setDuration(1332L);
            this.f425a.a(false);
        } else {
            ak akVar = this.f426b;
            f = this.f426b.k;
            akVar.k = (f + 1.0f) % 5.0f;
        }
    }
}
