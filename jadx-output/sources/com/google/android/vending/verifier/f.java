package com.google.android.vending.verifier;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.utils.FinskyLog;
import java.io.Serializable;

/* loaded from: classes.dex */
final class f implements com.android.volley.t<com.google.android.vending.verifier.a.h> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f7154a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PackageVerificationService f7155b;

    f(PackageVerificationService packageVerificationService, l lVar) {
        this.f7155b = packageVerificationService;
        this.f7154a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18, types: [byte[][], java.io.Serializable] */
    @Override // com.android.volley.t
    public final /* synthetic */ void a_(com.google.android.vending.verifier.a.h hVar) {
        ComponentName b2;
        com.google.android.vending.verifier.a.h hVar2 = hVar;
        FinskyLog.a("Verification id=%d response=%d", Integer.valueOf(this.f7154a.f7165a), Integer.valueOf(hVar2.f7114a));
        PackageVerificationService packageVerificationService = this.f7155b;
        this.f7154a.D = hVar2.d;
        if (hVar2.e) {
            PackageVerificationService.c(this.f7155b, this.f7154a);
        }
        switch (hVar2.f7114a) {
            case 1:
            case 3:
                this.f7154a.C = hVar2.f7115b;
                this.f7154a.B = -1;
                this.f7154a.E = hVar2.f;
                this.f7155b.a(packageVerificationService, this.f7154a, this.f7154a.B);
                b2 = this.f7155b.b();
                if (b2 != null) {
                    Intent intent = new Intent("com.google.android.vending.verifier.INSTALL_BLOCKED");
                    intent.setComponent(b2);
                    intent.putExtra("digest", this.f7154a.v);
                    intent.putExtra("package_name", this.f7154a.p);
                    intent.putExtra("version_code", this.f7154a.q);
                    intent.putExtra("package_certs", (Serializable) this.f7154a.r);
                    intent.putExtra("description_string", this.f7154a.C);
                    this.f7155b.sendBroadcast(intent);
                    this.f7155b.a((Context) packageVerificationService, this.f7154a);
                    break;
                } else {
                    PackageWarningDialog.a(packageVerificationService, this.f7154a.f7165a, 1, this.f7154a.u, this.f7154a.C, this.f7154a.E);
                    break;
                }
            case 2:
            default:
                this.f7154a.B = 1;
                this.f7155b.a((Context) packageVerificationService, this.f7154a);
                break;
        }
    }
}
