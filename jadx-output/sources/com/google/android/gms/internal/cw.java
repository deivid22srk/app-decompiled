package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@gw
/* loaded from: classes.dex */
public final class cw {
    cw c;
    private final List<cu> d = new LinkedList();
    private final Map<String, String> e = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    final Object f5939b = new Object();

    /* renamed from: a, reason: collision with root package name */
    boolean f5938a = true;

    public cw(String str, String str2) {
        this.e.put("action", str);
        this.e.put("ad_format", str2);
    }

    public final cu a(long j) {
        if (this.f5938a) {
            return new cu(j, null, null);
        }
        return null;
    }

    public final boolean a(cu cuVar, long j, String... strArr) {
        synchronized (this.f5939b) {
            for (String str : strArr) {
                this.d.add(new cu(j, str, cuVar));
            }
        }
        return true;
    }

    public final void a(String str, String str2) {
        cn a2;
        if (!this.f5938a || TextUtils.isEmpty(str2) || (a2 = com.google.android.gms.ads.internal.d.f().a()) == null) {
            return;
        }
        synchronized (this.f5939b) {
            cq cqVar = a2.f5931b.get(str);
            cq cqVar2 = cqVar != null ? cqVar : cq.f5932a;
            Map<String, String> map = this.e;
            map.put(str, cqVar2.a(map.get(str), str2));
        }
    }
}
