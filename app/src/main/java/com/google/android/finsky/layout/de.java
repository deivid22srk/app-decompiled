package com.google.android.finsky.layout;

/* loaded from: classes.dex */
final class de implements r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f3217a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ RateReviewEditor2 f3218b;

    de(RateReviewEditor2 rateReviewEditor2, r rVar) {
        this.f3218b = rateReviewEditor2;
        this.f3217a = rVar;
    }

    @Override // com.google.android.finsky.layout.r
    public final void z_() {
        RateReviewEditor2.a(this.f3218b, new df(this));
    }

    @Override // com.google.android.finsky.layout.r
    public final void b() {
        RateReviewEditor2.a(this.f3218b, new dg(this));
    }
}
