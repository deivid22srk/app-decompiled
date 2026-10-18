package com.google.gson.bpkg.apkg;

import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i extends com.google.gson.stream.a {
    public static final Reader c = new j();
    public static final Object d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final List<Object> f7791a;

    @Override // com.google.gson.stream.a
    public final void a() {
        a(com.google.gson.stream.e.BEGIN_ARRAY);
        this.f7791a.add(((com.google.gson.v) g()).iterator());
    }

    @Override // com.google.gson.stream.a
    public final void b() {
        a(com.google.gson.stream.e.END_ARRAY);
        p();
        p();
    }

    @Override // com.google.gson.stream.a
    public final void c() {
        a(com.google.gson.stream.e.BEGIN_OBJECT);
        this.f7791a.add(((com.google.gson.aa) g()).h().iterator());
    }

    @Override // com.google.gson.stream.a
    public final void d() {
        a(com.google.gson.stream.e.END_OBJECT);
        p();
        p();
    }

    @Override // com.google.gson.stream.a
    public final boolean e() {
        com.google.gson.stream.e f = f();
        return (f == com.google.gson.stream.e.END_OBJECT || f == com.google.gson.stream.e.END_ARRAY) ? false : true;
    }

    @Override // com.google.gson.stream.a
    public final com.google.gson.stream.e f() {
        while (!this.f7791a.isEmpty()) {
            Object g = g();
            if (g instanceof Iterator) {
                boolean z = this.f7791a.get(this.f7791a.size() - 2) instanceof com.google.gson.aa;
                Iterator it = (Iterator) g;
                if (!it.hasNext()) {
                    return z ? com.google.gson.stream.e.END_OBJECT : com.google.gson.stream.e.END_ARRAY;
                }
                if (z) {
                    return com.google.gson.stream.e.NAME;
                }
                this.f7791a.add(it.next());
            } else {
                if (g instanceof com.google.gson.aa) {
                    return com.google.gson.stream.e.BEGIN_OBJECT;
                }
                if (g instanceof com.google.gson.v) {
                    return com.google.gson.stream.e.BEGIN_ARRAY;
                }
                if (g instanceof com.google.gson.ab) {
                    com.google.gson.ab abVar = (com.google.gson.ab) g;
                    if (abVar.f7760a instanceof String) {
                        return com.google.gson.stream.e.STRING;
                    }
                    if (abVar.f7760a instanceof Boolean) {
                        return com.google.gson.stream.e.BOOLEAN;
                    }
                    if (abVar.f7760a instanceof Number) {
                        return com.google.gson.stream.e.NUMBER;
                    }
                    throw new AssertionError();
                }
                if (g instanceof com.google.gson.z) {
                    return com.google.gson.stream.e.NULL;
                }
                if (g == d) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
        return com.google.gson.stream.e.END_DOCUMENT;
    }

    public final Object g() {
        return this.f7791a.get(this.f7791a.size() - 1);
    }

    public Object p() {
        return this.f7791a.remove(this.f7791a.size() - 1);
    }

    public final void a(com.google.gson.stream.e eVar) {
        if (f() != eVar) {
            throw new IllegalStateException("Expected " + eVar + " but was " + f());
        }
    }

    @Override // com.google.gson.stream.a
    public final String h() {
        a(com.google.gson.stream.e.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) g()).next();
        this.f7791a.add(entry.getValue());
        return (String) entry.getKey();
    }

    @Override // com.google.gson.stream.a
    public final String i() {
        com.google.gson.stream.e f = f();
        if (f != com.google.gson.stream.e.STRING && f != com.google.gson.stream.e.NUMBER) {
            throw new IllegalStateException("Expected " + com.google.gson.stream.e.STRING + " but was " + f);
        }
        return ((com.google.gson.ab) p()).b();
    }

    @Override // com.google.gson.stream.a
    public final boolean j() {
        a(com.google.gson.stream.e.BOOLEAN);
        return ((com.google.gson.ab) p()).f();
    }

    @Override // com.google.gson.stream.a
    public final void k() {
        a(com.google.gson.stream.e.NULL);
        p();
    }

    @Override // com.google.gson.stream.a
    public final double l() {
        com.google.gson.stream.e f = f();
        if (f != com.google.gson.stream.e.NUMBER && f != com.google.gson.stream.e.STRING) {
            throw new IllegalStateException("Expected " + com.google.gson.stream.e.NUMBER + " but was " + f);
        }
        double c2 = ((com.google.gson.ab) g()).c();
        if (!this.f7860b && (Double.isNaN(c2) || Double.isInfinite(c2))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + c2);
        }
        p();
        return c2;
    }

    @Override // com.google.gson.stream.a
    public final long m() {
        com.google.gson.stream.e f = f();
        if (f != com.google.gson.stream.e.NUMBER && f != com.google.gson.stream.e.STRING) {
            throw new IllegalStateException("Expected " + com.google.gson.stream.e.NUMBER + " but was " + f);
        }
        long d2 = ((com.google.gson.ab) g()).d();
        p();
        return d2;
    }

    @Override // com.google.gson.stream.a
    public final int n() {
        com.google.gson.stream.e f = f();
        if (f != com.google.gson.stream.e.NUMBER && f != com.google.gson.stream.e.STRING) {
            throw new IllegalStateException("Expected " + com.google.gson.stream.e.NUMBER + " but was " + f);
        }
        int e = ((com.google.gson.ab) g()).e();
        p();
        return e;
    }

    @Override // com.google.gson.stream.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7791a.clear();
        this.f7791a.add(d);
    }

    @Override // com.google.gson.stream.a
    public final void o() {
        if (f() == com.google.gson.stream.e.NAME) {
            h();
        } else {
            p();
        }
    }

    @Override // com.google.gson.stream.a
    public final String toString() {
        return getClass().getSimpleName();
    }
}
