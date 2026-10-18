package com.android.volley;

import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f1232a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f1233b;

    d(c cVar, l lVar) {
        this.f1233b = cVar;
        this.f1232a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.f1233b.d;
            blockingQueue.put(this.f1232a);
        } catch (InterruptedException e) {
        }
    }
}
