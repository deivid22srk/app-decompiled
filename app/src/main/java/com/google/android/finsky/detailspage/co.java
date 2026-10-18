package com.google.android.finsky.detailspage;

import com.google.android.finsky.layout.RateReviewEditor2;

/* loaded from: classes.dex */
final class co implements com.google.android.finsky.layout.db {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RateReviewModuleV2Layout f2588a;

    co(RateReviewModuleV2Layout rateReviewModuleV2Layout) {
        this.f2588a = rateReviewModuleV2Layout;
    }

    @Override // com.google.android.finsky.layout.db
    public final void g() {
    }

    @Override // com.google.android.finsky.layout.db
    public final void h() {
        cr crVar;
        cr crVar2;
        RateReviewEditor2 rateReviewEditor2;
        crVar = this.f2588a.f2504a;
        if (crVar != null) {
            crVar2 = this.f2588a.f2504a;
            rateReviewEditor2 = this.f2588a.n;
            crVar2.a(rateReviewEditor2.getUserRating());
        }
    }
}
