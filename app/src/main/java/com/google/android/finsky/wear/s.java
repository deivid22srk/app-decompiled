package com.google.android.finsky.wear;

import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class s implements com.google.android.gms.common.api.y<com.google.android.gms.wearable.g> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5148a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.bpkg.b f5149b;
    final /* synthetic */ m c;

    s(m mVar, String str, com.google.android.finsky.bpkg.b bVar) {
        this.c = mVar;
        this.f5148a = str;
        this.f5149b = bVar;
    }

    @Override // com.google.android.gms.common.api.y
    public final /* synthetic */ void a(com.google.android.gms.wearable.g gVar) {
        com.google.android.gms.wearable.g gVar2 = gVar;
        if (gVar2.b().a()) {
            return;
        }
        FinskyLog.d("Writing %s failed with error %d", this.f5148a, Integer.valueOf(gVar2.b().g));
        bh.a(111, r0.f5136a, null, 993, null, r0.i, this.c.f5137b);
        this.c.a(this.f5149b);
    }
}
