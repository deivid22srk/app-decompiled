package com.google.android.finsky.hpkg;

import com.google.android.finsky.download.apkg.c;
import com.google.android.finsky.protos.aa;
import com.google.android.finsky.protos.ag;
import com.google.android.finsky.protos.ah;
import com.google.android.finsky.protos.hr;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class a {
    public static String a(String str, int i) {
        return "v2:" + str + ":1:" + i;
    }

    public static com.google.android.finsky.download.apkg.a a(aa aaVar, String str, boolean z) {
        int i = z ? 1 : 0;
        for (int i2 = 0; i2 < aaVar.l.length; i2++) {
            ah ahVar = aaVar.l[i2];
            if (ahVar.f3590a == i) {
                return c.a(z, str, ahVar.c, ahVar.e);
            }
        }
        return null;
    }

    public static long a(ag agVar) {
        long j = 0;
        for (int i = 0; i < agVar.C.length; i++) {
            hr hrVar = agVar.C[i];
            int i2 = hrVar.f3924a;
            switch (i2) {
                case 0:
                    j += hrVar.e;
                    break;
                case 1:
                case 2:
                    com.google.android.finsky.download.apkg.a a2 = c.a(i2 == 2, agVar.w, hrVar.c, hrVar.e);
                    if (a2.d() == 4) {
                        j += a2.c();
                        break;
                    } else {
                        break;
                    }
                default:
                    FinskyLog.c("Bad file type %d in %s entry# %d", Integer.valueOf(i2), agVar.w, Integer.valueOf(i));
                    break;
            }
        }
        return j;
    }
}
