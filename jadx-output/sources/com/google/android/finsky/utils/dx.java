package com.google.android.finsky.utils;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class dx {

    /* renamed from: a, reason: collision with root package name */
    public static final dx f4838a = new dx(Collections.emptyMap(), Bundle.EMPTY);

    /* renamed from: b, reason: collision with root package name */
    public Map<String, Object> f4839b;
    public Bundle c;

    private dx(Map map, Bundle bundle) {
        this.f4839b = map;
        this.c = bundle;
    }

    public final boolean a(String str) {
        return this.f4839b.containsKey(str) || this.c.containsKey(str);
    }

    public final void a(String str, Object obj) {
        this.f4839b.put(str, obj);
    }

    public final Object b(String str) {
        return this.f4839b.containsKey(str) ? this.f4839b.get(str) : this.c.get(str);
    }

    public final void a(String str, int i) {
        this.f4839b.put(str, Integer.valueOf(i));
    }

    public final int c(String str) {
        return this.f4839b.containsKey(str) ? ((Integer) this.f4839b.get(str)).intValue() : this.c.getInt(str);
    }

    public final <T> List<T> d(String str) {
        return this.f4839b.containsKey(str) ? (List) this.f4839b.get(str) : (List) this.c.getParcelable(str);
    }

    public dx() {
        this(new HashMap(), new Bundle());
    }
}
