package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class hj implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f6029a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f6030b = new AtomicInteger(1);

    hj(String str) {
        this.f6029a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.f6029a + ") #" + this.f6030b.getAndIncrement());
    }
}
