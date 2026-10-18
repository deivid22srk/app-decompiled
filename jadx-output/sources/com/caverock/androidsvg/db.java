package com.caverock.androidsvg;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class db {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Integer> f1363a;

    static {
        HashMap hashMap = new HashMap(13);
        f1363a = hashMap;
        hashMap.put("normal", 400);
        f1363a.put("bold", 700);
        f1363a.put("bolder", 1);
        f1363a.put("lighter", -1);
        f1363a.put("100", 100);
        f1363a.put("200", 200);
        f1363a.put("300", 300);
        f1363a.put("400", 400);
        f1363a.put("500", 500);
        f1363a.put("600", 600);
        f1363a.put("700", 700);
        f1363a.put("800", 800);
        f1363a.put("900", 900);
    }

    public static Integer a(String str) {
        return f1363a.get(str);
    }
}
