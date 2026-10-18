package com.a.a.apkg;

import com.a.a.aa;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
final class h extends g {

    /* renamed from: a, reason: collision with root package name */
    public static final f<Socket> f993a = new f<>(null, "setUseSessionTickets", Boolean.TYPE);

    /* renamed from: b, reason: collision with root package name */
    public static final f<Socket> f994b = new f<>(null, "setHostname", String.class);
    public static final f<Socket> c = new f<>(byte[].class, "getNpnSelectedProtocol", new Class[0]);
    public static final f<Socket> d = new f<>(null, "setNpnProtocols", byte[].class);
    public static final f<Socket> e = new f<>(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
    public static final f<Socket> f = new f<>(null, "setAlpnProtocols", byte[].class);
    public final Method g;
    public final Method h;

    /* synthetic */ h(Method method, Method method2, byte b2) {
        this(method, method2);
    }

    public h(Method method, Method method2) {
        this.g = method;
        this.h = method2;
    }

    @Override // com.a.a.apkg.g
    public final void a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (SecurityException e2) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e2);
            throw iOException;
        }
    }

    @Override // com.a.a.apkg.g
    public final void a(SSLSocket sSLSocket, String str, List<aa> list) {
        if (str != null) {
            f993a.a(sSLSocket, true);
            f994b.a(sSLSocket, str);
        }
        boolean a2 = d.a(sSLSocket);
        boolean a3 = f.a(sSLSocket);
        if (a2 || a3) {
            Object[] objArr = new Object[1];
            okio2.f fVar = new okio2.f();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                aa aaVar = list.get(i);
                if (aaVar != aa.HTTP_1_0) {
                    fVar.g(aaVar.toString().length());
                    fVar.b(aaVar.toString());
                }
            }
            objArr[0] = fVar.n();
            if (a2) {
                d.b(sSLSocket, objArr);
            }
            if (a3) {
                f.b(sSLSocket, objArr);
            }
        }
    }

    @Override // com.a.a.apkg.g
    public final String b(SSLSocket sSLSocket) {
        String a2 = a(sSLSocket, c);
        return a2 != null ? a2 : a(sSLSocket, e);
    }

    public static String a(SSLSocket sSLSocket, f<Socket> fVar) {
        byte[] bArr;
        if (fVar.a(sSLSocket) && (bArr = (byte[]) fVar.b(sSLSocket, new Object[0])) != null) {
            return new String(bArr, l.d);
        }
        return null;
    }

    @Override // com.a.a.apkg.g
    public final void a(Socket socket) {
        if (this.g != null) {
            try {
                this.g.invoke(null, socket);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    @Override // com.a.a.apkg.g
    public final void b(Socket socket) {
        if (this.h != null) {
            try {
                this.h.invoke(null, socket);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }
}
