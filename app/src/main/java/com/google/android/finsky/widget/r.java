package com.google.android.finsky.widget;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    private static r f5224b;

    /* renamed from: a, reason: collision with root package name */
    final com.google.android.finsky.utils.bpkg.c f5225a;

    public static r a(Context context) {
        if (f5224b == null) {
            f5224b = new r(context);
        }
        return f5224b;
    }

    private r(Context context) {
        this(new com.google.android.finsky.utils.bpkg.a(context.getDir("widgets", 0), "WidgetTypeMap"));
    }

    private r(com.google.android.finsky.utils.bpkg.b bVar) {
        this.f5225a = new com.google.android.finsky.utils.bpkg.c(bVar);
        com.google.android.finsky.utils.bpkg.c cVar = this.f5225a;
        com.google.android.finsky.utils.bpkg.c.b();
        cVar.f4763b = cVar.f4762a.a();
        cVar.c.clear();
    }

    static String a(Class<? extends a> cls, int i) {
        return cls.getSimpleName() + "#" + String.valueOf(i);
    }

    public final void a(Class<? extends a> cls, int i, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("data cannot be null or empty");
        }
        String a2 = a(cls, i);
        Map<String, String> b2 = this.f5225a.b(a2);
        if (b2 == null) {
            b2 = Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(b2);
        hashMap.put("type", str);
        hashMap.put("appWidgetId", String.valueOf(i));
        hashMap.put("widgetProvider", cls.getSimpleName());
        this.f5225a.a(a2, hashMap);
    }

    public final String b(Class<? extends a> cls, int i) {
        Map<String, String> b2 = this.f5225a.b(a(cls, i));
        if (b2 != null) {
            return b2.get("type");
        }
        return null;
    }

    public final int[] a(Class<? extends a> cls, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        String simpleName = cls.getSimpleName();
        for (Map<String, String> map : this.f5225a.a().values()) {
            String str2 = map.get("type");
            if (str.equals(str2) || (z && "all".equals(str2))) {
                if (simpleName.equals(map.get("widgetProvider"))) {
                    arrayList.add(map.get("appWidgetId"));
                }
            }
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = Integer.valueOf((String) arrayList.get(i)).intValue();
        }
        return iArr;
    }
}
