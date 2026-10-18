package com.google.android.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    static String f5252a;

    /* renamed from: b, reason: collision with root package name */
    private static GCMBroadcastReceiver f5253b;

    public static void a(Context context, String... strArr) {
        String a2 = a(strArr);
        Log.v("GCMRegistrar", "Registering app " + context.getPackageName() + " of senders " + a2);
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gsf");
        intent.putExtra("app", PendingIntent.getBroadcast(context, 0, new Intent(), 0));
        intent.putExtra("sender", a2);
        context.startService(intent);
    }

    static String a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("No senderIds");
        }
        StringBuilder sb = new StringBuilder(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            sb.append(',').append(strArr[i]);
        }
        return sb.toString();
    }

    static synchronized void a(Context context) {
        synchronized (b.class) {
            if (f5253b == null) {
                if (f5252a == null) {
                    Log.e("GCMRegistrar", "internal error: retry receiver class not set yet");
                    f5253b = new GCMBroadcastReceiver();
                } else {
                    try {
                        f5253b = (GCMBroadcastReceiver) Class.forName(f5252a).newInstance();
                    } catch (Exception e) {
                        Log.e("GCMRegistrar", "Could not create instance of " + f5252a + ". Using " + GCMBroadcastReceiver.class.getName() + " directly.");
                        f5253b = new GCMBroadcastReceiver();
                    }
                }
                String packageName = context.getPackageName();
                IntentFilter intentFilter = new IntentFilter("com.google.android.gcm.intent.RETRY");
                intentFilter.addCategory(packageName);
                Log.v("GCMRegistrar", "Registering receiver");
                context.registerReceiver(f5253b, intentFilter, packageName + ".permission.C2D_MESSAGE", null);
            }
        }
    }

    private static int d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Coult not get package name: " + e);
        }
    }

    public static void c(Context context) {
        Log.d("GCMRegistrar", "resetting backoff for " + context.getPackageName());
        a(context, 3000);
    }

    public static String b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gcm", 0);
        String string = sharedPreferences.getString("regId", "");
        int i = sharedPreferences.getInt("appVersion", Integer.MIN_VALUE);
        int d = d(context);
        if (i != Integer.MIN_VALUE && i != d) {
            Log.v("GCMRegistrar", "App version changed from " + i + " to " + d + "; resetting registration id");
            a(context, "");
            return "";
        }
        return string;
    }

    static String a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gcm", 0);
        String string = sharedPreferences.getString("regId", "");
        int d = d(context);
        Log.v("GCMRegistrar", "Saving regId on app version " + d);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("regId", str);
        edit.putInt("appVersion", d);
        edit.commit();
        return string;
    }

    static void a(Context context, int i) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.android.gcm", 0).edit();
        edit.putInt("backoff_ms", i);
        edit.commit();
    }
}
