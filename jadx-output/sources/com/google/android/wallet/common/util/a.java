package com.google.android.wallet.common.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class a {
    public static boolean a(Context context) {
        return ((AccessibilityManager) context.getSystemService("accessibility")).isEnabled();
    }

    public static String a(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return null;
        }
        String packageName = callingActivity.getPackageName();
        if (packageName != null) {
            return packageName;
        }
        String valueOf = String.valueOf(callingActivity);
        Log.e("AndroidUtils", new StringBuilder(String.valueOf(valueOf).length() + 54).append("getCallingPackage(): Couldn't get a package name from ").append(valueOf).toString());
        return null;
    }

    @TargetApi(17)
    public static DisplayMetrics b(Context context) {
        if (Build.VERSION.SDK_INT >= 17) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
            return displayMetrics;
        }
        return context.getResources().getDisplayMetrics();
    }
}
