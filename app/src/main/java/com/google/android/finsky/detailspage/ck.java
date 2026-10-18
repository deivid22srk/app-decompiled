package com.google.android.finsky.detailspage;

import android.view.View;

/* loaded from: classes.dex */
final class ck implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RateReviewModuleLayout f2584a;

    ck(RateReviewModuleLayout rateReviewModuleLayout) {
        this.f2584a = rateReviewModuleLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cl clVar;
        cl clVar2;
        clVar = this.f2584a.f2502a;
        if (clVar != null) {
            clVar2 = this.f2584a.f2502a;
            clVar2.e();
        }
    }
}
