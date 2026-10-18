package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class PlayQuickLinksBannerView extends PlayClusterViewContentV2 implements cy {
    public com.google.android.finsky.apkg.ai q;
    public cy y;

    public PlayQuickLinksBannerView(Context context) {
        this(context, null);
    }

    public PlayQuickLinksBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.apkg.ai getPlayStoreUiElement() {
        return this.q;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public cy getParentNode() {
        return this.y;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(cy cyVar) {
        com.google.android.finsky.apkg.i.a(this, cyVar);
    }
}
