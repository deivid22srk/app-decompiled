package android.support.v4.h;

import java.util.Iterator;

/* loaded from: classes.dex */
final class i<T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    final int f290a;

    /* renamed from: b, reason: collision with root package name */
    int f291b;
    int c;
    boolean d = false;
    final /* synthetic */ h e;

    i(h hVar, int i) {
        this.e = hVar;
        this.f290a = i;
        this.f291b = hVar.a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.f291b;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t = (T) this.e.a(this.c, this.f290a);
        this.c++;
        this.d = true;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        this.c--;
        this.f291b--;
        this.d = false;
        this.e.a(this.c);
    }
}
