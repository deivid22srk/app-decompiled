package com.google.android.finsky.billing.giftcard.apkg;

import android.os.Bundle;
import com.google.android.finsky.apkg.ai;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class h extends com.google.android.finsky.billing.instrumentmanager.c<com.google.android.finsky.billing.giftcard.a> {

    /* renamed from: a, reason: collision with root package name */
    public ai f2218a = com.google.android.finsky.apkg.i.a(1106);

    @Override // com.google.android.wallet.common.pub.d
    public final void b(int i, Bundle bundle) {
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.f2218a;
    }

    @Override // com.google.android.wallet.common.pub.d
    public final void a(int i, Bundle bundle) {
        com.google.android.finsky.billing.giftcard.a aVar = (com.google.android.finsky.billing.giftcard.a) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E);
        if (b(i)) {
            com.google.android.finsky.billing.giftcard.e eVar = aVar.f2208b;
            if (eVar.as != 6) {
                FinskyLog.e("Invalid state: %d", Integer.valueOf(eVar.as));
                return;
            } else {
                eVar.u();
                return;
            }
        }
        aVar.v();
    }
}
