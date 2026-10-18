package com.google.android.finsky.api;

import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private static float f2011a = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f2012b = false;
    private static boolean c = false;
    private static boolean d = false;

    public static void a() {
        com.google.android.finsky.d.d e = FinskyApp.a().e();
        if (e.a(12604235L)) {
            f2011a = 1.5f;
        } else if (e.a(12604236L)) {
            f2011a = 2.0f;
        }
        if (e.a(12603408L)) {
            f2012b = true;
        }
        if (e.a(12602374L)) {
            c = true;
            d = true;
        } else if (e.a(12604366L)) {
            d = true;
        }
    }

    public static float b() {
        return f2011a;
    }

    public static boolean a(boolean z, boolean z2) {
        if (!z || f2012b) {
            return z2 ? c : d;
        }
        return false;
    }
}
