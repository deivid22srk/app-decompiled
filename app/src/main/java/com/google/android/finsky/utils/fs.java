package com.google.android.finsky.utils;

import android.text.TextUtils;
import com.google.android.finsky.api.model.Document;
import com.google.android.play.layout.PlayCardViewSmall;

/* loaded from: classes.dex */
final class fs extends ev<PlayCardViewSmall> {
    fs() {
    }

    @Override // com.google.android.finsky.utils.ev
    public final /* synthetic */ void a(PlayCardViewSmall playCardViewSmall, Document document) {
        PlayCardViewSmall playCardViewSmall2 = playCardViewSmall;
        super.a(playCardViewSmall2, document);
        int i = 0;
        if (document.aQ() || document.k() || !TextUtils.isEmpty(document.as())) {
            i = 2;
        }
        if (document.f1963a.e == 44) {
            i |= 4;
        }
        playCardViewSmall2.setTextContentFlags(i);
    }
}
