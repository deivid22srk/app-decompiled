package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class PlayCardMyCirclesClusterView extends PlayCardClusterView {
    public PlayCardMyCirclesClusterView(Context context) {
        this(context, null);
    }

    public PlayCardMyCirclesClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.layout.play.ci
    protected int getPlayStoreUiElementType() {
        return 415;
    }
}
