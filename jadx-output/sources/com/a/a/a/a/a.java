package com.a.a.a.a;

import com.a.a.af;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements com.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.a.a.b f888a = new a();

    @Override // com.a.a.b
    public final com.a.a.ab a(Proxy proxy, af afVar) {
        PasswordAuthentication requestPasswordAuthentication;
        List<com.a.a.j> b2 = afVar.b();
        com.a.a.ab abVar = afVar.f1012a;
        URL a2 = abVar.a();
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            com.a.a.j jVar = b2.get(i);
            if ("Basic".equalsIgnoreCase(jVar.f1032a) && (requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(a2.getHost(), a(proxy, a2), a2.getPort(), a2.getProtocol(), jVar.f1033b, jVar.f1032a, a2, Authenticator.RequestorType.SERVER)) != null) {
                return abVar.c().a("Authorization", com.a.a.q.a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()))).a();
            }
        }
        return null;
    }

    @Override // com.a.a.b
    public final com.a.a.ab b(Proxy proxy, af afVar) {
        List<com.a.a.j> b2 = afVar.b();
        com.a.a.ab abVar = afVar.f1012a;
        URL a2 = abVar.a();
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            com.a.a.j jVar = b2.get(i);
            if ("Basic".equalsIgnoreCase(jVar.f1032a)) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                PasswordAuthentication requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), a(proxy, a2), inetSocketAddress.getPort(), a2.getProtocol(), jVar.f1033b, jVar.f1032a, a2, Authenticator.RequestorType.PROXY);
                if (requestPasswordAuthentication != null) {
                    return abVar.c().a("Proxy-Authorization", com.a.a.q.a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()))).a();
                }
            }
        }
        return null;
    }

    private static InetAddress a(Proxy proxy, URL url) {
        return (proxy == null || proxy.type() == Proxy.Type.DIRECT) ? InetAddress.getByName(url.getHost()) : ((InetSocketAddress) proxy.address()).getAddress();
    }
}
