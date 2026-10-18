package com.google.android.finsky.billing;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.jm;

/* loaded from: classes.dex */
public final class v {
    public static void a(String str) {
        bg.H.b(str).c();
        FinskyLog.a("Invalidated has_fop cache. (account=%s)", FinskyLog.a(str));
        b(str);
    }

    public static void b(String str) {
        com.google.android.finsky.cpkg.o<Integer> b2;
        bg.K.b(str).a((com.google.android.finsky.cpkg.o<Long>) Long.valueOf(System.currentTimeMillis()));
        if (f(str)) {
            b2 = bg.J.b(str);
        } else {
            b2 = bg.I.b(str);
        }
        b2.a((com.google.android.finsky.cpkg.o<Integer>) Integer.valueOf(b2.a().intValue() + 1));
        FinskyLog.a("Snoozing for %d ms (account=%s)", Long.valueOf(e(str)), FinskyLog.a(str));
    }

    public static boolean a(String str, long j) {
        int intValue;
        if (f(str)) {
            intValue = bg.J.b(str).a().intValue();
        } else {
            intValue = bg.I.b(str).a().intValue();
        }
        if (intValue <= 0) {
            return false;
        }
        long longValue = bg.K.b(str).a().longValue();
        long e = e(str);
        boolean z = e < 0 || longValue + e > j;
        FinskyLog.b("is_snoozed=%b (account=%s)", Boolean.valueOf(z), FinskyLog.a(str));
        return z;
    }

    private static long e(String str) {
        String b2;
        int intValue;
        if (f(str)) {
            b2 = com.google.android.finsky.cpkg.d.S.b();
            intValue = bg.J.b(str).a().intValue();
        } else {
            b2 = com.google.android.finsky.cpkg.d.R.b();
            intValue = bg.I.b(str).a().intValue();
        }
        if (b2 == null) {
            FinskyLog.a("No snooze schedule.", new Object[0]);
            return -1L;
        }
        String[] d = jm.d(b2);
        int min = Math.min(intValue - 1, d.length - 1);
        if (min < 0) {
            FinskyLog.d("Invalid snooze schedule: %s", b2);
            return -1L;
        }
        String str2 = d[min];
        try {
            return Long.parseLong(str2) * 60 * 1000;
        } catch (NumberFormatException e) {
            FinskyLog.d("Invalid snooze period: %s. Schedule: %s", str2, b2);
            return -1L;
        }
    }

    public static boolean b(String str, long j) {
        Boolean a2 = bg.G.b(str).a();
        if (a2 == null) {
            FinskyLog.a("#accountHasFop is not ready", new Object[0]);
            return false;
        }
        if (a2.booleanValue()) {
            FinskyLog.b("has_fop=true cache valid. (account=%s)", FinskyLog.a(str));
            return true;
        }
        if (bg.H.b(str).a().longValue() + com.google.android.finsky.cpkg.d.Q.b().longValue() > j) {
            FinskyLog.b("has_fop=false cache valid. (account=%s)", FinskyLog.a(str));
            return true;
        }
        FinskyLog.a("has_fop=false cache invalid. (account=%s)", FinskyLog.a(str));
        return false;
    }

    public static boolean c(String str) {
        return FinskyApp.a().d(str).a(12602035L);
    }

    public static boolean d(String str) {
        return FinskyApp.a().d(str).a(12603992L);
    }

    private static boolean f(String str) {
        return FinskyApp.a().d(str).a(12603126L);
    }
}
