package com.google.android.finsky.autoupdate;

import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    final String f2036a;

    /* renamed from: b, reason: collision with root package name */
    final int f2037b;
    final int c;
    final int d;

    private g(String str) {
        String[] split = str.split(",");
        if (split.length != 4) {
            throw new IllegalArgumentException(String.format("Invalid number of items for the Rapid Auto Update data (Expecting 4, got %d). Data: %s", Integer.valueOf(split.length), str));
        }
        try {
            this.f2036a = split[0];
            this.f2037b = Integer.parseInt(split[1]);
            this.c = Integer.parseInt(split[2]);
            this.d = Integer.parseInt(split[3]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("Invalid format for the Rapid Auto Update data: %s", str));
        }
    }

    static List<g> a() {
        ArrayList arrayList = new ArrayList();
        for (String str : com.google.android.finsky.c.d.ew.b().split(";")) {
            try {
                arrayList.add(new g(str));
            } catch (IllegalArgumentException e) {
                FinskyLog.c(e.getMessage(), new Object[0]);
            }
        }
        return arrayList;
    }
}
