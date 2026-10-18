package com.google.android.finsky.layout.play;

import android.view.animation.Animation;
import com.google.android.finsky.utils.et;
import com.google.android.finsky.utils.eu;

/* loaded from: classes.dex */
final class bi extends eu {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayCardViewRate f3437a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f3438b;
    final /* synthetic */ PlayCardRateAndSuggestClusterView c;

    bi(PlayCardRateAndSuggestClusterView playCardRateAndSuggestClusterView, PlayCardViewRate playCardViewRate, float f) {
        this.c = playCardRateAndSuggestClusterView;
        this.f3437a = playCardViewRate;
        this.f3438b = f;
    }

    @Override // com.google.android.finsky.utils.eu, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f3437a.setState(0);
        this.c.f3308a.a(0, 0, this.c);
        this.f3437a.setThumbnailAspectRatio(this.f3438b);
        this.f3437a.startAnimation(et.a(this.c.getContext(), 150L, new bj(this)));
        this.c.a(0, false);
    }
}
