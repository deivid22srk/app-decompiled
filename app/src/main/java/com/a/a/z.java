package com.a.a;

import com.a.a.apkg.bpkg.ak;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
final class z extends com.a.a.apkg.a {
    z() {
    }

    @Override // com.a.a.apkg.a
    public final boolean a(l lVar) {
        return lVar.a();
    }

    @Override // com.a.a.apkg.a
    public final void b(l lVar, com.a.a.apkg.apkg.o oVar) {
        lVar.a(oVar);
    }

    @Override // com.a.a.apkg.a
    public final com.a.a.apkg.d c(y yVar) {
        com.a.a.apkg.d dVar;
        dVar = yVar.s;
        return dVar;
    }

    @Override // com.a.a.apkg.a
    public final com.a.a.apkg.apkg.ac a(l lVar, com.a.a.apkg.apkg.o oVar) {
        return lVar.f != null ? new com.a.a.apkg.apkg.aa(oVar, lVar.f) : new com.a.a.apkg.apkg.t(oVar, lVar.e);
    }

    @Override // com.a.a.apkg.a
    public final int b(l lVar) {
        return lVar.j;
    }

    @Override // com.a.a.apkg.a
    public final void a(l lVar, aa aaVar) {
        if (aaVar == null) {
            throw new IllegalArgumentException("protocol == null");
        }
        lVar.g = aaVar;
    }

    @Override // com.a.a.apkg.a
    public final boolean c(l lVar) {
        if (lVar.e != null) {
            return lVar.e.b();
        }
        return true;
    }

    @Override // com.a.a.apkg.a
    public final void a(u uVar, String str) {
        int indexOf = str.indexOf(":", 1);
        if (indexOf != -1) {
            uVar.b(str.substring(0, indexOf), str.substring(indexOf + 1));
        } else if (str.startsWith(":")) {
            uVar.b("", str.substring(1));
        } else {
            uVar.b("", str);
        }
    }

    @Override // com.a.a.apkg.a
    public final com.a.a.apkg.b a(y yVar) {
        return yVar.l;
    }

    @Override // com.a.a.apkg.a
    public final void a(m mVar, l lVar) {
        if (!lVar.e() && lVar.a()) {
            if (!lVar.b()) {
                com.a.a.apkg.l.a(lVar.c);
                return;
            }
            try {
                com.a.a.apkg.g.a().b(lVar.c);
                synchronized (mVar) {
                    mVar.a(lVar);
                    lVar.j++;
                    if (lVar.f != null) {
                        throw new IllegalStateException("spdyConnection != null");
                    }
                    lVar.h = System.nanoTime();
                }
            } catch (SocketException e) {
                com.a.a.apkg.g.a();
                com.a.a.apkg.g.a("Unable to untagSocket(): " + e);
                com.a.a.apkg.l.a(lVar.c);
            }
        }
    }

    @Override // com.a.a.apkg.a
    public final com.a.a.apkg.k b(y yVar) {
        return yVar.c;
    }

