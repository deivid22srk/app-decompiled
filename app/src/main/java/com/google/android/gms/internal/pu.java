package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class pu extends pk<com.google.android.gms.safetynet.e> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ pt f6235a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    pu(pt ptVar, com.google.android.gms.common.api.m mVar) {
        super(mVar);
        this.f6235a = ptVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.kr
    public final /* synthetic */ void a(ps psVar) {
        psVar.o().a(new pv(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.kt
    public final com.google.android.gms.safetynet.e a(Status status) {
        return new pw(status, null);
    }
}
