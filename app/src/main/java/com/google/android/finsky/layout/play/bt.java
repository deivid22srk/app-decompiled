package com.google.android.finsky.layout.play;

import android.view.animation.Animation;
import com.google.android.finsky.utils.eu;

/* loaded from: classes.dex */
final class bt extends eu {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayCardViewRate f3452a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PlayCardRateClusterView f3453b;

    bt(PlayCardRateClusterView playCardRateClusterView, PlayCardViewRate playCardViewRate) {
        this.f3453b = playCardRateClusterView;
        this.f3452a = playCardViewRate;
    }

    @Override // com.google.android.finsky.utils.eu, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f3452a.setVisibility(4);
        this.f3452a.setState(2);
        PlayCardRateClusterView.b(this.f3453b, this.f3452a);
    }
}
