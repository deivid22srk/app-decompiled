package com.google.android.gms.common.data;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class a<T> implements b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final DataHolder f5619a;

    @Override // com.google.android.gms.common.api.w
    public final void a() {
        if (this.f5619a != null) {
            this.f5619a.c();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new h(this);
    }

    public a(DataHolder dataHolder) {
        this.f5619a = dataHolder;
        if (this.f5619a != null) {
            this.f5619a.j = this;
        }
    }

    @Override // com.google.android.gms.common.data.b
    public int c() {
        if (this.f5619a == null) {
            return 0;
        }
        return this.f5619a.h;
    }
}
