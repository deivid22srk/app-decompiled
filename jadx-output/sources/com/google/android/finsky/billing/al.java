package com.google.android.finsky.billing;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.pr;
import com.google.android.finsky.protos.pw;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cg;
import com.google.android.finsky.utils.jm;
import com.google.android.finsky.utils.jn;

/* loaded from: classes.dex */
public final class al {
    public static void a(String str, pr prVar) {
        if (prVar != null && prVar.c) {
            int i = prVar.f4265b;
            com.google.android.finsky.c.o<Integer> a2 = a(str);
            if (a2 == null) {
                return;
            }
            a2.a((com.google.android.finsky.c.o<Integer>) Integer.valueOf(i));
        }
    }

    private static com.google.android.finsky.c.o<Integer> a(String str) {
        return jn.a().a("IAB_VERSION_" + jm.a(str), (Integer) 0);
    }

    public static boolean a(String str, int i) {
        if (str != null) {
            com.google.android.finsky.c.o<Integer> a2 = a(str);
            if (!a2.b()) {
                com.google.android.finsky.api.b b2 = FinskyApp.a().b(str);
                if (b2 == null) {
                    FinskyLog.c("Unknown account %s", str);
                } else {
                    pw a3 = cg.a(b2);
                    if (a3 != null && a3.w != null) {
                        a(str, a3.w);
                    }
                }
            }
            if (i <= a2.a().intValue()) {
                return true;
            }
        }
        return false;
    }
}
