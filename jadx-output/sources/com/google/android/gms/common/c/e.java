package com.google.android.gms.common.c;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public final class e {
    public static boolean a(Context context, String str) {
        try {
            return (context.getPackageManager().getApplicationInfo(str, 0).flags & 2097152) != 0;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
