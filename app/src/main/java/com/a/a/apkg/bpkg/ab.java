package com.a.a.apkg.bpkg;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.zip.Deflater;

/* loaded from: classes.dex */
final class ab implements d {

    /* renamed from: a, reason: collision with root package name */
    public final okio2.h f927a;

    /* renamed from: b, reason: collision with root package name */
    public final okio2.f f928b;
    public final okio2.h c;
    public final boolean d;
    public boolean e;

    ab(okio2.h hVar, boolean z) {
        this.f927a = hVar;
        this.d = z;
        Deflater deflater = new Deflater();
        deflater.setDictionary(com.a.a.apkg.bpkg.z.f983a);
        this.f928b = new okio2.f();
        this.c = okio2.o.a(new okio2.k((okio2.x) this.f928b, deflater));
    }

    @Override // com.a.a.apkg.bpkg.d
    public final void a(y yVar) {
    }

    @Override // com.a.a.apkg.bpkg.d
    public final synchronized void a() {
    }

    @Override // com.a.a.apkg.bpkg.d
    public final synchronized void b() {
        if (this.e) {
            throw new IOException("closed");
        }
        this.f927a.b();
    }

    @Override // com.a.a.apkg.bpkg.d
    public final synchronized void a(boolean z, int i, List<e> list) {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            a(list);
            int i2 = (int) (10 + this.f928b.f10b);
            int i3 = z ? 1 : 0;
            this.f927a.e(-2147287039);
            this.f927a.e((((i3 | 0) & 255) << 24) | (i2 & 16777215));
            this.f927a.e(Integer.MAX_VALUE & i);
            this.f927a.e(0);
            this.f927a.f(0);
            this.f927a.a(this.f928b);
            this.f927a.b();
        }
    }

    @Override // com.a.a.apkg.bpkg.d
    public final synchronized void a(int i, a aVar) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (aVar.t == -1) {
            throw new IllegalArgumentException();
        }
        this.f927a.e(-2147287037);
        this.f927a.e(8);
        this.f927a.e(Integer.MAX_VALUE & i);
        this.f927a.e(aVar.t);
        this.f927a.b();
    }

    @Override // com.a.a.apkg.bpkg.d
    public final int c() {
        return 16383;
    }

    @Override // com.a.a.apkg.bpkg.d
    public final synchronized void a(boolean z, int i, okio2.f fVar, int i2) {
        int i3 = z ? 1 : 0;
        if (this.e) {
            throw new IOException("closed");
        }
        if (i2 > 16777215) {
            throw new IllegalArgumentException("FRAME_TOO_LARGE max size is 16Mib: " + i2);
        }
        this.f927a.e(Integer.MAX_VALUE & i);
        this.f927a.e(((i3 & 255) << 24) | (16777215 & i2));
        if (i2 > 0) {
            this.f927a.a_(fVar, i2);
        }
    }

    public void a(List<e> list) {
        if (this.f928b.f10b != 0) {
            throw new IllegalStateException();
        }
        this.c.e(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            okio2.j jVar = list.get(i).h;
            this.c.e(jVar.f13b.length);
            this.c.b(jVar);
            okio2.j jVar2 = list.get(i).i;
            this.c.e(jVar2.f13b.length);
            this.c.b(jVar2);
        }
        this.c.b();
    }

    @Override // com.a.a.apkg.bpkg.d
    public final synchronized void b(y yVar) {
        if (this.e) {
            throw new IOException("closed");
        }
        int bitCount = Integer.bitCount(yVar.f981a);
        this.f927a.e(-2147287036);
        this.f927a.e((((bitCount * 8) + 4) & 16777215) | 0);
        this.f927a.e(bitCount);
        for (int i = 0; i <= 10; i++) {
            if (yVar.a(i)) {
                this.f927a.e(((yVar.b(i) & 255) << 24) | (i & 16777215));
                this.f927a.e(yVar.d[i]);
            }
        }
        this.f927a.b();
    }

    @Override // com.a.a.apkg.bpkg.d
    public final synchronized void a(boolean z, int i, int i2) {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            if (z != (this.d != ((i & 1) == 1))) {
                throw new IllegalArgumentException("payload != reply");
            }
            this.f927a.e(-2147287034);
            this.f927a.e(4);
            this.f927a.e(i);
            this.f927a.b();
        }
    }

    @Override // com.a.a.apkg.bpkg.d
    public final synchronized void a(int i, a aVar, byte[] bArr) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (aVar.u == -1) {
            throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
        }
        this.f927a.e(-2147287033);
        this.f927a.e(8);
        this.f927a.e(i);
        this.f927a.e(aVar.u);
        this.f927a.b();
    }

    @Override // com.a.a.apkg.bpkg.d
    public final synchronized void a(int i, long j) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException("windowSizeIncrement must be between 1 and 0x7fffffff: " + j);
        }
        this.f927a.e(-2147287031);
        this.f927a.e(8);
        this.f927a.e(i);
        this.f927a.e((int) j);
        this.f927a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e = true;
        com.a.a.apkg.l.a((Closeable) this.f927a, (Closeable) this.c);
    }
}
