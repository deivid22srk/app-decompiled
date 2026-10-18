package com.google.android.finsky.c;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.ma;
import com.google.android.finsky.utils.bg;

/* loaded from: classes.dex */
public final class p {
    public static ma a(String str) {
        int b2 = b(str);
        Long a2 = bg.O.b(str).a();
        long currentTimeMillis = System.currentTimeMillis();
        ma maVar = new ma();
        switch (b2) {
            case 0:
                maVar.f4111a = 3;
                maVar.f4112b = true;
                return maVar;
            case 1:
                maVar.f4111a = 4;
                maVar.f4112b = true;
                if (a2 != null && a2.longValue() != 0) {
                    maVar.c = a2.longValue();
                    maVar.d = true;
                }
                maVar.e = currentTimeMillis;
                maVar.f = true;
                return maVar;
            case 2:
                maVar.f4111a = 2;
                maVar.f4112b = true;
                return maVar;
            default:
                throw new IllegalArgumentException("Unexpected purchaseAuth specified " + b2);
        }
    }

    public static int b(String str) {
        int intValue = bg.Q.b(str).a().intValue();
        return intValue == -1 ? d.cP.b().intValue() : intValue;
    }

    public static void a(String str, int i, Integer num, com.google.android.finsky.a.i iVar, String str2) {
        o<Integer> b2 = bg.Q.b(str);
        o<Integer> b3 = bg.R.b(str);
        b2.a((o<Integer>) Integer.valueOf(i));
        b3.a((o<Integer>) Integer.valueOf(FinskyApp.a().k()));
        iVar.a(400, Integer.valueOf(i), num, str2);
    }

    public static void a(String str, boolean z, com.google.android.finsky.a.i iVar, String str2) {
        o<Boolean> b2 = bg.aR.b(str);
        boolean booleanValue = b2.a().booleanValue();
        if (booleanValue == z) {
            return;
        }
        iVar.a(408, Integer.valueOf(z ? 1 : 0), Integer.valueOf(booleanValue ? 1 : 0), str2);
        b2.a((o<Boolean>) Boolean.valueOf(z));
    }
}
