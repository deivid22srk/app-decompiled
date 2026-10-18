package a;

import java.io.EOFException;
import java.io.InputStream;

/* loaded from: classes.dex */
final class t implements i {

    /* renamed from: a, reason: collision with root package name */
    public final f f29a;

    /* renamed from: b, reason: collision with root package name */
    public final y f30b;
    boolean c;

    private t(y yVar, f fVar) {
        if (yVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        this.f29a = fVar;
        this.f30b = yVar;
    }

    public t(y yVar) {
        this(yVar, new f());
    }

    @Override // a.i
    public final f c() {
        return this.f29a;
    }

    @Override // a.y
    public final long a(f fVar, long j) {
        if (fVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (this.f29a.f10b == 0 && this.f30b.a(this.f29a, 2048L) == -1) {
            return -1L;
        }
        return this.f29a.a(fVar, Math.min(j, this.f29a.f10b));
    }

    @Override // a.i
    public final boolean e() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        return this.f29a.e() && this.f30b.a(this.f29a, 2048L) == -1;
    }

    @Override // a.i
    public final byte g() {
        a(1L);
        return this.f29a.g();
    }

    @Override // a.i
    public final j c(long j) {
        a(j);
        return this.f29a.c(j);
    }

    @Override // a.i
    public final byte[] e(long j) {
        a(j);
        return this.f29a.e(j);
    }

    @Override // a.i
    public final String m() {
        long a2 = a((byte) 10);
        if (a2 == -1) {
            f fVar = new f();
            this.f29a.a(fVar, 0L, Math.min(32L, this.f29a.f10b));
            throw new EOFException("\\n not found: size=" + this.f29a.f10b + " content=" + fVar.l().b() + "...");
        }
        return this.f29a.d(a2);
    }

    @Override // a.i
    public final short h() {
        a(2L);
        return this.f29a.h();
    }

    @Override // a.i
    public final short j() {
        a(2L);
        return ab.a(this.f29a.h());
    }

    @Override // a.i
    public final int i() {
        a(4L);
        return this.f29a.i();
    }

    @Override // a.i
    public final int k() {
        a(4L);
        return ab.a(this.f29a.i());
    }

    @Override // a.i
    public final void f(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            if (this.f29a.f10b == 0 && this.f30b.a(this.f29a, 2048L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.f29a.f10b);
            this.f29a.f(min);
            j -= min;
        }
    }

    @Override // a.i
    public final InputStream f() {
        return new u(this);
    }

    @Override // a.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.c) {
            this.c = true;
            this.f30b.close();
            this.f29a.o();
        }
    }

    @Override // a.y
    public final z a() {
        return this.f30b.a();
    }

    public final String toString() {
        return "buffer(" + this.f30b + ")";
    }

    @Override // a.i
    public final void a(long j) {
        boolean z;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            if (this.f29a.f10b >= j) {
                z = true;
                break;
            } else if (this.f30b.a(this.f29a, 2048L) == -1) {
                z = false;
                break;
            }
        }
        if (!z) {
            throw new EOFException();
        }
    }

    @Override // a.i
    public final long a(byte b2) {
        long j = 0;
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (0 >= this.f29a.f10b) {
            if (this.f30b.a(this.f29a, 2048L) == -1) {
                return -1L;
            }
        }
        do {
            long a2 = this.f29a.a(b2, j);
            if (a2 == -1) {
                j = this.f29a.f10b;
            } else {
                return a2;
            }
        } while (this.f30b.a(this.f29a, 2048L) != -1);
        return -1L;
    }
}
