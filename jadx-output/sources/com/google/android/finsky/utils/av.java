package com.google.android.finsky.utils;

import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public final class av {

    /* renamed from: a, reason: collision with root package name */
    static String f4752a;

    /* renamed from: b, reason: collision with root package name */
    static Boolean f4753b;

    public static boolean a() {
        boolean z;
        if (FinskyApp.a().d(e()).a(12603992L)) {
            if (f4753b != null) {
                z = f4753b.booleanValue();
            } else {
                String e = e();
                z = com.google.android.finsky.billing.v.d(e) && com.google.android.finsky.billing.v.b(e, System.currentTimeMillis()) && !bg.G.b(e).a().booleanValue();
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean b() {
        return bg.aX.b(e()).a().intValue() == 0 && a();
    }

    public static boolean c() {
        return bg.aW.b(e()).a().intValue() == 0 && b();
    }

    public static void d() {
        com.google.android.finsky.c.o<Integer> b2 = bg.aX.b(e());
        if (b2.a().intValue() == 0) {
            b2.a((com.google.android.finsky.c.o<Integer>) 1);
        }
    }

    public static String e() {
        return f4752a != null ? f4752a : FinskyApp.a().j();
    }
}
