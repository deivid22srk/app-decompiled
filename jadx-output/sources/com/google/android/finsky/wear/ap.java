package com.google.android.finsky.wear;

import android.net.Uri;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class ap implements com.google.android.gms.common.api.y<com.google.android.gms.wearable.n> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WearSupportService f5091a;

    ap(WearSupportService wearSupportService) {
        this.f5091a = wearSupportService;
    }

    @Override // com.google.android.gms.common.api.y
    public final /* synthetic */ void a(com.google.android.gms.wearable.n nVar) {
        com.google.android.gms.wearable.n nVar2 = nVar;
        WearSupportService.n(this.f5091a);
        Status status = nVar2.f6632b;
        if (!status.a()) {
            FinskyLog.c("Error %d getting zapp requests. (%s)", Integer.valueOf(status.g), status.h);
        } else {
            int c = nVar2.c();
            for (int i = 0; i < c; i++) {
                com.google.android.gms.wearable.l a2 = nVar2.a(i);
                Uri b2 = a2.b();
                String b3 = bi.b(b2);
                String str = b2.getPathSegments().get(1);
                if (com.google.android.gms.wearable.o.a(a2.c()).c("phoneskyProcessed")) {
                    FinskyLog.a("Skipping DataItem %s node %s, already processed", b2, b3);
                } else {
                    WearSupportService.m(this.f5091a);
                    WearSupportService.a(this.f5091a, a2, b3, str);
                }
            }
        }
        nVar2.a();
        this.f5091a.b();
    }
}
