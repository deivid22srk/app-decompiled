package com.google.android.finsky.layout.play;

import android.view.animation.Animation;
import com.google.android.finsky.utils.eu;
import com.google.android.finsky.utils.ik;
import com.google.android.finsky.utils.ip;

/* loaded from: classes.dex */
final class bx extends eu {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayCardRateClusterView f3459a;

    bx(PlayCardRateClusterView playCardRateClusterView) {
        this.f3459a = playCardRateClusterView;
    }

    @Override // com.google.android.finsky.utils.eu, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ip ipVar;
        this.f3459a.f3308a.setVisibility(8);
        if (PlayListView.f3355a) {
            PlayCardRateClusterView playCardRateClusterView = this.f3459a;
            ipVar = this.f3459a.f;
            ik.a(playCardRateClusterView, ipVar, 2500L);
        }
    }
}
