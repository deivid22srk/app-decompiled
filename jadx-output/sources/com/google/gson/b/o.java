package com.google.gson.b;

import com.google.gson.aj;
import com.google.gson.ak;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class o implements ak, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public static final o f7831a = new o();
    public boolean e;

    /* renamed from: b, reason: collision with root package name */
    public double f7832b = -1.0d;
    public int c = 136;
    public boolean d = true;
    public List<com.google.gson.b> f = Collections.emptyList();
    public List<com.google.gson.b> g = Collections.emptyList();

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o clone() {
        try {
            return (o) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public final boolean a(Class<?> cls, boolean z) {
        if (this.f7832b != -1.0d && !a((com.google.gson.a.c) cls.getAnnotation(com.google.gson.a.c.class), (com.google.gson.a.d) cls.getAnnotation(com.google.gson.a.d.class))) {
            return true;
        }
        if ((this.d || !b(cls)) && !a(cls)) {
            Iterator<com.google.gson.b> it = (z ? this.f : this.g).iterator();
            while (it.hasNext()) {
                if (it.next().b()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean a(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public static boolean b(Class<?> cls) {
        if (cls.isMemberClass()) {
            if (!((cls.getModifiers() & 8) != 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.gson.ak
    public final <T> aj<T> a(com.google.gson.k kVar, com.google.gson.c.a<T> aVar) {
        Class<? super T> cls = aVar.f7846a;
        boolean a2 = a((Class<?>) cls, true);
        boolean a3 = a((Class<?>) cls, false);
        if (a2 || a3) {
            return new p(this, a3, a2, kVar, aVar);
        }
        return null;
    }

    public final boolean a(com.google.gson.a.c cVar, com.google.gson.a.d dVar) {
        if (cVar == null || cVar.a() <= this.f7832b) {
            if (dVar == null || dVar.a() > this.f7832b) {
                return true;
            }
        }
        return false;
    }
}
