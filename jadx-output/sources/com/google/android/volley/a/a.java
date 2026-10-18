package com.google.android.volley.a;

import com.android.volley.w;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.scheme.HostNameResolver;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* loaded from: classes.dex */
public final class a implements SocketFactory {

    /* renamed from: a, reason: collision with root package name */
    private static final a f7181a = new a((byte) 0);

    /* renamed from: b, reason: collision with root package name */
    private final HostNameResolver f7182b;

    public static a a() {
        return f7181a;
    }

    private a() {
        this.f7182b = null;
    }

    private a(byte b2) {
        this();
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public final Socket createSocket() {
        return new Socket();
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public final Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) {
        InetSocketAddress inetSocketAddress;
        if (str == null) {
            throw new IllegalArgumentException("Target host may not be null.");
        }
        if (httpParams == null) {
            throw new IllegalArgumentException("Parameters may not be null.");
        }
        if (socket == null) {
            socket = createSocket();
        }
        if (inetAddress != null || i2 > 0) {
            if (i2 < 0) {
                i2 = 0;
            }
            socket.bind(new InetSocketAddress(inetAddress, i2));
        }
        int connectionTimeout = HttpConnectionParams.getConnectionTimeout(httpParams);
        if (this.f7182b != null) {
            inetSocketAddress = new InetSocketAddress(this.f7182b.resolve(str), i);
        } else {
            inetSocketAddress = new InetSocketAddress(str, i);
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            socket.connect(inetSocketAddress, connectionTimeout);
            w.a("Established connection to [host=%s] in [%s ms]", str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            return socket;
        } catch (SocketTimeoutException e) {
            throw new ConnectTimeoutException("Connect to " + inetSocketAddress + " timed out");
        }
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public final boolean isSecure(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null.");
        }
        if (socket.getClass() != Socket.class) {
            throw new IllegalArgumentException("Socket not created by this factory.");
        }
        if (socket.isClosed()) {
            throw new IllegalArgumentException("Socket is closed.");
        }
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return a.class.hashCode();
    }
}
