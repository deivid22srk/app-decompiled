package okio2;

/* loaded from: classes.dex */
public abstract class l implements y {

    /* renamed from: a, reason: collision with root package name */
    private final y f16a;

    public l(y yVar) {
        if (yVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f16a = yVar;
    }

    @Override // okio2.y
    public long a(f fVar, long j) {
        return this.f16a.a(fVar, j);
    }

    @Override // okio2.y
    public final z a() {
        return this.f16a.a();
    }

    @Override // okio2.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16a.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f16a.toString() + ")";
    }
}
