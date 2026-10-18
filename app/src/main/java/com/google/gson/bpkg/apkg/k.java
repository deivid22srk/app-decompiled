package com.google.gson.bpkg.apkg;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class k extends com.google.gson.stream.f {
    public static final Writer h = new l();
    public static final com.google.gson.ab i = new com.google.gson.ab("closed");

    /* renamed from: a, reason: collision with root package name */
    public final List<com.google.gson.y> f7792a;

    /* renamed from: b, reason: collision with root package name */
    com.google.gson.y f7793b;
    public String j;

    public k() {
        super(h);
        this.f7792a = new ArrayList();
        this.f7793b = com.google.gson.z.f7873a;
    }

    public com.google.gson.y f() {
        return this.f7792a.get(this.f7792a.size() - 1);
    }

    public void a(com.google.gson.y yVar) {
        if (this.j != null) {
            if (!(yVar instanceof com.google.gson.z) || this.g) {
                ((com.google.gson.aa) f()).a(this.j, yVar);
            }
            this.j = null;
            return;
        }
        if (this.f7792a.isEmpty()) {
            this.f7793b = yVar;
            return;
        }
        com.google.gson.y f = f();
        if (f instanceof com.google.gson.v) {
            ((com.google.gson.v) f).a(yVar);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.f
    public final com.google.gson.stream.f a() {
        com.google.gson.v vVar = new com.google.gson.v();
        a(vVar);
        this.f7792a.add(vVar);
        return this;
    }

    @Override // com.google.gson.stream.f
    public final com.google.gson.stream.f b() {
        if (this.f7792a.isEmpty() || this.j != null) {
            throw new IllegalStateException();
        }
        if (f() instanceof com.google.gson.v) {
            this.f7792a.remove(this.f7792a.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.f
    public final com.google.gson.stream.f c() {
        com.google.gson.aa aaVar = new com.google.gson.aa();
        a(aaVar);
        this.f7792a.add(aaVar);
        return this;
    }

    @Override // com.google.gson.stream.f
    public final com.google.gson.stream.f d() {
        if (this.f7792a.isEmpty() || this.j != null) {
            throw new IllegalStateException();
        }
        if (f() instanceof com.google.gson.aa) {
            this.f7792a.remove(this.f7792a.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.f
    public final com.google.gson.stream.f a(String str) {
        if (this.f7792a.isEmpty() || this.j != null) {
            throw new IllegalStateException();
        }
        if (f() instanceof com.google.gson.aa) {
            this.j = str;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.f
    public final com.google.gson.stream.f b(String str) {
        if (str == null) {
            return e();
        }
        a(new com.google.gson.ab(str));
        return this;
    }

    @Override // com.google.gson.stream.f
    public final com.google.gson.stream.f e() {
        a(com.google.gson.z.f7873a);
        return this;
    }

    @Override // com.google.gson.stream.f
    public final com.google.gson.stream.f a(boolean z) {
        a(new com.google.gson.ab(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.gson.stream.f
    public final com.google.gson.stream.f a(long j) {
        a(new com.google.gson.ab(Long.valueOf(j)));
        return this;
    }

    @Override // com.google.gson.stream.f
    public final com.google.gson.stream.f a(Number number) {
        if (number == null) {
            return e();
        }
        if (!this.e) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        a(new com.google.gson.ab(number));
        return this;
    }

    @Override // com.google.gson.stream.f, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f7792a.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f7792a.add(i);
    }
}
