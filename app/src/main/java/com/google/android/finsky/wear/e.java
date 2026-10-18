package com.google.android.finsky.wear;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* loaded from: classes.dex */
final class e implements com.google.android.gms.common.api.y<com.google.android.gms.wearable.n> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f5124a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.m f5125b;

    e(List list, com.google.android.gms.common.api.m mVar) {
        this.f5124a = list;
        this.f5125b = mVar;
    }

    @Override // com.google.android.gms.common.api.y
    public final /* synthetic */ void a(com.google.android.gms.wearable.n nVar) {
        com.google.android.gms.wearable.n nVar2 = nVar;
        Status status = nVar2.f6632b;
        if (!status.a()) {
            FinskyLog.c("Error %d getting liveness data. (%s)", Integer.valueOf(status.g), status.h);
        } else {
            int c = nVar2.c();
            for (int i = 0; i < c; i++) {
                com.google.android.gms.wearable.l a2 = nVar2.a(i);
                String b2 = bi.b(a2.b());
                long e = com.google.android.gms.wearable.o.a(a2.c()).e("timestamp");
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis > com.google.android.finsky.cpkg.d.eh.b().longValue() + e) {
                    FinskyLog.a("Dropping node %s with timestamp %d, current time %d", b2, Long.valueOf(e), Long.valueOf(currentTimeMillis));
                    this.f5124a.add(b2);
                }
            }
        }
        nVar2.a();
        com.google.android.gms.wearable.aa.f6462a.b(this.f5125b, bi.f5118a).a(new f(this));
    }
}
