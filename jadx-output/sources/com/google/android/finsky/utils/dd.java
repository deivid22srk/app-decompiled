package com.google.android.finsky.utils;

import android.location.Location;

/* loaded from: classes.dex */
public final class dd {

    /* renamed from: a, reason: collision with root package name */
    private Location f4823a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.finsky.c.o<String> f4824b;

    public static com.google.android.finsky.protos.jg a(Location location) {
        if (location == null) {
            return null;
        }
        com.google.android.finsky.protos.jg jgVar = new com.google.android.finsky.protos.jg();
        jgVar.f3992a = location.getLatitude();
        jgVar.f3993b = true;
        jgVar.c = location.getLongitude();
        jgVar.d = true;
        if (location.hasAccuracy()) {
            jgVar.e = (long) location.getAccuracy();
            jgVar.f = true;
        }
        jgVar.g = location.getTime();
        jgVar.h = true;
        return jgVar;
    }

    public dd(com.google.android.finsky.c.o<String> oVar) {
        this.f4824b = oVar;
        if (this.f4824b != null) {
            c();
        }
    }

    public final synchronized Location a() {
        return this.f4823a;
    }

    public final synchronized void b(Location location) {
        if (location == null) {
            this.f4824b.c();
            this.f4823a = null;
        } else {
            this.f4823a = location;
            d();
        }
    }

    public final synchronized boolean b() {
        return this.f4823a != null;
    }

    private synchronized void c() {
        String a2 = this.f4824b.a();
        if (a2 != null) {
            com.google.android.finsky.protos.jg jgVar = new com.google.android.finsky.protos.jg();
            dg.a(a2, jgVar);
            a(jgVar.f3992a, jgVar.c, jgVar.e, jgVar.g);
        }
    }

    private synchronized void d() {
        if (this.f4824b != null) {
            this.f4824b.a((com.google.android.finsky.c.o<String>) dg.a(a(this.f4823a)));
        }
    }

    private synchronized void a(double d, double d2, float f, long j) {
        this.f4823a = new Location((String) null);
        this.f4823a.setLatitude(d);
        this.f4823a.setLongitude(d2);
        this.f4823a.setAccuracy(f);
        this.f4823a.setTime(j);
    }
}
