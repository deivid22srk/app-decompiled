package com.google.android.finsky.gpkg;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f2824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f2825b;

    i(h hVar, CountDownLatch countDownLatch) {
        this.f2825b = hVar;
        this.f2824a = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2824a.countDown();
    }
}
