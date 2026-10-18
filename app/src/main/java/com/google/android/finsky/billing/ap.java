package com.google.android.finsky.billing;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.bg;

/* loaded from: classes.dex */
public final class ap {
    public static boolean a(int i) {
        return i == 1 && !FinskyApp.a().l.b() && a() && bg.v.a().intValue() == 1;
    }

    public static void a(String str) {
        if (a() && bg.v.a().intValue() == 3) {
            FinskyApp.a().k.e(str);
        }
    }

    public static boolean a() {
        FinskyApp a2 = FinskyApp.a();
        return a2.l.d() && a2.e().a(12604154L);
    }
}
