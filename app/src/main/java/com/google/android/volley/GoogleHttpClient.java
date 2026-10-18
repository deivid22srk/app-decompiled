package com.google.android.volley;

import android.content.ContentResolver;
import android.content.Context;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.EventLog;
import android.util.Log;
import com.google.android.common.http.UrlRules;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes.dex */
public final class GoogleHttpClient implements HttpClient {

    /* renamed from: a, reason: collision with root package name */
    final a f7177a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentResolver f7178b;
    private final g c;
    private final String d;
    private final ThreadLocal<Boolean> e;

    public class BlockedRequestException extends IOException {
        BlockedRequestException(com.google.android.common.http.c cVar) {
            super("Blocked by rule: " + cVar.f1430a);
        }
    }

    public GoogleHttpClient(Context context, String str) {
        this(context, str, (byte) 0);
    }

    private GoogleHttpClient(Context context, String str, byte b2) {
        this(context, str, (char) 0);
    }

    private GoogleHttpClient(Context context, String str, char c) {
        SocketFactory jVar;
        byte b2 = 0;
        this.e = new ThreadLocal<>();
        this.f7177a = a.a((str + " (" + Build.DEVICE + " " + Build.ID + ")") + "; gzip", context);
        this.c = new g(this, this.f7177a, b2);
        this.f7178b = context.getContentResolver();
        this.d = str;
        SchemeRegistry schemeRegistry = getConnectionManager().getSchemeRegistry();
        for (String str2 : schemeRegistry.getSchemeNames()) {
            Scheme unregister = schemeRegistry.unregister(str2);
            SocketFactory socketFactory = unregister.getSocketFactory();
            if (socketFactory instanceof LayeredSocketFactory) {
                jVar = new i(this, (LayeredSocketFactory) socketFactory, b2);
            } else {
                jVar = new j(this, socketFactory, b2);
            }
            schemeRegistry.register(new Scheme(str2, jVar, unregister.getDefaultPort()));
        }
    }

    private HttpResponse a(HttpUriRequest httpUriRequest) {
        HttpResponse a2;
        HttpResponse httpResponse;
        long elapsedRealtime;
        Boolean bool;
        HttpResponse a3;
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        try {
            this.e.set(null);
            if (com.google.android.a.d.a(this.f7178b, "http_stats", false)) {
                int myUid = Process.myUid();
                long uidTxBytes = TrafficStats.getUidTxBytes(myUid);
                long uidRxBytes = TrafficStats.getUidRxBytes(myUid);
                a3 = com.google.android.d.b.a(httpUriRequest, r2.f7194a.execute(com.google.android.d.b.a(httpUriRequest, r2.f7195b)), this.c.f7195b);
                HttpEntity entity = a3 == null ? null : a3.getEntity();
                if (entity != null) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    a3.setEntity(new com.google.android.common.http.a(entity, this.d, myUid, uidTxBytes, uidRxBytes, elapsedRealtime3 - elapsedRealtime2, elapsedRealtime3));
                }
                httpResponse = a3;
            } else {
                a2 = com.google.android.d.b.a(httpUriRequest, r2.f7194a.execute(com.google.android.d.b.a(httpUriRequest, r2.f7195b)), this.c.f7195b);
                httpResponse = a2;
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            try {
                EventLog.writeEvent(203002, Long.valueOf(elapsedRealtime - elapsedRealtime2), Integer.valueOf(statusCode), this.d, Integer.valueOf((bool != null || statusCode < 0) ? 0 : 1));
            } catch (Exception e) {
            }
            return httpResponse;
        } finally {
            try {
                long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                if (this.e.get() == null) {
                }
                EventLog.writeEvent(203002, Long.valueOf(elapsedRealtime4), -1, this.d, 0);
            } catch (Exception e2) {
                Log.e("GoogleHttpClient", "Error recording stats", e2);
            }
        }
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        String uri = httpUriRequest.getURI().toString();
        com.google.android.common.http.c a2 = UrlRules.a(this.f7178b).a(uri);
        String a3 = a2.a(uri);
        if (a3 == null) {
            Log.w("GoogleHttpClient", "Blocked by " + a2.f1430a + ": " + uri);
            throw new BlockedRequestException(a2);
        }
        if (a3 == uri) {
            return a(httpUriRequest);
        }
        try {
            URI uri2 = new URI(a3);
            RequestWrapper b2 = b(httpUriRequest);
            b2.setURI(uri2);
            if (Log.isLoggable("GoogleHttpClient", 3)) {
                Log.d("GoogleHttpClient", "Rule " + a2.f1430a + ": " + uri + " -> " + a3);
            }
            return a((HttpUriRequest) b2);
        } catch (URISyntaxException e) {
            throw new RuntimeException("Bad URL from rule: " + a2.f1430a, e);
        }
    }

