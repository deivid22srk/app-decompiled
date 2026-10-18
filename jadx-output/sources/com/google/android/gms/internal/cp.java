package com.google.android.gms.internal;

@gw
/* loaded from: classes.dex */
public final class cp {
    public static boolean a(cw cwVar, cu cuVar, String... strArr) {
        if (cwVar == null || cuVar == null || !cwVar.f5938a || cuVar == null) {
            return false;
        }
        return cwVar.a(cuVar, com.google.android.gms.ads.internal.d.g().b(), strArr);
    }

    public static cu a(cw cwVar) {
        if (cwVar == null) {
            return null;
        }
        return cwVar.a(com.google.android.gms.ads.internal.d.g().b());
    }
}
