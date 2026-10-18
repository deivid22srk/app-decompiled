package a;

/* loaded from: classes.dex */
final class s implements h {

    /* renamed from: a, reason: collision with root package name */
    public final f f27a;

    /* renamed from: b, reason: collision with root package name */
    public final x f28b;
    private boolean c;

    private s(x xVar, f fVar) {
        if (xVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        this.f27a = fVar;
        this.f28b = xVar;
    }

    public s(x xVar) {
        this(xVar, new f());
    }

    @Override // a.h, a.i
    public final f c() {
        return this.f27a;
    }

    @Override // a.x
    public final void a_(f fVar, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f27a.a_(fVar, j);
        q();
    }

    @Override // a.h
    public final h b(j jVar) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f27a.b(jVar);
        return q();
    }

    @Override // a.h
    public final h b(String str) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f27a.b(str);
        return q();
    }

    @Override // a.h
    public final h b(byte[] bArr) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f27a.b(bArr);
        return q();
    }

    @Override // a.h
    public final h c(byte[] bArr, int i, int i2) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f27a.c(bArr, i, i2);
        return q();
    }

    @Override // a.h
    public final long a(y yVar) {
        if (yVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long a2 = yVar.a(this.f27a, 2048L);
            if (a2 != -1) {
                j += a2;
                q();
            } else {
                return j;
            }
        }
    }

    @Override // a.h
    public final h g(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f27a.g(i);
        return q();
    }

    @Override // a.h
    public final h f(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f27a.f(i);
        return q();
    }

    @Override // a.h
    public final h e(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.f27a.e(i);
        return q();
    }

    @Override // a.h
    public final h q() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f27a;
        long j = fVar.f10b;
        if (j == 0) {
            j = 0;
        } else {
            if (fVar.f9a.e.c < 2048) {
                j -= r4.c - r4.f33b;
            }
        }
        if (j > 0) {
            this.f28b.a_(this.f27a, j);
        }
        return this;
    }

    @Override // a.h
    public final h d() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long j = this.f27a.f10b;
        if (j > 0) {
            this.f28b.a_(this.f27a, j);
        }
        return this;
    }

    @Override // a.x
    public final void b() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (this.f27a.f10b > 0) {
            this.f28b.a_(this.f27a, this.f27a.f10b);
        }
        this.f28b.b();
    }

    @Override // a.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.c) {
            Throwable th = null;
            try {
                if (this.f27a.f10b > 0) {
                    this.f28b.a_(this.f27a, this.f27a.f10b);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f28b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.c = true;
            if (th != null) {
                ab.a(th);
            }
        }
    }

    @Override // a.x
    public final z a() {
        return this.f28b.a();
    }

    public final String toString() {
        return "buffer(" + this.f28b + ")";
    }
}
