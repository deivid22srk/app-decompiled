package com.a.a.a.a;

import com.a.a.a.b.ao;
import com.a.a.af;
import com.a.a.ag;
import com.a.a.ah;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class aa implements ac {

    /* renamed from: a, reason: collision with root package name */
    private static final List<a.j> f889a = com.a.a.a.l.a(a.j.a("connection"), a.j.a("host"), a.j.a("keep-alive"), a.j.a("proxy-connection"), a.j.a("transfer-encoding"));

    /* renamed from: b, reason: collision with root package name */
    private static final List<a.j> f890b = com.a.a.a.l.a(a.j.a("connection"), a.j.a("host"), a.j.a("keep-alive"), a.j.a("proxy-connection"), a.j.a("te"), a.j.a("transfer-encoding"), a.j.a("encoding"), a.j.a("upgrade"));
    private final o c;
    private final com.a.a.a.b.ac d;
    private ao e;

    public aa(o oVar, com.a.a.a.b.ac acVar) {
        this.c = oVar;
        this.d = acVar;
    }

    @Override // com.a.a.a.a.ac
    public final a.x a(com.a.a.ab abVar, long j) {
        return this.e.d();
    }

    @Override // com.a.a.a.a.ac
    public final void a(com.a.a.ab abVar) {
        if (this.e == null) {
            this.c.a();
            boolean b2 = this.c.b();
            String a2 = x.a(this.c.c.g);
            com.a.a.a.b.ac acVar = this.d;
            com.a.a.aa aaVar = this.d.f929a;
            com.a.a.t tVar = abVar.c;
            ArrayList arrayList = new ArrayList((tVar.f1049a.length / 2) + 10);
            arrayList.add(new com.a.a.a.b.e(com.a.a.a.b.e.f951b, abVar.f1007b));
            arrayList.add(new com.a.a.a.b.e(com.a.a.a.b.e.c, x.a(abVar.a())));
            String a3 = o.a(abVar.a());
            if (com.a.a.aa.SPDY_3 == aaVar) {
                arrayList.add(new com.a.a.a.b.e(com.a.a.a.b.e.g, a2));
                arrayList.add(new com.a.a.a.b.e(com.a.a.a.b.e.f, a3));
            } else if (com.a.a.aa.HTTP_2 == aaVar) {
                arrayList.add(new com.a.a.a.b.e(com.a.a.a.b.e.e, a3));
            } else {
                throw new AssertionError();
            }
            arrayList.add(new com.a.a.a.b.e(com.a.a.a.b.e.d, abVar.a().getProtocol()));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = tVar.f1049a.length / 2;
            for (int i = 0; i < length; i++) {
                a.j a4 = a.j.a(tVar.a(i).toLowerCase(Locale.US));
                String b3 = tVar.b(i);
                if (!a(aaVar, a4) && !a4.equals(com.a.a.a.b.e.f951b) && !a4.equals(com.a.a.a.b.e.c) && !a4.equals(com.a.a.a.b.e.d) && !a4.equals(com.a.a.a.b.e.e) && !a4.equals(com.a.a.a.b.e.f) && !a4.equals(com.a.a.a.b.e.g)) {
                    if (!linkedHashSet.add(a4)) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= arrayList.size()) {
                                break;
                            }
                            if (!arrayList.get(i2).h.equals(a4)) {
                                i2++;
                            } else {
                                arrayList.set(i2, new com.a.a.a.b.e(a4, arrayList.get(i2).i.a() + (char) 0 + b3));
                                break;
                            }
                        }
                    } else {
                        arrayList.add(new com.a.a.a.b.e(a4, b3));
                    }
                }
            }
            this.e = acVar.a(arrayList, b2);
            this.e.h.a(this.c.f908b.x, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.a.a.a.a.ac
    public final void a(y yVar) {
        yVar.a(this.e.d());
    }

    @Override // com.a.a.a.a.ac
    public final void a() {
        this.e.d().close();
    }

    @Override // com.a.a.a.a.ac
    public final ag b() {
        List<com.a.a.a.b.e> c = this.e.c();
        com.a.a.aa aaVar = this.d.f929a;
        String str = null;
        String str2 = "HTTP/1.1";
        com.a.a.u uVar = new com.a.a.u();
        uVar.c(u.d, aaVar.toString());
        int size = c.size();
        int i = 0;
        while (i < size) {
            a.j jVar = c.get(i).h;
            String a2 = c.get(i).i.a();
            String str3 = str2;
            int i2 = 0;
            while (i2 < a2.length()) {
                int indexOf = a2.indexOf(0, i2);
                if (indexOf == -1) {
                    indexOf = a2.length();
                }
                String substring = a2.substring(i2, indexOf);
                if (!jVar.equals(com.a.a.a.b.e.f950a)) {
                    if (jVar.equals(com.a.a.a.b.e.g)) {
                        str3 = substring;
                        substring = str;
                    } else {
                        if (!a(aaVar, jVar)) {
                            uVar.a(jVar.a(), substring);
                        }
                        substring = str;
                    }
                }
                str = substring;
                i2 = indexOf + 1;
            }
            i++;
            str2 = str3;
        }
        if (str == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        ab a3 = ab.a(str2 + " " + str);
        ag agVar = new ag();
        agVar.f1015b = aaVar;
        agVar.c = a3.f892b;
        agVar.d = a3.c;
        return agVar.a(uVar.a());
    }

    @Override // com.a.a.a.a.ac
    public final ah a(af afVar) {
        return new w(afVar.f, a.o.a(this.e.f));
    }

    @Override // com.a.a.a.a.ac
    public final void c() {
    }

    @Override // com.a.a.a.a.ac
    public final boolean d() {
        return true;
    }

    private static boolean a(com.a.a.aa aaVar, a.j jVar) {
        if (aaVar == com.a.a.aa.SPDY_3) {
            return f889a.contains(jVar);
        }
        if (aaVar == com.a.a.aa.HTTP_2) {
            return f890b.contains(jVar);
        }
        throw new AssertionError(aaVar);
    }
}
