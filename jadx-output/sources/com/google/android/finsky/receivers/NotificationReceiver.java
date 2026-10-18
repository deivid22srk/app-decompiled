package com.google.android.finsky.receivers;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.MainActivity;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.cr;
import com.google.android.finsky.utils.dt;

/* loaded from: classes.dex */
public class NotificationReceiver extends BroadcastReceiver {
    public static Intent a() {
        return new Intent(FinskyApp.a(), (Class<?>) NotificationReceiver.class).setAction("com.android.vending.NEW_UPDATE_CLICKED");
    }

    public static Intent a(String str, String str2) {
        return new Intent(FinskyApp.a(), (Class<?>) NotificationReceiver.class).setAction("com.android.vending.SUCCESSFULLY_INSTALLED_CLICKED").putExtra("package_name", str).putExtra("continue_url", str2);
    }

    public static Intent b() {
        return new Intent(FinskyApp.a(), (Class<?>) NotificationReceiver.class).setAction("com.android.vending.SUCCESSFULLY_UPDATED_CLICKED");
    }

    public static Intent c() {
        return new Intent(FinskyApp.a(), (Class<?>) NotificationReceiver.class).setAction("com.android.vending.SUCCESSFULLY_UPDATED_DELETED");
    }

    public static Intent d() {
        return new Intent(FinskyApp.a(), (Class<?>) NotificationReceiver.class).setAction("com.android.vending.OUTSTANDING_UPDATE_CLICKED");
    }

    public static Intent e() {
        return new Intent(FinskyApp.a(), (Class<?>) NotificationReceiver.class).setAction("com.android.vending.NEW_UPDATE_NEED_APPROVAL_CLICKED");
    }

    public static Intent f() {
        return new Intent(FinskyApp.a(), (Class<?>) NotificationReceiver.class).setAction("com.android.vending.UPDATE_ALL_CLICKED");
    }

    public static Intent b(String str, String str2) {
        return new Intent(FinskyApp.a(), (Class<?>) NotificationReceiver.class).setAction("com.android.vending.PREREGISTRATION_RELEASED_CLICKED").putExtra("package_name", str).putExtra("account_name", str2);
    }

    public static Intent a(String str) {
        return new Intent(FinskyApp.a(), (Class<?>) NotificationReceiver.class).setAction("com.android.vending.PREREGISTRATION_RELEASED_DELETE").putExtra("package_name", str);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (!"com.android.vending.UPDATE_ALL_CLICKED".equals(action)) {
            if (!"com.android.vending.NEW_UPDATE_CLICKED".equals(action)) {
                if ("com.android.vending.SUCCESSFULLY_INSTALLED_CLICKED".equals(action)) {
                    String stringExtra = intent.getStringExtra("package_name");
                    String stringExtra2 = intent.getStringExtra("continue_url");
                    a(901, stringExtra);
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra);
                    if (!TextUtils.isEmpty(stringExtra2)) {
                        launchIntentForPackage = cr.a(stringExtra, stringExtra2);
                    }
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = dt.a(context, stringExtra, (String) null, (String) null, com.google.android.finsky.api.s.a(stringExtra));
                    }
                    context.startActivity(launchIntentForPackage.setFlags(268435456));
                    return;
                }
                if (!"com.android.vending.SUCCESSFULLY_UPDATED_CLICKED".equals(action)) {
                    if (!"com.android.vending.SUCCESSFULLY_UPDATED_DELETED".equals(action)) {
                        if (!"com.android.vending.OUTSTANDING_UPDATE_CLICKED".equals(action)) {
                            if (!"com.android.vending.NEW_UPDATE_NEED_APPROVAL_CLICKED".equals(action)) {
                                if ("com.android.vending.PREREGISTRATION_RELEASED_CLICKED".equals(action)) {
                                    String stringExtra3 = intent.getStringExtra("package_name");
                                    String stringExtra4 = intent.getStringExtra("account_name");
                                    a(905, stringExtra3);
                                    FinskyApp.a().z.a(stringExtra3);
                                    Intent flags = cr.a(context, com.google.android.finsky.api.s.a(stringExtra3)).setFlags(268435456);
                                    if (stringExtra4 != null) {
                                        flags.putExtra("authAccount", stringExtra4);
                                    }
                                    context.startActivity(flags);
                                    return;
                                }
                                if ("com.android.vending.PREREGISTRATION_RELEASED_DELETE".equals(action)) {
                                    FinskyApp.a().z.a(intent.getStringExtra("package_name"));
                                    return;
                                }
                                return;
                            }
                            a(904, (String) null);
                            a(context);
                            return;
                        }
                        a(903, (String) null);
                        a(context);
                        return;
                    }
                    bg.aj.c();
                    return;
                }
                a(902, (String) null);
                bg.aj.c();
                context.startActivity(MainActivity.b(context).setFlags(268435456));
                return;
            }
            a(900, (String) null);
            a(context);
            return;
        }
        try {
            PendingIntent.getBroadcast(context, 0, new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"), 1073741824).send();
        } catch (PendingIntent.CanceledException e) {
            FinskyLog.a(e, "Error when broadcasting close system dialogs intent", new Object[0]);
        }
        FinskyApp.a().n.a();
        a(276, (String) null);
        context.startActivity(MainActivity.c(context).setFlags(268435456));
    }

    private static void a(Context context) {
        context.startActivity(MainActivity.b(context).setFlags(268435456));
    }

    private static void a(int i, String str) {
        if (str == null) {
            FinskyApp.a().h().a(i, (byte[]) null, (cy) null);
            return;
        }
        com.google.android.finsky.a.aj ajVar = new com.google.android.finsky.a.aj();
        ajVar.f1456b = str;
        ajVar.c = true;
        FinskyApp.a().h().a(i, ajVar, (cy) null);
    }
}
