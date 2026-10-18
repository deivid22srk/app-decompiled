package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class df extends ct<com.google.android.gms.wearable.g> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Uri f6615a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ dd f6616b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    df(dd ddVar, com.google.android.gms.common.api.m mVar, Uri uri) {
        super(mVar);
        this.f6616b = ddVar;
        this.f6615a = uri;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.kr
    public final /* synthetic */ void a(ca caVar) {
        caVar.o().a(new bw(this), this.f6615a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.kt
    public final com.google.android.gms.wearable.g a(Status status) {
        return new dj(status, null);
    }
}
