package com.google.android.finsky.c;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.jm;

/* loaded from: classes.dex */
public enum c {
    EVERYONE(0),
    LOW_MATURITY(1),
    MEDIUM_MATURITY(2),
    HIGH_MATURITY(3),
    SHOW_ALL(4);

    private static final c g = a(d.ak.b().intValue());
    public final int f;

    c(int i) {
        this.f = i;
    }

    public static c a(Context context) {
        int intValue = bg.f4774b.a().intValue();
        if (intValue == -1) {
            SharedPreferences a2 = bg.a().a();
            int a3 = HIGH_MATURITY.a();
            Account[] a4 = com.google.android.finsky.api.a.a(context);
            int i = a3;
            boolean z = false;
            for (int length = a4.length - 1; length >= 0; length--) {
                int i2 = a2.getInt(jm.a(bg.f4774b.c, a4[length].name), -1);
                if (i2 >= 0) {
                    z = true;
                    i = Math.min(i, i2);
                }
            }
            if (!z) {
                o<Integer> a5 = new e("vending_preferences").a("content_rating", (Integer) (-1));
                if (a5.b()) {
                    int intValue2 = a5.a().intValue();
                    for (c cVar : values()) {
                        if (cVar.f == intValue2) {
                            i = cVar.f;
                            break;
                        }
                    }
                }
                i = -1;
            }
            if (i != -1) {
                bg.f4774b.a((o<Integer>) Integer.valueOf(i));
                intValue = i;
            }
        }
        if (intValue >= 0) {
            for (c cVar2 : values()) {
                if (cVar2.f == intValue) {
                    return cVar2;
                }
            }
        }
        return g;
    }

    public static c a(int i) {
        if (i == -1) {
            return HIGH_MATURITY;
        }
        for (c cVar : values()) {
            if (cVar.f == i) {
                return cVar;
            }
        }
        return HIGH_MATURITY;
    }

    public final int a() {
        return this.f == SHOW_ALL.f ? HIGH_MATURITY.f : this.f;
    }
}
