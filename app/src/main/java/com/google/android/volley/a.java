package com.google.android.volley;

import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParamBean;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes.dex */
public final class a implements HttpClient {

    /* renamed from: a, reason: collision with root package name */
    public static long f7179a = 256;
    private static String[] c = {"text/", "application/xml", "application/json"};
    private static final HttpRequestInterceptor d = new b();

    /* renamed from: b, reason: collision with root package name */
    volatile f f7180b;
    private final HttpClient e;
    private RuntimeException f = new IllegalStateException("AndroidHttpClient created and never closed");

    public static a a(String str, Context context) {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, false);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 20000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 20000);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpClientParams.setRedirecting(basicHttpParams, false);
        SSLSessionCache sSLSessionCache = context == null ? null : new SSLSessionCache(context);
        HttpProtocolParams.setUserAgent(basicHttpParams, str);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", com.google.android.volley.apkg.a.a(), 80));
        schemeRegistry.register(new Scheme("https", a(sSLSessionCache), 443));
        ConnManagerParamBean connManagerParamBean = new ConnManagerParamBean(basicHttpParams);
        connManagerParamBean.setConnectionsPerRoute(new ConnPerRouteBean(4));
        connManagerParamBean.setMaxTotalConnections(8);
        return new a(new com.google.android.volley.apkg.c(basicHttpParams, schemeRegistry), basicHttpParams);
    }

    private static SSLSocketFactory a(SSLSessionCache sSLSessionCache) {
        try {
            return (SSLSocketFactory) SSLSocketFactory.class.getConstructor(javax.net.ssl.SSLSocketFactory.class).newInstance(SSLCertificateSocketFactory.getDefault(5000, sSLSessionCache));
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (NoSuchMethodException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        }
    }

    private a(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.e = new c(this, clientConnectionManager, httpParams);
    }

    protected final void finalize() {
        super.finalize();
        if (this.f != null) {
            Log.e("AndroidHttpClient", "Leak found", this.f);
            this.f = null;
        }
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpParams getParams() {
        return this.e.getParams();
    }

    @Override // org.apache.http.client.HttpClient
    public final ClientConnectionManager getConnectionManager() {
        return this.e.getConnectionManager();
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpUriRequest httpUriRequest) {
        return this.e.execute(httpUriRequest);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return this.e.execute(httpUriRequest, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        return this.e.execute(httpHost, httpRequest);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return this.e.execute(httpHost, httpRequest, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) this.e.execute(httpUriRequest, responseHandler);
    }

    @Override // org.apache.http.client.HttpClient
    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T) this.e.execute(httpUriRequest, responseHandler, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public final <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) this.e.execute(httpHost, httpRequest, responseHandler);
    }

    @Override // org.apache.http.client.HttpClient
    public final <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T) this.e.execute(httpHost, httpRequest, responseHandler, httpContext);
    }

    private static boolean b(HttpUriRequest httpUriRequest) {
        Header[] headers = httpUriRequest.getHeaders("content-encoding");
        if (headers != null) {
            for (Header header : headers) {
                if ("gzip".equalsIgnoreCase(header.getValue())) {
                    return true;
                }
            }
        }
        Header[] headers2 = httpUriRequest.getHeaders("content-type");
        if (headers2 == null) {
            return true;
        }
        for (Header header2 : headers2) {
            for (String str : c) {
                if (header2.getValue().startsWith(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.String a(org.apache.http.client.methods.HttpUriRequest r8) {
        /*
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "curl "
            r3.append(r0)
            java.lang.String r0 = "-X "
            r3.append(r0)
            java.lang.String r0 = r8.getMethod()
            r3.append(r0)
            java.lang.String r0 = " "
            r3.append(r0)
            org.apache.http.Header[] r1 = r8.getAllHeaders()
            int r4 = r1.length
            r0 = r2
        L22:
            if (r0 >= r4) goto L3e
            r5 = r1[r0]
            java.lang.String r6 = "--header \""
            r3.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.trim()
            r3.append(r5)
            java.lang.String r5 = "\" "
            r3.append(r5)
            int r0 = r0 + 1
            goto L22
        L3e:
            java.net.URI r1 = r8.getURI()
            boolean r0 = r8 instanceof org.apache.http.impl.client.RequestWrapper
            if (r0 == 0) goto Ld4
            r0 = r8
            org.apache.http.impl.client.RequestWrapper r0 = (org.apache.http.impl.client.RequestWrapper) r0
            org.apache.http.HttpRequest r0 = r0.getOriginal()
            boolean r4 = r0 instanceof org.apache.http.client.methods.HttpUriRequest
            if (r4 == 0) goto Ld4
            org.apache.http.client.methods.HttpUriRequest r0 = (org.apache.http.client.methods.HttpUriRequest) r0
            java.net.URI r0 = r0.getURI()
        L57:
            java.lang.String r1 = "\""
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = "\""
            r3.append(r0)
            boolean r0 = r8 instanceof org.apache.http.HttpEntityEnclosingRequest
            if (r0 == 0) goto Lb5
            r0 = r8
            org.apache.http.HttpEntityEnclosingRequest r0 = (org.apache.http.HttpEntityEnclosingRequest) r0
            org.apache.http.HttpEntity r0 = r0.getEntity()
            if (r0 == 0) goto Lb5
            boolean r1 = r0.isRepeatable()
            if (r1 == 0) goto Lb5
            long r4 = r0.getContentLength()
            r6 = 1024(0x400, double:5.06E-321)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto Lce
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r0.writeTo(r1)
            boolean r0 = b(r8)
            if (r0 == 0) goto Lba
            byte[] r0 = r1.toByteArray()
            r1 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "echo '"
            r1.<init>(r4)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "' | base64 -d > /tmp/$$.bin; "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.insert(r2, r0)
            java.lang.String r0 = " --data-binary @/tmp/$$.bin"
            r3.append(r0)
        Lb5:
            java.lang.String r0 = r3.toString()
            return r0
        Lba:
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = " --data-ascii \""
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "\""
            r0.append(r1)
            goto Lb5
        Lce:
            java.lang.String r0 = " [TOO MUCH DATA TO INCLUDE]"
            r3.append(r0)
            goto Lb5
        Ld4:
            r0 = r1
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.volley.a.a(org.apache.http.client.methods.HttpUriRequest):java.lang.String");
    }
}
