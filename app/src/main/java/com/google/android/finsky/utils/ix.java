package com.google.android.finsky.utils;

import android.util.SparseArray;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.lp;
import com.google.android.finsky.protos.qv;

/* loaded from: classes.dex */
public final class ix {

    /* renamed from: a, reason: collision with root package name */
    private static SparseArray<Long> f5013a = new SparseArray<>();

    public static void a(String str, int i, int i2, com.android.volley.s sVar) {
        FinskyApp a2 = FinskyApp.a();
        Integer a3 = a(str, i);
        jb.a(str, i, i2, new iy(i, a2, i2, a3), new iz(i, i2, a3, a2, sVar));
    }

    public static Integer a(String str, int i) {
        lp b2 = b(str, i);
        if (b2 == null || !b2.d) {
            return null;
        }
        return Integer.valueOf(b2.c);
    }

    public static lp b(String str, int i) {
        qv c = jb.c(str);
        if (c != null) {
            for (lp lpVar : c.f4315b.f4094a) {
                if (lpVar.f4092a == i) {
                    return lpVar;
                }
            }
        }
        return null;
    }

    public static boolean a(String str) {
        lp b2 = b(str, 1);
        if (b2 == null || b2.c == 2) {
            return false;
        }
        return b2.e || b2.c == 1 || b2.c == 3;
    }

    public static com.google.android.finsky.layout.play.ay a(int i) {
        return new ja(i, com.google.android.finsky.cpkg.d.eH.b().longValue(), bg.aE.b(FinskyApp.a().j() + i), com.google.android.finsky.cpkg.d.eJ.b().intValue());
    }

    public static String b(int i) {
        switch (i) {
            case 2:
                return "gmail-itineraries";
            default:
                return null;
        }
    }

    static /* synthetic */ Integer c(int i) {
        switch (i) {
            case 2:
                return 409;
            default:
                return null;
        }
    }
}
