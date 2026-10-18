package com.google.android.finsky.utils;

import android.text.TextUtils;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.PlayCardViewListingSmall;

/* loaded from: classes.dex */
final class fy extends ev<PlayCardViewListingSmall> {
    fy() {
    }

    @Override // com.google.android.finsky.utils.ev
    public final /* synthetic */ void a(PlayCardViewListingSmall playCardViewListingSmall, Document document) {
        PlayCardViewListingSmall playCardViewListingSmall2 = playCardViewListingSmall;
        super.a(playCardViewListingSmall2, document);
        playCardViewListingSmall2.setSnippetVisible(document.aQ() || document.k() || !TextUtils.isEmpty(document.as()));
    }
}
