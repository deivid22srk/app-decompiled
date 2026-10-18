package com.a.a.a.a;

import com.a.a.ai;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLProtocolException;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    final com.a.a.a f921a;

    /* renamed from: b, reason: collision with root package name */
    final URI f922b;
    public final com.a.a.y c;
    final com.a.a.a.k d;
    public final com.a.a.ab e;
    Proxy f;
    InetSocketAddress g;
    int i;
    private final com.a.a.a.d j;
    private final com.a.a.m k;
    private com.a.a.o l;
    private List<Proxy> m;
    private int n;
    private int p;
    private List<InetSocketAddress> o = Collections.emptyList();
    List<com.a.a.o> h = Collections.emptyList();
    private final List<ai> q = new ArrayList();

    public z(com.a.a.a aVar, URI uri, com.a.a.y yVar, com.a.a.ab abVar) {
        this.m = Collections.emptyList();
        this.f921a = aVar;
        this.f922b = uri;
        this.c = yVar;
        this.k = yVar.r;
        this.d = com.a.a.a.a.f887b.b(yVar);
        this.j = com.a.a.a.a.f887b.c(yVar);
        this.e = abVar;
        Proxy proxy = aVar.f884a;
        if (proxy != null) {
            this.m = Collections.singletonList(proxy);
        } else {
            this.m = new ArrayList();
            List<Proxy> select = this.c.j.select(uri);
            if (select != null) {
                this.m.addAll(select);
            }
            this.m.removeAll(Collections.singleton(Proxy.NO_PROXY));
            this.m.add(Proxy.NO_PROXY);
        }
        this.n = 0;
    }

    public final com.a.a.l a() {
        while (true) {
            com.a.a.l a2 = this.k.a(this.f921a);
            if (a2 != null) {
                if (!this.e.f1007b.equals("GET") && !com.a.a.a.a.f887b.c(a2)) {
                    a2.c.close();
                } else {
                    return a2;
                }
            } else {
                if (!d()) {
                    if (!c()) {
                        if (!b()) {
                            if (!e()) {
                                throw new NoSuchElementException();
                            }
                            return new com.a.a.l(this.k, this.q.remove(0));
                        }
                        if (!b()) {
                            throw new SocketException("No route to " + this.f921a.f885b + "; exhausted proxy configurations: " + this.m);
                        }
                        List<Proxy> list = this.m;
                        int i = this.n;
                        this.n = i + 1;
                        Proxy proxy = list.get(i);
                        a(proxy);
                        this.f = proxy;
                    }
                    if (!c()) {
                        throw new SocketException("No route to " + this.f921a.f885b + "; exhausted inet socket addresses: " + this.o);
                    }
                    List<InetSocketAddress> list2 = this.o;
                    int i2 = this.p;
                    this.p = i2 + 1;
                    InetSocketAddress inetSocketAddress = list2.get(i2);
                    f();
                    this.g = inetSocketAddress;
                }
                if (!d()) {
                    throw new SocketException("No route to " + this.f921a.f885b + "; exhausted connection specs: " + this.h);
                }
                List<com.a.a.o> list3 = this.h;
                int i3 = this.i;
                this.i = i3 + 1;
                this.l = list3.get(i3);
                ai aiVar = new ai(this.f921a, this.f, this.g, this.l, a(this.l));
                if (this.d.c(aiVar)) {
                    this.q.add(aiVar);
                } else {
                    return new com.a.a.l(this.k, aiVar);
                }
            }
        }
    }

    private boolean a(com.a.a.o oVar) {
        return oVar != this.h.get(0) && oVar.d;
    }

    public final void a(com.a.a.l lVar, IOException iOException) {
        if (com.a.a.a.a.f887b.b(lVar) > 0) {
            return;
        }
        ai aiVar = lVar.f1037b;
        if (aiVar.f1017b.type() != Proxy.Type.DIRECT && this.f921a.k != null) {
            this.f921a.k.connectFailed(this.f922b, aiVar.f1017b.address(), iOException);
        }
        this.d.a(aiVar);
        if (!(iOException instanceof SSLHandshakeException) && !(iOException instanceof SSLProtocolException)) {
            while (this.i < this.h.size()) {
                List<com.a.a.o> list = this.h;
                int i = this.i;
                this.i = i + 1;
                com.a.a.o oVar = list.get(i);
                this.d.a(new ai(this.f921a, this.f, this.g, oVar, a(oVar)));
            }
        }
    }

    public final boolean b() {
        return this.n < this.m.size();
    }

    private void a(Proxy proxy) {
        String str;
        int a2;
        this.o = new ArrayList();
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            InetAddress address2 = inetSocketAddress.getAddress();
            if (address2 == null) {
                str = inetSocketAddress.getHostName();
            } else {
                str = address2.getHostAddress();
            }
            a2 = inetSocketAddress.getPort();
        } else {
            str = this.f921a.f885b;
            a2 = com.a.a.a.l.a(this.f922b);
        }
        InetAddress[] a3 = this.j.a(str);
        for (InetAddress inetAddress : a3) {
            this.o.add(new InetSocketAddress(inetAddress, a2));
        }
        this.p = 0;
    }

    public final boolean c() {
        return this.p < this.o.size();
    }

    private void f() {
        this.h = new ArrayList();
        List<com.a.a.o> list = this.f921a.j;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            com.a.a.o oVar = list.get(i);
            if (this.e.e() == oVar.d) {
                this.h.add(oVar);
            }
        }
        this.i = 0;
    }

    public final boolean d() {
        return this.i < this.h.size();
    }

    public final boolean e() {
        return !this.q.isEmpty();
    }
}
