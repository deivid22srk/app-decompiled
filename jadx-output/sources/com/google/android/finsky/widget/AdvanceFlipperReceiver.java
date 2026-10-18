package com.google.android.finsky.widget;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViews;
import com.deivid22srk.store.R;

@TargetApi(11)
/* loaded from: classes.dex */
public class AdvanceFlipperReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a(context, intent.getIntExtra("appWidgetId", 0));
    }

    public static void a(Context context, int i) {
        if (i != 0) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.rec_widget_base);
            remoteViews.showNext(R.id.widget_flipper);
            AppWidgetManager.getInstance(context).partiallyUpdateAppWidget(i, remoteViews);
        }
    }

    public static PendingIntent b(Context context, int i) {
        Intent intent = new Intent(context, (Class<?>) AdvanceFlipperReceiver.class);
        intent.setData(Uri.parse("content://widget/advance/" + i));
        intent.putExtra("appWidgetId", i);
        return PendingIntent.getBroadcast(context, 0, intent, 0);
    }
}
