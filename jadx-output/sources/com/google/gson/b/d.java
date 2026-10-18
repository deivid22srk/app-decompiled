package com.google.gson.b;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class d implements Serializable, ParameterizedType {

    /* renamed from: a, reason: collision with root package name */
    private final Type f7815a;

    /* renamed from: b, reason: collision with root package name */
    private final Type f7816b;
    private final Type[] c;

    public d(Type type, Type type2, Type... typeArr) {
        boolean z = true;
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            a.a(type != null || cls.getEnclosingClass() == null);
            if (type != null && cls.getEnclosingClass() == null) {
                z = false;
            }
            a.a(z);
        }
        this.f7815a = type == null ? null : b.a(type);
        this.f7816b = b.a(type2);
        this.c = (Type[]) typeArr.clone();
        for (int i = 0; i < this.c.length; i++) {
            a.a(this.c[i]);
            Type type3 = this.c[i];
            a.a(((r1 instanceof Class) && ((Class) r1).isPrimitive()) ? false : true);
            this.c[i] = b.a(this.c[i]);
        }
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f7816b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f7815a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && b.a(this, (ParameterizedType) obj);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.c) ^ this.f7816b.hashCode()) ^ b.a((Object) this.f7815a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.c.length + 1) * 30);
        sb.append(b.c(this.f7816b));
        if (this.c.length == 0) {
            return sb.toString();
        }
        sb.append("<").append(b.c(this.c[0]));
        for (int i = 1; i < this.c.length; i++) {
            sb.append(", ").append(b.c(this.c[i]));
        }
        return sb.append(">").toString();
    }
}
