package com.google.android.volley.apkg;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.tsccm.BasicPoolEntry;
import org.apache.http.impl.conn.tsccm.PoolEntryRequest;
import org.apache.http.impl.conn.tsccm.WaitingThreadAborter;

/* loaded from: classes.dex */
public final class g implements PoolEntryRequest {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WaitingThreadAborter f7186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HttpRoute f7187b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ f d;

    g(f fVar, WaitingThreadAborter waitingThreadAborter, HttpRoute httpRoute, Object obj) {
        this.d = fVar;
        this.f7186a = waitingThreadAborter;
        this.f7187b = httpRoute;
        this.c = obj;
    }

    @Override // org.apache.http.impl.conn.tsccm.PoolEntryRequest
    public final void abortRequest() {
        Lock lock;
        Lock lock2;
        lock = this.d.poolLock;
        lock.lock();
        try {
            this.f7186a.abort();
        } finally {
            lock2 = this.d.poolLock;
            lock2.unlock();
        }
    }

    @Override // org.apache.http.impl.conn.tsccm.PoolEntryRequest
    public final BasicPoolEntry getPoolEntry(long j, TimeUnit timeUnit) {
        return this.d.getEntryBlocking(this.f7187b, this.c, j, timeUnit, this.f7186a);
    }
}
