package com.google.android.finsky.billing;

import com.google.android.finsky.protos.bq;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class d implements com.android.volley.t<bq> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.api.b f2199a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int[] f2200b;
    final /* synthetic */ Semaphore c;
    final /* synthetic */ BillingAccountService d;

    d(BillingAccountService billingAccountService, com.google.android.finsky.api.b bVar, int[] iArr, Semaphore semaphore) {
        this.d = billingAccountService;
        this.f2199a = bVar;
        this.f2200b = iArr;
        this.c = semaphore;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(bq bqVar) {
        BillingAccountService.a(bqVar.f3644a ? 1 : 2, this.f2200b, this.c);
    }
}
