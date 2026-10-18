package com.google.android.finsky.billing.lightpurchase.cpkg;

import android.os.Bundle;
import com.google.android.finsky.apkg.ai;
import com.google.android.finsky.billing.an;
import com.google.android.finsky.billing.lightpurchase.PurchaseFragment;

/* loaded from: classes.dex */
public final class y extends com.google.android.finsky.billing.instrumentmanager.c<PurchaseFragment> {

    /* renamed from: a, reason: collision with root package name */
    public ai f2380a = com.google.android.finsky.apkg.i.a(740);

    @Override // com.google.android.wallet.common.pub.d
    public final void a(int i, Bundle bundle) {
        if (!b(i)) {
            ((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E)).v();
        } else {
            ((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E)).a((an) null, (Boolean) null);
        }
    }

    @Override // com.google.android.wallet.common.pub.d
    public final void b(int i, Bundle bundle) {
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.f2380a;
    }
}
