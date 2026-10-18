package a;

import java.io.InputStream;

/* loaded from: classes.dex */
final class g extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f11a;

    g(f fVar) {
        this.f11a = fVar;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f11a.f10b > 0) {
            return this.f11a.g() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.f11a.a(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(this.f11a.f10b, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final String toString() {
        return this.f11a + ".inputStream()";
    }
}
