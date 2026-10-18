package com.google.android.gms.ads.internal.apkg;

import java.util.concurrent.Callable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
public final class k<T> implements Callable<T> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f5293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f5294b;

    k(j jVar, a aVar) {
        this.f5294b = jVar;
        this.f5293a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        return (T) this.f5293a.a(this.f5294b.c);
    }
}
