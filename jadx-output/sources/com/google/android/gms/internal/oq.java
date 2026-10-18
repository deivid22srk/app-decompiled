package com.google.android.gms.internal;

import android.os.SystemClock;
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
public final class oq implements fc {

    /* renamed from: a, reason: collision with root package name */
    protected static final boolean f6215a = nx.f6191b;
    private static int d = 3000;
    private static int e = 4096;

    /* renamed from: b, reason: collision with root package name */
    protected final qi f6216b;
    protected final pe c;

    public oq(qi qiVar) {
        this(qiVar, new pe(e));
    }

    private oq(qi qiVar, pe peVar) {
        this.f6216b = qiVar;
        this.c = peVar;
    }

    private static Map<String, String> a(Header[] headerArr) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headerArr.length; i++) {
            treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return treeMap;
    }

    private byte[] a(HttpEntity httpEntity) {
        a aVar = new a(this.c, (int) httpEntity.getContentLength());
        try {
            InputStream content = httpEntity.getContent();
            if (content == null) {
                throw new zzp();
            }
            byte[] a2 = this.c.a(1024);
            while (true) {
                int read = content.read(a2);
                if (read == -1) {
                    break;
                }
                aVar.write(a2, 0, read);
            }
            byte[] byteArray = aVar.toByteArray();
            try {
                httpEntity.consumeContent();
            } catch (IOException e2) {
                nx.a("Error occured when calling consumingContent", new Object[0]);
            }
            this.c.a(a2);
            aVar.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                httpEntity.consumeContent();
            } catch (IOException e3) {
                nx.a("Error occured when calling consumingContent", new Object[0]);
            }
            this.c.a((byte[]) null);
            aVar.close();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.fc
    public final gy a(jn<?> jnVar) {
        byte[] bArr;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            HttpResponse httpResponse = null;
            Map<String, String> emptyMap = Collections.emptyMap();
            try {
                try {
                    HashMap hashMap = new HashMap();
                    bg bgVar = jnVar.m;
                    if (bgVar != null) {
                        if (bgVar.f5894b != null) {
                            hashMap.put("If-None-Match", bgVar.f5894b);
                        }
                        if (bgVar.d > 0) {
                            hashMap.put("If-Modified-Since", DateUtils.formatDate(new Date(bgVar.d)));
                        }
                    }
                    HttpResponse a2 = this.f6216b.a(jnVar, hashMap);
                    try {
                        StatusLine statusLine = a2.getStatusLine();
                        int statusCode = statusLine.getStatusCode();
                        emptyMap = a(a2.getAllHeaders());
                        if (statusCode == 304) {
                            bg bgVar2 = jnVar.m;
                            if (bgVar2 == null) {
                                return new gy(304, null, emptyMap, true, SystemClock.elapsedRealtime() - elapsedRealtime);
                            }
                            bgVar2.g.putAll(emptyMap);
                            return new gy(304, bgVar2.f5893a, bgVar2.g, true, SystemClock.elapsedRealtime() - elapsedRealtime);
                        }
                        bArr = a2.getEntity() != null ? a(a2.getEntity()) : new byte[0];
                        try {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            if (f6215a || elapsedRealtime2 > d) {
                                Object[] objArr = new Object[5];
                                objArr[0] = jnVar;
                                objArr[1] = Long.valueOf(elapsedRealtime2);
                                objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
                                objArr[3] = Integer.valueOf(statusLine.getStatusCode());
                                objArr[4] = Integer.valueOf(jnVar.l.b());
                                nx.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                            }
                            if (statusCode < 200 || statusCode > 299) {
                                throw new IOException();
                            }
                            return new gy(statusCode, bArr, emptyMap, false, SystemClock.elapsedRealtime() - elapsedRealtime);
                        } catch (IOException e2) {
                            e = e2;
                            httpResponse = a2;
                            if (httpResponse == null) {
                                throw new zzj(e);
                            }
                            int statusCode2 = httpResponse.getStatusLine().getStatusCode();
                            nx.c("Unexpected response code %d for %s", Integer.valueOf(statusCode2), jnVar.d);
                            if (bArr == null) {
                                throw new zzh((byte) 0);
                            }
                            gy gyVar = new gy(statusCode2, bArr, emptyMap, false, SystemClock.elapsedRealtime() - elapsedRealtime);
                            if (statusCode2 != 401 && statusCode2 != 403) {
                                throw new zzp(gyVar);
                            }
                            a("auth", jnVar, new zza(gyVar));
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
                throw new RuntimeException("Bad URL " + jnVar.d, e5);
            } catch (SocketTimeoutException e6) {
                a("socket", jnVar, new zzq());
            } catch (ConnectTimeoutException e7) {
                a("connection", jnVar, new zzq());
            }
        }
    }

    private static void a(String str, jn<?> jnVar, zzr zzrVar) {
        mv mvVar = jnVar.l;
        int c = jnVar.c();
        try {
            mvVar.a(zzrVar);
            jnVar.a(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(c)));
        } catch (zzr e2) {
            jnVar.a(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(c)));
            throw e2;
        }
    }
}
