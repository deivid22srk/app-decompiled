package com.google.gson.bpkg;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* loaded from: classes2.dex */
public final class e implements Serializable, WildcardType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f7817a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f7818b;

    public e(Type[] typeArr, Type[] typeArr2) {
        a.a(typeArr2.length <= 1);
        a.a(typeArr.length == 1);
        if (typeArr2.length == 1) {
            a.a(typeArr2[0]);
            Type type = typeArr2[0];
            a.a(((r1 instanceof Class) && ((Class) r1).isPrimitive()) ? false : true);
            a.a(typeArr[0] == Object.class);
            this.f7818b = b.a(typeArr2[0]);
            this.f7817a = Object.class;
            return;
        }
        a.a(typeArr[0]);
        Type type2 = typeArr[0];
        a.a(((r1 instanceof Class) && ((Class) r1).isPrimitive()) ? false : true);
        this.f7818b = null;
        this.f7817a = b.a(typeArr[0]);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f7817a};
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        return this.f7818b != null ? new Type[]{this.f7818b} : b.f7813a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && b.a(this, (WildcardType) obj);
    }

    public final int hashCode() {
        return (this.f7818b != null ? this.f7818b.hashCode() + 31 : 1) ^ (this.f7817a.hashCode() + 31);
    }

    public final String toString() {
        if (this.f7818b != null) {
            return "? super " + b.c(this.f7818b);
        }
        if (this.f7817a == Object.class) {
            return "?";
        }
        return "? extends " + b.c(this.f7817a);
    }
}
