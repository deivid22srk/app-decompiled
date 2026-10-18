package com.google.android.gms.common.cpkg;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c<E> extends AbstractSet<E> {

    /* renamed from: a, reason: collision with root package name */
    public final android.support.v4.h.a<E, E> f5602a;

    public c() {
        this.f5602a = new android.support.v4.h.a<>();
    }

    public c(int i) {
        this.f5602a = new android.support.v4.h.a<>(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(Collection<E> collection) {
        this(collection.size());
        addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        if (this.f5602a.containsKey(e)) {
            return false;
        }
        this.f5602a.put(e, e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        return collection instanceof c ? a((c) collection) : super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f5602a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f5602a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return this.f5602a.keySet().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!this.f5602a.containsKey(obj)) {
            return false;
        }
        this.f5602a.remove(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5602a.size();
    }

    public boolean a(c<? extends E> cVar) {
        int size = size();
        android.support.v4.h.a<E, E> aVar = this.f5602a;
        android.support.v4.h.a<? extends E, ? extends E> aVar2 = cVar.f5602a;
        int i = aVar2.h;
        aVar.a(aVar.h + i);
        if (aVar.h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                aVar.put(aVar2.b(i2), aVar2.c(i2));
            }
        } else if (i > 0) {
            System.arraycopy(aVar2.f, 0, aVar.f, 0, i);
            System.arraycopy(aVar2.g, 0, aVar.g, 0, i << 1);
            aVar.h = i;
        }
        return size() > size;
    }
}
