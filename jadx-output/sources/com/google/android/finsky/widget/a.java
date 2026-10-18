package com.google.android.finsky.widget;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.ar;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public abstract class a extends AppWidgetProvider {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    private final String[] f5163a = {"android.appwidget.action.APPWIDGET_ENABLED", "android.appwidget.action.APPWIDGET_DISABLED", "android.appwidget.action.APPWIDGET_UPDATE_OPTIONS", "android.appwidget.action.APPWIDGET_DELETED"};

    public abstract int a();

    public abstract void a(Context context, AppWidgetManager appWidgetManager, int... iArr);

    private ComponentName b(Context context) {
        return new ComponentName(context, getClass());
    }

    @SuppressLint({"NewApi"})
    public static int[] a(Context context, int i) {
        int[] iArr = {s.a(context, R.dimen.now_playing_default_width), s.a(context, R.dimen.now_playing_default_height), s.a(context, R.dimen.now_playing_default_width), s.a(context, R.dimen.now_playing_default_height)};
        if (Build.VERSION.SDK_INT >= 16) {
            Bundle appWidgetOptions = AppWidgetManager.getInstance(context).getAppWidgetOptions(i);
            iArr[0] = appWidgetOptions.getInt("appWidgetMinWidth");
            iArr[1] = appWidgetOptions.getInt("appWidgetMinHeight");
            iArr[2] = appWidgetOptions.getInt("appWidgetMaxWidth");
            iArr[3] = appWidgetOptions.getInt("appWidgetMaxHeight");
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        String action = intent.getAction();
        String[] strArr = this.f5163a;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!strArr[i].equals(action)) {
                i++;
            } else {
                int length2 = AppWidgetManager.getInstance(context).getAppWidgetIds(b(context)).length;
                String action2 = intent.getAction();
                int i2 = 0;
                while (true) {
                    if (i2 >= this.f5163a.length) {
                        i2 = 0;
                        break;
                    } else if (this.f5163a[i2].equals(action2)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                ar arVar = new ar();
                arVar.f1471a = a();
                arVar.f1472b = true;
                arVar.c = i2;
                arVar.d = true;
                arVar.e = length2;
                arVar.f = true;
                if ("android.appwidget.action.APPWIDGET_UPDATE_OPTIONS".equals(intent.getAction())) {
                    int intExtra = intent.getIntExtra("appWidgetId", 0);
                    int[] a2 = a(context, intExtra);
                    try {
                        arVar.g = s.a(r.a(context).b(getClass(), intExtra));
                        arVar.h = true;
                    } catch (IllegalArgumentException e) {
                        arVar.g = -1;
                        arVar.h = false;
                    }
                    arVar.i = a2[0];
                    arVar.j = true;
                    arVar.k = a2[1];
                    arVar.l = true;
                    arVar.m = a2[2];
                    arVar.n = true;
                    arVar.o = a2[3];
                    arVar.p = true;
                }
                com.google.android.finsky.a.b bVar = new com.google.android.finsky.a.b(507);
                bVar.f1473a.B = arVar;
                FinskyApp.a().h().b(bVar.f1473a);
            }
        }
        if ("com.android.launcher.action.APPWIDGET_DEFAULT_WORKSPACE_CONFIGURE".equals(action)) {
            int intExtra2 = intent.getIntExtra("appWidgetId", 0);
            AppWidgetManager appWidgetManager2 = AppWidgetManager.getInstance(context);
            r.a(context).a((Class<? extends a>) getClass(), intExtra2, intent.getStringExtra("type"));
            a(context, appWidgetManager2, intExtra2);
        }
        if ("com.deivid22srk.store.action.APPWIDGET_UPDATE_CONSUMPTION_DATA".equals(action)) {
            if (intent.hasExtra("backendId")) {
                r a3 = r.a(context);
                a(context, appWidgetManager, a3.a((Class<? extends a>) getClass(), s.a(intent.getIntExtra("backendId", 0)), false));
                a(context, appWidgetManager, a3.a((Class<? extends a>) getClass(), "all", false));
            } else {
                FinskyLog.e("No backend specified for update!", new Object[0]);
            }
        }
        if ("android.appwidget.action.APPWIDGET_UPDATE".equals(intent.getAction())) {
            if (intent.hasExtra("appWidgetId")) {
                int intExtra3 = intent.getIntExtra("appWidgetId", -1);
                if (intExtra3 == -1) {
                    FinskyLog.a("Received ACTION_APPWIDGET_UPDATE, with invalid widget ID.", new Object[0]);
                    return;
                } else {
                    FinskyLog.a("Received ACTION_APPWIDGET_UPDATE, updating widget %d.", Integer.valueOf(intExtra3));
                    a(context, appWidgetManager, intExtra3);
                    return;
                }
            }
            if (intent.hasExtra("appWidgetIds")) {
                int[] intArrayExtra = intent.getIntArrayExtra("appWidgetIds");
                FinskyLog.a("Received ACTION_APPWIDGET_UPDATE, updating %d widgets.", Integer.valueOf(intArrayExtra.length));
                a(context, appWidgetManager, intArrayExtra);
            } else if (com.google.android.finsky.c.d.f.b().booleanValue()) {
                a(context, appWidgetManager, appWidgetManager.getAppWidgetIds(b(context)));
            } else {
                FinskyLog.d("Refusing to update all widgets; need to narrow scope", new Object[0]);
            }
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(Context context, int[] iArr) {
        r a2 = r.a(context);
        for (int i : iArr) {
            a2.f5225a.a(r.a(getClass(), i));
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        a(context, appWidgetManager, iArr);
    }

    @TargetApi(14)
    public static PendingIntent a(Context context) {
        return PendingIntent.getActivity(context, 0, AccountManager.newChooseAccountIntent(null, null, com.google.android.finsky.api.a.a(), true, null, "androidmarket", null, com.google.android.finsky.activities.d.a(context)), 0);
    }

    public static void a(Context context, Class<?> cls, int... iArr) {
        Intent intent = new Intent(context, cls);
        intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
        intent.putExtra("appWidgetIds", iArr);
        context.sendBroadcast(intent);
    }
}
