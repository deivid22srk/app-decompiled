package com.google.android.volley.apkg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.tsccm.AbstractConnPool;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpParams;

/* loaded from: classes.dex */
public final class c extends ThreadSafeClientConnManager {
    public c(HttpParams httpParams, SchemeRegistry schemeRegistry) {
        super(httpParams, schemeRegistry);
    }

    @Override // org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager
    public final AbstractConnPool createConnectionPool(HttpParams httpParams) {
        f fVar = new f(this.connOperator, httpParams);
        fVar.enableConnectionGC();
        return fVar;
    }

    @Override // org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager, org.apache.http.conn.ClientConnectionManager
    public final ClientConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
        return new d(this, this.connectionPool.requestPoolEntry(httpRoute, obj), httpRoute);
    }

    @Override // org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager, org.apache.http.conn.ClientConnectionManager
    public final void releaseConnection(ManagedClientConnection managedClientConnection, long j, TimeUnit timeUnit) {
        if ((managedClientConnection instanceof e) && managedClientConnection.getRoute() != null) {
            if (System.currentTimeMillis() - ((e) managedClientConnection).f7185a > (managedClientConnection.getRoute().isSecure() ? 5000L : 2500L)) {
                try {
                    managedClientConnection.close();
                } catch (IOException e) {
                }
            }
        }
        super.releaseConnection(managedClientConnection, j, timeUnit);
    }
}
