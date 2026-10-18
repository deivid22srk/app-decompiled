package android.support.v4.app;

import android.view.View;
import android.view.animation.Animation;

/* loaded from: classes.dex */
class aj implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    private Animation.AnimationListener f174a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f175b;
    private View c;

    public aj(View view, Animation animation) {
        this.f174a = null;
        this.f175b = false;
        this.c = null;
        if (view != null && animation != null) {
            this.c = view;
        }
    }

    public aj(View view, Animation animation, Animation.AnimationListener animationListener) {
        this.f174a = null;
        this.f175b = false;
        this.c = null;
        if (view != null && animation != null) {
            this.f174a = animationListener;
            this.c = view;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        if (this.c != null) {
            this.f175b = ad.a(this.c, animation);
            if (this.f175b) {
                this.c.post(new ak(this));
            }
        }
        if (this.f174a != null) {
            this.f174a.onAnimationStart(animation);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        if (this.c != null && this.f175b) {
            this.c.post(new al(this));
        }
        if (this.f174a != null) {
            this.f174a.onAnimationEnd(animation);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        if (this.f174a != null) {
            this.f174a.onAnimationRepeat(animation);
        }
    }
}
