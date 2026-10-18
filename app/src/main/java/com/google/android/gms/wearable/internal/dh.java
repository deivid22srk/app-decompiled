package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes.dex */
final class dh extends ct<com.google.android.gms.wearable.n> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Uri f6618a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f6619b;
    final /* synthetic */ dd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dh(dd ddVar, com.google.android.gms.common.api.m mVar, Uri uri, int i) {
        super(mVar);
        this.c = ddVar;
        this.f6618a = uri;
        this.f6619b = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.kr
    public final /* synthetic */ void a(ca caVar) {
        caVar.o().a(new bx(this), this.f6618a, this.f6619b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.kt
    public final com.google.android.gms.wearable.n a(Status status) {
        return new com.google.android.gms.wearable.n(DataHolder.b(status.g));
    }
}
