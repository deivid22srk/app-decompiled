package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;

/* loaded from: classes.dex */
public final class i extends az {

    /* renamed from: a, reason: collision with root package name */
    static final String f6367a = String.valueOf(com.google.android.gms.common.b.f5588a / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");

    /* renamed from: b, reason: collision with root package name */
    private Boolean f6368b;

    i(ap apVar) {
        super(apVar);
    }

    public static long A() {
        return com.google.android.gms.common.b.f5588a / 1000;
    }

    public static boolean B() {
        return com.google.android.gms.common.internal.g.f5709a;
    }

    public static long D() {
        return s.p.a().longValue();
    }

    public static long E() {
        return s.l.a().longValue();
    }

    public static long F() {
        return 20L;
    }

    public static long G() {
        return Math.max(0L, s.e.a().longValue());
    }

    public static int H() {
        return s.f.a().intValue();
    }

    public static int I() {
        return Math.max(0, s.g.a().intValue());
    }

    public static String J() {
        return s.h.a();
    }

    public static long K() {
        return Math.max(0L, s.i.a().longValue());
    }

    public static long L() {
        return Math.max(0L, s.k.a().longValue());
    }

    public static long M() {
        return s.j.a().longValue();
    }

    public static long N() {
        return Math.max(0L, s.m.a().longValue());
    }

    public static long O() {
        return Math.max(0L, s.n.a().longValue());
    }

    public static int P() {
        return Math.min(20, Math.max(0, s.o.a().intValue()));
    }

    static String a() {
        return s.c.a();
    }

    public static int b() {
        return 24;
    }

    static int o() {
        return 36;
    }

    static int p() {
        return 256;
    }

    static int q() {
        return 36;
    }

    static int r() {
        return 2048;
    }

    static int s() {
        return 20;
    }

    static long t() {
        return 3600000L;
    }

    static long u() {
        return 60000L;
    }

    static long v() {
        return 61000L;
    }

    static long w() {
        return s.d.a().longValue();
    }

    static long x() {
        return s.q.a().longValue();
    }

    public static String y() {
        return "google_app_measurement.db";
    }

    public static String z() {
        return "google_app_measurement2.db";
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ x f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ bg g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.c.a h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ Context i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ g j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ al k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ z l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ ai m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ i n() {
        return super.n();
    }

    public final boolean C() {
        if (this.f6368b == null) {
            synchronized (this) {
                if (this.f6368b == null) {
                    ApplicationInfo applicationInfo = super.i().getApplicationInfo();
                    String a2 = com.google.android.gms.common.c.h.a(super.i(), Process.myPid());
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f6368b = Boolean.valueOf(str != null && str.equals(a2));
                    }
                    if (this.f6368b == null) {
                        this.f6368b = Boolean.TRUE;
                        super.l().f6388a.a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f6368b.booleanValue();
    }
}
