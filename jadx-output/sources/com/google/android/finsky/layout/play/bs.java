package com.google.android.finsky.layout.play;

/* loaded from: classes.dex */
final class bs implements cg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayCardViewRate f3450a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PlayCardRateClusterView f3451b;

    bs(PlayCardRateClusterView playCardRateClusterView, PlayCardViewRate playCardViewRate) {
        this.f3451b = playCardRateClusterView;
        this.f3450a = playCardViewRate;
    }

    @Override // com.google.android.finsky.layout.play.cg
    public final void a(boolean z) {
        this.f3451b.g = true;
        if (z) {
            this.f3451b.a(this.f3450a);
        }
    }

    @Override // com.google.android.finsky.layout.play.cg
    public final void a() {
        this.f3451b.g = false;
    }
}
