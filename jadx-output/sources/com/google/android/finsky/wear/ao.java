package com.google.android.finsky.wear;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class ao implements com.google.android.gms.common.api.y<com.google.android.gms.wearable.g> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ an f5090a;

    ao(an anVar) {
        this.f5090a = anVar;
    }

    @Override // com.google.android.gms.common.api.y
    public final /* synthetic */ void a(com.google.android.gms.wearable.g gVar) {
        com.google.android.gms.wearable.g gVar2 = gVar;
        Status b2 = gVar2.b();
        if (!b2.a()) {
            FinskyLog.c("Error %d getting data item %s. (%s)", this.f5090a.f5088a.toString(), Integer.valueOf(b2.g), b2.h);
            this.f5090a.d.a();
        } else if (com.google.android.gms.wearable.o.a(gVar2.a().c()).c("phoneskyProcessed")) {
            FinskyLog.a("Skipping DataItem %s node %s, already processed", this.f5090a.f5088a, this.f5090a.f5089b);
            this.f5090a.d.a();
        } else {
            WearSupportService.a(this.f5090a.d, gVar2.a(), this.f5090a.f5089b, this.f5090a.c);
        }
    }
}
