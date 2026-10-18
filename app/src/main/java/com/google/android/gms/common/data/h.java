package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.av;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h<T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    protected final b<T> f5622a;

    /* renamed from: b, reason: collision with root package name */
    protected int f5623b = -1;

    public h(b<T> bVar) {
        this.f5622a = (b) av.a(bVar);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5623b < this.f5622a.c() + (-1);
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Cannot advance the iterator beyond " + this.f5623b);
        }
        b<T> bVar = this.f5622a;
        int i = this.f5623b + 1;
        this.f5623b = i;
        return bVar.a(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
