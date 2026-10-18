package com.google.android.finsky.services;

import android.content.pm.PackageManager;
import android.os.Binder;

/* loaded from: classes.dex */
public final class aj {
    protected aj() {
    }

    public static boolean a(PackageManager packageManager) {
        String[] packagesForUid;
        int callingUid = Binder.getCallingUid();
        com.google.android.gms.common.d.a();
        String[] packagesForUid2 = packageManager.getPackagesForUid(callingUid);
        if (!((packagesForUid2 == null || packagesForUid2.length == 0) ? false : com.google.android.gms.common.d.a(packageManager, packagesForUid2[0])) || (packagesForUid = packageManager.getPackagesForUid(callingUid)) == null) {
            return false;
        }
        for (String str : packagesForUid) {
            if ("com.google.android.apps.work.core".equals(str)) {
                return true;
            }
        }
        return false;
    }
}
