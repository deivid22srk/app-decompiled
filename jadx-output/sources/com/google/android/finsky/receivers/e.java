package com.google.android.finsky.receivers;

import com.google.android.finsky.receivers.FlushLogsReceiver;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CountDownLatch f4474a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FlushLogsReceiver.FlushLogsService f4475b;

    e(FlushLogsReceiver.FlushLogsService flushLogsService, CountDownLatch countDownLatch) {
        this.f4475b = flushLogsService;
        this.f4474a = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4474a.countDown();
    }
}
