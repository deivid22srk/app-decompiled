package com.google.android.finsky.billing;

import com.android.volley.VolleyError;
import com.google.android.finsky.protos.pw;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cl;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class c implements cl {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Semaphore f2174a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int[] f2175b;
    final /* synthetic */ BillingAccountService c;

    c(BillingAccountService billingAccountService, Semaphore semaphore, int[] iArr) {
        this.c = billingAccountService;
        this.f2174a = semaphore;
        this.f2175b = iArr;
    }

    @Override // com.google.android.finsky.utils.cl
    public final void a(pw pwVar) {
        this.f2174a.release();
    }

    @Override // com.google.android.finsky.utils.cl
    public final void a(VolleyError volleyError) {
        int b2;
        FinskyLog.d("Error while loading toc: %s", volleyError);
        int[] iArr = this.f2175b;
        b2 = BillingAccountService.b(volleyError);
        iArr[0] = b2;
        this.f2174a.release();
    }
}
