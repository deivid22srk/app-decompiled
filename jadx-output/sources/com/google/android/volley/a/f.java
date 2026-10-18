package com.google.android.volley.a;

import com.android.volley.w;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.tsccm.BasicPoolEntry;
import org.apache.http.impl.conn.tsccm.ConnPoolByRoute;
import org.apache.http.impl.conn.tsccm.PoolEntryRequest;
import org.apache.http.impl.conn.tsccm.RouteSpecificPool;
import org.apache.http.impl.conn.tsccm.WaitingThread;
import org.apache.http.impl.conn.tsccm.WaitingThreadAborter;
import org.apache.http.params.HttpParams;

/* loaded from: classes.dex */
public final class f extends ConnPoolByRoute {
    public f(ClientConnectionOperator clientConnectionOperator, HttpParams httpParams) {
        super(clientConnectionOperator, httpParams);
    }

    @Override // org.apache.http.impl.conn.tsccm.ConnPoolByRoute, org.apache.http.impl.conn.tsccm.AbstractConnPool
    public final PoolEntryRequest requestPoolEntry(HttpRoute httpRoute, Object obj) {
        return new g(this, new WaitingThreadAborter(), httpRoute, obj);
    }

    @Override // org.apache.http.impl.conn.tsccm.ConnPoolByRoute
    protected final BasicPoolEntry getEntryBlocking(HttpRoute httpRoute, Object obj, long j, TimeUnit timeUnit, WaitingThreadAborter waitingThreadAborter) {
        WaitingThread waitingThread;
        Date date = null;
        if (j > 0) {
            date = new Date(System.currentTimeMillis() + timeUnit.toMillis(j));
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.poolLock.lock();
        try {
            RouteSpecificPool routePool = getRoutePool(httpRoute, true);
            WaitingThread waitingThread2 = null;
            BasicPoolEntry basicPoolEntry = null;
            while (basicPoolEntry == null) {
                if (this.isShutDown) {
                    throw new IllegalStateException("Connection pool shut down.");
                }
                basicPoolEntry = getFreeEntry(routePool, obj);
                if (basicPoolEntry != null) {
                    break;
                }
                w.a("Constructed new connection to route=[%s]", httpRoute);
                boolean z = routePool.getCapacity() > 0;
                if (z && this.numConnections < this.maxTotalConnections) {
                    basicPoolEntry = createEntry(routePool, this.operator);
                } else if (z && !this.freeConnections.isEmpty()) {
                    deleteLeastUsedEntry();
                    basicPoolEntry = createEntry(routePool, this.operator);
                } else {
                    if (waitingThread2 == null) {
                        waitingThread = newWaitingThread(this.poolLock.newCondition(), routePool);
                        waitingThreadAborter.setWaitingThread(waitingThread);
                    } else {
                        waitingThread = waitingThread2;
                    }
                    try {
                        routePool.queueThread(waitingThread);
                        this.waitingThreads.add(waitingThread);
                        if (!waitingThread.await(date) && date != null && date.getTime() <= System.currentTimeMillis()) {
                            throw new ConnectionPoolTimeoutException("Timeout waiting for connection");
                        }
                        waitingThread2 = waitingThread;
                    } finally {
                        routePool.removeThread(waitingThread);
                        this.waitingThreads.remove(waitingThread);
                    }
                }
            }
            BasicPoolEntry basicPoolEntry2 = basicPoolEntry;
            this.poolLock.unlock();
            long currentTimeMillis2 = System.currentTimeMillis();
            if (currentTimeMillis2 - currentTimeMillis > 10) {
                w.a("GetEntryBlocking() took %s ms", Long.valueOf(currentTimeMillis2 - currentTimeMillis));
            }
            return basicPoolEntry2;
        } catch (Throwable th) {
            this.poolLock.unlock();
            long currentTimeMillis3 = System.currentTimeMillis();
            if (currentTimeMillis3 - currentTimeMillis > 10) {
                w.a("GetEntryBlocking() took %s ms", Long.valueOf(currentTimeMillis3 - currentTimeMillis));
            }
            throw th;
        }
    }
}
