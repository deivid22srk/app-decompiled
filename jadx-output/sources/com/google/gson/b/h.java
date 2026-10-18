package com.google.gson.b;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
final class h<T> implements t<T> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Constructor f7822a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f7823b;

    h(f fVar, Constructor constructor) {
        this.f7823b = fVar;
        this.f7822a = constructor;
    }

    @Override // com.google.gson.b.t
    public final T a() {
        try {
            return (T) this.f7822a.newInstance(null);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke " + this.f7822a + " with no args", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to invoke " + this.f7822a + " with no args", e3.getTargetException());
        }
    }
}
