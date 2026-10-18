package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class ck extends Thread {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f5925b = nx.f6191b;

    /* renamed from: a, reason: collision with root package name */
    volatile boolean f5926a = false;
    private final BlockingQueue<jn<?>> c;
    public final BlockingQueue<jn<?>> d;
    private final bf e;
    private final kz f;

    public ck(BlockingQueue<jn<?>> blockingQueue, BlockingQueue<jn<?>> blockingQueue2, bf bfVar, kz kzVar) {
        this.c = blockingQueue;
        this.d = blockingQueue2;
        this.e = bfVar;
        this.f = kzVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f5925b) {
            nx.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.e.a();
        while (true) {
            try {
                jn<?> take = this.c.take();
                take.a("cache-queue-take");
                if (take.j) {
                    take.b("cache-discard-canceled");
                } else {
                    bg a2 = this.e.a(take.d);
                    if (a2 == null) {
                        take.a("cache-miss");
                        this.d.put(take);
                    } else {
                        if (a2.e < System.currentTimeMillis()) {
                            take.a("cache-hit-expired");
                            take.m = a2;
                            this.d.put(take);
                        } else {
                            take.a("cache-hit");
                            ju<?> a3 = take.a(new gy(a2.f5893a, a2.g));
                            take.a("cache-hit-parsed");
                            if (a2.f < System.currentTimeMillis()) {
                                take.a("cache-hit-refresh-needed");
                                take.m = a2;
                                a3.d = true;
                                this.f.a(take, a3, new cl(this, take));
                            } else {
                                this.f.a(take, a3);
                            }
                        }
                    }
                }
            } catch (InterruptedException e) {
                if (this.f5926a) {
                    return;
                }
            }
        }
    }
}
