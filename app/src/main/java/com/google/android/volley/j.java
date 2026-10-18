package com.google.android.volley;

import java.net.InetAddress;
import java.net.Socket;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpParams;

/* loaded from: classes.dex */
class j implements SocketFactory {

    /* renamed from: a, reason: collision with root package name */
    private SocketFactory f7206a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ GoogleHttpClient f7207b;

    /* synthetic */ j(GoogleHttpClient googleHttpClient, SocketFactory socketFactory, byte b2) {
        this(googleHttpClient, socketFactory);
    }

    private j(GoogleHttpClient googleHttpClient, SocketFactory socketFactory) {
        this.f7207b = googleHttpClient;
        this.f7206a = socketFactory;
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public final Socket createSocket() {
        return this.f7206a.createSocket();
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public final boolean isSecure(Socket socket) {
        return this.f7206a.isSecure(socket);
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public final Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) {
        ThreadLocal threadLocal;
        threadLocal = this.f7207b.e;
        threadLocal.set(Boolean.TRUE);
        return this.f7206a.connectSocket(socket, str, i, inetAddress, i2, httpParams);
    }
}
