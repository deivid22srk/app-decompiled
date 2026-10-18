package com.google.android.vending.verifier;

import android.content.pm.ApplicationInfo;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.dw;
import java.util.List;

/* loaded from: classes.dex */
final class h implements com.android.volley.t<com.google.android.vending.verifier.a.h[]> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f7158a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PackageVerificationService f7159b;

    h(PackageVerificationService packageVerificationService, List list) {
        this.f7159b = packageVerificationService;
        this.f7158a = list;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(com.google.android.vending.verifier.a.h[] hVarArr) {
        ApplicationInfo a2;
        com.google.android.vending.verifier.a.h[] hVarArr2 = hVarArr;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f7158a.size()) {
                b bVar = (b) this.f7158a.get(i2);
                com.google.android.vending.verifier.a.h hVar = hVarArr2[i2];
                if (hVar != null && hVar.f7114a != 0 && (a2 = PackageVerificationService.a(bVar.f7116a)) != null) {
                    String a3 = PackageVerificationService.a(a2);
                    dw dwVar = FinskyApp.a().n;
                    switch (hVar.f7114a) {
                        case 1:
                            dwVar.a(a3, bVar.f7116a, hVar.f7115b, hVar.f);
                            PackageVerificationService.b(a2);
                            break;
                        case 3:
                            if (!bVar.f) {
                                PackageVerificationService.b(bVar.f7116a);
                                dwVar.a(a3, bVar.f7116a, hVar.f7115b, hVar.d, hVar.f);
                                break;
                            } else {
                                break;
                            }
                    }
                }
                i = i2 + 1;
            } else {
                PackageVerificationService.a(this.f7159b, true);
                return;
            }
        }
    }
}
