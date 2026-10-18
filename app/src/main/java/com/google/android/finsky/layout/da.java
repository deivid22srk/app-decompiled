package com.google.android.finsky.layout;

import com.deivid22srk.store.R;
import com.google.android.finsky.layout.play.PlayRatingBar;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
final class da implements com.google.android.finsky.layout.play.cu {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RateReviewEditor f3214a;

    da(RateReviewEditor rateReviewEditor) {
        this.f3214a = rateReviewEditor;
    }

    @Override // com.google.android.finsky.layout.play.cu
    public final void a(PlayRatingBar playRatingBar, int i) {
        if (i > 0) {
            ik.a(this.f3214a.getContext(), this.f3214a.getResources().getQuantityString(R.plurals.content_description_rated, i, Integer.valueOf(i)), this.f3214a.f3053b);
            this.f3214a.b(i);
        }
        if (this.f3214a.e != null) {
            this.f3214a.e.h();
        }
    }
}
