package android.support.v4.h;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class a<K, V> extends r<K, V> implements Map<K, V> {

    /* renamed from: a, reason: collision with root package name */
    h<K, V> f279a;

    public a() {
    }

    public a(int i) {
        super(i);
    }

    private h<K, V> a() {
        if (this.f279a == null) {
            this.f279a = new b(this);
        }
        return this.f279a;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        a(this.h + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        h<K, V> a2 = a();
        if (a2.f289b == null) {
            a2.f289b = a2.new j();
        }
        return a2.f289b;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        h<K, V> a2 = a();
        if (a2.c == null) {
            a2.c = a2.new k();
        }
        return a2.c;
    }

    @Override // java.util.Map
    public Collection<V> values() {
        h<K, V> a2 = a();
        if (a2.d == null) {
            a2.d = a2.new m();
        }
        return a2.d;
    }
}
