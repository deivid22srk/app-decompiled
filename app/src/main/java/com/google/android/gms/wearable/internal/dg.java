package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes.dex */
final class dg extends ct<com.google.android.gms.wearable.n> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dd f6617a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dg(dd ddVar, com.google.android.gms.common.api.m mVar) {
        super(mVar);
        this.f6617a = ddVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.kr
    public final /* synthetic */ void a(ca caVar) {
        caVar.o().b(new bx(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.kt
    public final com.google.android.gms.wearable.n a(Status status) {
        return new com.google.android.gms.wearable.n(DataHolder.b(status.g));
    }
}
