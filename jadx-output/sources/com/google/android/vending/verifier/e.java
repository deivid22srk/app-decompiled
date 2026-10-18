package com.google.android.vending.verifier;

import android.content.Context;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class e implements com.android.volley.t<com.google.android.vending.verifier.a.h> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f7152a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PackageVerificationService f7153b;

    e(PackageVerificationService packageVerificationService, l lVar) {
        this.f7153b = packageVerificationService;
        this.f7152a = lVar;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(com.google.android.vending.verifier.a.h hVar) {
        com.google.android.vending.verifier.a.h hVar2 = hVar;
        FinskyLog.a("Verification id=%d response=%d", Integer.valueOf(this.f7152a.f7165a), Integer.valueOf(hVar2.f7114a));
        PackageVerificationService packageVerificationService = this.f7153b;
        this.f7152a.D = hVar2.d;
        if (hVar2.e) {
            PackageVerificationService.c(this.f7153b, this.f7152a);
        }
        switch (hVar2.f7114a) {
            case 1:
                this.f7152a.C = hVar2.f7115b;
                this.f7152a.B = -1;
                this.f7152a.E = hVar2.f;
                this.f7153b.a(packageVerificationService, this.f7152a, this.f7152a.B);
                PackageWarningDialog.a(packageVerificationService, this.f7152a.f7165a, 1, this.f7152a.u, this.f7152a.C, this.f7152a.E);
                break;
            case 2:
            default:
                this.f7152a.B = 1;
                this.f7153b.a((Context) packageVerificationService, this.f7152a);
                break;
            case 3:
                this.f7152a.C = hVar2.f7115b;
                this.f7152a.E = hVar2.f;
                if (!this.f7152a.h) {
                    this.f7153b.getPackageManager().extendVerificationTimeout(this.f7152a.f7165a, -1, com.google.android.finsky.c.d.cm.b().longValue());
                }
                PackageWarningDialog.a(packageVerificationService, this.f7152a.f7165a, 0, this.f7152a.u, this.f7152a.C, this.f7152a.E);
                break;
        }
    }
}
