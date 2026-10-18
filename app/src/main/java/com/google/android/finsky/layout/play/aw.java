package com.google.android.finsky.layout.play;

import android.view.animation.Animation;
import com.google.android.finsky.utils.eu;

/* loaded from: classes.dex */
final class aw extends eu {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.play.layout.a f3419a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PlayCardClusterViewContent f3420b;

    aw(PlayCardClusterViewContent playCardClusterViewContent, com.google.android.play.layout.a aVar) {
        this.f3420b = playCardClusterViewContent;
        this.f3419a = aVar;
    }

    @Override // com.google.android.finsky.utils.eu, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f3419a.d();
    }
}
