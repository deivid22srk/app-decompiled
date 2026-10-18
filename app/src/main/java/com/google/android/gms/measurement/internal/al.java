package com.google.android.gms.measurement.internal;

import android.content.Context;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class al extends ba {

    /* renamed from: a, reason: collision with root package name */
    ao f6307a;

    /* renamed from: b, reason: collision with root package name */
    ao f6308b;
    final Object c;
    final Semaphore d;
    volatile boolean e;
    private final BlockingQueue<FutureTask<?>> f;
    private final BlockingQueue<FutureTask<?>> g;
    private final Thread.UncaughtExceptionHandler j;
    private final Thread.UncaughtExceptionHandler k;

    al(ap apVar) {
        super(apVar);
        this.c = new Object();
        this.d = new Semaphore(2);
        this.f = new LinkedBlockingQueue();
        this.g = new LinkedBlockingQueue();
        this.j = new an(this, "Thread death: Uncaught exception on worker thread");
        this.k = new an(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // com.google.android.gms.measurement.internal.ba
    protected final void a() {
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final void d() {
        if (Thread.currentThread() != this.f6308b) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final void e() {
        if (Thread.currentThread() != this.f6307a) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ x f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ bg g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.cpkg.a h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ Context i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ g j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ al k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ z l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ ai m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ i n() {
        return super.n();
    }

    public final void a(Runnable runnable) {
        u();
        com.google.android.gms.common.internal.av.a(runnable);
        am amVar = new am(this, runnable, "Task exception on worker thread");
        synchronized (this.c) {
            this.f.add(amVar);
            if (this.f6307a == null) {
                this.f6307a = new ao(this, "Measurement Worker", this.f);
                this.f6307a.setUncaughtExceptionHandler(this.j);
                this.f6307a.start();
            } else {
                this.f6307a.a();
            }
        }
    }

    public final void b(Runnable runnable) {
        u();
        com.google.android.gms.common.internal.av.a(runnable);
        am amVar = new am(this, runnable, "Task exception on network thread");
        synchronized (this.c) {
            this.g.add(amVar);
            if (this.f6308b == null) {
                this.f6308b = new ao(this, "Measurement Network", this.g);
                this.f6308b.setUncaughtExceptionHandler(this.k);
                this.f6308b.start();
            } else {
                this.f6308b.a();
            }
        }
    }
}
