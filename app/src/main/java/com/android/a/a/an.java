package com.android.a.a;

import com.google.android.finsky.utils.jm;
import org.apache.http.client.methods.HttpGet;

/* loaded from: classes.dex */
final class an {
    an() {
    }

    static void a(String str, ao<am> aoVar) {
        new ap(new HttpGet(a(str)), aoVar).start();
    }

    private static String a(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char c = 0;
            int i2 = i;
            while (i2 < length) {
                c = str.charAt(i2);
                if (c == ':' || c == '/') {
                    break;
                }
                i2++;
            }
            if (i2 == length) {
                sb.append(jm.a(str.substring(i)));
                break;
            }
            if (i2 > i) {
                sb.append(jm.a(str.substring(i, i2)));
                sb.append(c);
            } else {
                sb.append(c);
                i2 = i;
            }
            i = i2 + 1;
        }
        return sb.toString();
    }
}
