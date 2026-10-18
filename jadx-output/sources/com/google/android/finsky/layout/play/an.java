package com.google.android.finsky.layout.play;

import android.view.View;

/* loaded from: classes.dex */
final class an implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.play.layout.d f3404a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PlayBundleBannerView f3405b;

    an(PlayBundleBannerView playBundleBannerView, com.google.android.play.layout.d dVar) {
        this.f3405b = playBundleBannerView;
        this.f3404a = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3404a.a();
    }
}