    @Override // com.a.a.apkg.a
    public final void a(y yVar, l lVar, com.a.a.apkg.apkg.o oVar, ab abVar) {
        ab a2;
        String[] strArr;
        String b2;
        lVar.a(oVar);
        if (!lVar.d) {
            ai aiVar = lVar.f1037b;
            if (aiVar.f1016a.e != null && aiVar.f1017b.type() == Proxy.Type.HTTP) {
                String host = abVar.a().getHost();
                int a3 = com.a.a.apkg.l.a(abVar.a());
                ac a4 = new ac().a(new URL("https", host, a3, "/")).a("Host", a3 == com.a.a.apkg.l.a("https") ? host : host + ":" + a3).a("Proxy-Connection", "Keep-Alive");
                String a5 = abVar.a("User-Agent");
                if (a5 != null) {
                    a4.a("User-Agent", a5);
                }
                String a6 = abVar.a("Proxy-Authorization");
                if (a6 != null) {
                    a4.a("Proxy-Authorization", a6);
                }
                a2 = a4.a();
            } else {
                a2 = null;
            }
            int i = yVar.w;
            int i2 = yVar.x;
            int i3 = yVar.y;
            if (lVar.d) {
                throw new IllegalStateException("already connected");
            }
            if (lVar.f1037b.f1017b.type() == Proxy.Type.DIRECT || lVar.f1037b.f1017b.type() == Proxy.Type.HTTP) {
                lVar.c = lVar.f1037b.f1016a.d.createSocket();
            } else {
                lVar.c = new Socket(lVar.f1037b.f1017b);
            }
            lVar.c.setSoTimeout(i2);
            com.a.a.apkg.g.a().a(lVar.c, lVar.f1037b.c, i);
            if (lVar.f1037b.f1016a.e == null) {
                lVar.e = new com.a.a.apkg.apkg.f(lVar.f1036a, lVar, lVar.c);
            } else {
                com.a.a.apkg.g a7 = com.a.a.apkg.g.a();
                if (a2 != null) {
                    lVar.a(a2, i2, i3);
                }
                lVar.c = lVar.f1037b.f1016a.e.createSocket(lVar.c, lVar.f1037b.f1016a.f885b, lVar.f1037b.f1016a.c, true);
                SSLSocket sSLSocket = (SSLSocket) lVar.c;
                o oVar2 = lVar.f1037b.d;
                ai aiVar2 = lVar.f1037b;
                o oVar3 = oVar2.h;
                if (oVar3 == null) {
                    List a8 = com.a.a.apkg.l.a((Object[]) oVar2.e, (Object[]) sSLSocket.getSupportedCipherSuites());
                    List a9 = com.a.a.apkg.l.a((Object[]) oVar2.f, (Object[]) sSLSocket.getSupportedProtocols());
                    p pVar = new p(oVar2);
                    pVar.f1044b = (String[]) a8.toArray(new String[a8.size()]);
                    pVar.c = (String[]) a9.toArray(new String[a9.size()]);
                    oVar3 = pVar.a();
                    oVar2.h = oVar3;
                }
                sSLSocket.setEnabledProtocols(oVar3.f);
                String[] strArr2 = oVar3.e;
                if (aiVar2.e && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
                    strArr = new String[strArr2.length + 1];
                    System.arraycopy(strArr2, 0, strArr, 0, strArr2.length);
                    strArr[strArr.length - 1] = "TLS_FALLBACK_SCSV";
                } else {
                    strArr = strArr2;
                }
                sSLSocket.setEnabledCipherSuites(strArr);
                com.a.a.apkg.g a10 = com.a.a.apkg.g.a();
                if (oVar3.g) {
                    a10.a(sSLSocket, aiVar2.f1016a.f885b, aiVar2.f1016a.i);
                }
                try {
                    sSLSocket.startHandshake();
                    if (lVar.f1037b.d.g && (b2 = a7.b(sSLSocket)) != null) {
                        lVar.g = aa.a(b2);
                    }
                    a7.a(sSLSocket);
                    lVar.i = s.a(sSLSocket.getSession());
                    if (!lVar.f1037b.f1016a.f.verify(lVar.f1037b.f1016a.f885b, sSLSocket.getSession())) {
                        X509Certificate x509Certificate = (X509Certificate) sSLSocket.getSession().getPeerCertificates()[0];
                        throw new IOException("Hostname " + lVar.f1037b.f1016a.f885b + " not verified:\n    certificate: " + h.a((Certificate) x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + com.a.a.apkg.cpkg.b.a(x509Certificate));
                    }
                    lVar.f1037b.f1016a.g.a(lVar.f1037b.f1016a.f885b, lVar.i.f1048b);
                    if (lVar.g == aa.SPDY_3 || lVar.g == aa.HTTP_2) {
                        sSLSocket.setSoTimeout(0);
                        ak akVar = new ak(lVar.f1037b.f1016a.f885b, lVar.c);
                        akVar.d = lVar.g;
                        lVar.f = new com.a.a.apkg.bpkg.ac(akVar, (byte) 0);
                        com.a.a.apkg.bpkg.ac acVar = lVar.f;
                        acVar.i.a();
                        acVar.i.b(acVar.e);
                        if (acVar.e.b() != 65536) {
                            acVar.i.a(0, r1 - 65536);
                        }
                    } else {
                        lVar.e = new com.a.a.apkg.apkg.f(lVar.f1036a, lVar, lVar.c);
                    }
                } catch (Throwable th) {
                    a7.a(sSLSocket);
                    throw th;
                }
            }
            lVar.d = true;
            if (lVar.e()) {
                m mVar = yVar.r;
                if (!lVar.e()) {
                    throw new IllegalArgumentException();
                }
                if (lVar.b()) {
                    synchronized (mVar) {
                        mVar.a(lVar);
                    }
                }
            }
            yVar.c.b(lVar.f1037b);
        }
        int i4 = yVar.x;
        int i5 = yVar.y;
        if (!lVar.d) {
            throw new IllegalStateException("setTimeouts - not connected");
        }
        if (lVar.e == null) {
            return;
        }
        lVar.c.setSoTimeout(i4);
        lVar.e.a(i4, i5);
    }
}
