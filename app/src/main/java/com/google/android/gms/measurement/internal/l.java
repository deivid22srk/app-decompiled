package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* loaded from: classes.dex */
abstract class l {
    private static volatile Handler c;

    /* renamed from: a, reason: collision with root package name */
    volatile long f6372a;

    /* renamed from: b, reason: collision with root package name */
    public final ap f6373b;
    private final Runnable d;
    public boolean e;

    l(ap apVar) {
        com.google.android.gms.common.internal.av.a(apVar);
        this.f6373b = apVar;
        this.e = true;
        this.d = new m(this);
    }

    static /* synthetic */ long b(l lVar) {
        lVar.f6372a = 0L;
        return 0L;
    }

    public abstract void a();

    public final void b() {
        this.f6372a = 0L;
        c().removeCallbacks(this.d);
    }

    public final void a(long j) {
        b();
        if (j >= 0) {
            this.f6372a = this.f6373b.d.a();
            if (c().postDelayed(this.d, j)) {
                return;
            }
            this.f6373b.e().f6388a.a("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    private Handler c() {
        Handler handler;
        if (c != null) {
            return c;
        }
        synchronized (l.class) {
            if (c == null) {
                c = new Handler(this.f6373b.f6315a.getMainLooper());
            }
            handler = c;
        }
        return handler;
    }
}
