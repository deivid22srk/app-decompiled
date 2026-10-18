package com.google.android.finsky.layout.play;

import android.view.View;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class am implements com.google.android.play.layout.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View.OnClickListener f3402a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PlayBundleBannerView f3403b;

    am(PlayBundleBannerView playBundleBannerView, View.OnClickListener onClickListener) {
        this.f3403b = playBundleBannerView;
        this.f3402a = onClickListener;
    }

    @Override // com.google.android.play.layout.f
    public final void a(int i) {
        this.f3402a.onClick(this.f3403b);
        FinskyApp.a().h().a(212, (byte[]) null, this.f3403b.getPlayStoreUiElementNode());
    }
}
