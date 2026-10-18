package com.google.android.finsky.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class by {
    public static void a(Context context, com.google.android.finsky.api.b bVar) {
        String b2 = com.google.android.gcm.b.b(context);
        if (!TextUtils.isEmpty(b2) && !b2.equals(bg.p.a())) {
            FinskyLog.a("Uploading GcmRegistration Id because not registered yet", new Object[0]);
            am.a().a(bVar, true, null);
        }
    }

    public static String a(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 8) {
            throw new UnsupportedOperationException("Device must be at least API Level 8 (instead of " + i + ")");
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gsf", 0);
            String b2 = com.google.android.gcm.b.b(context);
            if (TextUtils.isEmpty(b2)) {
                FinskyLog.a("Start requesting GCM Reg Id", new Object[0]);
                com.google.android.gcm.b.c(context);
                com.google.android.gcm.b.a(context, "932144863878");
                return null;
            }
            return b2;
        } catch (PackageManager.NameNotFoundException e) {
            throw new UnsupportedOperationException("Device does not have package com.google.android.gsf");
        }
    }
}
