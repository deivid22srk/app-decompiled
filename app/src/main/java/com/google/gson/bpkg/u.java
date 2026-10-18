package com.google.gson.bpkg;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<Class<?>, Class<?>> f7838a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map<Class<?>, Class<?>> f7839b;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        a(hashMap, hashMap2, Character.TYPE, Character.class);
        a(hashMap, hashMap2, Double.TYPE, Double.class);
        a(hashMap, hashMap2, Float.TYPE, Float.class);
        a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        a(hashMap, hashMap2, Long.TYPE, Long.class);
        a(hashMap, hashMap2, Short.TYPE, Short.class);
        a(hashMap, hashMap2, Void.TYPE, Void.class);
        f7838a = Collections.unmodifiableMap(hashMap);
        f7839b = Collections.unmodifiableMap(hashMap2);
    }

    public static void a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    public static boolean a(Type type) {
        return f7838a.containsKey(type);
    }

    public static boolean b(Type type) {
        return f7839b.containsKey(a.a(type));
    }

    public static <T> Class<T> a(Class<T> cls) {
        Class<T> cls2 = (Class) f7838a.get(a.a(cls));
        return cls2 == null ? cls : cls2;
    }
}
