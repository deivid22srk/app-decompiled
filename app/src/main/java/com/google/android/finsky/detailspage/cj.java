package com.google.android.finsky.detailspage;

import com.google.android.finsky.layout.play.PlayRatingBar;

/* loaded from: classes.dex */
final class cj implements com.google.android.finsky.layout.play.cu {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RateReviewModuleLayout f2583a;

    cj(RateReviewModuleLayout rateReviewModuleLayout) {
        this.f2583a = rateReviewModuleLayout;
    }

    @Override // com.google.android.finsky.layout.play.cu
    public final void a(PlayRatingBar playRatingBar, int i) {
        cl clVar;
        cl clVar2;
        clVar = this.f2583a.f2502a;
        if (clVar != null) {
            clVar2 = this.f2583a.f2502a;
            clVar2.a(i);
        }
    }
}
