package android.support.v4.h;

/* loaded from: classes.dex */
public final class n<F, S> {

    /* renamed from: a, reason: collision with root package name */
    public final F f297a;

    /* renamed from: b, reason: collision with root package name */
    public final S f298b;

    public n(F f, S s) {
        this.f297a = f;
        this.f298b = s;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return a(nVar.f297a, this.f297a) && a(nVar.f298b, this.f298b);
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public final int hashCode() {
        return (this.f297a == null ? 0 : this.f297a.hashCode()) ^ (this.f298b != null ? this.f298b.hashCode() : 0);
    }
}
