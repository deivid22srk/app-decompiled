package com.google.android.volley.a;

import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.tsccm.PoolEntryRequest;

/* loaded from: classes.dex */
final class d implements ClientConnectionRequest {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PoolEntryRequest f7183a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ HttpRoute f7184b;
    final /* synthetic */ c c;

    d(c cVar, PoolEntryRequest poolEntryRequest, HttpRoute httpRoute) {
        this.c = cVar;
        this.f7183a = poolEntryRequest;
        this.f7184b = httpRoute;
    }

    @Override // org.apache.http.conn.ClientConnectionRequest
    public final void abortRequest() {
        this.f7183a.abortRequest();
    }

    @Override // org.apache.http.conn.ClientConnectionRequest
    public final ManagedClientConnection getConnection(long j, TimeUnit timeUnit) {
        if (this.f7184b == null) {
            throw new IllegalArgumentException("Route may not be null.");
        }
        return new e(this.c, this.f7183a.getPoolEntry(j, timeUnit));
    }
}
