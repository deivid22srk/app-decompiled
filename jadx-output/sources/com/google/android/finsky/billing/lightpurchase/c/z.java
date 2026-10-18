package com.google.android.finsky.billing.lightpurchase.c;

import com.google.android.finsky.a.ai;
import com.google.android.finsky.a.aj;
import com.google.android.finsky.billing.at;
import com.google.android.finsky.billing.lightpurchase.PurchaseFragment;

/* loaded from: classes.dex */
public final class z extends at<PurchaseFragment> {
    private final ai g = com.google.android.finsky.a.i.a(775);

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.g;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final void u() {
        a(778, (aj) null);
        P_();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.at
    public final void P_() {
        ((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).y();
    }
}
