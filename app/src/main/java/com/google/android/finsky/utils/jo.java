package com.google.android.finsky.utils;

import android.os.Build;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public final class jo {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f5036a = null;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f5037b = false;

    public static synchronized void a(jq jqVar) {
        boolean z;
        synchronized (jo.class) {
            if (f5036a == null) {
                int k = FinskyApp.a().k();
                if (bg.f4773a.a().intValue() != k) {
                    bg.f4773a.a((com.google.android.finsky.cpkg.o<Integer>) Integer.valueOf(k));
                    z = true;
                } else {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z || a());
                f5036a = valueOf;
                if (valueOf.booleanValue()) {
                    FinskyLog.a("Diff version or system, clear token & cache", new Object[0]);
                    am.a().c();
                    FinskyApp.a().a(new jp(jqVar));
                }
            }
            jqVar.a(f5036a.booleanValue());
        }
    }

    public static boolean a() {
        if (f5037b) {
            return true;
        }
        String str = Build.FINGERPRINT;
        if (str.equals(jn.d.a())) {
            return false;
        }
        f5037b = true;
        jn.d.a((com.google.android.finsky.cpkg.o<String>) str);
        return true;
    }
}
