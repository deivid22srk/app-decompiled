package com.google.android.finsky.widget.consumption;

import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bg;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    boolean f5201a;

    /* renamed from: b, reason: collision with root package name */
    boolean f5202b;
    boolean c;
    boolean d;
    boolean e;

    public static v a(int i) {
        v vVar = new v();
        String a2 = bg.ai.a(i).a();
        if (TextUtils.isEmpty(a2)) {
            return vVar;
        }
        String[] split = a2.split("&");
        for (String str : split) {
            String[] split2 = str.split(",");
            if (split2 != null && split2.length == 2 && !TextUtils.isEmpty(split2[0]) && !TextUtils.isEmpty(split2[1])) {
                String str2 = split2[0];
                boolean parseBoolean = Boolean.parseBoolean(split2[1]);
                if ("d".equals(str2)) {
                    vVar.f5201a = parseBoolean;
                } else if ("mu".equals(str2)) {
                    vVar.f5202b = parseBoolean;
                } else if ("ma".equals(str2)) {
                    vVar.c = parseBoolean;
                } else if ("mo".equals(str2)) {
                    vVar.d = parseBoolean;
                } else if ("b".equals(str2)) {
                    vVar.e = parseBoolean;
                } else {
                    FinskyLog.d("Malformed data detected in widget pref, ignoring.", new Object[0]);
                }
            }
        }
        return vVar;
    }

    static void a(int i, v vVar) {
        String str = (((("d," + Boolean.toString(vVar.f5201a)) + "&ma," + Boolean.toString(vVar.c)) + "&mo," + Boolean.toString(vVar.d)) + "&mu," + Boolean.toString(vVar.f5202b)) + "&b," + Boolean.toString(vVar.e);
        bg.ai.a(i).a((com.google.android.finsky.c.o<String>) str);
        FinskyLog.a("Writing data for widget=%d data=%s", Integer.valueOf(i), str);
    }
}
