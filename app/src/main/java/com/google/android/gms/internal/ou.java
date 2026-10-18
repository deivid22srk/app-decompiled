package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class ou extends com.google.android.gms.people.r<com.google.android.gms.people.e> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f6217a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f6218b = null;
    final /* synthetic */ com.google.android.gms.people.d c;
    final /* synthetic */ ot d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ou(ot otVar, com.google.android.gms.common.api.m mVar, String str, com.google.android.gms.people.d dVar) {
        super(mVar);
        this.d = otVar;
        this.f6217a = str;
        this.c = dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.kr
    public final /* bridge */ /* synthetic */ void a(com.google.android.gms.people.internal.m mVar) {
        mVar.a(this, this.f6217a, this.f6218b, this.c.c, this.c.f6395b, this.c.d, this.c.e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.kt
    public final com.google.android.gms.people.e a(Status status) {
        return new ov(this, status);
    }
}
