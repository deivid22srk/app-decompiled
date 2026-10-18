package com.a.a.apkg.apkg;

import com.a.a.af;
import com.a.a.ag;
import com.a.a.ah;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class t implements ac {

    /* renamed from: a, reason: collision with root package name */
    public final o f913a;

    /* renamed from: b, reason: collision with root package name */
    public final f f914b;

    public t(o oVar, f fVar) {
        this.f913a = oVar;
        this.f914b = fVar;
    }

    @Override // com.a.a.apkg.apkg.ac
    public final okio2.x a(com.a.a.ab abVar, long j) {
        if ("chunked".equalsIgnoreCase(abVar.a("Transfer-Encoding"))) {
            f fVar = this.f914b;
            if (fVar.e != 1) {
                throw new IllegalStateException("state: " + fVar.e);
            }
            fVar.e = 2;
            return new h(fVar, (byte) 0);
        }
        if (j != -1) {
            f fVar2 = this.f914b;
            if (fVar2.e != 1) {
                throw new IllegalStateException("state: " + fVar2.e);
            }
            fVar2.e = 2;
            return new j(fVar2, j, (byte) 0);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // com.a.a.apkg.apkg.ac
    public final void a() {
        this.f914b.a();
    }

    @Override // com.a.a.apkg.apkg.ac
    public final void a(y yVar) {
        f fVar = this.f914b;
        if (fVar.e != 1) {
            throw new IllegalStateException("state: " + fVar.e);
        }
        fVar.e = 3;
        yVar.a(fVar.d);
    }

    @Override // com.a.a.apkg.apkg.ac
    public final void a(com.a.a.ab abVar) {
        this.f913a.a();
        Proxy.Type type = this.f913a.c.f1037b.f1017b.type();
        com.a.a.aa aaVar = this.f913a.c.g;
        StringBuilder sb = new StringBuilder();
        sb.append(abVar.f1007b);
        sb.append(' ');
        if (!abVar.e() && type == Proxy.Type.HTTP) {
            sb.append(abVar.a());
        } else {
            sb.append(x.a(abVar.a()));
        }
        sb.append(' ');
        sb.append(x.a(aaVar));
        this.f914b.a(abVar.c, sb.toString());
    }

    @Override // com.a.a.apkg.apkg.ac
    public final ag b() {
        return this.f914b.c();
    }

    @Override // com.a.a.apkg.apkg.ac
    public final void c() {
        if (d()) {
            f fVar = this.f914b;
            fVar.f = 1;
            if (fVar.e != 0) {
                return;
            }
            fVar.f = 0;
            com.a.a.apkg.a.f887b.a(fVar.f897a, fVar.f898b);
            return;
        }
        f fVar2 = this.f914b;
        fVar2.f = 2;
        if (fVar2.e != 0) {
            return;
        }
        fVar2.e = 6;
        fVar2.f898b.c.close();
    }

    @Override // com.a.a.apkg.apkg.ac
    public final boolean d() {
        if ("close".equalsIgnoreCase(this.f913a.k.a("Connection")) || "close".equalsIgnoreCase(this.f913a.c().a("Connection"))) {
            return false;
        }
        return !(this.f914b.e == 6);
    }

    @Override // com.a.a.apkg.apkg.ac
    public final ah a(af afVar) {
        okio2.y lVar;
        if (!o.c(afVar)) {
            lVar = this.f914b.a(0L);
        } else if ("chunked".equalsIgnoreCase(afVar.a("Transfer-Encoding"))) {
            f fVar = this.f914b;
            o oVar = this.f913a;
            if (fVar.e != 4) {
                throw new IllegalStateException("state: " + fVar.e);
            }
            fVar.e = 5;
            lVar = new i(fVar, oVar);
        } else {
            long a2 = u.a(afVar);
            if (a2 != -1) {
                lVar = this.f914b.a(a2);
            } else {
                f fVar2 = this.f914b;
                if (fVar2.e != 4) {
                    throw new IllegalStateException("state: " + fVar2.e);
                }
                fVar2.e = 5;
                lVar = new l(fVar2, (byte) 0);
            }
        }
        return new w(afVar.f, okio2.o.a(lVar));
    }
}
