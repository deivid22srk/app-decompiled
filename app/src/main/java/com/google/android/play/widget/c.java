package com.google.android.play.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    boolean f7094a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ScalingPageIndicator f7095b;

    public c(ScalingPageIndicator scalingPageIndicator) {
        this.f7095b = scalingPageIndicator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f7094a = true;
        super.onAnimationCancel(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        List list;
        int i;
        Animator animator2;
        super.onAnimationEnd(animator);
        if (!this.f7094a) {
            i = this.f7095b.c;
            if (i < 40) {
                animator2 = this.f7095b.f7088a;
                if (animator2 != null) {
                    ScalingPageIndicator.d(this.f7095b);
                    animator.setStartDelay(200L);
                    animator.start();
                    return;
                }
                return;
            }
        }
        int i2 = 0;
        while (i2 < this.f7095b.getChildCount()) {
            ImageView imageView = (ImageView) this.f7095b.getChildAt(i2);
            if (imageView != null) {
                this.f7095b.a(imageView, i2 == this.f7095b.getSelectedPage(), true, i2);
            }
            i2++;
        }
        list = this.f7095b.d;
        list.clear();
    }
}
