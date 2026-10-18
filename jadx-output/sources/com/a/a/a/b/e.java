package com.a.a.a.b;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final a.j f950a = a.j.a(":status");

    /* renamed from: b, reason: collision with root package name */
    public static final a.j f951b = a.j.a(":method");
    public static final a.j c = a.j.a(":path");
    public static final a.j d = a.j.a(":scheme");
    public static final a.j e = a.j.a(":authority");
    public static final a.j f = a.j.a(":host");
    public static final a.j g = a.j.a(":version");
    public final a.j h;
    public final a.j i;
    final int j;

    public e(String str, String str2) {
        this(a.j.a(str), a.j.a(str2));
    }

    public e(a.j jVar, String str) {
        this(jVar, a.j.a(str));
    }

    public e(a.j jVar, a.j jVar2) {
        this.h = jVar;
        this.i = jVar2;
        this.j = jVar.f13b.length + 32 + jVar2.f13b.length;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.h.equals(eVar.h) && this.i.equals(eVar.i);
    }

    public final int hashCode() {
        return ((this.h.hashCode() + 527) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", this.h.a(), this.i.a());
    }
}
