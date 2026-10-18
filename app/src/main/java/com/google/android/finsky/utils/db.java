package com.google.android.finsky.utils;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Looper;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public final class db {

    /* renamed from: a, reason: collision with root package name */
    long f4819a;

    /* renamed from: b, reason: collision with root package name */
    boolean f4820b;
    boolean c;
    final dd d;
    private final Context e;
    private final int f = com.google.android.finsky.cpkg.d.eK.b().intValue();

    public db(Context context, dd ddVar) {
        this.e = context;
        this.d = ddVar;
    }

    public final void a() {
        this.f4820b = false;
        this.c = false;
        this.d.b(null);
    }

    public final Location b() {
        if (!ix.a(FinskyApp.a().j())) {
            return null;
        }
        if (!this.d.b()) {
            if (!this.f4820b || this.c) {
                return null;
            }
            a(1004);
            this.c = true;
            return null;
        }
        return new Location(this.d.a());
    }

    public final void a(Runnable runnable) {
        boolean z;
        if (bg.aH.a() != null) {
            b(runnable);
            return;
        }
        String j = FinskyApp.a().j();
        if (!(jb.d(j) ? true : ix.a(j))) {
            a();
            b(runnable);
            return;
        }
        if (this.d.b()) {
            z = !b(this.d.a()) && System.currentTimeMillis() - this.f4819a > com.google.android.finsky.cpkg.d.eE.b().longValue();
        } else {
            z = true;
        }
        if (!z) {
            a(1002);
            b(runnable);
            return;
        }
        this.f4819a = System.currentTimeMillis();
        w wVar = new w();
        Location a2 = w.a(this.e);
        if (b(a2)) {
            if (a(a2)) {
                this.d.b(a2);
                a(1000);
            }
            b(runnable);
            return;
        }
        this.f4820b = true;
        this.c = false;
        Context context = this.e;
        dc dcVar = new dc(this, runnable);
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        Criteria criteria = new Criteria();
        criteria.setAccuracy(2);
        if (!locationManager.isProviderEnabled("network") && !locationManager.isProviderEnabled("gps")) {
            dcVar.a(null);
            return;
        }
        try {
            locationManager.requestSingleUpdate(criteria, new x(wVar, dcVar), (Looper) null);
        } catch (SecurityException e) {
            FinskyLog.d("No permission to get location. %s", e);
            dcVar.a(null);
        }
    }

    static void b(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    final boolean a(Location location) {
        if (!b(location)) {
            return false;
        }
        if (this.d.b() && location.distanceTo(this.d.a()) <= this.f) {
            a(1003);
            return false;
        }
        return true;
    }

    private static boolean b(Location location) {
        return location != null && System.currentTimeMillis() - location.getTime() <= com.google.android.finsky.cpkg.d.eE.b().longValue();
    }

    static void a(int i) {
        FinskyApp.a().h().a(i, (byte[]) null);
    }
}