    private static RequestWrapper b(HttpUriRequest httpUriRequest) {
        RequestWrapper requestWrapper;
        try {
            if (httpUriRequest instanceof HttpEntityEnclosingRequest) {
                requestWrapper = new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest) httpUriRequest);
            } else {
                requestWrapper = new RequestWrapper(httpUriRequest);
            }
            requestWrapper.resetHeaders();
            return requestWrapper;
        } catch (ProtocolException e) {
            throw new ClientProtocolException(e);
        }
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpParams getParams() {
        return this.f7177a.getParams();
    }

    @Override // org.apache.http.client.HttpClient
    public final ClientConnectionManager getConnectionManager() {
        return this.f7177a.getConnectionManager();
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpUriRequest httpUriRequest) {
        return execute(httpUriRequest, (HttpContext) null);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        g gVar = this.c;
        return com.google.android.d.b.a(a(httpRequest), gVar.f7194a.execute(httpHost, com.google.android.d.b.a(a(httpRequest), gVar.f7195b)), gVar.f7195b);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        g gVar = this.c;
        return com.google.android.d.b.a(a(httpRequest), gVar.f7194a.execute(httpHost, com.google.android.d.b.a(a(httpRequest), gVar.f7195b), httpContext), gVar.f7195b);
    }

    @Override // org.apache.http.client.HttpClient
    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) {
        g gVar = this.c;
        return (T) gVar.f7194a.execute(com.google.android.d.b.a(httpUriRequest, gVar.f7195b), new h(gVar.c, responseHandler, httpUriRequest, gVar.f7195b, (byte) 0));
    }

    @Override // org.apache.http.client.HttpClient
    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        g gVar = this.c;
        return (T) gVar.f7194a.execute(httpUriRequest, new h(gVar.c, responseHandler, httpUriRequest, gVar.f7195b, (byte) 0), httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public final <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        g gVar = this.c;
        RequestWrapper a2 = a(httpRequest);
        return (T) gVar.f7194a.execute(httpHost, com.google.android.d.b.a(a2, gVar.f7195b), new h(gVar.c, responseHandler, a2, gVar.f7195b, (byte) 0));
    }

    @Override // org.apache.http.client.HttpClient
    public final <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        g gVar = this.c;
        RequestWrapper a2 = a(httpRequest);
        return (T) gVar.f7194a.execute(httpHost, com.google.android.d.b.a(a2, gVar.f7195b), new h(gVar.c, responseHandler, a2, gVar.f7195b, (byte) 0), httpContext);
    }

    private static RequestWrapper a(HttpRequest httpRequest) {
        RequestWrapper requestWrapper;
        try {
            if (httpRequest instanceof HttpEntityEnclosingRequest) {
                requestWrapper = new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest) httpRequest);
            } else {
                requestWrapper = new RequestWrapper(httpRequest);
            }
            requestWrapper.resetHeaders();
            return requestWrapper;
        } catch (ProtocolException e) {
            throw new ClientProtocolException(e);
        }
    }
}
