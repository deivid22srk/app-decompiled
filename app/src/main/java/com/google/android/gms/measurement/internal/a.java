package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* loaded from: classes.dex */
final class a implements Iterator<String> {

    /* renamed from: a, reason: collision with root package name */
    Iterator<String> f6287a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ EventParams f6288b;

    a(EventParams eventParams) {
        Bundle bundle;
        this.f6288b = eventParams;
        bundle = this.f6288b.f6282b;
        this.f6287a = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6287a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ String next() {
        return this.f6287a.next();
    }
}
