package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;

/* loaded from: classes.dex */
final class lh extends mb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ lc f6132a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ResolveAccountResponse f6133b;
    final /* synthetic */ lg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    lh(lg lgVar, lz lzVar, lc lcVar, ResolveAccountResponse resolveAccountResponse) {
        super(lzVar);
        this.c = lgVar;
        this.f6132a = lcVar;
        this.f6133b = resolveAccountResponse;
    }

    @Override // com.google.android.gms.internal.mb
    public final void a() {
        lc lcVar = this.f6132a;
        ResolveAccountResponse resolveAccountResponse = this.f6133b;
        if (lcVar.b(0)) {
            ConnectionResult connectionResult = resolveAccountResponse.c;
            if (connectionResult.b()) {
                lcVar.g = com.google.android.gms.common.internal.ae.a(resolveAccountResponse.f5691b);
                lcVar.f = true;
                lcVar.h = resolveAccountResponse.d;
                lcVar.i = resolveAccountResponse.e;
                lcVar.e();
                return;
            }
            if (!lcVar.a(connectionResult)) {
                lcVar.b(connectionResult);
            } else {
                lcVar.h();
                lcVar.e();
            }
        }
    }
}
