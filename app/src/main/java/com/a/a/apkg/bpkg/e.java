package com.a.a.apkg.bpkg;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final okio2.j f950a = okio2.j.a(":status");

    /* renamed from: b, reason: collision with root package name */
    public static final okio2.j f951b = okio2.j.a(":method");
    public static final okio2.j c = okio2.j.a(":path");
    public static final okio2.j d = okio2.j.a(":scheme");
    public static final okio2.j e = okio2.j.a(":authority");
    public static final okio2.j f = okio2.j.a(":host");
    public static final okio2.j g = okio2.j.a(":version");
    public final okio2.j h;
    public final okio2.j i;
    public final int j;

    public e(String str, String str2) {
        this(okio2.j.a(str), okio2.j.a(str2));
    }

    public e(okio2.j jVar, String str) {
        this(jVar, okio2.j.a(str));
    }

    public e(okio2.j jVar, okio2.j jVar2) {
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
