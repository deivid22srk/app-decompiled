package com.google.android.gms.internal;

import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
final class cl implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ jn f5927a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ck f5928b;

    cl(ck ckVar, jn jnVar) {
        this.f5928b = ckVar;
        this.f5927a = jnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.f5928b.d;
            blockingQueue.put(this.f5927a);
        } catch (InterruptedException e) {
        }
    }
}
