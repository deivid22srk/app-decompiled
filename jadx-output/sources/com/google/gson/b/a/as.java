package com.google.gson.b.a;

/* loaded from: classes2.dex */
final class as implements com.google.gson.ak {
    as() {
    }

    @Override // com.google.gson.ak
    public final <T> com.google.gson.aj<T> a(com.google.gson.k kVar, com.google.gson.c.a<T> aVar) {
        Class<? super T> cls = aVar.f7846a;
        if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
            return null;
        }
        if (!cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        return new bg(cls);
    }
}
