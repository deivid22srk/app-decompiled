package com.google.android.finsky.wear;

import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class ak implements com.google.android.gms.common.api.y<com.google.android.gms.wearable.v> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WearSupportService f5084a;

    ak(WearSupportService wearSupportService) {
        this.f5084a = wearSupportService;
    }

    @Override // com.google.android.gms.common.api.y
    public final /* synthetic */ void a(com.google.android.gms.wearable.v vVar) {
        com.google.android.gms.wearable.v vVar2 = vVar;
        if (vVar2.b().a()) {
            return;
        }
        FinskyLog.c("request checkin message failed status=%d", Integer.valueOf(vVar2.b().g));
    }
}
