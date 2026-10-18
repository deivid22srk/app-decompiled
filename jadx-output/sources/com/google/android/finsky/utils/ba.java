package com.google.android.finsky.utils;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.ExternalReferrer;

/* loaded from: classes.dex */
public final class ba implements com.google.android.finsky.receivers.aq {
    @Override // com.google.android.finsky.receivers.aq
    public final void b(String str) {
        ExternalReferrer.ExternalReferrerService.a(FinskyApp.a(), str, true);
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void a(String str, boolean z) {
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void c(String str) {
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void a(String[] strArr) {
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void d(String str) {
        FinskyLog.a("Package first launch for %s", str);
        ExternalReferrer.ExternalReferrerService.a(FinskyApp.a(), str, false);
    }
}
