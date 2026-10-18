package com.google.android.finsky.detailspage;

import android.view.inputmethod.InputMethodManager;
import com.google.android.finsky.layout.RateReviewEditor2;

/* loaded from: classes.dex */
final class cn implements com.google.android.finsky.layout.r {

    /* renamed from: a, reason: collision with root package name */
    InputMethodManager f2586a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f2587b;
    final /* synthetic */ RateReviewModuleV2Layout c;

    cn(RateReviewModuleV2Layout rateReviewModuleV2Layout, String str) {
        this.c = rateReviewModuleV2Layout;
        this.f2587b = str;
        this.f2586a = (InputMethodManager) this.c.getContext().getSystemService("input_method");
    }

    @Override // com.google.android.finsky.layout.r
    public final void z_() {
        RateReviewEditor2 rateReviewEditor2;
        cr crVar;
        cr crVar2;
        RateReviewEditor2 rateReviewEditor22;
        RateReviewEditor2 rateReviewEditor23;
        rateReviewEditor2 = this.c.n;
        rateReviewEditor2.clearFocus();
        this.f2586a.hideSoftInputFromWindow(this.c.getWindowToken(), 0);
        crVar = this.c.f2504a;
        if (crVar != null) {
            crVar2 = this.c.f2504a;
            rateReviewEditor22 = this.c.n;
            int userRating = rateReviewEditor22.getUserRating();
            rateReviewEditor23 = this.c.n;
            crVar2.a(userRating, rateReviewEditor23.getUserComment());
        }
    }

    @Override // com.google.android.finsky.layout.r
    public final void b() {
        RateReviewEditor2 rateReviewEditor2;
        RateReviewEditor2 rateReviewEditor22;
        cr crVar;
        cr crVar2;
        rateReviewEditor2 = this.c.n;
        rateReviewEditor2.clearFocus();
        this.f2586a.hideSoftInputFromWindow(this.c.getWindowToken(), 0);
        rateReviewEditor22 = this.c.n;
        rateReviewEditor22.setUserComment(this.f2587b);
        crVar = this.c.f2504a;
        if (crVar != null) {
            crVar2 = this.c.f2504a;
            crVar2.h();
        }
    }
}
