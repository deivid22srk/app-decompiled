package com.google.android.gms.common;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.Log;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final d f5614a = new d();

    private d() {
    }

    public static d a() {
        return f5614a;
    }

    static i a(PackageInfo packageInfo, i... iVarArr) {
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        ci ciVar = new ci(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < iVarArr.length; i++) {
            if (iVarArr[i].equals(ciVar)) {
                return iVarArr[i];
            }
        }
        if (Log.isLoggable("GoogleSignatureVerifier", 2)) {
            Log.v("GoogleSignatureVerifier", "Signature not valid.  Found: \n" + Base64.encodeToString(ciVar.a(), 0));
        }
        return null;
    }

    private static boolean a(PackageInfo packageInfo, boolean z) {
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return false;
        }
        ci ciVar = new ci(packageInfo.signatures[0].toByteArray());
        if ((z ? h.a() : h.b()).contains(ciVar)) {
            return true;
        }
        if (Log.isLoggable("GoogleSignatureVerifier", 2)) {
            Log.v("GoogleSignatureVerifier", "Signature not valid.  Found: \n" + Base64.encodeToString(ciVar.a(), 0));
        }
        return false;
    }

    public static boolean a(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo == null) {
                return false;
            }
            if (c.a(packageManager)) {
                return a(packageInfo, true);
            }
            boolean a2 = a(packageInfo, false);
            if (a2 || !a(packageInfo, true)) {
                return a2;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
            return a2;
        } catch (PackageManager.NameNotFoundException e) {
            if (!Log.isLoggable("GoogleSignatureVerifier", 3)) {
                return false;
            }
            Log.d("GoogleSignatureVerifier", "Package manager can't find package " + str + ", defaulting to false");
            return false;
        }
    }
}
