package com.google.android.gms.people.internal;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.av;

/* loaded from: classes.dex */
public final class k {
    public static String a(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        av.b(objArr.length % 2 == 0);
        String str = "";
        for (int i = 0; i < objArr.length; i += 2) {
            sb.append(str);
            sb.append(objArr[i]);
            sb.append("=");
            sb.append(objArr[i + 1]);
            str = ", ";
        }
        return sb.toString();
    }

    public static void a(String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("(");
        int i = 0;
        String str2 = "";
        while (true) {
            int i2 = i;
            if (i2 >= 3) {
                break;
            }
            Object obj = objArr[i2];
            sb.append(str2);
            if (obj instanceof Bundle) {
                sb.append(u.a((Bundle) obj));
            } else {
                sb.append(obj);
            }
            str2 = ", ";
            i = i2 + 1;
        }
        sb.append(")");
        Log.d("PeopleClientCall", sb.toString(), Log.isLoggable("PeopleClientCall", 2) ? new Throwable("STACK TRACE (It's not crash!)") : null);
    }
}
