package com.google.android.gms.internal;

import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class gg extends Thread {

    /* renamed from: a, reason: collision with root package name */
    volatile boolean f6000a = false;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue<jn<?>> f6001b;
    private final fc c;
    private final bf d;
    private final kz e;

    public gg(BlockingQueue<jn<?>> blockingQueue, fc fcVar, bf bfVar, kz kzVar) {
        this.f6001b = blockingQueue;
        this.c = fcVar;
        this.d = bfVar;
        this.e = kzVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                jn<?> take = this.f6001b.take();
                try {
                    take.a("network-queue-take");
                    if (take.j) {
                        take.b("network-discard-cancelled");
                    } else {
                        if (Build.VERSION.SDK_INT >= 14) {
                            TrafficStats.setThreadStatsTag(take.e);
                        }
                        gy a2 = this.c.a(take);
                        take.a("network-http-complete");
                        if (a2.d && take.k) {
                            take.b("not-modified");
                        } else {
                            ju<?> a3 = take.a(a2);
                            take.a("network-parse-complete");
                            if (take.i && a3.f6100b != null) {
                                this.d.a(take.d, a3.f6100b);
                                take.a("network-cache-written");
                            }
                            take.k = true;
                            this.e.a(take, a3);
                        }
                    }
                } catch (zzr e) {
                    e.f6268b = SystemClock.elapsedRealtime() - elapsedRealtime;
                    this.e.a(take, jn.a(e));
                } catch (Exception e2) {
                    nx.a(e2, "Unhandled exception %s", e2.toString());
                    zzr zzrVar = new zzr(e2);
                    zzrVar.f6268b = SystemClock.elapsedRealtime() - elapsedRealtime;
                    this.e.a(take, zzrVar);
                }
            } catch (InterruptedException e3) {
                if (this.f6000a) {
                    return;
                }
            }
        }
    }
}
