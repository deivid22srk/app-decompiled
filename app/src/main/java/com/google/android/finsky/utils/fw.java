package com.google.android.finsky.utils;

import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.PlayBundleContainerViewRow;

/* loaded from: classes.dex */
final class fw extends ev<PlayBundleContainerViewRow> {
    fw() {
    }

    @Override // com.google.android.finsky.utils.ev
    public final /* synthetic */ void a(PlayBundleContainerViewRow playBundleContainerViewRow, Document document) {
        PlayBundleContainerViewRow playBundleContainerViewRow2 = playBundleContainerViewRow;
        super.a(playBundleContainerViewRow2, document);
        playBundleContainerViewRow2.setExtraInfo(document);
    }
}
