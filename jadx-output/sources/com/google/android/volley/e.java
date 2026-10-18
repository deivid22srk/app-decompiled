package com.google.android.volley;

import android.util.Log;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes.dex */
final class e implements HttpRequestInterceptor {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f7191a;

    private e(a aVar) {
        this.f7191a = aVar;
    }

    /* synthetic */ e(a aVar, byte b2) {
        this(aVar);
    }

    @Override // org.apache.http.HttpRequestInterceptor
    public final void process(HttpRequest httpRequest, HttpContext httpContext) {
        f fVar;
        fVar = this.f7191a.f7180b;
        if (fVar != null && Log.isLoggable(fVar.f7192a, fVar.f7193b) && (httpRequest instanceof HttpUriRequest)) {
            Log.println(fVar.f7193b, fVar.f7192a, a.a((HttpUriRequest) httpRequest));
        }
    }
}
