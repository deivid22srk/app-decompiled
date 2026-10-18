package com.google.android.finsky.layout.play;

/* loaded from: classes.dex */
final class bq implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayCardRateAndSuggestContentScroller f3448a;

    bq(PlayCardRateAndSuggestContentScroller playCardRateAndSuggestContentScroller) {
        this.f3448a = playCardRateAndSuggestContentScroller;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PlayCardClusterViewContent playCardClusterViewContent;
        PlayCardClusterViewContent playCardClusterViewContent2;
        playCardClusterViewContent = this.f3448a.f3332a;
        if (playCardClusterViewContent.getCardChildCount() > 0) {
            playCardClusterViewContent2 = this.f3448a.f3332a;
            com.google.android.play.layout.a b2 = playCardClusterViewContent2.b(0);
            this.f3448a.scrollTo(b2.getWidth(), 0);
            b2.setVisibility(4);
        }
    }
}
