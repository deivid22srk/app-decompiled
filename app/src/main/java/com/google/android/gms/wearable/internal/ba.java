package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class ba extends ct<com.google.android.gms.wearable.v> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f6590a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f6591b;
    final /* synthetic */ byte[] c;
    final /* synthetic */ az d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ba(az azVar, com.google.android.gms.common.api.m mVar, String str, String str2, byte[] bArr) {
        super(mVar);
        this.d = azVar;
        this.f6590a = str;
        this.f6591b = str2;
        this.c = bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.kr
    public final /* synthetic */ void a(ca caVar) {
        caVar.o().a(new bt(this), this.f6590a, this.f6591b, this.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.kt
    public final com.google.android.gms.wearable.v a(Status status) {
        return new bb(status, -1);
    }
}
