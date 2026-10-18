package com.google.gson.b;

import java.util.TreeSet;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
final class i<T> implements t<T> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f7824a;

    i(f fVar) {
        this.f7824a = fVar;
    }

    @Override // com.google.gson.b.t
    public final T a() {
        return (T) new TreeSet();
    }
}
