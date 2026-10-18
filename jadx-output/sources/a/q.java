package a;

import java.io.InputStream;

/* loaded from: classes.dex */
final class q implements y {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f24a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InputStream f25b;

    q(z zVar, InputStream inputStream) {
        this.f24a = zVar;
        this.f25b = inputStream;
    }

    @Override // a.y
    public final long a(f fVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        this.f24a.g();
        v d = fVar.d(1);
        int read = this.f25b.read(d.f32a, d.c, (int) Math.min(j, 2048 - d.c));
        if (read == -1) {
            return -1L;
        }
        d.c += read;
        fVar.f10b += read;
        return read;
    }

    @Override // a.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f25b.close();
    }

    @Override // a.y
    public final z a() {
        return this.f24a;
    }

    public final String toString() {
        return "source(" + this.f25b + ")";
    }
}
