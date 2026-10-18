package com.google.android.finsky.billing.iab;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class g implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n[] f2245a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Semaphore f2246b;
    final /* synthetic */ b c;

    g(b bVar, n[] nVarArr, Semaphore semaphore) {
        this.c = bVar;
        this.f2245a = nVarArr;
        this.f2246b = semaphore;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.c("Error response on confirmPurchase: %s", volleyError.toString());
        this.f2245a[0] = n.RESULT_ERROR;
        this.f2246b.release();
    }
}
