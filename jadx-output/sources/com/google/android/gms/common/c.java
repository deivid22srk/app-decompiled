package com.google.android.gms.common;

import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f5600a = 8298000;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f5601b = false;
    public static boolean c = false;
    private static int e = -1;
    private static final Object f = new Object();
    private static String g = null;
    private static Integer h = null;
    static final AtomicBoolean d = new AtomicBoolean();
    private static final AtomicBoolean i = new AtomicBoolean();

    @Deprecated
    public static boolean a(int i2) {
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 9:
                return true;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                return false;
        }
    }

    public static boolean a(int i2, Activity activity, Fragment fragment, int i3, DialogInterface.OnCancelListener onCancelListener) {
        Dialog b2 = b(i2, activity, fragment, i3, onCancelListener);
        if (b2 == null) {
            return false;
        }
        a(activity, onCancelListener, "GooglePlayServicesErrorDialog", b2);
        return true;
    }

    @Deprecated
    public static void b(Context context) {
        b.a();
        int a2 = b.a(context);
        if (a2 != 0) {
            b.a();
            Intent a3 = b.a(context, a2, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + a2);
            if (a3 != null) {
                throw new GooglePlayServicesRepairableException(a2, "Google Play Services not available", a3);
            }
            throw new GooglePlayServicesNotAvailableException(a2);
        }
    }

    @Deprecated
    public static boolean b(Context context, int i2) {
        if (i2 == 18) {
            return true;
        }
        if (i2 == 1) {
            return a(context, "com.google.android.gms");
        }
        return false;
    }

    private static boolean b(PackageManager packageManager) {
        boolean z;
        synchronized (f) {
            if (e == -1) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 64);
                    d.a();
                    if (d.a(packageInfo, h.f5667b[1]) != null) {
                        e = 1;
                    } else {
                        e = 0;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    e = 0;
                }
            }
            z = e != 0;
        }
        return z;
    }

    @Deprecated
    public static void c(Context context) {
        if (d.getAndSet(true)) {
            return;
        }
        try {
            ((NotificationManager) context.getSystemService("notification")).cancel(10436);
        } catch (SecurityException e2) {
        }
    }

    public static Resources d(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException e2) {
            return null;
        }
    }

    public static Context e(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException e2) {
            return null;
        }
    }

    public static String f(Context context) {
        ApplicationInfo applicationInfo;
        String str = context.getApplicationInfo().name;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e2) {
            applicationInfo = null;
        }
        return applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo).toString() : packageName;
    }

    @Deprecated
    public static int g(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static int a(Context context) {
        Integer num;
        int i2 = 9;
        if (com.google.android.gms.common.internal.g.f5709a) {
            return 0;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            context.getResources().getString(com.google.android.gms.b.common_google_play_services_unknown_issue);
        } catch (Throwable th) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !i.get()) {
            synchronized (f) {
                if (g == null) {
                    g = context.getPackageName();
                    try {
                        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        if (bundle != null) {
                            h = Integer.valueOf(bundle.getInt("com.google.android.gms.version"));
                        } else {
                            h = null;
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                        Log.wtf("GooglePlayServicesUtil", "This should never happen.", e2);
                    }
                } else if (!g.equals(context.getPackageName())) {
                    throw new IllegalArgumentException("isGooglePlayServicesAvailable should only be called with Context from your application's package. A previous call used package '" + g + "' and this call used package '" + context.getPackageName() + "'.");
                }
                num = h;
            }
            if (num == null) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
            if (num.intValue() != f5600a) {
                throw new IllegalStateException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + f5600a + " but found " + num + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 64);
            d.a();
            if (!com.google.android.gms.common.c.d.a(context)) {
                try {
                    i a2 = d.a(packageManager.getPackageInfo("com.android.vending", 8256), gb.f5657a);
                    if (a2 == null) {
                        Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                    } else if (d.a(packageInfo, a2) == null) {
                        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                    }
                    return i2;
                } catch (PackageManager.NameNotFoundException e3) {
                    Log.w("GooglePlayServicesUtil", "Google Play Store is neither installed nor updating.");
                    return i2;
                }
            }
            if (d.a(packageInfo, gb.f5657a) == null) {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            if (com.google.android.gms.common.c.d.a(packageInfo.versionCode) < com.google.android.gms.common.c.d.a(f5600a)) {
                Log.w("GooglePlayServicesUtil", "Google Play services out of date.  Requires " + f5600a + " but found " + packageInfo.versionCode);
                i2 = 2;
            } else {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo == null) {
                    try {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e4) {
                        Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e4);
                        i2 = 1;
                    }
                }
                i2 = !applicationInfo.enabled ? 3 : 0;
            }
            return i2;
        } catch (PackageManager.NameNotFoundException e5) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }

    public static boolean a(Context context, int i2) {
        if (a(context, i2, "com.google.android.gms")) {
            PackageManager packageManager = context.getPackageManager();
            d.a();
            if (d.a(packageManager, "com.google.android.gms")) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context, int i2, String str) {
        if (com.google.android.gms.common.c.g.a(19)) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).checkPackage(i2, str);
                return true;
            } catch (SecurityException e2) {
                return false;
            }
        }
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
        if (str == null || packagesForUid == null) {
            return false;
        }
        for (String str2 : packagesForUid) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(PackageManager packageManager) {
        if (!b(packageManager)) {
            if (f5601b ? c : "user".equals(Build.TYPE)) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public static Dialog a(int i2, Activity activity) {
        return b(i2, activity, null, -1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00db, code lost:
    
        if (r1 != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.app.Dialog b(int r9, android.app.Activity r10, android.support.v4.app.Fragment r11, int r12, android.content.DialogInterface.OnCancelListener r13) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.c.b(int, android.app.Activity, android.support.v4.app.Fragment, int, android.content.DialogInterface$OnCancelListener):android.app.Dialog");
    }

    public static void a(Activity activity, DialogInterface.OnCancelListener onCancelListener, String str, Dialog dialog) {
        if (activity instanceof android.support.v4.app.t) {
            e.a(dialog, onCancelListener).a(((android.support.v4.app.t) activity).d(), str);
        } else {
            if (!com.google.android.gms.common.c.g.a(11)) {
                throw new RuntimeException("This Activity does not support Fragments.");
            }
            a.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
        }
    }

    @Deprecated
    public static boolean b(int i2, Activity activity) {
        return a(i2, activity, null, 0, null);
    }

    public static boolean h(Context context) {
        return com.google.android.gms.common.c.g.a(21) && context.getPackageManager().hasSystemFeature("cn.google");
    }

    static boolean a(Context context, String str) {
        Bundle applicationRestrictions;
        if (com.google.android.gms.common.c.g.a(21)) {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
        }
        if (com.google.android.gms.common.c.g.a(18) && (applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName())) != null && "true".equals(applicationRestrictions.getString("restricted_profile"))) {
            return false;
        }
        try {
            return context.getPackageManager().getApplicationInfo(str, 8192).enabled;
        } catch (PackageManager.NameNotFoundException e2) {
            return false;
        }
    }
}
