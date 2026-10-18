package com.google.android.finsky.detailspage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.transition.Transition;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class aa extends com.google.android.play.d.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f2528a;

    aa(z zVar) {
        this.f2528a = zVar;
    }

    @Override // com.google.android.play.d.a, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        Bitmap bitmap;
        int i;
        int i2;
        int i3;
        int i4;
        Interpolator interpolator;
        Bitmap bitmap2;
        if (this.f2528a.R != null) {
            bitmap = this.f2528a.aC;
            if (bitmap != null && !TextUtils.isEmpty(this.f2528a.am)) {
                z zVar = this.f2528a;
                bitmap2 = this.f2528a.aC;
                z.a(zVar, bitmap2);
            }
            Drawable b2 = z.b(this.f2528a);
            if (b2 != null) {
                b2.setAlpha(0);
            }
            if (this.f2528a.aj != null) {
                this.f2528a.aj.a();
            }
            Iterator it = z.c(this.f2528a).iterator();
            while (it.hasNext()) {
                ((View) it.next()).setAlpha(0.0f);
            }
            if (this.f2528a.aj != null && !TextUtils.isEmpty(this.f2528a.am)) {
                int measuredWidth = this.f2528a.aj.getMeasuredWidth();
                int measuredHeight = this.f2528a.aj.getMeasuredHeight();
                this.f2528a.ai.setClipChildren(false);
                i = this.f2528a.aF;
                i2 = this.f2528a.aH;
                int i5 = (i + (i2 / 2)) - (measuredWidth / 2);
                i3 = this.f2528a.aE;
                i4 = this.f2528a.aG;
                int i6 = i3 - ((measuredHeight - i4) / 2);
                this.f2528a.aj.setTranslationX(i5);
                this.f2528a.aj.setTranslationY(i6);
                AnimatorSet animatorSet = new AnimatorSet();
                interpolator = this.f2528a.aB;
                animatorSet.setInterpolator(interpolator);
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f2528a.aj, "translationX", i5, 0.0f), ObjectAnimator.ofFloat(this.f2528a.aj, "translationY", i6, 0.0f));
                animatorSet.addListener(new ab(this));
                animatorSet.setDuration(400L);
                animatorSet.start();
                ViewAnimationUtils.createCircularReveal(this.f2528a.aj, measuredWidth / 2, measuredHeight / 2, 0.0f, ((float) Math.sqrt((measuredWidth * measuredWidth) + (measuredHeight * measuredHeight))) * 0.5f).setDuration(400L).start();
            }
        }
    }

    @Override // com.google.android.play.d.a, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        if (((ViewGroup) this.f2528a.R) != null && this.f2528a.ak != null) {
            z.i(this.f2528a);
            if (this.f2528a.aj != null) {
                this.f2528a.aj.b();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            for (View view : z.c(this.f2528a)) {
                arrayList.add(com.google.android.finsky.utils.et.a(view, view.getAlpha(), 400L));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.start();
            this.f2528a.an = false;
            for (int i = 0; i < this.f2528a.g.size(); i++) {
                bd bdVar = this.f2528a.g.get(i);
                if (this.f2528a.b(bdVar) && !this.f2528a.h.contains(bdVar)) {
                    this.f2528a.c(bdVar);
                }
            }
            Drawable b2 = z.b(this.f2528a);
            if (b2 != null) {
                ObjectAnimator.ofInt(b2, "alpha", b2.getAlpha(), 255).setDuration(400L).start();
            }
        }
    }
}
