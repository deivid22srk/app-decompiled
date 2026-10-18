package com.google.android.finsky.billing;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class ak implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f2164a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ai f2165b;

    ak(ai aiVar, Runnable runnable) {
        this.f2165b = aiVar;
        this.f2164a = runnable;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.c("PurchaseMetadataRequest failed: %s", volleyError);
        if (this.f2164a != null) {
            this.f2164a.run();
        }
    }
}
