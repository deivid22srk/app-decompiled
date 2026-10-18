package com.google.android.gms.internal;

import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* loaded from: classes.dex */
public final class px implements qi {

    /* renamed from: a, reason: collision with root package name */
    protected final HttpClient f6239a;

    public px(HttpClient httpClient) {
        this.f6239a = httpClient;
    }

    private static void a(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, map.get(str));
        }
    }

    @Override // com.google.android.gms.internal.qi
    public final HttpResponse a(jn<?> jnVar, Map<String, String> map) {
        HttpRequestBase httpRequestBase;
        switch (jnVar.c) {
            case -1:
                httpRequestBase = new HttpGet(jnVar.d);
                break;
            case 0:
                httpRequestBase = new HttpGet(jnVar.d);
                break;
            case 1:
                HttpPost httpPost = new HttpPost(jnVar.d);
                httpPost.addHeader("Content-Type", jn.b());
                httpRequestBase = httpPost;
                break;
            case 2:
                HttpPut httpPut = new HttpPut(jnVar.d);
                httpPut.addHeader("Content-Type", jn.b());
                httpRequestBase = httpPut;
                break;
            case 3:
                httpRequestBase = new HttpDelete(jnVar.d);
                break;
            case 4:
                httpRequestBase = new HttpHead(jnVar.d);
                break;
            case 5:
                httpRequestBase = new HttpOptions(jnVar.d);
                break;
            case 6:
                httpRequestBase = new HttpTrace(jnVar.d);
                break;
            case 7:
                py pyVar = new py(jnVar.d);
                pyVar.addHeader("Content-Type", jn.b());
                httpRequestBase = pyVar;
                break;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
        a(httpRequestBase, map);
        a(httpRequestBase, jnVar.a());
        HttpParams params = httpRequestBase.getParams();
        int c = jnVar.c();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, c);
        return this.f6239a.execute(httpRequestBase);
    }
}
