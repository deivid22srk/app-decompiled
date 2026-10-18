package com.google.gson.bpkg.apkg;

import java.lang.Enum;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class bg<T extends Enum<T>> extends com.google.gson.aj<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, T> f7784a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map<T, String> f7785b = new HashMap();

    @Override // com.google.gson.aj
    public final /* synthetic */ void a(com.google.gson.stream.f fVar, Object obj) {
        Enum r3 = (Enum) obj;
        fVar.b(r3 == null ? null : this.f7785b.get(r3));
    }

    public bg(Class<T> cls) {
        try {
            for (T t : cls.getEnumConstants()) {
                String name = t.name();
                com.google.gson.apkg.b bVar = (com.google.gson.apkg.b) cls.getField(name).getAnnotation(com.google.gson.apkg.b.class);
                String a2 = bVar != null ? bVar.a() : name;
                this.f7784a.put(a2, t);
                this.f7785b.put(t, a2);
            }
        } catch (NoSuchFieldException e) {
            throw new AssertionError();
        }
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ Object a(com.google.gson.stream.a aVar) {
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        return this.f7784a.get(aVar.i());
    }
}
