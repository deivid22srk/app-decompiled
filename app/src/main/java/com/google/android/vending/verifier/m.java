package com.google.android.vending.verifier;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.AsyncTask;
import android.os.Build;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
final class m extends AsyncTask<Void, Void, Map<String, b>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PackageVerificationService f7167a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f7168b;
    private String c;

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Map<String, b> doInBackground(Void[] voidArr) {
        return a();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Map<String, b> map) {
        Map<String, b> map2 = map;
        if (isCancelled()) {
            return;
        }
        if (!map2.isEmpty()) {
            PackageVerificationService.a(this.f7167a, map2, this.c);
        } else {
            PackageVerificationService.a(this.f7167a, true);
        }
    }

    public m(PackageVerificationService packageVerificationService) {
        this.f7167a = packageVerificationService;
        this.f7168b = packageVerificationService;
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        FinskyLog.a("Verifying installed apps", new Object[0]);
    }

    @TargetApi(9)
    private Map<String, b> a() {
        boolean z;
        String b2;
        long j;
        byte[][] d;
        HashMap hashMap = new HashMap();
        List<PackageInfo> installedPackages = this.f7167a.getPackageManager().getInstalledPackages(64);
        c cVar = new c(this.f7168b);
        boolean b3 = r.b();
        boolean booleanValue = com.google.android.finsky.cpkg.d.cz.b().booleanValue();
        if (Build.VERSION.SDK_INT < 14) {
            z = false;
        } else {
            z = new Random().nextFloat() < com.google.android.finsky.cpkg.d.cA.b().floatValue();
        }
        com.google.android.finsky.gpkg.h hVar = FinskyApp.a().p;
        hVar.c();
        HashSet hashSet = new HashSet(cVar.a().keySet());
        for (PackageInfo packageInfo : installedPackages) {
            if (isCancelled()) {
                return null;
            }
            String str = packageInfo.packageName;
            hashSet.remove(str);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                boolean z2 = (applicationInfo.flags & 1) != 0;
                if (!z2 || (z && applicationInfo.enabled)) {
                    if (Build.VERSION.SDK_INT >= 9) {
                        j = packageInfo.lastUpdateTime;
                    } else {
                        j = packageInfo.versionCode;
                    }
                    boolean z3 = !hVar.a(str).isEmpty();
                    if (z3 || b3) {
                        if (!z3 || booleanValue) {
                            b a2 = cVar.a(str);
                            if (a2 == null || j != a2.f7117b) {
                                long j2 = 0;
                                byte[] bArr = null;
                                String str2 = applicationInfo.publicSourceDir;
                                File file = new File(str2);
                                if (!file.exists()) {
                                    FinskyLog.c("Cannot find file for %s", str2);
                                } else if (!file.canRead()) {
                                    FinskyLog.c("Cannot read file for %s", str2);
                                } else {
                                    j2 = file.length();
                                    try {
                                        bArr = PackageVerificationService.b(file);
                                    } catch (IOException e) {
                                        FinskyLog.c("Error while calculating sha256 for file=%s, error=%s", str2, e);
                                    } catch (NoSuchAlgorithmException e2) {
                                        throw new RuntimeException(e2);
                                    }
                                }
                                if (bArr != null) {
                                    a2 = new b(str, j, bArr, j2, !applicationInfo.publicSourceDir.equals(applicationInfo.sourceDir), false);
                                    cVar.a(a2);
                                }
                            }
                            a2.g = z3;
                            a2.h = (applicationInfo.flags & 2097152) != 0;
                            a2.i = z2;
                            a2.j = (applicationInfo.flags & 128) != 0;
                            d = PackageVerificationService.d(packageInfo.signatures);
                            a2.k = d;
                            hashMap.put(a2.f7116a, a2);
                            FinskyLog.a("Adding %s for verification", str);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            cVar.b((String) it.next());
        }
        b2 = PackageVerificationService.b(this.f7168b);
        this.c = b2;
        return hashMap;
    }
}
