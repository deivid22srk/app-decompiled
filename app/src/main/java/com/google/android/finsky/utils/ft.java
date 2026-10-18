package com.google.android.finsky.utils;

import android.text.TextUtils;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.PlayCardViewMediumPlus;
import com.google.android.finsky.protos.pi;

/* loaded from: classes.dex */
final class ft extends ev<PlayCardViewMediumPlus> {
    ft() {
    }

    @Override // com.google.android.finsky.utils.ev
    public final /* synthetic */ void a(PlayCardViewMediumPlus playCardViewMediumPlus, Document document) {
        PlayCardViewMediumPlus playCardViewMediumPlus2 = playCardViewMediumPlus;
        super.a(playCardViewMediumPlus2, document);
        pi ar = document.ar();
        playCardViewMediumPlus2.getSnippet2().setSizeMode((ar != null && ar.c.length == 1) || !TextUtils.isEmpty(document.as()) ? 1 : 0);
    }
}
