package com.google.android.finsky.detailspage;

import com.google.android.finsky.layout.play.PlayRatingBar;

/* loaded from: classes.dex */
final class cm implements com.google.android.finsky.layout.play.cu {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RateReviewModuleV2Layout f2585a;

    cm(RateReviewModuleV2Layout rateReviewModuleV2Layout) {
        this.f2585a = rateReviewModuleV2Layout;
    }

    @Override // com.google.android.finsky.layout.play.cu
    public final void a(PlayRatingBar playRatingBar, int i) {
        cr crVar;
        cr crVar2;
        crVar = this.f2585a.f2504a;
        if (crVar != null) {
            crVar2 = this.f2585a.f2504a;
            crVar2.a(i);
        }
    }
}
