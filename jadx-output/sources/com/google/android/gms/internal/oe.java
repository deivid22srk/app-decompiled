package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class oe extends oi<com.google.android.gms.herrevad.d> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ od f6201a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    oe(od odVar, com.google.android.gms.common.api.h hVar, com.google.android.gms.common.api.m mVar) {
        super(hVar, mVar);
        this.f6201a = odVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.kr
    public final /* synthetic */ void a(nw nwVar) {
        nwVar.o().a(new of(this, this));
    }

    @Override // com.google.android.gms.internal.kt
    public final /* synthetic */ com.google.android.gms.common.api.x a(Status status) {
        return new og(status, null);
    }
}
