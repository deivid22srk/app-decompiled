package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
final class lf extends mb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ lc f6129a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ConnectionResult f6130b;
    final /* synthetic */ le c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    lf(le leVar, lz lzVar, lc lcVar, ConnectionResult connectionResult) {
        super(lzVar);
        this.c = leVar;
        this.f6129a = lcVar;
        this.f6130b = connectionResult;
    }

    @Override // com.google.android.gms.internal.mb
    public final void a() {
        lc lcVar = this.f6129a;
        ConnectionResult connectionResult = this.f6130b;
        if (lcVar.b(2)) {
            if (connectionResult.b()) {
                lcVar.g();
            } else if (!lcVar.a(connectionResult)) {
                lcVar.b(connectionResult);
            } else {
                lcVar.h();
                lcVar.g();
            }
        }
    }
}
