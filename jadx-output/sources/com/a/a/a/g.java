package com.a.a.a;

import com.a.a.aa;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final g f992a = c();

    public static g a() {
        return f992a;
    }

    public static String b() {
        return "OkHttp";
    }

    public static void a(String str) {
        System.out.println(str);
    }

    public void a(Socket socket) {
    }

    public void b(Socket socket) {
    }

    public static URI a(URL url) {
        return url.toURI();
    }

    public void a(SSLSocket sSLSocket, String str, List<aa> list) {
    }

    public void a(SSLSocket sSLSocket) {
    }

    public String b(SSLSocket sSLSocket) {
        return null;
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    private static g c() {
        Method method;
        Method method2;
        Method method3 = null;
        try {
            try {
                Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e) {
                Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            }
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                method = cls.getMethod("tagSocket", Socket.class);
                try {
                    method3 = cls.getMethod("untagSocket", Socket.class);
                    method2 = method;
                } catch (ClassNotFoundException e2) {
                    method2 = method;
                    return new h(method2, method3, (byte) 0);
                } catch (NoSuchMethodException e3) {
                    method2 = method;
                    return new h(method2, method3, (byte) 0);
                }
            } catch (ClassNotFoundException e4) {
                method = null;
            } catch (NoSuchMethodException e5) {
                method = null;
            }
            return new h(method2, method3, (byte) 0);
        } catch (ClassNotFoundException e6) {
            try {
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                return new i(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
            } catch (ClassNotFoundException | NoSuchMethodException e7) {
                return new g();
            }
        }
    }
}
