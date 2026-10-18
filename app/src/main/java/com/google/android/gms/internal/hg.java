package com.google.android.gms.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class hg implements Callable<Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f6024a;

    hg(Runnable runnable) {
        this.f6024a = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Void call() {
        this.f6024a.run();
        return null;
    }
}
