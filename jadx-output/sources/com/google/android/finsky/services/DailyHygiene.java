package com.google.android.finsky.services;

import android.accounts.Account;
import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.provider.Settings;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.receivers.FlushLogsReceiver;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cb;
import com.google.android.finsky.utils.cg;
import com.google.android.finsky.utils.cn;
import com.google.android.finsky.utils.gc;
import com.google.android.finsky.utils.gh;
import com.google.android.finsky.utils.gi;
import com.google.android.finsky.utils.gx;
import com.google.android.finsky.utils.ic;
import com.google.android.finsky.utils.ik;
import com.google.android.finsky.utils.jo;
import com.google.android.finsky.wear.WearSupportService;
import com.google.android.vending.verifier.VerifyInstalledPackagesReceiver;

/* loaded from: classes.dex */
public class DailyHygiene extends Service {

    /* renamed from: a, reason: collision with root package name */
    public static final long f4545a = com.google.android.finsky.c.d.aI.b().longValue();

    /* renamed from: b, reason: collision with root package name */
    public static final long f4546b = com.google.android.finsky.c.d.aH.b().longValue();
    private static final long c = com.google.android.finsky.c.d.aF.b().longValue();
    private static final long d = com.google.android.finsky.c.d.aM.b().longValue();
    private static final long e = com.google.android.finsky.c.d.aG.b().longValue();
    private static final float f = com.google.android.finsky.c.d.aK.b().floatValue();
    private static final float g = com.google.android.finsky.c.d.aJ.b().floatValue();
    private static final int[] h = {1, 3, 9, 27, 81};
    private static final Intent i = new Intent(FinskyApp.a(), (Class<?>) DailyHygiene.class);
    private static boolean j = false;

