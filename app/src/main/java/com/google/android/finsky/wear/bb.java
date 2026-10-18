package com.google.android.finsky.wear;

import android.os.Bundle;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jm;

/* loaded from: classes.dex */
final class bb implements com.google.android.gms.common.api.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WearSupportService f5111a;

    bb(WearSupportService wearSupportService) {
        this.f5111a = wearSupportService;
    }

    @Override // com.google.android.gms.common.api.p
    public final void a(Bundle bundle) {
        jm.a();
        this.f5111a.g = true;
        WearSupportService.i(this.f5111a);
    }

    @Override // com.google.android.gms.common.api.p
    public final void a(int i) {
        jm.a();
        FinskyLog.a("onConnectionSuspended: %d", Integer.valueOf(i));
        this.f5111a.g = false;
        WearSupportService.h(this.f5111a);
        WearSupportService.i(this.f5111a);
    }
}
