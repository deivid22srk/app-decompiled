package com.google.android.vending.verifier;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class j implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PackageVerificationService f7162a;

    j(PackageVerificationService packageVerificationService) {
        this.f7162a = packageVerificationService;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.d("Multi verification error response %s", volleyError);
        PackageVerificationLoggingService.a(this.f7162a, true, PackageVerificationService.a(volleyError), null, null, null, volleyError.f1195b != null ? Integer.valueOf(volleyError.f1195b.f1243a) : null);
        PackageVerificationService.a(this.f7162a, false);
    }
}
