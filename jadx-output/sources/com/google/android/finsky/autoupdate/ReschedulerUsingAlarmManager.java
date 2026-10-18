package com.google.android.finsky.autoupdate;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class ReschedulerUsingAlarmManager extends h {
    static void f() {
        AlarmManager alarmManager = (AlarmManager) FinskyApp.a().getSystemService("alarm");
        PendingIntent g = g();
        Long b2 = com.google.android.finsky.c.d.ds.b();
        if (b2.longValue() > 0) {
            alarmManager.set(3, SystemClock.elapsedRealtime() + b2.longValue(), g);
        }
        FinskyLog.a("Scheduling recheck in %d MS", b2);
    }

    private static PendingIntent g() {
        return PendingIntent.getService(FinskyApp.a(), 0, new Intent(FinskyApp.a(), (Class<?>) CheckWifiAndAutoUpdate.class), 0);
    }

    public class CheckWifiAndAutoUpdate extends Service implements u {
        @Override // android.app.Service
        public int onStartCommand(Intent intent, int i, int i2) {
            if (h.e()) {
                FinskyLog.a("Checking wifi: disabled, will check wifi again later.", new Object[0]);
                h.a(false);
                ReschedulerUsingAlarmManager.f();
                stopSelf();
                return 2;
            }
            h.a(new j(this));
            return 2;
        }

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            return null;
        }

        @Override // com.google.android.finsky.autoupdate.u
        public final void a(boolean z) {
            stopSelf();
        }
    }

    @Override // com.google.android.finsky.autoupdate.h
    public final boolean a() {
        return (com.google.android.finsky.f.a.a().b() || e()) ? false : true;
    }

    @Override // com.google.android.finsky.autoupdate.h
    public final void b() {
        ((AlarmManager) FinskyApp.a().getSystemService("alarm")).cancel(g());
        FinskyLog.a("Canceling auto-update wifi check.", new Object[0]);
        f();
        if (e()) {
            FinskyLog.a("Checking wifi: disabled, will check wifi again later.", new Object[0]);
            a(false);
        }
    }
}
