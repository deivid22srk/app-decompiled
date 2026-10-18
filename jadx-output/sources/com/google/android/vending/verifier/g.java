package com.google.android.vending.verifier;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class g implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f7156a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PackageVerificationService f7157b;

    g(PackageVerificationService packageVerificationService, l lVar) {
        this.f7157b = packageVerificationService;
        this.f7156a = lVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        int a2 = PackageVerificationService.a(volleyError);
        Integer num = null;
        if (volleyError.f1195b != null) {
            num = Integer.valueOf(volleyError.f1195b.f1243a);
        }
        PackageVerificationLoggingService.a(this.f7157b, false, a2, this.f7156a.p, this.f7156a.q, this.f7156a.v, num);
        FinskyLog.d("Verification id=%d error response %s", Integer.valueOf(this.f7156a.f7165a), volleyError);
        this.f7157b.a((Context) this.f7157b, this.f7156a);
    }
}
