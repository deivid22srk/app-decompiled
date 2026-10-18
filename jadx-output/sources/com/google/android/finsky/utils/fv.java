package com.google.android.finsky.utils;

import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.FeaturedWideCardView;

/* loaded from: classes.dex */
final class fv extends ev<FeaturedWideCardView> {
    fv() {
    }

    @Override // com.google.android.finsky.utils.ev
    public final /* synthetic */ void a(FeaturedWideCardView featuredWideCardView, Document document) {
        FeaturedWideCardView featuredWideCardView2 = featuredWideCardView;
        super.a(featuredWideCardView2, document);
        featuredWideCardView2.getFeaturedHeroImage().a(document, (com.google.android.finsky.layout.play.cy) featuredWideCardView2.getLoggingData());
    }
}
