package com.google.android.gms.internal;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class kt<R extends com.google.android.gms.common.api.x> extends com.google.android.gms.common.api.u<R> {

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.gms.common.api.y<? super R> f6116b;
    private boolean c;
    private boolean d;
    private com.google.android.gms.common.internal.ag e;
    protected final ku<R> g;
    volatile R i;
    volatile boolean j;
    private Integer k;
    private volatile mo<R> l;
    final Object f = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f6115a = new CountDownLatch(1);
    final ArrayList<com.google.android.gms.common.api.v> h = new ArrayList<>();

    @Deprecated
    protected kt(Looper looper) {
        this.g = new ku<>(looper);
    }

    public static void b(com.google.android.gms.common.api.x xVar) {
        if (xVar instanceof com.google.android.gms.common.api.w) {
            try {
                ((com.google.android.gms.common.api.w) xVar).a();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release " + xVar, e);
            }
        }
    }

    private boolean h() {
        boolean z;
        synchronized (this.f) {
            z = this.c;
        }
        return z;
    }

    private R i() {
        R r;
        synchronized (this.f) {
            com.google.android.gms.common.internal.av.a(this.j ? false : true, "Result has already been consumed.");
            com.google.android.gms.common.internal.av.a(f(), "Result is not ready.");
            r = this.i;
            this.i = null;
            this.f6116b = null;
            this.j = true;
        }
        e();
        return r;
    }

    @Override // com.google.android.gms.common.api.u
    public final R a() {
        com.google.android.gms.common.internal.av.a(Looper.myLooper() != Looper.getMainLooper(), "await must not be called on the UI thread");
        com.google.android.gms.common.internal.av.a(!this.j, "Result has already been consumed");
        com.google.android.gms.common.internal.av.a(this.l == null, "Cannot await if then() has been called.");
        try {
            this.f6115a.await();
        } catch (InterruptedException e) {
            c(Status.f5573b);
        }
        com.google.android.gms.common.internal.av.a(f(), "Result is not ready.");
        return i();
    }

    @Override // com.google.android.gms.common.api.u
    public final R a(long j, TimeUnit timeUnit) {
        com.google.android.gms.common.internal.av.a(j <= 0 || Looper.myLooper() != Looper.getMainLooper(), "await must not be called on the UI thread when time is greater than zero.");
        com.google.android.gms.common.internal.av.a(!this.j, "Result has already been consumed.");
        com.google.android.gms.common.internal.av.a(this.l == null, "Cannot await if then() has been called.");
        try {
            if (!this.f6115a.await(j, timeUnit)) {
                c(Status.d);
            }
        } catch (InterruptedException e) {
            c(Status.f5573b);
        }
        com.google.android.gms.common.internal.av.a(f(), "Result is not ready.");
        return i();
    }

    public abstract R a(Status status);

    @Override // com.google.android.gms.common.api.u
    public final void a(com.google.android.gms.common.api.v vVar) {
        com.google.android.gms.common.internal.av.a(!this.j, "Result has already been consumed.");
        com.google.android.gms.common.internal.av.b(true, "Callback cannot be null.");
        synchronized (this.f) {
            if (f()) {
                this.i.b();
                vVar.a();
            } else {
                this.h.add(vVar);
            }
        }
    }

    public final void a(R r) {
        synchronized (this.f) {
            if (this.d || this.c) {
                b(r);
                return;
            }
            com.google.android.gms.common.internal.av.a(!f(), "Results have already been set");
            com.google.android.gms.common.internal.av.a(this.j ? false : true, "Result has already been consumed");
            c((kt<R>) r);
        }
    }

    @Override // com.google.android.gms.common.api.u
    public final void a(com.google.android.gms.common.api.y<? super R> yVar) {
        com.google.android.gms.common.internal.av.a(!this.j, "Result has already been consumed.");
        synchronized (this.f) {
            com.google.android.gms.common.internal.av.a(this.l == null, "Cannot set callbacks if then() has been called.");
            if (h()) {
                return;
            }
            if (f()) {
                this.g.a(yVar, i());
            } else {
                this.f6116b = yVar;
            }
        }
    }

    @Override // com.google.android.gms.common.api.u
    public final Integer b() {
        return this.k;
    }

    public final void c(Status status) {
        synchronized (this.f) {
            if (!f()) {
                a((kt<R>) a(status));
                this.d = true;
            }
        }
    }

    protected void e() {
    }

    public final boolean f() {
        return this.f6115a.getCount() == 0;
    }

    public final void g() {
        synchronized (this.f) {
            if (this.c || this.j) {
                return;
            }
            if (this.e != null) {
                try {
                    this.e.a();
                } catch (RemoteException e) {
                }
            }
            b(this.i);
            this.f6116b = null;
            this.c = true;
            c((kt<R>) a(Status.e));
        }
    }

    private void c(R r) {
        this.i = r;
        this.e = null;
        this.f6115a.countDown();
        this.i.b();
        if (this.f6116b != null) {
            this.g.removeMessages(2);
            if (!this.c) {
                this.g.a(this.f6116b, i());
            }
        }
        Iterator<com.google.android.gms.common.api.v> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.h.clear();
    }
}
