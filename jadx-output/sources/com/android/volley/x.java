package com.android.volley;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f1259a = w.f1258b;

    /* renamed from: b, reason: collision with root package name */
    private final List<y> f1260b = new ArrayList();
    private boolean c = false;

    x() {
    }

    public final synchronized void a(String str, long j) {
        if (this.c) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f1260b.add(new y(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void a(String str) {
        this.c = true;
        long j = this.f1260b.size() == 0 ? 0L : this.f1260b.get(this.f1260b.size() - 1).c - this.f1260b.get(0).c;
        if (j > 0) {
            long j2 = this.f1260b.get(0).c;
            w.b("(%-4d ms) %s", Long.valueOf(j), str);
            long j3 = j2;
            for (y yVar : this.f1260b) {
                long j4 = yVar.c;
                w.b("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(yVar.f1262b), yVar.f1261a);
                j3 = j4;
            }
        }
    }

    protected final void finalize() {
        if (!this.c) {
            a("Request on the loose");
            w.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }
}
