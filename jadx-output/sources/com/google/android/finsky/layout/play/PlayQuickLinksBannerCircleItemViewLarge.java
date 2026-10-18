package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public class PlayQuickLinksBannerCircleItemViewLarge extends cr implements com.google.android.finsky.adapters.ap {
    public PlayQuickLinksBannerCircleItemViewLarge(Context context) {
        super(context, null);
    }

    public PlayQuickLinksBannerCircleItemViewLarge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PlayQuickLinksBannerCircleItemViewLarge(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.google.android.finsky.layout.play.cr
    public final void a(com.google.android.finsky.protos.ba baVar, com.google.android.finsky.navigationmanager.b bVar, DfeToc dfeToc, com.google.android.play.image.e eVar, cy cyVar) {
        super.a(baVar, bVar, dfeToc, eVar, cyVar);
        this.c = ik.a(baVar.c, this.c);
        this.f3479b.setBitmapTransformation(com.google.android.play.image.a.a(getResources(), this.c));
    }
}
