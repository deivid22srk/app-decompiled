package com.google.android.vending.verifier;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public class PackageVerificationActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        setVisible(false);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (!"android.intent.action.VIEW".equals(action) && !"android.intent.action.INSTALL_PACKAGE".equals(action)) {
            FinskyLog.c("Unexpected action %s", action);
        } else {
            if (Build.VERSION.SDK_INT >= 17) {
                FinskyLog.e("Skipping verification. Unexpected SDK=%d", Integer.valueOf(Build.VERSION.SDK_INT));
                z = false;
            } else if (r.c()) {
                FinskyLog.a("Skipping verification. Disabled by user setting", new Object[0]);
                z = false;
            } else if (!com.google.android.finsky.c.d.cn.b().booleanValue()) {
                FinskyLog.a("Skipping verification. Disabled by Gservices", new Object[0]);
                z = false;
            } else if (FinskyApp.a().l.e()) {
                z = true;
            } else {
                FinskyLog.a("Skipping verification. Network inactive", new Object[0]);
                z = false;
            }
            if (z) {
                FinskyLog.c("Verification requested through action=%s", action);
                intent.putExtra("com.google.android.vending.verifier.extra.FROM_VERIFICATION_ACTIVITY", true);
                PackageVerificationService.a(this, intent);
            } else {
                intent.setPackage("com.android.packageinstaller");
                intent.setComponent(new ComponentName("com.android.packageinstaller", "com.android.packageinstaller.PackageInstallerActivity"));
                startActivity(intent);
            }
        }
        finish();
    }
}
