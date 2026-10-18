package com.google.gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class t {
    public boolean g;
    public String h;
    public boolean k;
    public boolean l;
    public boolean n;
    public boolean o;

    /* renamed from: a, reason: collision with root package name */
    public com.google.gson.b.o f7870a = com.google.gson.b.o.f7831a;

    /* renamed from: b, reason: collision with root package name */
    public ae f7871b = ae.f7761a;
    public j c = d.f7848a;
    public final Map<Type, u<?>> d = new HashMap();
    public final List<ak> e = new ArrayList();
    public final List<ak> f = new ArrayList();
    public int i = 2;
    public int j = 2;
    public boolean m = true;

    public final t a(Type type, Object obj) {
        byte b2 = 0;
        com.google.gson.b.a.a((obj instanceof ad) || (obj instanceof x) || (obj instanceof u) || (obj instanceof aj));
        if (com.google.gson.b.u.a(type) || com.google.gson.b.u.b(type)) {
            throw new IllegalArgumentException("Cannot register type adapters for " + type);
        }
        if (obj instanceof u) {
            this.d.put(type, (u) obj);
        }
        if ((obj instanceof ad) || (obj instanceof x)) {
            com.google.gson.c.a<?> a2 = com.google.gson.c.a.a(type);
            this.e.add(new ai(obj, a2, a2.f7847b == a2.f7846a, b2));
        }
        if (obj instanceof aj) {
            this.e.add(com.google.gson.b.a.aa.a(com.google.gson.c.a.a(type), (aj) obj));
        }
        return this;
    }
}
