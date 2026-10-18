package com.google.gson.bpkg;

import java.lang.reflect.Type;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class n<T> implements t<T> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f7829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Type f7830b;
    public final /* synthetic */ f c;
    public final w d = w.a();

    n(f fVar, Class cls, Type type) {
        this.c = fVar;
        this.f7829a = cls;
        this.f7830b = type;
    }

    @Override // com.google.gson.bpkg.t
    public final T a() {
        try {
            return (T) this.d.a(this.f7829a);
        } catch (Exception e) {
            throw new RuntimeException("Unable to invoke no-args constructor for " + this.f7830b + ". Register an InstanceCreator with Gson for this type may fix this problem.", e);
        }
    }
}
