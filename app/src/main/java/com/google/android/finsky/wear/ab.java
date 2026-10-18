package com.google.android.finsky.wear;

import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class ab implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Semaphore f5069a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f5070b;

    ab(z zVar, Semaphore semaphore) {
        this.f5070b = zVar;
        this.f5069a = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5069a.release();
    }
}
