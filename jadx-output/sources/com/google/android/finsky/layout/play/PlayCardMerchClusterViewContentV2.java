package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class PlayCardMerchClusterViewContentV2 extends PlayClusterViewContentV2 {
    public PlayCardMerchClusterViewContentV2(Context context) {
        this(context, null);
    }

    public PlayCardMerchClusterViewContentV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.layout.play.PlayClusterViewContentV2
    protected int getLeadingItemGap() {
        return this.x <= 3 ? 1 : 2;
    }
}
