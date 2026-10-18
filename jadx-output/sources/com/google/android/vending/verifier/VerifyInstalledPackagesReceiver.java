package com.google.android.vending.verifier;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public class VerifyInstalledPackagesReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i;
        boolean z = true;
        String action = intent.getAction();
        if (!"com.google.android.vending.verifier.intent.action.VERIFY_INSTALLED_PACKAGES".equals(action)) {
            if ("com.google.android.vending.verifier.intent.action.REMOVAL_REQUEST_RESPONSE".equals(action)) {
                FinskyLog.a("Handle removal request responses requested", new Object[0]);
                PackageVerificationService.a(context, intent);
                return;
            } else {
                FinskyLog.c("Unexpected action %s", action);
                return;
            }
        }
        if (!com.google.android.finsky.c.d.cf.b().booleanValue()) {
            FinskyLog.a("Skipping verification because disabled", new Object[0]);
            z = false;
        } else {
            ContentResolver contentResolver = context.getContentResolver();
            if (Build.VERSION.SDK_INT >= 17) {
                i = Settings.Global.getInt(contentResolver, "package_verifier_enable", 1);
            } else {
                i = Settings.Secure.getInt(contentResolver, "package_verifier_enable", 1);
            }
            if (!(i != 0)) {
                FinskyLog.a("Skipping verification because verify apps is not enabled", new Object[0]);
                z = false;
            } else if (!FinskyApp.a().l.e()) {
                FinskyLog.a("Skipping verification because network inactive", new Object[0]);
                PackageVerificationLoggingService.a(context, true, 1, null, null, null, null);
                z = false;
            }
        }
        if (z) {
            FinskyLog.a("Verify installed apps requested", new Object[0]);
            PackageVerificationService.a(context, intent);
        }
    }

    public static void a(Context context) {
        context.sendBroadcast(new Intent("com.google.android.vending.verifier.intent.action.VERIFY_INSTALLED_PACKAGES"));
    }
}
