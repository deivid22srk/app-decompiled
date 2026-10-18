package com.google.android.finsky.autoupdate;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.IBinder;
import android.os.SystemClock;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class ReschedulerUsingBroadcast extends h {
    static void f() {
        boolean d = d();
        boolean e = e();
        a((Class<?>) PowerBroadcastReceiver.class, d());
        a((Class<?>) WifiBroadcastReceiver.class, e);
        FinskyLog.a("Enabling receivers: power=%s wifi=%s", Boolean.valueOf(d), Boolean.valueOf(e));
    }

    static void g() {
        a((Class<?>) PowerBroadcastReceiver.class, false);
        a((Class<?>) WifiBroadcastReceiver.class, false);
        FinskyLog.a("Disabled broadcast receivers for wifi and power.", new Object[0]);
    }

    private static void a(Class<?> cls, boolean z) {
        FinskyApp a2 = FinskyApp.a();
        a2.getPackageManager().setComponentEnabledSetting(new ComponentName(a2, cls), z ? 1 : 2, 1);
    }

    static void a(n nVar) {
        Long l;
        Long l2;
        Long l3;
        l = nVar.g;
        if (l.longValue() <= 0) {
            FinskyLog.e("Unexpected time interval should be > 0", new Object[0]);
            return;
        }
        AlarmManager alarmManager = (AlarmManager) FinskyApp.a().getSystemService("alarm");
        PendingIntent a2 = AutoUpdateRecheckForBroadcast.a(nVar);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        l2 = nVar.g;
        alarmManager.set(3, elapsedRealtime + l2.longValue(), a2);
        l3 = nVar.g;
        FinskyLog.a("Scheduling recheck in %d MS for state: %s", l3, nVar.name());
    }

    static void h() {
        ((AlarmManager) FinskyApp.a().getSystemService("alarm")).cancel(AutoUpdateRecheckForBroadcast.a(n.UNKNOWN));
        FinskyLog.a("Canceled alarm.", new Object[0]);
    }

    public class PowerBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.ACTION_POWER_CONNECTED".equals(intent.getAction())) {
                AutoUpdateRecheckForBroadcast.a();
            }
        }
    }

    public class WifiBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NetworkInfo networkInfo;
            if ("android.net.wifi.STATE_CHANGE".equals(intent.getAction()) && (networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo")) != null && networkInfo.isConnected()) {
                AutoUpdateRecheckForBroadcast.a();
            }
        }
    }

    public class AutoUpdateRecheckForBroadcast extends Service {

        /* renamed from: a, reason: collision with root package name */
        private int f2028a;

        @Override // android.app.Service
        public int onStartCommand(Intent intent, int i, int i2) {
            this.f2028a = i2;
            n valueOf = n.valueOf(intent.getStringExtra("Finksy.RecheckAutoUpdateFromAlarm"));
            FinskyLog.a("Handling state : %s", valueOf.name());
            switch (k.f2041a[valueOf.ordinal()]) {
                case 1:
                case 2:
                    h.a(Integer.valueOf(n.BROADCAST.ordinal()), false);
                    if (h.c()) {
                        ReschedulerUsingBroadcast.f();
                        ReschedulerUsingBroadcast.h();
                    } else {
                        ReschedulerUsingBroadcast.a(n.STABILIZER);
                    }
                    stopSelf(this.f2028a);
                    return 2;
                case 3:
                    if (!h.c()) {
                        b(valueOf);
                        return 2;
                    }
                    ReschedulerUsingBroadcast.a(n.THROTTLE);
                    h.a(Integer.valueOf(n.STABILIZER.ordinal()), false);
                    stopSelf(this.f2028a);
                    return 2;
                case 4:
                case 5:
                    if (!h.c()) {
                        b(valueOf);
                        return 2;
                    }
                    ReschedulerUsingBroadcast.f();
                    ReschedulerUsingBroadcast.h();
                    h.a(Integer.valueOf(valueOf.ordinal()), false);
                    stopSelf(this.f2028a);
                    return 2;
                default:
                    FinskyLog.c("Unexpected state", new Object[0]);
                    stopSelf(this.f2028a);
                    return 2;
            }
        }

        private void b(n nVar) {
            h.a(new l(this, nVar));
        }

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            return null;
        }

        static void a() {
            ReschedulerUsingBroadcast.g();
            ReschedulerUsingBroadcast.a(n.DEBOUNCE);
        }

        static /* synthetic */ PendingIntent a(n nVar) {
            Intent intent = new Intent(FinskyApp.a(), (Class<?>) AutoUpdateRecheckForBroadcast.class);
            intent.putExtra("Finksy.RecheckAutoUpdateFromAlarm", nVar.name());
            return PendingIntent.getService(FinskyApp.a(), 0, intent, 134217728);
        }
    }

    @Override // com.google.android.finsky.autoupdate.h
    public final boolean a() {
        return (com.google.android.finsky.fpkg.a.a().b() || e() || d()) ? false : true;
    }

    @Override // com.google.android.finsky.autoupdate.h
    public final void b() {
        h();
        g();
        if (c()) {
            f();
            a((Integer) null, false);
        } else if (com.google.android.finsky.fpkg.a.a().b()) {
            a(n.GEARHEAD);
            a((Integer) null, true);
        }
    }
}
