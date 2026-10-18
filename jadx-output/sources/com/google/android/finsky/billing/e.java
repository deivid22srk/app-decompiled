package com.google.android.finsky.billing;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class e implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.api.b f2201a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int[] f2202b;
    final /* synthetic */ Semaphore c;
    final /* synthetic */ BillingAccountService d;

    e(BillingAccountService billingAccountService, com.google.android.finsky.api.b bVar, int[] iArr, Semaphore semaphore) {
        this.d = billingAccountService;
        this.f2201a = bVar;
        this.f2202b = iArr;
        this.c = semaphore;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        int b2;
        FinskyLog.c("Received error: %s", volleyError);
        b2 = BillingAccountService.b(volleyError);
        BillingAccountService.a(b2, this.f2202b, this.c);
    }
}
