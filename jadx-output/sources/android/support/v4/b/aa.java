package android.support.v4.b;

import android.content.Context;
import android.os.Process;

/* loaded from: classes.dex */
public final class aa {
    public static int a(Context context, String str) {
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String a2 = android.support.v4.app.f.a(str);
        if (a2 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            if (android.support.v4.app.f.a(context, a2, packageName) != 0) {
                return -2;
            }
        }
        return 0;
    }
}
