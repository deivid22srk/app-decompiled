package com.google.android.finsky.billing.refund;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final j f2434a = new j();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Set<String>> f2435b = new LinkedHashMap();

    private j() {
    }

    public static j a() {
        return f2434a;
    }

    public final synchronized boolean a(String str, String str2) {
        boolean z;
        Set<String> set = this.f2435b.get(str);
        if (set != null) {
            z = set.contains(str2);
        }
        return z;
    }

    final synchronized void b(String str, String str2) {
        Set<String> set = this.f2435b.get(str);
        if (set == null) {
            set = new LinkedHashSet<>();
            if (this.f2435b.size() >= 5) {
                this.f2435b.remove(this.f2435b.keySet().iterator().next());
            }
            this.f2435b.put(str, set);
        }
        if (set.size() >= 100) {
            set.remove(set.iterator().next());
        }
        set.add(str2);
    }
}
