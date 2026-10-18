package com.google.android.finsky.utils;

import java.util.AbstractList;

/* loaded from: classes.dex */
final class q<T> extends AbstractList<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T[] f5056a;

    public q(T[] tArr) {
        this.f5056a = tArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return this.f5056a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5056a.length;
    }
}
