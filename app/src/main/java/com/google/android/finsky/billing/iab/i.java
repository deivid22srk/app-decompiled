package com.google.android.finsky.billing.iab;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class i implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n[] f2249a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Semaphore f2250b;
    final /* synthetic */ b c;

    i(b bVar, n[] nVarArr, Semaphore semaphore) {
        this.c = bVar;
        this.f2249a = nVarArr;
        this.f2250b = semaphore;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.c("Error response on checkIabPromo: %s", volleyError.toString());
        this.f2249a[0] = n.RESULT_ERROR;
        this.f2250b.release();
    }
}
