package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
final class ll extends mb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ConnectionResult f6138a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ lk f6139b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ll(lk lkVar, lz lzVar, ConnectionResult connectionResult) {
        super(lzVar);
        this.f6139b = lkVar;
        this.f6138a = connectionResult;
    }

    @Override // com.google.android.gms.internal.mb
    public final void a() {
        this.f6139b.f6137a.b(this.f6138a);
    }
}
