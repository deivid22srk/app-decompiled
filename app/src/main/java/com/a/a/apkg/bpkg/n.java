package com.a.a.apkg.bpkg;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class n implements d {

    /* renamed from: a, reason: collision with root package name */
    public final okio2.h f967a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f968b;
    public final okio2.f c = new okio2.f();
    public final i d = new i(this.c);
    public int e = 16384;
    public boolean f;

    n(okio2.h hVar, boolean z) {
        this.f967a = hVar;
        this.f968b = z;
    }

    @Override // com.a.a.apkg.bpkg.d
    public final synchronized void b() {
        if (this.f) {
            throw new IOException("closed");
        }
        this.f967a.b();
    }

    @Override // com.a.a.apkg.bpkg.d
    public final synchronized void a(y yVar) {
        if (this.f) {
            throw new IOException("closed");
        }
        int i = this.e;
        if ((yVar.f981a & 32) != 0) {
            i = yVar.d[5];
        }
        this.e = i;
        a(0, 0, (byte) 4, (byte) 1);
        this.f967a.b();
    }

    @Override // com.a.a.apkg.bpkg.d
    public final synchronized void a() {
        Logger logger;
        okio2.j jVar;
        Logger logger2;
        okio2.j jVar2;
        if (this.f) {
            throw new IOException("closed");
        }
        if (this.f968b) {
            logger = j.f959a;
            if (logger.isLoggable(Level.FINE)) {
                logger2 = j.f959a;
                jVar2 = j.f960b;
                logger2.fine(String.format(">> CONNECTION %s", jVar2.b()));
            }
            okio2.h hVar = this.f967a;
            jVar = j.f960b;
            hVar.b(jVar.d());
            this.f967a.b();
        }
    }

    @Override // com.a.a.apkg.bpkg.d
    public final synchronized void a(boolean z, int i, List<e> list) {
        if (this.f) {
            throw new IOException("closed");
        }
        if (this.f) {
            throw new IOException("closed");
        }
        if (this.c.f10b != 0) {
            throw new IllegalStateException();
        }
        this.d.a(list);
        long j = this.c.f10b;
        int min = (int) Math.min(this.e, j);
        byte b2 = j == ((long) min) ? (byte) 4 : (byte) 0;
        if (z) {
            b2 = (byte) (b2 | 1);
        }
        a(i, min, (byte) 1, b2);
        this.f967a.a_(this.c, min);
        if (j > min) {
            b(i, j - min);
        }
    }

    public void b(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min(this.e, j);
            j -= min;
            a(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.f967a.a_(this.c, min);
        }
    }

    @Override // com.a.a.apkg.bpkg.d
    public final synchronized void a(int i, a aVar) {
        if (this.f) {
            throw new IOException("closed");
        }
        if (aVar.t == -1) {
            throw new IllegalArgumentException();
        }
        a(i, 4, (byte) 3, (byte) 0);
        this.f967a.e(aVar.s);
        this.f967a.b();
    }

    @Override // com.a.a.apkg.bpkg.d
    public final int c() {
        return this.e;
    }

    @Override // com.a.a.apkg.bpkg.d
    public final synchronized void a(boolean z, int i, okio2.f fVar, int i2) {
        synchronized (this) {
            if (this.f) {
                throw new IOException("closed");
            }
            a(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
            if (i2 > 0) {
                this.f967a.a_(fVar, i2);
            }
        }
    }

    @Override // com.a.a.apkg.bpkg.d
    public final synchronized void b(y yVar) {
        int i;
        int i2 = 0;
        synchronized (this) {
            if (this.f) {
                throw new IOException("closed");
            }
            a(0, Integer.bitCount(yVar.f981a) * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (yVar.a(i2)) {
                    if (i2 == 4) {
                        i = 3;
                    } else {
                        i = i2 == 7 ? 4 : i2;
                    }
                    this.f967a.f(i);
                    this.f967a.e(yVar.d[i2]);
                }
                i2++;
            }
            this.f967a.b();
        }
    }

    @Override // com.a.a.apkg.bpkg.d
    public final synchronized void a(boolean z, int i, int i2) {
        synchronized (this) {
            if (this.f) {
                throw new IOException("closed");
            }
            a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.f967a.e(i);
            this.f967a.e(i2);
            this.f967a.b();
        }
    }

    @Override // com.a.a.apkg.bpkg.d
    public final synchronized void a(int i, a aVar, byte[] bArr) {
        if (this.f) {
            throw new IOException("closed");
        }
        if (aVar.s == -1) {
            throw j.b("errorCode.httpCode == -1", new Object[0]);
        }
        a(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.f967a.e(i);
        this.f967a.e(aVar.s);
        if (bArr.length > 0) {
            this.f967a.b(bArr);
        }
        this.f967a.b();
    }

    @Override // com.a.a.apkg.bpkg.d
    public final synchronized void a(int i, long j) {
        if (this.f) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw com.a.a.apkg.bpkg.j.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[]{Long.valueOf(j)});
        }
        a(i, 4, (byte) 8, (byte) 0);
        this.f967a.e((int) j);
        this.f967a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f = true;
        this.f967a.close();
    }

    public void a(int i, int i2, byte b2, byte b3) {
        Logger logger;
        Logger logger2;
        logger = j.f959a;
        if (logger.isLoggable(Level.FINE)) {
            logger2 = j.f959a;
            logger2.fine(l.a(false, i, i2, b2, b3));
        }
        if (i2 > this.e) {
            throw j.b("FRAME_SIZE_ERROR length > %d: %d", new Object[]{Integer.valueOf(this.e), Integer.valueOf(i2)});
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw j.b("reserved bit set: %s", new Object[]{Integer.valueOf(i)});
        }
        j.a(this.f967a, i2);
        this.f967a.g(b2 & 255);
        this.f967a.g(b3 & 255);
        this.f967a.e(Integer.MAX_VALUE & i);
    }
}
