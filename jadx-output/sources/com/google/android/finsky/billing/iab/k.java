package com.google.android.finsky.billing.iab;

import android.os.Bundle;
import com.android.volley.VolleyError;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class k implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f2253a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Semaphore f2254b;
    final /* synthetic */ b c;

    k(b bVar, Bundle bundle, Semaphore semaphore) {
        this.c = bVar;
        this.f2253a = bundle;
        this.f2254b = semaphore;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        this.f2253a.putInt("RESPONSE_CODE", n.RESULT_ERROR.l);
        this.f2254b.release();
    }
}
