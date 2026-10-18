package com.google.android.finsky.wear;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jm;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
final class ba implements com.google.android.gms.common.api.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WearSupportService f5110a;

    ba(WearSupportService wearSupportService) {
        this.f5110a = wearSupportService;
    }

    @Override // com.google.android.gms.common.api.q
    public final void a(ConnectionResult connectionResult) {
        jm.a();
        FinskyLog.d("onConnectionFailed: %s", connectionResult);
        this.f5110a.g = false;
        WearSupportService.h(this.f5110a);
        WearSupportService.i(this.f5110a);
    }
}
