package okio2;

import java.io.IOException;

/* loaded from: classes.dex */
public final class c implements y {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ y f6a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f7b;

    c(a aVar, y yVar) {
        this.f7b = aVar;
        this.f6a = yVar;
    }

    @Override // okio2.y
    public final long a(f fVar, long j) {
        this.f7b.c();
        try {
            try {
                long a2 = this.f6a.a(fVar, j);
                this.f7b.a(true);
                return a2;
            } catch (IOException e) {
                throw this.f7b.a(e);
            }
        } catch (Throwable th) {
            this.f7b.a(false);
            throw th;
        }
    }

    @Override // okio2.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            try {
                this.f6a.close();
                this.f7b.a(true);
            } catch (IOException e) {
                throw this.f7b.a(e);
            }
        } catch (Throwable th) {
            this.f7b.a(false);
            throw th;
        }
    }

    @Override // okio2.y
    public final z a() {
        return this.f7b;
    }

    public final String toString() {
        return "AsyncTimeout.source(" + this.f6a + ")";
    }
}
