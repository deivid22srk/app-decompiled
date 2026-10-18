package com.google.gson.bpkg.apkg;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class r implements com.google.gson.ak {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.bpkg.f f7801a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.gson.j f7802b;
    public final com.google.gson.bpkg.o c;

    public r(com.google.gson.bpkg.f fVar, com.google.gson.j jVar, com.google.gson.bpkg.o oVar) {
        this.f7801a = fVar;
        this.f7802b = jVar;
        this.c = oVar;
    }

    public boolean a(Field field, boolean z) {
        boolean z2;
        com.google.gson.apkg.a aVar;
        if (!this.c.a(field.getType(), z)) {
            com.google.gson.bpkg.o oVar = this.c;
            if ((oVar.c & field.getModifiers()) != 0) {
                z2 = true;
            } else if (oVar.f7832b != -1.0d && !oVar.a((com.google.gson.apkg.c) field.getAnnotation(com.google.gson.apkg.c.class), (com.google.gson.apkg.d) field.getAnnotation(com.google.gson.apkg.d.class))) {
                z2 = true;
            } else if (field.isSynthetic()) {
                z2 = true;
            } else if (oVar.e && ((aVar = (com.google.gson.apkg.a) field.getAnnotation(com.google.gson.apkg.a.class)) == null || (!z ? aVar.b() : aVar.a()))) {
                z2 = true;
            } else if (!oVar.d && com.google.gson.bpkg.o.b(field.getType())) {
                z2 = true;
            } else if (com.google.gson.bpkg.o.a(field.getType())) {
                z2 = true;
            } else {
                List<com.google.gson.b> list = z ? oVar.f : oVar.g;
                if (!list.isEmpty()) {
                    new com.google.gson.c(field);
                    Iterator<com.google.gson.b> it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next().a()) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
            }
            if (!z2) {
                return true;
            }
        }
        return false;
    }

    public Map<String, u> a(com.google.gson.k kVar, com.google.gson.cpkg.a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = aVar.f7847b;
        while (cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                boolean a2 = a(field, true);
                boolean a3 = a(field, false);
                if (a2 || a3) {
                    field.setAccessible(true);
                    Type a4 = com.google.gson.bpkg.b.a(aVar.f7847b, cls, field.getGenericType());
                    com.google.gson.apkg.b bVar = (com.google.gson.apkg.b) field.getAnnotation(com.google.gson.apkg.b.class);
                    String a5 = bVar == null ? this.f7802b.a(field) : bVar.a();
                    com.google.gson.cpkg.a<?> a6 = com.google.gson.cpkg.a.a(a4);
                    s sVar = new s(this, a5, a2, a3, kVar, a6, field, com.google.gson.bpkg.u.a((Type) a6.f7846a));
                    u uVar = (u) linkedHashMap.put(sVar.g, sVar);
                    if (uVar != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + uVar.g);
                    }
                }
            }
            aVar = com.google.gson.cpkg.a.a(com.google.gson.bpkg.b.a(aVar.f7847b, cls, cls.getGenericSuperclass()));
            cls = aVar.f7846a;
        }
        return linkedHashMap;
    }

    @Override // com.google.gson.ak
    public final <T> com.google.gson.aj<T> a(com.google.gson.k kVar, com.google.gson.cpkg.a<T> aVar) {
        Class<? super T> cls = aVar.f7846a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        return new t(this, this.f7801a.a(aVar), a(kVar, aVar, cls), (byte) 0);
    }
}
