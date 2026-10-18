package com.google.android.vending.verifier;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.dw;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
final class i implements com.android.volley.t<com.google.android.vending.verifier.apkg.h[]> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f7160a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PackageVerificationService f7161b;

    i(PackageVerificationService packageVerificationService, List list) {
        this.f7161b = packageVerificationService;
        this.f7160a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [byte[][], java.io.Serializable] */
    @Override // com.android.volley.t
    public final /* synthetic */ void a_(com.google.android.vending.verifier.apkg.h[] hVarArr) {
        PackageInfo packageInfo;
        ComponentName b2;
        int i = 0;
        com.google.android.vending.verifier.apkg.h[] hVarArr2 = hVarArr;
        while (true) {
            int i2 = i;
            if (i2 < this.f7160a.size()) {
                b bVar = (b) this.f7160a.get(i2);
                com.google.android.vending.verifier.apkg.h hVar = hVarArr2[i2];
                if (hVar != null && hVar.f7114a != 0) {
                    try {
                        packageInfo = FinskyApp.a().getPackageManager().getPackageInfo(bVar.f7116a, 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                        String a2 = PackageVerificationService.a(applicationInfo);
                        dw dwVar = FinskyApp.a().n;
                        switch (hVar.f7114a) {
                            case 1:
                            case 3:
                                b2 = this.f7161b.b();
                                if (b2 != null) {
                                    Intent intent = new Intent("com.google.android.vending.verifier.APPLICATION_REMOVED");
                                    intent.setComponent(b2);
                                    intent.putExtra("digest", bVar.c);
                                    intent.putExtra("package_name", applicationInfo.packageName);
                                    intent.putExtra("version_code", packageInfo.versionCode);
                                    intent.putExtra("package_cert_fingerprints", (Serializable) bVar.k);
                                    intent.putExtra("description_string", hVar.f7115b);
                                    this.f7161b.sendBroadcast(intent);
                                } else {
                                    dwVar.a(a2, bVar.f7116a, hVar.f7115b, hVar.f);
                                }
                                PackageVerificationService.b(applicationInfo);
                                break;
                        }
                    }
                }
                i = i2 + 1;
            } else {
                PackageVerificationService.a(this.f7161b, true);
                return;
            }
        }
    }
}
