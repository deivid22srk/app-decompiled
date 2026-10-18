package com.google.android.vending.verifier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ig;

/* loaded from: classes.dex */
public class PackageVerificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean z;
        int i;
        DfeToc dfeToc;
        String action = intent.getAction();
        if ("android.intent.action.PACKAGE_NEEDS_VERIFICATION".equals(action) || "android.intent.action.PACKAGE_VERIFIED".equals(action)) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                int i2 = extras.getInt("android.content.pm.extra.VERIFICATION_ID");
                if (!com.google.android.finsky.c.d.cf.b().booleanValue()) {
                    FinskyLog.a("Skipping verification because disabled", new Object[0]);
                    z = false;
                } else if (Build.VERSION.SDK_INT < 17) {
                    FinskyLog.a("Skipping verification because SDK=%d", Integer.valueOf(Build.VERSION.SDK_INT));
                    z = false;
                } else {
                    if (!(r.a() instanceof t)) {
                        if (!FinskyApp.a().l.e()) {
                            FinskyLog.a("Skipping verification because network inactive", new Object[0]);
                            PackageVerificationLoggingService.a(context, false, 1, extras.getString("android.content.pm.extra.VERIFICATION_PACKAGE_NAME"), (Integer) extras.get("android.content.pm.extra.VERIFICATION_VERSION_CODE"), null, null);
                            z = false;
                        } else {
                            if (extras.containsKey("android.content.pm.extra.VERIFICATION_INSTALLER_UID")) {
                                i = extras.getInt("android.content.pm.extra.VERIFICATION_INSTALLER_UID");
                            } else {
                                i = extras.getInt("android.intent.extra.ORIGINATING_UID");
                            }
                            if (i == Process.myUid()) {
                                FinskyLog.a("Skipping verification because own installation", new Object[0]);
                                z = false;
                            } else if (r.c()) {
                                FinskyLog.a("Skipping verification. Disabled by user setting", new Object[0]);
                                z = false;
                            }
                        }
                    }
                    z = true;
                }
                if (z) {
                    FinskyLog.a("Verification requested, id = %d", Integer.valueOf(i2));
                    PackageVerificationService.a(context, intent);
                    return;
                } else {
                    context.getPackageManager().verifyPendingInstall(i2, 1);
                    return;
                }
            }
            return;
        }
        if (!"com.google.android.finsky.action.TOC_SET".equals(action)) {
            FinskyLog.c("Unexpected action %s", action);
            return;
        }
        if (!r.e()) {
            return;
        }
        FinskyApp a2 = FinskyApp.a();
        String j = a2.j();
        if (!((j == null || (dfeToc = a2.g) == null || ig.a(j, dfeToc)) ? false : true)) {
            return;
        }
        r.a().a(1, false);
    }
}
