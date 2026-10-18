package com.google.android.play.onboard;

import android.view.View;

/* loaded from: classes.dex */
final class a implements f<View> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f7003a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterstitialOverlay f7004b;

    a(InterstitialOverlay interstitialOverlay, String str) {
        this.f7004b = interstitialOverlay;
        this.f7003a = str;
    }

    @Override // com.google.android.play.onboard.f
    public final /* synthetic */ boolean a(View view) {
        return this.f7003a.equals(view.getTag());
    }
}
