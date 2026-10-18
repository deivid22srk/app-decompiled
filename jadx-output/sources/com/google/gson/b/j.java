package com.google.gson.b;

import java.util.LinkedHashSet;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
final class j<T> implements t<T> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f7825a;

    j(f fVar) {
        this.f7825a = fVar;
    }

    @Override // com.google.gson.b.t
    public final T a() {
        return (T) new LinkedHashSet();
    }
}
