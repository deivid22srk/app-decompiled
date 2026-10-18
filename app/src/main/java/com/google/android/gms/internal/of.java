package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.herrevad.PredictedNetworkQuality;

/* loaded from: classes.dex */
final class of extends nm<com.google.android.gms.herrevad.d> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ oe f6202b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    of(oe oeVar, ks ksVar) {
        super(ksVar);
        this.f6202b = oeVar;
    }

    @Override // com.google.android.gms.internal.nm, com.google.android.gms.internal.np
    public final void a(Status status, PredictedNetworkQuality predictedNetworkQuality) {
        this.f6185a.a(new og(status, predictedNetworkQuality));
    }
}
