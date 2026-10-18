package com.android.volley;

import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class j extends Thread {

    /* renamed from: a, reason: collision with root package name */
    volatile boolean f1241a = false;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue<l<?>> f1242b;
    private final i c;
    private final a d;
    private final u e;

    public j(BlockingQueue<l<?>> blockingQueue, i iVar, a aVar, u uVar) {
        this.f1242b = blockingQueue;
        this.c = iVar;
        this.d = aVar;
        this.e = uVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                l<?> take = this.f1242b.take();
                try {
                    take.a("network-queue-take");
                    if (take.e()) {
                        take.b("network-discard-cancelled");
                    } else {
                        if (Build.VERSION.SDK_INT >= 14) {
                            TrafficStats.setThreadStatsTag(take.f1246b);
                        }
                        k a2 = this.c.a(take);
                        take.a("network-http-complete");
                        if (a2.d && take.f) {
                            take.b("not-modified");
                        } else {
                            r<?> a3 = take.a(a2);
                            take.a("network-parse-complete");
                            if (take.e && a3.f1256b != null) {
                                this.d.a(take.c(), a3.f1256b);
                                take.a("network-cache-written");
                            }
                            take.f = true;
                            this.e.a(take, a3);
                        }
                    }
                } catch (VolleyError e) {
                    e.c = SystemClock.elapsedRealtime() - elapsedRealtime;
                    this.e.a(take, take.a(e));
                } catch (Exception e2) {
                    w.a(e2, "Unhandled exception %s", e2.toString());
                    VolleyError volleyError = new VolleyError(e2);
                    volleyError.c = SystemClock.elapsedRealtime() - elapsedRealtime;
                    this.e.a(take, volleyError);
                }
            } catch (InterruptedException e3) {
                if (this.f1241a) {
                    return;
                }
            }
        }
    }
}
