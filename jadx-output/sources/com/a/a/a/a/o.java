package com.a.a.a.a;

import com.a.a.af;
import com.a.a.ag;
import com.a.a.ah;
import com.a.a.ai;
import java.net.CookieHandler;
import java.net.URL;
import java.util.Date;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final ah f907a = new p();

    /* renamed from: b, reason: collision with root package name */
    public final com.a.a.y f908b;
    public com.a.a.l c;
    public z d;
    public ai e;
    public final af f;
    public ac g;
    public boolean i;
    public final boolean j;
    public final com.a.a.ab k;
    public com.a.a.ab l;
    public af m;
    public af n;
    public a.h p;
    public final boolean q;
    public final boolean r;
    public b s;
    public c t;
    public long h = -1;
    public a.x o = null;

    public o(com.a.a.y yVar, com.a.a.ab abVar, boolean z, boolean z2, boolean z3, com.a.a.l lVar, z zVar, af afVar) {
        this.f908b = yVar;
        this.k = abVar;
        this.j = z;
        this.q = z2;
        this.r = z3;
        this.c = lVar;
        this.d = zVar;
        this.f = afVar;
        if (lVar != null) {
            com.a.a.a.a.f887b.b(lVar, this);
            this.e = lVar.f1037b;
        } else {
            this.e = null;
        }
    }

    public static af a(af afVar) {
        if (afVar == null || afVar.g == null) {
            return afVar;
        }
        ag a2 = afVar.a();
        a2.g = null;
        return a2.a();
    }

    public final void a() {
        if (this.h != -1) {
            throw new IllegalStateException();
        }
        this.h = System.currentTimeMillis();
    }

    public final boolean b() {
        return s.a(this.k.f1007b);
    }

    public final af c() {
        if (this.n == null) {
            throw new IllegalStateException();
        }
        return this.n;
    }

    public final void d() {
        if (this.g != null && this.c != null) {
            this.g.c();
        }
        this.c = null;
    }

    public final com.a.a.l e() {
        if (this.p != null) {
            com.a.a.a.l.a(this.p);
        } else if (this.o != null) {
            com.a.a.a.l.a(this.o);
        }
        if (this.n == null) {
            if (this.c != null) {
                com.a.a.a.l.a(this.c.c);
            }
            this.c = null;
            return null;
        }
        com.a.a.a.l.a(this.n.g);
        if (this.g != null && this.c != null && !this.g.d()) {
            com.a.a.a.l.a(this.c.c);
            this.c = null;
            return null;
        }
        if (this.c != null && !com.a.a.a.a.f887b.a(this.c)) {
            this.c = null;
        }
        com.a.a.l lVar = this.c;
        this.c = null;
        return lVar;
    }

    public final af b(af afVar) {
        if (this.i && "gzip".equalsIgnoreCase(this.n.a("Content-Encoding")) && afVar.g != null) {
            a.m mVar = new a.m(afVar.g.c());
            com.a.a.t a2 = afVar.f.b().a("Content-Encoding").a("Content-Length").a();
            ag a3 = afVar.a().a(a2);
            a3.g = new w(a2, a.o.a(mVar));
            return a3.a();
        }
        return afVar;
    }

    public static String a(URL url) {
        return com.a.a.a.l.a(url) != com.a.a.a.l.a(url.getProtocol()) ? url.getHost() + ":" + url.getPort() : url.getHost();
    }

    public final af f() {
        this.g.a();
        ag b2 = this.g.b();
        b2.f1014a = this.l;
        b2.e = this.c.i;
        af a2 = b2.a(u.f916b, Long.toString(this.h)).a(u.c, Long.toString(System.currentTimeMillis())).a();
        if (!this.r) {
            ag a3 = a2.a();
            a3.g = this.g.a(a2);
            a2 = a3.a();
        }
        com.a.a.a.a.f887b.a(this.c, a2.f1013b);
        return a2;
    }

    public static com.a.a.t a(com.a.a.t tVar, com.a.a.t tVar2) {
        com.a.a.u uVar = new com.a.a.u();
        int length = tVar.f1049a.length / 2;
        for (int i = 0; i < length; i++) {
            String a2 = tVar.a(i);
            String b2 = tVar.b(i);
            if ((!"Warning".equalsIgnoreCase(a2) || !b2.startsWith("1")) && (!u.a(a2) || tVar2.a(a2) == null)) {
                uVar.a(a2, b2);
            }
        }
        int length2 = tVar2.f1049a.length / 2;
        for (int i2 = 0; i2 < length2; i2++) {
            String a3 = tVar2.a(i2);
            if (!"Content-Length".equalsIgnoreCase(a3) && u.a(a3)) {
                uVar.a(a3, tVar2.b(i2));
            }
        }
        return uVar.a();
    }

    public final void a(com.a.a.t tVar) {
        CookieHandler cookieHandler = this.f908b.k;
        if (cookieHandler != null) {
            cookieHandler.put(this.k.b(), u.b(tVar));
        }
    }

    public final boolean b(URL url) {
        URL a2 = this.k.a();
        return a2.getHost().equals(url.getHost()) && com.a.a.a.l.a(a2) == com.a.a.a.l.a(url) && a2.getProtocol().equals(url.getProtocol());
    }

    public static boolean c(af afVar) {
        if (afVar.f1012a.f1007b.equals("HEAD")) {
            return false;
        }
        int i = afVar.c;
        if ((i >= 100 && i < 200) || i == 204 || i == 304) {
            return u.a(afVar) != -1 || "chunked".equalsIgnoreCase(afVar.a("Transfer-Encoding"));
        }
        return true;
    }

    public static boolean a(af afVar, af afVar2) {
        Date b2;
        if (afVar2.c == 304) {
            return true;
        }
        Date b3 = afVar.f.b("Last-Modified");
        return (b3 == null || (b2 = afVar2.f.b("Last-Modified")) == null || b2.getTime() >= b3.getTime()) ? false : true;
    }
}
