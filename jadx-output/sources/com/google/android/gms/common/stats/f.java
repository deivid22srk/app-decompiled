package com.google.android.gms.common.stats;

import android.os.SystemClock;
import android.support.v4.h.r;
import android.util.Log;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final long f5783a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5784b;
    private final r<String, Long> c;

    public f() {
        this.f5783a = 60000L;
        this.f5784b = 10;
        this.c = new r<>(10);
    }

    public f(long j) {
        this.f5783a = j;
        this.f5784b = 1024;
        this.c = new r<>();
    }

    public final boolean b(String str) {
        boolean z;
        synchronized (this) {
            z = this.c.remove(str) != null;
        }
        return z;
    }

    public final Long a(String str) {
        Long put;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f5783a;
        synchronized (this) {
            long j2 = j;
            while (this.c.size() >= this.f5784b) {
                for (int size = this.c.size() - 1; size >= 0; size--) {
                    if (elapsedRealtime - this.c.c(size).longValue() > j2) {
                        this.c.d(size);
                    }
                }
                long j3 = j2 / 2;
                Log.w("ConnectionTracker", "The max capacity " + this.f5784b + " is not enough. Current durationThreshold is: " + j3);
                j2 = j3;
            }
            put = this.c.put(str, Long.valueOf(elapsedRealtime));
        }
        return put;
    }
}
