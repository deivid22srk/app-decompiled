package com.google.android.wallet.common.apkg;

import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public final class o {
    public static int a(String str) {
        if (str.length() != 2) {
            throw new IllegalArgumentException("CountryCode must have length of 2!");
        }
        if (str.equals("UK")) {
            str = "GB";
        }
        return (((Character.toUpperCase(str.charAt(0)) - 'A') + 1) << 5) | ((Character.toUpperCase(str.charAt(1)) - 'A') + 1);
    }

    public static String a(int i) {
        return (i == 0 || (i & (-1024)) != 0) ? "ZZ" : String.format(Locale.US, "%c%c", Character.valueOf((char) ((((i & 992) >> 5) + 65) - 1)), Character.valueOf((char) (((i & 31) + 65) - 1)));
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return a(str);
        } catch (IllegalArgumentException e) {
            return 858;
        }
    }
}
