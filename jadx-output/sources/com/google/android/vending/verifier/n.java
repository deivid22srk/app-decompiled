package com.google.android.vending.verifier;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class n extends AsyncTask<Void, Void, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PackageVerificationService f7169a;

    /* renamed from: b, reason: collision with root package name */
    private final l f7170b;
    private final Context c;

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Boolean doInBackground(Void[] voidArr) {
        return a();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Boolean bool) {
        if (!bool.booleanValue()) {
            this.f7169a.a(this.c, this.f7170b);
            return;
        }
        if (r.b()) {
            this.f7169a.d(this.f7170b);
            return;
        }
        if (!com.google.android.finsky.c.d.ch.b().booleanValue()) {
            this.f7169a.a(this.c, this.f7170b);
            return;
        }
        if (!this.f7170b.h) {
            this.f7169a.getPackageManager().extendVerificationTimeout(this.f7170b.f7165a, 1, com.google.android.finsky.c.d.cm.b().longValue());
        }
        ConsentDialog.a(this.f7169a, this.f7170b.f7165a);
    }

    public n(PackageVerificationService packageVerificationService, l lVar) {
        this.f7169a = packageVerificationService;
        this.f7170b = lVar;
        this.c = packageVerificationService;
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        FinskyLog.a("Verification Requested for %s", this.f7170b);
    }

    private Boolean a() {
        boolean c;
        String b2;
        byte[][] c2;
        byte[][] c3;
        this.f7170b.B = 1;
        c = this.f7169a.c(this.f7170b);
        if (!c) {
            return false;
        }
        if (r.a() instanceof t) {
            this.f7170b.B = -1;
            this.f7170b.z = true;
            if (!FinskyApp.a().l.e()) {
                return false;
            }
        }
        if (this.f7170b.f != -1) {
            PackageManager packageManager = this.c.getPackageManager();
            String[] packagesForUid = packageManager.getPackagesForUid(this.f7170b.f);
            this.f7170b.l = packagesForUid;
            if (packagesForUid != null && packagesForUid.length > 0) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packagesForUid[0], 64);
                    l lVar = this.f7170b;
                    c3 = PackageVerificationService.c(packageInfo.signatures);
                    lVar.m = c3;
                    if (PackageVerificationService.a(this.f7170b.m, this.f7170b.r) && !r.b()) {
                        for (String str : packagesForUid) {
                            if (packageManager.checkPermission("android.permission.INSTALL_PACKAGES", str) == 0) {
                                FinskyLog.a("Skipping verification for id=%d", Integer.valueOf(this.f7170b.f7165a));
                                return false;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    FinskyLog.c("Could not retrieve signatures for package %s", packagesForUid[0]);
                }
            } else {
                this.f7170b.l = new String[]{String.format("uid:%d", Integer.valueOf(this.f7170b.f))};
            }
        } else {
            this.f7170b.l = null;
        }
        if (this.f7170b.g != -1) {
            PackageManager packageManager2 = this.c.getPackageManager();
            String[] packagesForUid2 = packageManager2.getPackagesForUid(this.f7170b.g);
            this.f7170b.n = packagesForUid2;
            if (packagesForUid2 != null && packagesForUid2.length > 0) {
                try {
                    PackageInfo packageInfo2 = packageManager2.getPackageInfo(packagesForUid2[0], 64);
                    l lVar2 = this.f7170b;
                    c2 = PackageVerificationService.c(packageInfo2.signatures);
                    lVar2.o = c2;
                } catch (PackageManager.NameNotFoundException e2) {
                    FinskyLog.c("Could not retrieve signatures for package %s", packagesForUid2[0]);
                }
            } else {
                this.f7170b.n = new String[]{String.format("uid:%d", Integer.valueOf(this.f7170b.g))};
            }
        } else {
            this.f7170b.n = null;
        }
        PackageVerificationService.a(this.f7170b);
        l lVar3 = this.f7170b;
        b2 = PackageVerificationService.b(this.c);
        lVar3.y = b2;
        return true;
    }
}
