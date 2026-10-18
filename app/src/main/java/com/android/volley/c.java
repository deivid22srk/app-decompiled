package com.android.volley;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class c extends Thread {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f1230b = w.f1258b;

    /* renamed from: a, reason: collision with root package name */
    volatile boolean f1231a = false;
    private final BlockingQueue<l<?>> c;
    private final BlockingQueue<l<?>> d;
    private final a e;
    private final u f;

    public c(BlockingQueue<l<?>> blockingQueue, BlockingQueue<l<?>> blockingQueue2, a aVar, u uVar) {
        this.c = blockingQueue;
        this.d = blockingQueue2;
        this.e = aVar;
        this.f = uVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f1230b) {
            w.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.e.a();
        while (true) {
            try {
                l<?> take = this.c.take();
                take.a("cache-queue-take");
                if (take.e()) {
                    take.b("cache-discard-canceled");
                } else {
                    b a2 = this.e.a(take.c());
                    if (a2 == null) {
                        take.a("cache-miss");
                        this.d.put(take);
                    } else if (a2.a()) {
                        take.a("cache-hit-expired");
                        take.h = a2;
                        this.d.put(take);
                    } else {
                        take.a("cache-hit");
                        r<?> a3 = take.a(new k(a2.f1228a, a2.g));
                        take.a("cache-hit-parsed");
                        if (!(a2.f < System.currentTimeMillis())) {
                            this.f.a(take, a3);
                        } else {
                            take.a("cache-hit-refresh-needed");
                            take.h = a2;
                            a3.d = true;
                            this.f.a(take, a3, new d(this, take));
                        }
                    }
                }
            } catch (InterruptedException e) {
                if (this.f1231a) {
                    return;
                }
            }
        }
    }
}
