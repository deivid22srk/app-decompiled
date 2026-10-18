package com.google.android.finsky.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.services.LoadConsumptionDataService;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.widget.consumption.NowPlayingWidgetProvider;

/* loaded from: classes.dex */
public class ConsumptionAppDataChangedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            FinskyLog.a("Consumption app update contained no extras.", new Object[0]);
            return;
        }
        if (!extras.containsKey("Play.BackendId")) {
            FinskyLog.a("Consumption app did not specify backend id, ignoring!", new Object[0]);
            return;
        }
        if (!extras.containsKey("Play.DataType")) {
            FinskyLog.a("Consumption app did not specify which list type was updated, ignoring!", new Object[0]);
            return;
        }
        int i = extras.getInt("Play.BackendId");
        int i2 = extras.getInt("Play.DataType");
        if (com.google.android.finsky.widget.r.a(context).a(NowPlayingWidgetProvider.class, com.google.android.finsky.widget.s.a(i), true).length == 0) {
            new Object[1][0] = Integer.valueOf(i);
        } else if (LoadConsumptionDataService.a(i) && LoadConsumptionDataService.b(i2)) {
            LoadConsumptionDataService.a(context, i);
        } else {
            FinskyLog.a("Either backendId=[%d] or dataType=[%d] is not supported.", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }
}
