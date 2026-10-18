package com.google.android.libraries.bind.apkg;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n extends ThreadPoolExecutor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f6656a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f6657b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(j jVar, int i, int i2, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, 10L, timeUnit, (BlockingQueue<Runnable>) blockingQueue, threadFactory);
        this.f6657b = jVar;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        if (this.f6656a) {
            f fVar = f.f6644b;
            if (!f.f6643a && !a.b()) {
                fVar.c.lock();
                while (fVar.e) {
                    try {
                        fVar.d.awaitUninterruptibly();
                    } finally {
                        fVar.c.unlock();
                    }
                }
            }
        }
    }
}
