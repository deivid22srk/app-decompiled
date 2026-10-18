package com.google.gson;

/* loaded from: classes2.dex */
final class s<T> extends aj<T> {

    /* renamed from: a, reason: collision with root package name */
    aj<T> f7858a;

    s() {
    }

    @Override // com.google.gson.aj
    public final T a(com.google.gson.stream.a aVar) {
        if (this.f7858a == null) {
            throw new IllegalStateException();
        }
        return this.f7858a.a(aVar);
    }

    @Override // com.google.gson.aj
    public final void a(com.google.gson.stream.f fVar, T t) {
        if (this.f7858a == null) {
            throw new IllegalStateException();
        }
        this.f7858a.a(fVar, t);
    }
}
