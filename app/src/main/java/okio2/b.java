package okio2;

import java.io.IOException;

/* loaded from: classes.dex */
public final class b implements x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f4a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f5b;

    b(a aVar, x xVar) {
        this.f5b = aVar;
        this.f4a = xVar;
    }

    @Override // okio2.x
    public final void a_(f fVar, long j) {
        this.f5b.c();
        try {
            try {
                this.f4a.a_(fVar, j);
                this.f5b.a(true);
            } catch (IOException e) {
                throw this.f5b.a(e);
            }
        } catch (Throwable th) {
            this.f5b.a(false);
            throw th;
        }
    }

    @Override // okio2.x
    public final void b() {
        this.f5b.c();
        try {
            try {
                this.f4a.b();
                this.f5b.a(true);
            } catch (IOException e) {
                throw this.f5b.a(e);
            }
        } catch (Throwable th) {
            this.f5b.a(false);
            throw th;
        }
    }

    @Override // okio2.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5b.c();
        try {
            try {
                this.f4a.close();
                this.f5b.a(true);
            } catch (IOException e) {
                throw this.f5b.a(e);
            }
        } catch (Throwable th) {
            this.f5b.a(false);
            throw th;
        }
    }

    @Override // okio2.x
    public final z a() {
        return this.f5b;
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.f4a + ")";
    }
}
