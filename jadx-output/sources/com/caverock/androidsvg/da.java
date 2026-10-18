package com.caverock.androidsvg;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class da {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, ag> f1362a;

    static {
        HashMap hashMap = new HashMap(9);
        f1362a = hashMap;
        hashMap.put("xx-small", new ag(0.694f, cd.pt));
        f1362a.put("x-small", new ag(0.833f, cd.pt));
        f1362a.put("small", new ag(10.0f, cd.pt));
        f1362a.put("medium", new ag(12.0f, cd.pt));
        f1362a.put("large", new ag(14.4f, cd.pt));
        f1362a.put("x-large", new ag(17.3f, cd.pt));
        f1362a.put("xx-large", new ag(20.7f, cd.pt));
        f1362a.put("smaller", new ag(83.33f, cd.percent));
        f1362a.put("larger", new ag(120.0f, cd.percent));
    }

    public static ag a(String str) {
        return f1362a.get(str);
    }
}
