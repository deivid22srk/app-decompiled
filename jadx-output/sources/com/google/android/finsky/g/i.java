package com.google.android.finsky.g;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CountDownLatch f2824a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f2825b;

    i(h hVar, CountDownLatch countDownLatch) {
        this.f2825b = hVar;
        this.f2824a = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2824a.countDown();
    }
}