    public static void a(Context context, long j2) {
        ((AlarmManager) context.getSystemService("alarm")).set(0, System.currentTimeMillis() + j2, PendingIntent.getService(context, 0, i, 0));
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        com.google.android.play.dfe.api.d a2;
        com.google.android.finsky.api.b b2 = FinskyApp.a().b((String) null);
        if (b2 == null || !com.google.android.finsky.c.d.aE.b().booleanValue()) {
            e();
            return;
        }
        boolean a3 = FinskyApp.a().e().a(12605765L);
        cg.a(b2, false, new m(this, a3, b2));
        if (a3 && (a2 = FinskyApp.a().a((Account) null)) != null) {
            a2.a(null, null, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (com.google.android.finsky.c.d.er.b().booleanValue() && ic.b(FinskyApp.a())) {
            f();
            return;
        }
        com.google.android.finsky.api.b b2 = FinskyApp.a().b((String) null);
        if (b2 == null) {
            f();
            return;
        }
        int k = FinskyApp.a().k();
        com.google.android.finsky.a.n nVar = new com.google.android.finsky.a.n();
        nVar.c = 0;
        nVar.d = true;
        nVar.e = true;
        nVar.f = true;
        cb.a(b2, com.google.android.finsky.utils.am.a(), new n(this, nVar, FinskyApp.a().h(), b2.c(), k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (b(FinskyApp.a().k())) {
            b(true);
            return;
        }
        o oVar = new o(this);
        FinskyApp.a().p.a(oVar);
        FinskyApp.a().q.a(oVar, "daily-hygiene");
        FinskyApp.a().s.a(oVar);
        com.google.android.finsky.f.a.a().a(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        WearSupportService.a(FinskyApp.a(), (String) null, "hygiene_reason_daily");
        FinskyApp a2 = FinskyApp.a();
        gc gcVar = a2.z;
        q qVar = new q(this, gcVar, a2, z);
        Context baseContext = getBaseContext();
        if (FinskyApp.a().e().a(12603110L)) {
            qVar.a(true);
            return;
        }
        if (!gcVar.c.a()) {
            FinskyLog.e("Require loaded libraries to perform pre-registration hygiene.", new Object[0]);
            qVar.a(true);
        } else {
            com.google.android.finsky.api.model.p pVar = new com.google.android.finsky.api.model.p();
            pVar.a(new gh(gcVar, pVar, qVar, baseContext));
            pVar.a(new gi(gcVar, qVar));
            pVar.a(gcVar.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        long a2;
        if (z) {
            if (com.google.android.finsky.utils.bg.r.a().longValue() == 0) {
                a2 = a(c, f);
                FinskyLog.a("Scheduling first run in %1.1f hours", Float.valueOf(a2 / 3600000.0f));
            } else {
                a2 = a(c, g);
            }
            com.google.android.finsky.utils.bg.r.a((com.google.android.finsky.c.o<Long>) Long.valueOf(System.currentTimeMillis()));
            com.google.android.finsky.utils.bg.z.a((com.google.android.finsky.c.o<Integer>) Integer.valueOf(com.google.android.finsky.g.av.a()));
        } else {
            int intValue = com.google.android.finsky.utils.bg.q.a().intValue() + 1;
            if (intValue <= h.length) {
                a2 = a(h[intValue - 1] * e, g);
                FinskyLog.a("Scheduling new run in %d minutes (failures=%d)", Long.valueOf(a2 / 60000), Integer.valueOf(intValue));
                com.google.android.finsky.utils.bg.q.a((com.google.android.finsky.c.o<Integer>) Integer.valueOf(intValue));
            } else {
                FinskyLog.a("Giving up. (failures=%d)", Integer.valueOf(intValue));
                com.google.android.finsky.utils.bg.q.c();
                a2 = a(c, g);
            }
        }
        a(this, a2);
        j = false;
        stopSelf();
    }

    public static boolean a() {
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(int i2) {
        int intValue = com.google.android.finsky.c.d.aO.b().intValue();
        int intValue2 = com.google.android.finsky.c.d.aP.b().intValue();
        if (intValue <= 0 || intValue2 <= 0) {
            return false;
        }
        if (i2 < intValue || i2 > intValue2) {
            return false;
        }
        FinskyLog.c("Scheduling emergency daily hygiene, %d <= %d <= %d", Integer.valueOf(intValue), Integer.valueOf(i2), Integer.valueOf(intValue2));
        return true;
    }

    public static void b() {
        com.google.android.finsky.c.o<Boolean> oVar = com.google.android.finsky.utils.bg.s;
        if (!oVar.a().booleanValue()) {
            FinskyLog.a("Canceling holdoff. Provisioned=%b", Boolean.valueOf(c()));
            oVar.a((com.google.android.finsky.c.o<Boolean>) true);
        }
    }

    @TargetApi(17)
    public static boolean c() {
        int i2;
        ContentResolver contentResolver = FinskyApp.a().getContentResolver();
        if (Build.VERSION.SDK_INT >= 17) {
            i2 = Settings.Global.getInt(contentResolver, "device_provisioned", 0);
        } else {
            i2 = Settings.Secure.getInt(contentResolver, "device_provisioned", 0);
        }
        return i2 != 0;
    }

    private static long a(long j2, float f2) {
        return (long) ((((((float) Math.random()) - 0.5f) * 2.0f * f2) + 1.0f) * j2);
    }

    public static void a(Context context, int i2) {
        if (!(com.google.android.finsky.utils.bg.r.a().longValue() < System.currentTimeMillis() - c) && !b(i2)) {
            int intValue = com.google.android.finsky.utils.bg.z.a().intValue();
            com.google.android.finsky.g.av.a();
            if (!(intValue != 11)) {
                FinskyLog.a("No need to run daily hygiene.", new Object[0]);
                return;
            }
        }
        FinskyLog.a("Dirty, need more hygiene.", new Object[0]);
        a(context, f4545a);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        boolean z;
        com.google.android.finsky.c.o<Boolean> oVar = com.google.android.finsky.utils.bg.s;
        if (oVar.a().booleanValue()) {
            z = false;
        } else if (c()) {
            FinskyLog.a("No holdoff required - already provisioned", new Object[0]);
            oVar.a((com.google.android.finsky.c.o<Boolean>) true);
            z = false;
        } else if (com.google.android.finsky.c.d.aL.b().longValue() <= 0) {
            FinskyLog.a("No holdoff required - disabled", new Object[0]);
            oVar.a((com.google.android.finsky.c.o<Boolean>) true);
            z = false;
        } else {
            FinskyLog.a("DailyHygiene holdoff continue", new Object[0]);
            z = true;
        }
        if (z) {
            a(this, d);
        } else {
            FinskyLog.a("Beginning daily hygiene", new Object[0]);
            j = true;
            if (FinskyApp.a().e().a(12605261L)) {
                FinskyLog.c("OTA cleanup disabled by kill-switch", new Object[0]);
                d();
            } else {
                jo.a(new l(this));
            }
        }
        return 2;
    }

    static /* synthetic */ void e(DailyHygiene dailyHygiene) {
        ContentSyncService.a().a();
        if (FinskyApp.a().m.f4968b) {
            dailyHygiene.a(true);
            return;
        }
        FinskyApp.a().p.d();
        com.google.android.finsky.autoupdate.p.a().a(new p(dailyHygiene), "daily_hygiene", ik.a());
    }

    static /* synthetic */ void b(DailyHygiene dailyHygiene, boolean z) {
        cn cnVar = new cn(FinskyApp.a());
        FinskyLog.a("Logging device features", new Object[0]);
        cnVar.f4806b = new com.google.android.gms.common.api.n(cnVar.f4805a, cnVar, cnVar).a(com.google.android.gms.b.a.f5388b).b();
        cnVar.f4806b.b();
        FlushLogsReceiver.b();
        if (com.google.android.finsky.c.d.cy.b().booleanValue()) {
            if (System.currentTimeMillis() > com.google.android.finsky.utils.bg.E.a().longValue() + com.google.android.finsky.c.d.co.b().longValue()) {
                VerifyInstalledPackagesReceiver.a(dailyHygiene);
            }
        }
        for (Account account : com.google.android.finsky.api.a.a(FinskyApp.a())) {
            gx.a(account.name, dailyHygiene);
        }
        com.google.android.finsky.utils.ac.a(dailyHygiene);
        dailyHygiene.b(z);
    }
}
