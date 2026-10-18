package com.google.android.finsky.services;

import android.accounts.Account;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.rf;
import com.google.android.finsky.protos.rg;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

/* loaded from: classes.dex */
final class aa extends com.deivid22srk.store.licensing.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LicensingService f4562a;

    aa(LicensingService licensingService) {
        this.f4562a = licensingService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // com.deivid22srk.store.licensing.ILicensingService
    public final void a(long j, String str, com.deivid22srk.store.licensing.a aVar) {
        ?? r7 = 258;
        r7 = 258;
        r7 = 258;
        ?? r72 = 258;
        try {
            PackageInfo packageInfo = this.f4562a.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo.applicationInfo.uid != getCallingUid()) {
                LicensingService.a(aVar, 259, null, null);
            } else {
                int i = packageInfo.versionCode;
                com.google.android.finsky.b.a aVar2 = FinskyApp.a().s;
                aVar2.f2060a.c();
                com.google.android.finsky.b.b a2 = aVar2.a(str);
                if (a2 == null) {
                    FinskyLog.e("Unexpected null appState for %s", str);
                    LicensingService.a(aVar, 258, null, null);
                } else {
                    if (a2.d != null) {
                        String str2 = a2.d.i;
                        boolean isEmpty = TextUtils.isEmpty(str2);
                        r72 = str2;
                        if (!isEmpty) {
                            a(j, str, aVar, i, str2);
                            r7 = str2;
                        }
                    }
                    com.google.android.finsky.g.h hVar = FinskyApp.a().p;
                    hVar.c();
                    List<Account> a3 = hVar.a(str, a2.c.f2138b);
                    if (!a3.isEmpty()) {
                        String str3 = a3.get(0).name;
                        a(j, str, aVar, i, str3);
                        r7 = str3;
                    } else {
                        Account b2 = com.google.android.finsky.api.a.b(this.f4562a);
                        if (b2 != null) {
                            String str4 = b2.name;
                            a(j, str, aVar, i, str4);
                            r7 = str4;
                        } else {
                            LicensingService.a(aVar, 1, null, null);
                            r7 = r72;
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            LicensingService.a(aVar, r7, null, null);
        }
    }

    private void a(long j, String str, com.deivid22srk.store.licensing.a aVar, int i, String str2) {
        boolean z = str2 != null && str2.endsWith("@android-for-work.gserviceaccount.com");
        boolean a2 = FinskyApp.a().e().a(12607225L);
        if (z || a2) {
            FinskyApp.a().b(str2).a(str, i, j, new ab(this, aVar), new ac(this, aVar));
            return;
        }
        rf rfVar = new rf();
        rfVar.f4329a = str;
        rfVar.f4330b = true;
        rfVar.c = i;
        rfVar.d = true;
        rfVar.e = j;
        rfVar.f = true;
        com.google.android.vending.a.a.a c = FinskyApp.a().c(str2);
        c.f7099a.a(com.google.android.vending.a.a.e.a("https://android.clients.google.com/vending/api/ApiRequest", rf.class, rfVar, rg.class, new ad(this, aVar), c.f7100b, new ae(this, aVar)));
    }
}
