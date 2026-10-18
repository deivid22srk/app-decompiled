package com.a.a;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class aA2 {

    /* renamed from: a, reason: collision with root package name */
    public final Proxy f884a;

    /* renamed from: b, reason: collision with root package name */
    public final String f885b;
    public final int c;
    public final SocketFactory d;
    public final SSLSocketFactory e;
    public final HostnameVerifier f;
    public final h g;
    public final b h;
    public final List<aa> i;
    public final List<o> j;
    public final ProxySelector k;

    public aA2(String str, int i, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, h hVar, b bVar, Proxy proxy, List<aa> list, List<o> list2, ProxySelector proxySelector) {
        if (str == null) {
            throw new NullPointerException("uriHost == null");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("uriPort <= 0: " + i);
        }
        if (bVar == null) {
            throw new IllegalArgumentException("authenticator == null");
        }
        if (list == null) {
            throw new IllegalArgumentException("protocols == null");
        }
        if (proxySelector == null) {
            throw new IllegalArgumentException("proxySelector == null");
        }
        this.f884a = proxy;
        this.f885b = str;
        this.c = i;
        this.d = socketFactory;
        this.e = sSLSocketFactory;
        this.f = hostnameVerifier;
        this.g = hVar;
        this.h = bVar;
        this.i = com.a.a.apkg.l.a(list);
        this.j = com.a.a.apkg.l.a(list2);
        this.k = proxySelector;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aA2)) {
            return false;
        }
        aA2 aVar = (aA2) obj;
        return com.a.a.apkg.l.a(this.f884a, aVar.f884a) && this.f885b.equals(aVar.f885b) && this.c == aVar.c && com.a.a.apkg.l.a(this.e, aVar.e) && com.a.a.apkg.l.a(this.f, aVar.f) && com.a.a.apkg.l.a(this.g, aVar.g) && com.a.a.apkg.l.a(this.h, aVar.h) && com.a.a.apkg.l.a(this.i, aVar.i) && com.a.a.apkg.l.a(this.j, aVar.j) && com.a.a.apkg.l.a(this.k, aVar.k);
    }

    public final int hashCode() {
        return (((((((((((this.f != null ? this.f.hashCode() : 0) + (((this.e != null ? this.e.hashCode() : 0) + (((((((this.f884a != null ? this.f884a.hashCode() : 0) + 527) * 31) + this.f885b.hashCode()) * 31) + this.c) * 31)) * 31)) * 31) + (this.g != null ? this.g.hashCode() : 0)) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode();
    }
}
