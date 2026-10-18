package android.support.v4.h;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
final class l<K, V> implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

    /* renamed from: a, reason: collision with root package name */
    int f294a;
    final /* synthetic */ h d;
    boolean c = false;

    /* renamed from: b, reason: collision with root package name */
    int f295b = -1;

    l(h hVar) {
        this.d = hVar;
        this.f294a = hVar.a() - 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f295b < this.f294a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException();
        }
        this.d.a(this.f295b);
        this.f295b--;
        this.f294a--;
        this.c = false;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return (K) this.d.a(this.f295b, 0);
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return (V) this.d.a(this.f295b, 1);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return (V) this.d.a(this.f295b, (int) v);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return c.a(entry.getKey(), this.d.a(this.f295b, 0)) && c.a(entry.getValue(), this.d.a(this.f295b, 1));
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        Object a2 = this.d.a(this.f295b, 0);
        Object a3 = this.d.a(this.f295b, 1);
        return (a3 != null ? a3.hashCode() : 0) ^ (a2 == null ? 0 : a2.hashCode());
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f295b++;
        this.c = true;
        return this;
    }
}
