package com.google.android.wallet.instrumentmanager.ui.f;

import android.app.Activity;
import com.google.android.wallet.analytics.e;
import com.google.b.a.a.a.b.a.a.b.a.x;

/* loaded from: classes.dex */
public final class a extends com.google.android.wallet.ui.d.a implements com.google.android.wallet.analytics.a {
    public static a a(x xVar, int i) {
        a aVar = new a();
        aVar.f(a(i, xVar));
        return aVar;
    }

    @Override // com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public final void a(Activity activity) {
        super.a(activity);
        this.f = this;
    }

    @Override // com.google.android.wallet.analytics.a
    public final void a(e eVar, int i) {
        com.google.android.wallet.common.b.a.a.a(eVar, -1, i);
    }
}
