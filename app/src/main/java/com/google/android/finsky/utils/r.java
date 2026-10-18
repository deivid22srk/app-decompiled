package com.google.android.finsky.utils;

import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public final class r {
    public static boolean a(String str) {
        com.google.android.finsky.bpkg.b a2 = FinskyApp.a().s.a(str);
        boolean booleanValue = bg.t.a().booleanValue();
        if (a2.d != null) {
            return booleanValue && a2.d.f2131b == 1;
        }
        return booleanValue;
    }
}
