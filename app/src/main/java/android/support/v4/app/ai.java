package android.support.v4.app;

import android.view.View;
import android.view.animation.Animation;

/* loaded from: classes.dex */
final class ai extends aj {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Fragment f172a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ad f173b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(ad adVar, View view, Animation animation, Fragment fragment) {
        super(view, animation);
        this.f173b = adVar;
        this.f172a = fragment;
    }

    @Override // android.support.v4.app.aj, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        super.onAnimationEnd(animation);
        if (this.f172a.l != null) {
            this.f172a.l = null;
            this.f173b.a(this.f172a, this.f172a.m, 0, 0, false);
        }
    }
}
