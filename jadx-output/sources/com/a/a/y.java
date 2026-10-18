package com.a.a;

import java.net.CookieHandler;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class y implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    static final List<aa> f1053a = com.a.a.a.l.a(aa.HTTP_2, aa.SPDY_3, aa.HTTP_1_1);

    /* renamed from: b, reason: collision with root package name */
    static final List<o> f1054b = com.a.a.a.l.a(o.f1041a, o.f1042b, o.c);
    private static SSLSocketFactory z;
    private c A;
    final com.a.a.a.k c;
    r d;
    public Proxy e;
    public List<aa> f;
    public List<o> g;
    final List<v> h;
    public final List<v> i;
    public ProxySelector j;
    public CookieHandler k;
    com.a.a.a.b l;
    public SocketFactory m;
    public SSLSocketFactory n;
    public HostnameVerifier o;
    public h p;
    public b q;
    public m r;
    com.a.a.a.d s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public int y;

    static {
        com.a.a.a.a.f887b = new z();
    }

    public y() {
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.t = true;
        this.u = true;
        this.v = true;
        this.c = new com.a.a.a.k();
        this.d = new r();
    }

    y(y yVar) {
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.t = true;
        this.u = true;
        this.v = true;
        this.c = yVar.c;
        this.d = yVar.d;
        this.e = yVar.e;
        this.f = yVar.f;
        this.g = yVar.g;
        this.h.addAll(yVar.h);
        this.i.addAll(yVar.i);
        this.j = yVar.j;
        this.k = yVar.k;
        this.A = yVar.A;
        this.l = this.A != null ? this.A.f1020a : yVar.l;
        this.m = yVar.m;
        this.n = yVar.n;
        this.o = yVar.o;
        this.p = yVar.p;
        this.q = yVar.q;
        this.r = yVar.r;
        this.s = yVar.s;
        this.t = yVar.t;
        this.u = yVar.u;
        this.v = yVar.v;
        this.w = yVar.w;
        this.x = yVar.x;
        this.y = yVar.y;
    }

    public final f a(ab abVar) {
        return new f(this, abVar);
    }

    final synchronized SSLSocketFactory a() {
        if (z == null) {
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, null, null);
                z = sSLContext.getSocketFactory();
            } catch (GeneralSecurityException e) {
                throw new AssertionError();
            }
        }
        return z;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final y clone() {
        try {
            return (y) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
