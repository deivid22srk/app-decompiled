package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class PlayCardAddToCirclesClusterView extends PlayCardClusterView {
    public PlayCardAddToCirclesClusterView(Context context) {
        this(context, null);
    }

    public PlayCardAddToCirclesClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.layout.play.ci
    protected int getPlayStoreUiElementType() {
        return 410;
    }
}
