package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class di extends ct<com.google.android.gms.wearable.i> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Uri f6620a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f6621b = 0;
    final /* synthetic */ dd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    di(dd ddVar, com.google.android.gms.common.api.m mVar, Uri uri) {
        super(mVar);
        this.c = ddVar;
        this.f6620a = uri;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.kr
    public final /* synthetic */ void a(ca caVar) {
        caVar.o().b(new bv(this), this.f6620a, this.f6621b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.kt
    public final com.google.android.gms.wearable.i a(Status status) {
        return new dk(status, 0);
    }
}
