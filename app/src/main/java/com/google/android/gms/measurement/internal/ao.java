package com.google.android.gms.measurement.internal;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
final class ao extends Thread {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ al f6313a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f6314b;
    private final BlockingQueue<FutureTask<?>> c;

    public ao(al alVar, String str, BlockingQueue<FutureTask<?>> blockingQueue) {
        this.f6313a = alVar;
        com.google.android.gms.common.internal.av.a(str);
        this.f6314b = new Object();
        this.c = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.f6314b) {
            this.f6314b.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            FutureTask<?> poll = this.c.poll();
            if (poll == null) {
                synchronized (this.f6314b) {
                    if (this.c.peek() == null && !this.f6313a.e) {
                        try {
                            this.f6314b.wait(30000L);
                        } catch (InterruptedException e) {
                            this.f6313a.l().f6389b.a(getName() + " was interrupted", e);
                        }
                    }
                }
                synchronized (this.f6313a.c) {
                    if (this.c.peek() == null) {
                        break;
                    }
                }
            } else {
                poll.run();
            }
        }
        this.f6313a.d.release();
        this.f6313a.c.notifyAll();
        if (this == this.f6313a.f6307a) {
            this.f6313a.f6307a = null;
        } else if (this == this.f6313a.f6308b) {
            this.f6313a.f6308b = null;
        } else {
            this.f6313a.l().f6388a.a("Current scheduler thread is neither worker nor network");
        }
    }
}
