package com.google.android.gms.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class hf implements Callable<Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f6023a;

    hf(Runnable runnable) {
        this.f6023a = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Void call() {
        this.f6023a.run();
        return null;
    }
}
