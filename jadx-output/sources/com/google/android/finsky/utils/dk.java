package com.google.android.finsky.utils;

/* loaded from: classes.dex */
final class dk implements com.google.android.gms.common.api.y<com.google.android.gms.herrevad.d> {
    dk() {
    }

    @Override // com.google.android.gms.common.api.y
    public final /* synthetic */ void a(com.google.android.gms.herrevad.d dVar) {
        com.google.android.gms.common.api.m mVar;
        com.google.android.gms.common.api.m mVar2;
        com.google.android.gms.herrevad.d dVar2 = dVar;
        if (dVar2 != null && dVar2.b().a()) {
            dj.a(dVar2.a());
        } else {
            FinskyLog.d("Failed to fetch PredictedNetworkQuality", new Object[0]);
        }
        mVar = dj.f4829b;
        if (mVar != null) {
            mVar2 = dj.f4829b;
            mVar2.d();
            dj.d();
        }
    }
}
