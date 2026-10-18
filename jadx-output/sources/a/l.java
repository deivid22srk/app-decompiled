package a;

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

    @Override // a.y
    public long a(f fVar, long j) {
        return this.f16a.a(fVar, j);
    }

    @Override // a.y
    public final z a() {
        return this.f16a.a();
    }

    @Override // a.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16a.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f16a.toString() + ")";
    }
}
