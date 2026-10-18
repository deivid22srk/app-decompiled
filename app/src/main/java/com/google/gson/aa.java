package com.google.gson;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class aa extends y {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, y> f7758a = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, y yVar) {
        if (yVar == null) {
            yVar = z.f7873a;
        }
        this.f7758a.put(com.google.gson.bpkg.apkg.a(str), yVar);
    }

    public final Set<Map.Entry<String, y>> h() {
        return this.f7758a.entrySet();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof aa) && ((aa) obj).f7758a.equals(this.f7758a));
    }

    public final int hashCode() {
        return this.f7758a.hashCode();
    }
}
