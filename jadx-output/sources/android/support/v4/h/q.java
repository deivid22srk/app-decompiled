package android.support.v4.h;

/* loaded from: classes.dex */
public final class q<T> implements p<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f299a;

    /* renamed from: b, reason: collision with root package name */
    private int f300b;

    public q(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f299a = new Object[i];
    }

    @Override // android.support.v4.h.p
    public final T a() {
        if (this.f300b <= 0) {
            return null;
        }
        int i = this.f300b - 1;
        T t = (T) this.f299a[i];
        this.f299a[i] = null;
        this.f300b--;
        return t;
    }

    @Override // android.support.v4.h.p
    public final boolean a(T t) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.f300b) {
                z = false;
                break;
            }
            if (this.f299a[i] == t) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        if (this.f300b >= this.f299a.length) {
            return false;
        }
        this.f299a[this.f300b] = t;
        this.f300b++;
        return true;
    }
}
