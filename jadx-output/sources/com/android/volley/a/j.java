package com.android.volley.a;

import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* loaded from: classes.dex */
public class j implements m {

    /* renamed from: a, reason: collision with root package name */
    protected final HttpClient f1214a;

    public j(HttpClient httpClient) {
        this.f1214a = httpClient;
    }

    private static void a(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, map.get(str));
        }
    }

    private static void a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, com.android.volley.l<?> lVar) {
        byte[] k = lVar.k();
        if (k != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(k));
        }
    }

    @Override // com.android.volley.a.m
    public final HttpResponse a(com.android.volley.l<?> lVar, Map<String, String> map) {
        HttpRequestBase httpRequestBase;
        switch (lVar.f1245a) {
            case -1:
                byte[] h = lVar.h();
                if (h != null) {
                    HttpPost httpPost = new HttpPost(lVar.b());
                    httpPost.addHeader("Content-Type", lVar.g());
                    httpPost.setEntity(new ByteArrayEntity(h));
                    httpRequestBase = httpPost;
                    break;
                } else {
                    httpRequestBase = new HttpGet(lVar.b());
                    break;
                }
            case 0:
                httpRequestBase = new HttpGet(lVar.b());
                break;
            case 1:
                HttpPost httpPost2 = new HttpPost(lVar.b());
                httpPost2.addHeader("Content-Type", lVar.j());
                a(httpPost2, lVar);
                httpRequestBase = httpPost2;
                break;
            case 2:
                HttpPut httpPut = new HttpPut(lVar.b());
                httpPut.addHeader("Content-Type", lVar.j());
                a(httpPut, lVar);
                httpRequestBase = httpPut;
                break;
            case 3:
                httpRequestBase = new HttpDelete(lVar.b());
                break;
            case 4:
                httpRequestBase = new HttpHead(lVar.b());
                break;
            case 5:
                httpRequestBase = new HttpOptions(lVar.b());
                break;
            case 6:
                httpRequestBase = new HttpTrace(lVar.b());
                break;
            case 7:
                k kVar = new k(lVar.b());
                kVar.addHeader("Content-Type", lVar.j());
                a(kVar, lVar);
                httpRequestBase = kVar;
                break;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
        a(httpRequestBase, map);
        a(httpRequestBase, lVar.f());
        HttpParams params = httpRequestBase.getParams();
        int m = lVar.m();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, m);
        return this.f1214a.execute(httpRequestBase);
    }
}
