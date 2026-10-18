package com.google.android.vending.verifier;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.TargetApi;
import android.app.admin.DevicePolicyManager;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.UserManager;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bg;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private static s f7174a;

    static synchronized s a() {
        s sVar;
        boolean z;
        s uVar;
        synchronized (r.class) {
            if (f7174a == null) {
                if (com.google.android.finsky.cpkg.d.ck.b().booleanValue() && ((DevicePolicyManager) FinskyApp.a().getSystemService("device_policy")).isDeviceOwnerApp("com.google.android.apps.enterprise.dmagent")) {
                    for (Account account : ((AccountManager) FinskyApp.a().getSystemService("account")).getAccountsByType("com.google")) {
                        if (account.name.endsWith("@google.com")) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                    f7174a = new t((byte) 0);
                } else if (Build.VERSION.SDK_INT < 19) {
                    if (g()) {
                        f7174a = new y((byte) 0);
                    } else {
                        f7174a = new w((byte) 0);
                    }
                } else if (g()) {
                    f7174a = new x((byte) 0);
                } else {
                    f7174a = new v((byte) 0);
                }
                String a2 = bg.D.a();
                if (!f7174a.a().equals(a2)) {
                    if (a2.equals("PreferenceConsent")) {
                        uVar = new u((byte) 0);
                    } else if (a2.equals("PreferenceConsentWithExport")) {
                        uVar = new v((byte) 0);
                    } else if (a2.equals("PreferenceConsentWithExportPreKK")) {
                        uVar = new w((byte) 0);
                    } else if (a2.equals("SecureSettingsConsent")) {
                        uVar = new x((byte) 0);
                    } else if (a2.equals("SecureSettingsConsentPreKK")) {
                        uVar = new y((byte) 0);
                    } else if (a2.equals("GooglerConsent")) {
                        uVar = new t((byte) 0);
                    } else {
                        FinskyLog.d("Invalid verify apps consent model: %s", a2);
                        uVar = new u((byte) 0);
                    }
                    int b2 = uVar.b();
                    uVar.d();
                    f7174a.a(b2, null);
                    bg.D.a((com.google.android.finsky.cpkg.o<String>) f7174a.a());
                }
            }
            sVar = f7174a;
        }
        return sVar;
    }

    public static boolean b() {
        return !com.google.android.finsky.cpkg.d.cg.b().booleanValue() || d() || a().b() == 1;
    }

    public static boolean c() {
        if (!com.google.android.finsky.cpkg.d.cg.b().booleanValue() || d()) {
            return false;
        }
        return a().b() == -1;
    }

    private static boolean g() {
        int intValue = com.google.android.finsky.cpkg.d.cj.b().intValue();
        if (intValue == -1) {
            return false;
        }
        try {
            PackageInfo packageInfo = FinskyApp.a().getPackageManager().getPackageInfo("com.google.android.gms", 0);
            if (packageInfo != null) {
                if (packageInfo.versionCode >= intValue) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    @TargetApi(21)
    protected static boolean d() {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        UserManager userManager = (UserManager) FinskyApp.a().getSystemService("user");
        return userManager != null && userManager.hasUserRestriction("ensure_verify_apps");
    }

    static boolean e() {
        return com.google.android.finsky.cpkg.d.ci.b().booleanValue() && a().c() && a().b() == 0;
    }

    public static void f() {
        if (e()) {
            a().a(1, false);
        }
    }
}
