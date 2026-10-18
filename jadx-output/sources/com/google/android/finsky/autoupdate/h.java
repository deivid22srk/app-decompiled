package com.google.android.finsky.autoupdate;

import android.content.IntentFilter;
import android.os.PowerManager;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public abstract class h {
    public abstract boolean a();

    public abstract void b();

    protected static boolean c() {
        return d() || e();
    }

    public static boolean d() {
        return FinskyApp.a().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", 0) == 0 && System.currentTimeMillis() - bg.al.a().longValue() <= com.google.android.finsky.c.d.dr.b().longValue();
    }

    public static boolean e() {
        boolean z;
        if (FinskyApp.a().l.d() && !bg.u.a().booleanValue()) {
            return false;
        }
        com.google.android.finsky.installer.n nVar = FinskyApp.a().l;
        if (nVar.b()) {
            if (com.google.android.finsky.installer.n.f2864a) {
                z = nVar.b() && nVar.c.isActiveNetworkMetered();
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return (ik.a() && nVar.c()) ? false : true;
    }

    protected static void a(Runnable runnable) {
        PowerManager.WakeLock newWakeLock = ((PowerManager) FinskyApp.a().getSystemService("power")).newWakeLock(1, "ReschedulerStrategy");
        i iVar = new i(runnable, newWakeLock);
        newWakeLock.acquire();
        FinskyApp.a().p.a(iVar);
        FinskyApp.a().s.a(iVar);
        com.google.android.finsky.f.a.a().a(iVar);
    }

    protected static void a(u uVar, boolean z) {
        p.a().a(uVar, "wifi_checker", z);
    }

    protected static void a(boolean z) {
        a((Integer) null, z);
    }

    protected static void a(Integer num, boolean z) {
        com.google.android.finsky.a.p pVar = new com.google.android.finsky.a.p();
        pVar.w = true;
        pVar.x = true;
        pVar.c = d();
        pVar.d = pVar.c;
        pVar.e = e();
        pVar.f = pVar.e;
        pVar.f1494a = z;
        pVar.f1495b = pVar.f1494a;
        if (num != null) {
            pVar.g = num.intValue();
            pVar.h = true;
        }
        FinskyApp.a().h().a((String) null, pVar, "wifi_checker", (com.google.android.finsky.a.n) null);
    }
}
