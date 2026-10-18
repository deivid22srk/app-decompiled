package com.google.android.wallet.instrumentmanager.ui.a;

import android.app.Activity;
import com.google.android.wallet.analytics.b;
import com.google.android.wallet.analytics.e;
import com.google.android.wallet.ui.common.aq;
import com.google.b.a.a.a.b.a.apkg.bpkg.apkg.d;
import com.google.b.a.a.a.b.a.apkg.l;

/* loaded from: classes.dex */
public final class a extends com.google.android.wallet.ui.card.a implements com.google.android.wallet.analytics.a, b {
    public static a a(d dVar, int i) {
        a aVar = new a();
        aVar.f(a(i, dVar));
        return aVar;
    }

    @Override // com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public final void a(Activity activity) {
        super.a(activity);
        this.at = this;
        this.au = this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.card.a
    public final aq a(l lVar) {
        return com.google.android.wallet.instrumentmanager.ui.common.a.a(lVar, this.aI);
    }

    @Override // com.google.android.wallet.analytics.a
    public final void a(e eVar, int i) {
        com.google.android.wallet.common.bpkg.a.a.a(eVar, -1, i);
    }

    @Override // com.google.android.wallet.analytics.b
    public final void a(e eVar) {
        com.google.android.wallet.common.bpkg.a.a.a(eVar, -1);
    }
}
