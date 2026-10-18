package com.google.android.finsky.wear;

import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class u implements com.google.android.gms.common.api.y<com.google.android.gms.wearable.g> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5152a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f5153b;

    u(t tVar, String str) {
        this.f5153b = tVar;
        this.f5152a = str;
    }

    @Override // com.google.android.gms.common.api.y
    public final /* synthetic */ void a(com.google.android.gms.wearable.g gVar) {
        com.google.android.gms.wearable.g gVar2 = gVar;
        if (gVar2.b().a()) {
            return;
        }
        FinskyLog.d("Writing %s failed with error %d", this.f5152a, Integer.valueOf(gVar2.b().g));
        bh.a(111, r0.f5136a, null, 993, null, r0.i, this.f5153b.d.f5137b);
        this.f5153b.d.a(this.f5153b.f5150a);
    }
}
