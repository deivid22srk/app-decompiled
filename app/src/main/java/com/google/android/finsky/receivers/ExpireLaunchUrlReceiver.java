package com.google.android.finsky.receivers;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public class ExpireLaunchUrlReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        FinskyApp.a().r.b(intent.getExtras().getString("package_name"), (String) null);
        FinskyLog.a("Removed expired continue URL", new Object[0]);
    }

    public static void a(Context context, String str) {
        if (a(str)) {
            ((AlarmManager) context.getSystemService("alarm")).cancel(c(context, str));
        }
    }

    public static void b(Context context, String str) {
        if (a(str)) {
            ((AlarmManager) context.getSystemService("alarm")).set(1, System.currentTimeMillis() + com.google.android.finsky.cpkg.d.aR.b().longValue(), c(context, str));
        }
    }

    private static boolean a(String str) {
        if (Build.VERSION.SDK_INT < 13) {
            com.google.android.finsky.bpkg.t a2 = FinskyApp.a().r.a(str);
            if ((a2 == null || TextUtils.isEmpty(a2.n)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    private static PendingIntent c(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) ExpireLaunchUrlReceiver.class);
        intent.putExtra("package_name", str);
        return PendingIntent.getBroadcast(context, 1, intent, 1073741824);
    }
}
