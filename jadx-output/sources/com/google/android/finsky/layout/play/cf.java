package com.google.android.finsky.layout.play;

import android.view.animation.Animation;
import com.google.android.finsky.utils.eu;

/* loaded from: classes.dex */
final class cf extends eu {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayCardViewRate f3467a;

    cf(PlayCardViewRate playCardViewRate) {
        this.f3467a = playCardViewRate;
    }

    @Override // com.google.android.finsky.utils.eu, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f3467a.setState(0);
    }
}
