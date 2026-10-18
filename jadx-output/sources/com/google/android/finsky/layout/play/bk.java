package com.google.android.finsky.layout.play;

/* loaded from: classes.dex */
final class bk implements cg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayCardRateAndSuggestClusterView f3440a;

    bk(PlayCardRateAndSuggestClusterView playCardRateAndSuggestClusterView) {
        this.f3440a = playCardRateAndSuggestClusterView;
    }

    @Override // com.google.android.finsky.layout.play.cg
    public final void a(boolean z) {
        if (z) {
            this.f3440a.a(false);
            this.f3440a.b(false);
        } else {
            this.f3440a.a(1, false);
        }
    }

    @Override // com.google.android.finsky.layout.play.cg
    public final void a() {
        this.f3440a.a(0, false);
    }
}
