package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class ow extends com.google.android.gms.people.r<com.google.android.gms.people.g> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f6221a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f6222b = null;
    final /* synthetic */ com.google.android.gms.people.f c;
    final /* synthetic */ ot d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ow(ot otVar, com.google.android.gms.common.api.m mVar, String str, com.google.android.gms.people.f fVar) {
        super(mVar);
        this.d = otVar;
        this.f6221a = str;
        this.c = fVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.kr
    public final /* bridge */ /* synthetic */ void a(com.google.android.gms.people.internal.m mVar) {
        com.google.android.gms.people.internal.m mVar2 = mVar;
        String str = this.f6221a;
        String str2 = this.f6222b;
        com.google.android.gms.people.f fVar = this.c;
        if (fVar == null) {
            fVar = com.google.android.gms.people.f.f6396a;
        }
        mVar2.a(this, str, str2, fVar.f6397b, fVar.c, fVar.d, fVar.e, fVar.f, fVar.g, fVar.h, fVar.i, fVar.j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.kt
    public final /* synthetic */ com.google.android.gms.common.api.x a(Status status) {
        return new ox(this, status);
    }
}
