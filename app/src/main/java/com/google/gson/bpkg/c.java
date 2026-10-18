package com.google.gson.bpkg;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class c implements Serializable, GenericArrayType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f7814a;

    public c(Type type) {
        this.f7814a = b.a(type);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f7814a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && b.a(this, (GenericArrayType) obj);
    }

    public final int hashCode() {
        return this.f7814a.hashCode();
    }

    public final String toString() {
        return b.c(this.f7814a) + "[]";
    }
}
