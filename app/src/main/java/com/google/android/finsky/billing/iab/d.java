package com.google.android.finsky.billing.iab;

import android.os.Bundle;
import com.android.volley.VolleyError;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class d implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f2239a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Semaphore f2240b;
    final /* synthetic */ b c;

    d(b bVar, Bundle bundle, Semaphore semaphore) {
        this.c = bVar;
        this.f2239a = bundle;
        this.f2240b = semaphore;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        this.f2239a.putInt("RESPONSE_CODE", n.RESULT_ERROR.l);
        this.f2240b.release();
    }
}
