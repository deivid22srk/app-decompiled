package com.google.android.finsky.layout.play;

import android.view.animation.Animation;
import com.google.android.finsky.utils.eu;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
final class bj extends eu {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bi f3439a;

    bj(bi biVar) {
        this.f3439a = biVar;
    }

    @Override // com.google.android.finsky.utils.eu, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        boolean z;
        z = PlayCardRateAndSuggestClusterView.e;
        if (z && ik.c(this.f3439a.c.getContext())) {
            this.f3439a.f3437a.performAccessibilityAction(64, null);
        }
    }
}
