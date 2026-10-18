package android.support.v7.widget;

import android.view.animation.Animation;

/* loaded from: classes.dex */
final class fr implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f825a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ SwitchCompat f826b;

    fr(SwitchCompat switchCompat, boolean z) {
        this.f826b = switchCompat;
        this.f825a = z;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        fs fsVar;
        fsVar = this.f826b.C;
        if (fsVar == animation) {
            this.f826b.setThumbPosition(this.f825a ? 1.0f : 0.0f);
            SwitchCompat.b(this.f826b);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
