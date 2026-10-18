package com.android.volley.a;

import android.os.SystemClock;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.cookie.DateUtils;

/* loaded from: classes.dex */
public final class c implements com.android.volley.i {

    /* renamed from: a, reason: collision with root package name */
    protected static final boolean f1205a = com.android.volley.w.f1258b;
    private static int d = 3000;
    private static int e = 4096;

    /* renamed from: b, reason: collision with root package name */
    protected final m f1206b;
    protected final d c;

    public c(m mVar) {
        this(mVar, new d(e));
    }

    public c(m mVar, d dVar) {
        this.f1206b = mVar;
        this.c = dVar;
    }

    @Override // com.android.volley.i
    public final com.android.volley.k a(com.android.volley.l<?> lVar) {
        byte[] bArr;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            HttpResponse httpResponse = null;
            Map<String, String> emptyMap = Collections.emptyMap();
            try {
                try {
                    HashMap hashMap = new HashMap();
                    com.android.volley.b bVar = lVar.h;
                    if (bVar != null) {
                        if (bVar.f1229b != null) {
                            hashMap.put("If-None-Match", bVar.f1229b);
                        }
                        if (bVar.d > 0) {
                            hashMap.put("If-Modified-Since", DateUtils.formatDate(new Date(bVar.d)));
                        }
                    }
                    HttpResponse a2 = this.f1206b.a(lVar, hashMap);
                    try {
                        StatusLine statusLine = a2.getStatusLine();
                        int statusCode = statusLine.getStatusCode();
                        emptyMap = a(a2.getAllHeaders());
                        if (statusCode != 304) {
                            if (a2.getEntity() != null) {
                                bArr = a(a2.getEntity());
                            } else {
                                bArr = new byte[0];
                            }
                            try {
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                if (f1205a || elapsedRealtime2 > d) {
                                    Object[] objArr = new Object[5];
                                    objArr[0] = lVar;
                                    objArr[1] = Long.valueOf(elapsedRealtime2);
                                    objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
                                    objArr[3] = Integer.valueOf(statusLine.getStatusCode());
                                    objArr[4] = Integer.valueOf(lVar.g.b());
                                    com.android.volley.w.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                                }
                                if (statusCode < 200 || statusCode > 299) {
                                    throw new IOException();
                                }
                                return new com.android.volley.k(statusCode, bArr, emptyMap, false, SystemClock.elapsedRealtime() - elapsedRealtime);
                            } catch (IOException e2) {
                                e = e2;
                                httpResponse = a2;
                                if (httpResponse != null) {
                                    int statusCode2 = httpResponse.getStatusLine().getStatusCode();
                                    com.android.volley.w.c("Unexpected response code %d for %s", Integer.valueOf(statusCode2), lVar.b());
                                    if (bArr != null) {
                                        com.android.volley.k kVar = new com.android.volley.k(statusCode2, bArr, emptyMap, false, SystemClock.elapsedRealtime() - elapsedRealtime);
                                        if (statusCode2 == 401 || statusCode2 == 403) {
                                            a("auth", lVar, new AuthFailureError(kVar));
                                        } else {
                                            throw new ServerError(kVar);
                                        }
                                    } else {
                                        throw new NetworkError((byte) 0);
                                    }
                                } else {
                                    throw new NoConnectionError(e);
                                }
                            }
                        } else {
                            com.android.volley.b bVar2 = lVar.h;
                            if (bVar2 == null) {
                                return new com.android.volley.k(304, null, emptyMap, true, SystemClock.elapsedRealtime() - elapsedRealtime);
                            }
                            bVar2.g.putAll(emptyMap);
                            return new com.android.volley.k(304, bVar2.f1228a, bVar2.g, true, SystemClock.elapsedRealtime() - elapsedRealtime);
                        }
                    } catch (IOException e3) {
                        e = e3;
                        bArr = null;
                        httpResponse = a2;
                    }
                } catch (IOException e4) {
                    e = e4;
                    bArr = null;
                }
            } catch (MalformedURLException e5) {
                throw new RuntimeException("Bad URL " + lVar.b(), e5);
            } catch (SocketTimeoutException e6) {
                a("socket", lVar, new TimeoutError());
            } catch (ConnectTimeoutException e7) {
                a("connection", lVar, new TimeoutError());
            }
        }
    }

    private byte[] a(HttpEntity httpEntity) {
        ad adVar = new ad(this.c, (int) httpEntity.getContentLength());
        try {
            InputStream content = httpEntity.getContent();
            if (content == null) {
                throw new ServerError();
            }
            byte[] a2 = this.c.a(1024);
            while (true) {
                int read = content.read(a2);
                if (read == -1) {
                    break;
                }
                adVar.write(a2, 0, read);
            }
            byte[] byteArray = adVar.toByteArray();
            try {
                httpEntity.consumeContent();
            } catch (IOException e2) {
                com.android.volley.w.a("Error occured when calling consumingContent", new Object[0]);
            }
            this.c.a(a2);
            adVar.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                httpEntity.consumeContent();
            } catch (IOException e3) {
                com.android.volley.w.a("Error occured when calling consumingContent", new Object[0]);
            }
            this.c.a((byte[]) null);
            adVar.close();
            throw th;
        }
    }

    private static Map<String, String> a(Header[] headerArr) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headerArr.length; i++) {
            treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return treeMap;
    }

    private static void a(String str, com.android.volley.l<?> lVar, VolleyError volleyError) {
        com.android.volley.v vVar = lVar.g;
        int m = lVar.m();
        try {
            vVar.a(volleyError);
            lVar.a(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(m)));
        } catch (VolleyError e2) {
            lVar.a(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(m)));
            throw e2;
        }
    }
}
