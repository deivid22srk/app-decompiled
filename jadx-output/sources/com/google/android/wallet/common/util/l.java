package com.google.android.wallet.common.util;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static l f7301a;

    public static l a() {
        if (f7301a == null) {
            f7301a = new l();
        }
        return f7301a;
    }

    public static boolean a(Context context, String str) {
        a();
        return a(context, context.getPackageName(), str);
    }

    public static boolean a(Activity activity, String str) {
        if (a((Context) activity, str)) {
            a();
            a();
            if (a(activity, a.a(activity), str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context) {
        a();
        return b(context, context.getPackageName());
    }

    public static boolean b(Context context, String str) {
        return a(context, str, "android.permission.ACCESS_COARSE_LOCATION") || a(context, str, "android.permission.ACCESS_FINE_LOCATION");
    }

    private static boolean a(Context context, String str, String str2) {
        return context.getPackageManager().checkPermission(str2, str) == 0;
    }
}
