package com.google.android.gms.internal;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class ny {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f6192a = nx.f6191b;

    /* renamed from: b, reason: collision with root package name */
    private final List<nz> f6193b = new ArrayList();
    private boolean c = false;

    ny() {
    }

    public final synchronized void a(String str, long j) {
        if (this.c) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f6193b.add(new nz(str, j, SystemClock.elapsedRealtime()));
    }

    protected final void finalize() {
        if (this.c) {
            return;
        }
        a("Request on the loose");
        nx.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void a(String str) {
        this.c = true;
        long j = this.f6193b.size() == 0 ? 0L : this.f6193b.get(this.f6193b.size() - 1).c - this.f6193b.get(0).c;
        if (j > 0) {
            long j2 = this.f6193b.get(0).c;
            nx.b("(%-4d ms) %s", Long.valueOf(j), str);
            long j3 = j2;
            for (nz nzVar : this.f6193b) {
                long j4 = nzVar.c;
                nx.b("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(nzVar.f6195b), nzVar.f6194a);
                j3 = j4;
            }
        }
    }
}
