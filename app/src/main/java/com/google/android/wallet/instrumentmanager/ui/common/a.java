package com.google.android.wallet.instrumentmanager.ui.common;

import android.app.Activity;
import com.google.android.wallet.analytics.e;
import com.google.android.wallet.ui.common.aq;
import com.google.b.a.a.a.b.a.apkg.l;

/* loaded from: classes.dex */
public final class a extends aq implements com.google.android.wallet.analytics.a {
    public static a a(l lVar, int i) {
        a aVar = new a();
        aVar.f(c(lVar, i));
        return aVar;
    }

    @Override // com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public final void a(Activity activity) {
        super.a(activity);
        this.e = this;
    }

    @Override // com.google.android.wallet.analytics.a
    public final void a(e eVar, int i) {
        com.google.android.wallet.common.bpkg.a.a.a(eVar, -1, i);
    }
}
