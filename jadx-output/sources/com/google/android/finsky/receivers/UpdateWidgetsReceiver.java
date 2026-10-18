package com.google.android.finsky.receivers;

import android.appwidget.AppWidgetManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.deivid22srk.store.MarketWidgetProvider;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.widget.consumption.NowPlayingWidgetProvider;
import com.google.android.finsky.widget.recommendation.RecommendedWidgetProvider;

/* loaded from: classes.dex */
public class UpdateWidgetsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static Class<?>[] f4432a = {MarketWidgetProvider.class, RecommendedWidgetProvider.class, NowPlayingWidgetProvider.class};

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        for (Class<?> cls : f4432a) {
            ComponentName componentName = new ComponentName(context, cls);
            int[] appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
            Intent intent2 = new Intent("android.appwidget.action.APPWIDGET_UPDATE");
            intent2.putExtra("appWidgetIds", appWidgetIds);
            intent2.setComponent(componentName);
            context.sendBroadcast(intent2);
            FinskyLog.a("Updated %d %s widgets (%s)", Integer.valueOf(appWidgetIds.length), cls.getSimpleName(), intent.getAction());
        }
    }
}
