package com.google.android.libraries.bind.apkg;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class l implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f6652a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f6653b = new AtomicInteger(1);

    l(j jVar) {
        this.f6652a = jVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f6652a.d, new m(this, runnable), this.f6652a + " #" + this.f6653b.getAndIncrement());
        thread.setPriority(1);
        return thread;
    }
}
