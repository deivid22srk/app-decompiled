package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes.dex */
final class af implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ac f6295a;

    /* renamed from: b, reason: collision with root package name */
    private final URL f6296b;
    private final byte[] c;
    private final ad d;

    public af(ac acVar, URL url, byte[] bArr, ad adVar) {
        this.f6295a = acVar;
        this.f6296b = url;
        this.c = bArr;
        this.d = adVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        int i;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection;
        int i2;
        OutputStream outputStream2;
        HttpURLConnection httpURLConnection2;
        this.f6295a.d();
        try {
            byte[] a2 = this.f6295a.j().a(this.c);
            URLConnection openConnection = this.f6296b.openConnection();
            if (!(openConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            i.u();
            httpURLConnection.setConnectTimeout(60000);
            i.v();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                httpURLConnection.setDoOutput(true);
                httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setFixedLengthStreamingMode(a2.length);
                httpURLConnection.connect();
                outputStream = httpURLConnection.getOutputStream();
                try {
                    outputStream.write(a2);
                    outputStream.close();
                    i = httpURLConnection.getResponseCode();
                    try {
                        byte[] a3 = ac.a(httpURLConnection);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f6295a.k().a(new ae(this.d, i, null, a3, (byte) 0));
                    } catch (IOException e) {
                        e = e;
                        i2 = i;
                        httpURLConnection2 = httpURLConnection;
                        outputStream2 = null;
                        if (outputStream2 != null) {
                            try {
                                outputStream2.close();
                            } catch (IOException e2) {
                                this.f6295a.l().f6388a.a("Error closing HTTP compressed POST connection output stream", e2);
                            }
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        this.f6295a.k().a(new ae(this.d, i2, e, null, (byte) 0));
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = null;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e3) {
                                this.f6295a.l().f6388a.a("Error closing HTTP compressed POST connection output stream", e3);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f6295a.k().a(new ae(this.d, i, null, null, (byte) 0));
                        throw th;
                    }
                } catch (IOException e4) {
                    e = e4;
                    i2 = 0;
                    httpURLConnection2 = httpURLConnection;
                    outputStream2 = outputStream;
                } catch (Throwable th3) {
                    th = th3;
                    i = 0;
                }
            } catch (IOException e5) {
                e = e5;
                i2 = 0;
                httpURLConnection2 = httpURLConnection;
                outputStream2 = null;
            } catch (Throwable th4) {
                th = th4;
                i = 0;
                outputStream = null;
            }
        } catch (IOException e6) {
            e = e6;
            i2 = 0;
            outputStream2 = null;
            httpURLConnection2 = null;
        } catch (Throwable th5) {
            th = th5;
            i = 0;
            outputStream = null;
            httpURLConnection = null;
        }
    }
}
