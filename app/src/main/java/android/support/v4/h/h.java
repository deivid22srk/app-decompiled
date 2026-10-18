package android.support.v4.h;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class h<K, V> {

    /* renamed from: b, reason: collision with root package name */
    h<K, V>.j f289b;
    h<K, V>.k c;
    h<K, V>.m d;

    protected abstract int a();

    protected abstract int a(Object obj);

    protected abstract Object a(int i, int i2);

    protected abstract V a(int i, V v);

    protected abstract void a(int i);

    protected abstract void a(K k2, V v);

    protected abstract int b(Object obj);

    protected abstract Map<K, V> b();

    protected abstract void c();

    h() {
    }

    final class j implements Set<Map.Entry<K, V>> {
        j() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int a2 = h.this.a();
            for (Map.Entry<K, V> entry : collection) {
                h.this.a((h) entry.getKey(), (K) entry.getValue());
            }
            return a2 != h.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            h.this.c();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a2 = h.this.a(entry.getKey());
            if (a2 >= 0) {
                return android.support.v4.h.c.a(h.this.a(a2, 1), entry.getValue());
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return h.this.a() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new l(h.this);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return h.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return h.a((Set) this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int a2 = h.this.a() - 1;
            int i = 0;
            while (a2 >= 0) {
                Object a3 = h.this.a(a2, 0);
                Object a4 = h.this.a(a2, 1);
                a2--;
                i += (a4 == null ? 0 : a4.hashCode()) ^ (a3 == null ? 0 : a3.hashCode());
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }
    }

    final class k implements Set<K> {
        k() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            h.this.c();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return h.this.a(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Map<K, V> b2 = h.this.b();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!b2.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return h.this.a() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new i(h.this, 0);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            int a2 = h.this.a(obj);
            if (a2 < 0) {
                return false;
            }
            h.this.a(a2);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Map<K, V> b2 = h.this.b();
            int size = b2.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                b2.remove(it.next());
            }
            return size != b2.size();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return h.a((Map) h.this.b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return h.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            return h.this.b(0);
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) h.this.a(tArr, 0);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return h.a((Set) this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int i = 0;
            for (int a2 = h.this.a() - 1; a2 >= 0; a2--) {
                Object a3 = h.this.a(a2, 0);
                i += a3 == null ? 0 : a3.hashCode();
            }
            return i;
        }
    }

    final class m implements Collection<V> {
        m() {
        }

        @Override // java.util.Collection
        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            h.this.c();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return h.this.b(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return h.this.a() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new i(h.this, 1);
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            int b2 = h.this.b(obj);
            if (b2 < 0) {
                return false;
            }
            h.this.a(b2);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            int i = 0;
            int a2 = h.this.a();
            boolean z = false;
            while (i < a2) {
                if (collection.contains(h.this.a(i, 1))) {
                    h.this.a(i);
                    i--;
                    a2--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            int i = 0;
            int a2 = h.this.a();
            boolean z = false;
            while (i < a2) {
                if (!collection.contains(h.this.a(i, 1))) {
                    h.this.a(i);
                    i--;
                    a2--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return h.this.a();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            return h.this.b(1);
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) h.this.a(tArr, 1);
        }
    }

    public static <K, V> boolean a(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public final Object[] b(int i) {
        int a2 = a();
        Object[] objArr = new Object[a2];
        for (int i2 = 0; i2 < a2; i2++) {
            objArr[i2] = a(i2, i);
        }
        return objArr;
    }

    public final <T> T[] a(T[] tArr, int i) {
        int a2 = a();
        Object[] objArr = tArr.length < a2 ? (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), a2)) : tArr;
        for (int i2 = 0; i2 < a2; i2++) {
            objArr[i2] = a(i2, i);
        }
        if (objArr.length > a2) {
            objArr[a2] = null;
        }
        return (T[]) objArr;
    }

    public static <T> boolean a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                if (set.containsAll(set2)) {
                    return true;
                }
            }
            return false;
        } catch (ClassCastException e) {
            return false;
        } catch (NullPointerException e2) {
            return false;
        }
    }
}
