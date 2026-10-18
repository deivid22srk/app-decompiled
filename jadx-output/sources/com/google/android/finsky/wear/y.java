package com.google.android.finsky.wear;

import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class y implements com.google.android.gms.common.api.y<com.google.android.gms.wearable.g> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f5160a;

    y(v vVar) {
        this.f5160a = vVar;
    }

    @Override // com.google.android.gms.common.api.y
    public final /* synthetic */ void a(com.google.android.gms.wearable.g gVar) {
        com.google.android.gms.wearable.g gVar2 = gVar;
        if (!gVar2.b().a()) {
            FinskyLog.d("Writing %s for node %s failed with error %d", this.f5160a.c, this.f5160a.f5155b, Integer.valueOf(gVar2.b().g));
        }
        this.f5160a.f5154a.a();
    }
}
