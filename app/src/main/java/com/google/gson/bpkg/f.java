package com.google.gson.bpkg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Type, com.google.gson.u<?>> f7819a;

    public f(Map<Type, com.google.gson.u<?>> map) {
        this.f7819a = map;
    }

    public f() {
        this(Collections.emptyMap());
    }

    public <T> t<T> a(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new h(this, declaredConstructor);
        } catch (NoSuchMethodException e) {
            return null;
        }
    }

    public final String toString() {
        return this.f7819a.toString();
    }

    public final <T> t<T> a(com.google.gson.cpkg.a<T> aVar) {
        t<T> tVar;
        Type type = aVar.f7847b;
        Class<? super T> cls = aVar.f7846a;
        com.google.gson.u<?> uVar = this.f7819a.get(type);
        if (uVar != null) {
            return new g(this, uVar, type);
        }
        t<T> a2 = a(cls);
        if (a2 != null) {
            return a2;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                tVar = new i<>(this);
            } else if (Set.class.isAssignableFrom(cls)) {
                tVar = new j<>(this);
            } else if (Queue.class.isAssignableFrom(cls)) {
                tVar = new k<>(this);
            } else {
                tVar = new l<>(this);
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            tVar = new m<>(this);
        } else {
            tVar = null;
        }
        if (tVar != null) {
            return tVar;
        }
        return new n(this, cls, type);
    }
}
