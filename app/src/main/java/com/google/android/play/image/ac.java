package com.google.android.play.image;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class ac<T> implements Iterator<T> {

    /* renamed from: b, reason: collision with root package name */
    ad f6927b;
    T c;

    protected abstract T a();

    private ac() {
        this.f6927b = ad.NOT_READY;
    }

    /* synthetic */ ac(byte b2) {
        this();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6927b == ad.FAILED) {
            throw new IllegalStateException();
        }
        switch (this.f6927b) {
            case DONE:
                return false;
            case READY:
                return true;
            default:
                this.f6927b = ad.FAILED;
                this.c = a();
                if (this.f6927b == ad.DONE) {
                    return false;
                }
                this.f6927b = ad.READY;
                return true;
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6927b = ad.NOT_READY;
        return this.c;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
