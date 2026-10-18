package com.a.a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f1032a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1033b;

    public j(String str, String str2) {
        this.f1032a = str;
        this.f1033b = str2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof j) && com.a.a.a.l.a(this.f1032a, ((j) obj).f1032a) && com.a.a.a.l.a(this.f1033b, ((j) obj).f1033b);
    }

    public final int hashCode() {
        return (((this.f1033b != null ? this.f1033b.hashCode() : 0) + 899) * 31) + (this.f1032a != null ? this.f1032a.hashCode() : 0);
    }

    public final String toString() {
        return this.f1032a + " realm=\"" + this.f1033b + "\"";
    }
}
