package com.google.android.volley;

import java.io.IOException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes.dex */
final class d implements HttpRequestRetryHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f7190a;

    d(c cVar) {
        this.f7190a = cVar;
    }

    @Override // org.apache.http.client.HttpRequestRetryHandler
    public final boolean retryRequest(IOException iOException, int i, HttpContext httpContext) {
        return false;
    }
}
