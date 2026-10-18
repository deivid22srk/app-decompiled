package com.google.android.finsky.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.services.LocationUpdaterService;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.db;

/* loaded from: classes.dex */
public class LocationProviderChangedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        db g = FinskyApp.a().g();
        if (Build.VERSION.SDK_INT >= 19) {
            if ("android.location.MODE_CHANGED".equals(intent.getAction())) {
                try {
                    if (Settings.Secure.getInt(context.getContentResolver(), "location_mode") == 0) {
                        a(1005);
                        g.a();
                    } else {
                        a(1006);
                        LocationUpdaterService.a(context);
                    }
                    return;
                } catch (Settings.SettingNotFoundException e) {
                    FinskyLog.b(e, "LOCATION_MODE setting change received but no setting was found!", new Object[0]);
                    return;
                }
            }
            return;
        }
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (!locationManager.isProviderEnabled("network") && !locationManager.isProviderEnabled("gps")) {
            a(1005);
            g.a();
        } else {
            a(1006);
            LocationUpdaterService.a(context);
        }
    }

    private static void a(int i) {
        FinskyApp.a().h().b(new com.google.android.finsky.apkg.b(i).f1473a);
    }
}
