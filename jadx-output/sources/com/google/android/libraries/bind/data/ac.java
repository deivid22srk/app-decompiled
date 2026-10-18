package com.google.android.libraries.bind.data;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    static final List<Data> f6683a = Collections.unmodifiableList(Collections.emptyList());
    private static final Map<Object, Integer> f = Collections.emptyMap();

    /* renamed from: b, reason: collision with root package name */
    public final List<Data> f6684b;
    public final int c;
    final Map<Object, Integer> d;
    final DataException e;

    private ac(int i, List<Data> list, Map<Object, Integer> map) {
        this.c = i;
        this.f6684b = Collections.unmodifiableList(list);
        this.d = map;
        this.e = null;
        Iterator<Data> it = list.iterator();
        while (it.hasNext()) {
            it.next().f6679b = true;
        }
    }

    public ac(int i, DataException dataException) {
        this.c = i;
        this.e = dataException;
        this.f6684b = f6683a;
        this.d = f;
    }

    ac(int i) {
        this.c = i;
        this.f6684b = f6683a;
        this.d = f;
        this.e = null;
    }

    private static Map<Object, Integer> a(List<Data> list, int i) {
        if (list == null) {
            return f;
        }
        if (list.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Data data = list.get(i2);
            if (data == null) {
                throw new IllegalStateException(String.format("Entry %d has no data", Integer.valueOf(i2)));
            }
            Object b2 = data.b(i);
            if (b2 == null) {
                throw new IllegalStateException(String.format("Entry %d has an empty primary key %s - %s", Integer.valueOf(i2), Data.d(i), list.get(i2).toString()));
            }
            Object put = hashMap.put(b2, Integer.valueOf(i2));
            if (put != null) {
                throw new IllegalStateException(String.format("Duplicate entries for primary key %s, value %s (class %s), positions %s and %s", Data.d(i), b2, b2.getClass().getSimpleName(), put, Integer.valueOf(i2)));
            }
        }
        return hashMap;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[4];
        objArr[0] = getClass().getSimpleName();
        objArr[1] = Data.d(this.c);
        objArr[2] = Integer.valueOf(a());
        objArr[3] = b() ? this.e.getMessage() : "no";
        return String.format(locale, "%s - primaryKey: %s, size: %d, exception: %s", objArr);
    }

    public final int a() {
        return this.f6684b.size();
    }

    public final boolean b() {
        return this.e != null;
    }

    public final boolean a(int i) {
        return i < 0 || i >= this.f6684b.size();
    }

    public ac(int i, List<Data> list) {
        this(i, list, a(list, i));
    }
}
