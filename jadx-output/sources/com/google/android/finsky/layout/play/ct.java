package com.google.android.finsky.layout.play;

import android.widget.HorizontalScrollView;

/* loaded from: classes.dex */
final class ct implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f3481a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PlayQuickLinksBannerViewV2 f3482b;

    ct(PlayQuickLinksBannerViewV2 playQuickLinksBannerViewV2, int i) {
        this.f3482b = playQuickLinksBannerViewV2;
        this.f3481a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HorizontalScrollView horizontalScrollView;
        horizontalScrollView = this.f3482b.f3363a;
        horizontalScrollView.scrollTo(this.f3481a, 0);
    }
}
