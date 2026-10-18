package com.google.android.finsky.utils;

import com.android.vending.R;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class iw implements com.google.android.finsky.api.model.x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5011a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ iu f5012b;

    iw(iu iuVar, String str) {
        this.f5012b = iuVar;
        this.f5011a = str;
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        if (this.f5012b.c.b() != null) {
            FinskyApp.a().n.a(this.f5012b.f5007a.getResources().getString(R.string.active_subscriptions_title, this.f5012b.c.b().f1963a.i), this.f5011a, this.f5012b.f5007a.getResources().getString(R.string.active_subscriptions_body));
        }
    }
}
