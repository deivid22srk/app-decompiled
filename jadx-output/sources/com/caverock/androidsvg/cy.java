package com.caverock.androidsvg;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class cy {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, o> f1358a;

    static {
        HashMap hashMap = new HashMap(10);
        f1358a = hashMap;
        hashMap.put("none", o.None);
        f1358a.put("xMinYMin", o.XMinYMin);
        f1358a.put("xMidYMin", o.XMidYMin);
        f1358a.put("xMaxYMin", o.XMaxYMin);
        f1358a.put("xMinYMid", o.XMinYMid);
        f1358a.put("xMidYMid", o.XMidYMid);
        f1358a.put("xMaxYMid", o.XMaxYMid);
        f1358a.put("xMinYMax", o.XMinYMax);
        f1358a.put("xMidYMax", o.XMidYMax);
        f1358a.put("xMaxYMax", o.XMaxYMax);
    }

    public static o a(String str) {
        return f1358a.get(str);
    }
}
