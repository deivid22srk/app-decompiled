package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import android.os.Build;
import java.io.File;

/* loaded from: classes.dex */
public final class c {
    public static jt a(Context context) {
        File file = new File(context.getCacheDir(), "volley");
        String str = "volley/0";
        try {
            String packageName = context.getPackageName();
            str = packageName + "/" + context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
        }
        jt jtVar = new jt(new pg(file, (byte) 0), new oq(Build.VERSION.SDK_INT >= 9 ? new qj() : new px(AndroidHttpClient.newInstance(str))), (byte) 0);
        jtVar.a();
        return jtVar;
    }
}
