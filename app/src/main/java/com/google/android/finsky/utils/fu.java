package com.google.android.finsky.utils;

import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.FeaturedCardView;

/* loaded from: classes.dex */
final class fu extends ev<FeaturedCardView> {
    fu() {
    }

    @Override // com.google.android.finsky.utils.ev
    public final /* synthetic */ void a(FeaturedCardView featuredCardView, Document document) {
        FeaturedCardView featuredCardView2 = featuredCardView;
        super.a(featuredCardView2, document);
        featuredCardView2.getFeaturedHeroImage().a(document, (com.google.android.finsky.layout.play.cy) featuredCardView2.getLoggingData());
    }
}
