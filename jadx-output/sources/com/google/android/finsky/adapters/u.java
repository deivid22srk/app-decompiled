package com.google.android.finsky.adapters;

import com.android.vending.R;
import com.google.android.finsky.layout.play.PlayQuickLinksBannerCircleItemViewLarge;
import com.google.android.finsky.layout.play.cy;

/* loaded from: classes.dex */
final class u implements com.google.android.finsky.layout.s<PlayQuickLinksBannerCircleItemViewLarge> {

    /* renamed from: a, reason: collision with root package name */
    cy f1939a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f1940b;

    private u(s sVar) {
        this.f1940b = sVar;
    }

    /* synthetic */ u(s sVar, byte b2) {
        this(sVar);
    }

    @Override // com.google.android.finsky.layout.s
    public final /* bridge */ /* synthetic */ void a(PlayQuickLinksBannerCircleItemViewLarge playQuickLinksBannerCircleItemViewLarge, int i) {
        playQuickLinksBannerCircleItemViewLarge.a(this.f1940b.g[i], this.f1940b.c, this.f1940b.e, this.f1940b.f, this.f1939a);
    }

    @Override // com.google.android.finsky.layout.s
    public final /* bridge */ /* synthetic */ float a_(PlayQuickLinksBannerCircleItemViewLarge playQuickLinksBannerCircleItemViewLarge) {
        return 1.0f;
    }

    @Override // com.google.android.finsky.layout.s
    public final String a() {
        return "category_quick_links";
    }

    @Override // com.google.android.finsky.layout.s
    public final int d() {
        return this.f1940b.g.length;
    }

    @Override // com.google.android.finsky.layout.s
    public final int b() {
        return R.layout.play_quicklinks_banner_circle_item_large;
    }

    @Override // com.google.android.finsky.layout.s
    public final float a(int i) {
        return 1.0f;
    }

    @Override // com.google.android.finsky.layout.s
    public final boolean X_() {
        return false;
    }
}
