package a;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
final class u extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f31a;

    u(t tVar) {
        this.f31a = tVar;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f31a.c) {
            throw new IOException("closed");
        }
        if (this.f31a.f29a.f10b == 0 && this.f31a.f30b.a(this.f31a.f29a, 2048L) == -1) {
            return -1;
        }
        return this.f31a.f29a.g() & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f31a.c) {
            throw new IOException("closed");
        }
        ab.a(bArr.length, i, i2);
        if (this.f31a.f29a.f10b == 0 && this.f31a.f30b.a(this.f31a.f29a, 2048L) == -1) {
            return -1;
        }
        return this.f31a.f29a.a(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.f31a.c) {
            throw new IOException("closed");
        }
        return (int) Math.min(this.f31a.f29a.f10b, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f31a.close();
    }

    public final String toString() {
        return this.f31a + ".inputStream()";
    }
}
