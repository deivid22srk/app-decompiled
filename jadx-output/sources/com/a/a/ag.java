package com.a.a;

/* loaded from: classes.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    public ab f1014a;

    /* renamed from: b, reason: collision with root package name */
    public aa f1015b;
    public int c;
    public String d;
    public s e;
    u f;
    public ah g;
    af h;
    af i;
    af j;

    /* synthetic */ ag(af afVar, byte b2) {
        this(afVar);
    }

    public ag() {
        this.c = -1;
        this.f = new u();
    }

    private ag(af afVar) {
        this.c = -1;
        this.f1014a = afVar.f1012a;
        this.f1015b = afVar.f1013b;
        this.c = afVar.c;
        this.d = afVar.d;
        this.e = afVar.e;
        this.f = afVar.f.b();
        this.g = afVar.g;
        this.h = afVar.h;
        this.i = afVar.i;
        this.j = afVar.j;
    }

    public final ag a(String str, String str2) {
        this.f.c(str, str2);
        return this;
    }

    public final ag b(String str, String str2) {
        this.f.a(str, str2);
        return this;
    }

    public final ag a(t tVar) {
        this.f = tVar.b();
        return this;
    }

    public final ag a(af afVar) {
        if (afVar != null) {
            a("networkResponse", afVar);
        }
        this.h = afVar;
        return this;
    }

    public final ag b(af afVar) {
        if (afVar != null) {
            a("cacheResponse", afVar);
        }
        this.i = afVar;
        return this;
    }

    public final ag c(af afVar) {
        if (afVar == null || afVar.g == null) {
            this.j = afVar;
            return this;
        }
        throw new IllegalArgumentException("priorResponse.body != null");
    }

    public final af a() {
        if (this.f1014a == null) {
            throw new IllegalStateException("request == null");
        }
        if (this.f1015b == null) {
            throw new IllegalStateException("protocol == null");
        }
        if (this.c < 0) {
            throw new IllegalStateException("code < 0: " + this.c);
        }
        return new af(this, (byte) 0);
    }

    private static void a(String str, af afVar) {
        if (afVar.g != null) {
            throw new IllegalArgumentException(str + ".body != null");
        }
        if (afVar.h != null) {
            throw new IllegalArgumentException(str + ".networkResponse != null");
        }
        if (afVar.i != null) {
            throw new IllegalArgumentException(str + ".cacheResponse != null");
        }
        if (afVar.j != null) {
            throw new IllegalArgumentException(str + ".priorResponse != null");
        }
    }
}
