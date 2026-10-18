package com.google.gson.bpkg;

import java.lang.reflect.Type;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class g<T> implements t<T> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.u f7820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Type f7821b;
    public final /* synthetic */ f c;

    g(f fVar, com.google.gson.u uVar, Type type) {
        this.c = fVar;
        this.f7820a = uVar;
        this.f7821b = type;
    }

    @Override // com.google.gson.bpkg.t
    public final T a() {
        return (T) this.f7820a.a();
    }
}
