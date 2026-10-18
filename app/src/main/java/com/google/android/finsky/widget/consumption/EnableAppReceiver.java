package com.google.android.finsky.widget.consumption;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.finsky.utils.cr;

/* loaded from: classes.dex */
public class EnableAppReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("backendId", 0);
        context.getPackageManager().setApplicationEnabledSetting(cr.a(intExtra), 1, 0);
        Intent intent2 = new Intent("com.deivid22srk.store.action.APPWIDGET_UPDATE_CONSUMPTION_DATA");
        intent2.setClass(context, NowPlayingWidgetProvider.class);
        intent2.putExtra("backendId", intExtra);
        context.sendBroadcast(intent2);
    }

    public static PendingIntent a(Context context, int i) {
        Intent intent = new Intent(context, (Class<?>) EnableAppReceiver.class);
        intent.setData(Uri.parse("content://" + context.getPackageName() + "/enable/" + i));
        intent.putExtra("backendId", i);
        return PendingIntent.getBroadcast(context, 0, intent, 0);
    }
}
