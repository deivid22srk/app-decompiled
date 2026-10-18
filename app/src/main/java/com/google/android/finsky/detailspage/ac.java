package com.google.android.finsky.detailspage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class ac extends com.google.android.play.dpkg.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f2530a;

    ac(z zVar) {
        this.f2530a = zVar;
    }

    @Override // com.google.android.play.dpkg.a, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this.f2530a.R != null) {
            bitmap = this.f2530a.aC;
            if (bitmap != null && !TextUtils.isEmpty(this.f2530a.am)) {
                z zVar = this.f2530a;
                bitmap2 = this.f2530a.aC;
                z.a(zVar, bitmap2);
            }
            Drawable b2 = z.b(this.f2530a);
            if (b2 != null) {
                b2.setAlpha(0);
            }
            if (this.f2530a.aj != null) {
                this.f2530a.aj.a();
            }
            Iterator it = z.c(this.f2530a).iterator();
            while (it.hasNext()) {
                ((View) it.next()).setAlpha(0.0f);
            }
        }
    }

    @Override // com.google.android.play.dpkg.a, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        if (((ViewGroup) this.f2530a.R) != null && this.f2530a.ak != null) {
            z.i(this.f2530a);
            if (this.f2530a.aj != null) {
                this.f2530a.aj.b();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            for (View view : z.c(this.f2530a)) {
                arrayList.add(com.google.android.finsky.utils.et.a(view, view.getAlpha(), 400L));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.start();
            this.f2530a.an = false;
            for (int i = 0; i < this.f2530a.g.size(); i++) {
                bd bdVar = this.f2530a.g.get(i);
                if (this.f2530a.b(bdVar) && !this.f2530a.h.contains(bdVar)) {
                    this.f2530a.c(bdVar);
                }
            }
            Drawable b2 = z.b(this.f2530a);
            if (b2 != null) {
                ObjectAnimator.ofInt(b2, "alpha", b2.getAlpha(), 255).setDuration(400L).start();
            }
        }
    }
}
