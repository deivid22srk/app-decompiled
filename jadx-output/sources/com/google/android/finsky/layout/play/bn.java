package com.google.android.finsky.layout.play;

import android.view.animation.Animation;
import com.google.android.finsky.utils.eu;
import com.google.android.finsky.utils.ik;
import com.google.android.finsky.utils.ip;

/* loaded from: classes.dex */
final class bn extends eu {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayCardRateAndSuggestClusterView f3445a;

    bn(PlayCardRateAndSuggestClusterView playCardRateAndSuggestClusterView) {
        this.f3445a = playCardRateAndSuggestClusterView;
    }

    @Override // com.google.android.finsky.utils.eu, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        PlayCardRateAndSuggestContentScroller playCardRateAndSuggestContentScroller;
        ip ipVar;
        playCardRateAndSuggestContentScroller = this.f3445a.i;
        playCardRateAndSuggestContentScroller.setVisibility(8);
        if (PlayListView.f3355a) {
            PlayCardRateAndSuggestClusterView playCardRateAndSuggestClusterView = this.f3445a;
            ipVar = this.f3445a.h;
            ik.a(playCardRateAndSuggestClusterView, ipVar, 2500L);
        }
    }
}
