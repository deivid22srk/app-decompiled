package com.google.gson.c;

import com.google.gson.b.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<? super T> f7846a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f7847b;
    final int c;

    protected a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            this.f7847b = b.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.f7846a = (Class<? super T>) b.b(this.f7847b);
            this.c = this.f7847b.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    private a(Type type) {
        this.f7847b = b.a((Type) com.google.gson.b.a.a(type));
        this.f7846a = (Class<? super T>) b.b(this.f7847b);
        this.c = this.f7847b.hashCode();
    }

    public final int hashCode() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.a(this.f7847b, ((a) obj).f7847b);
    }

    public final String toString() {
        return b.c(this.f7847b);
    }

    public static a<?> a(Type type) {
        return new a<>(type);
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }
}
