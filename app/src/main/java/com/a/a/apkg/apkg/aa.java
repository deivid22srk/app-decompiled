package com.a.a.apkg.apkg;

import com.a.a.apkg.bpkg.ao;
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
    public static final List<okio2.j> f889a = com.a.a.apkg.l.a(okio2.j.a("connection"), okio2.j.a("host"), okio2.j.a("keep-alive"), okio2.j.a("proxy-connection"), okio2.j.a("transfer-encoding"));

    /* renamed from: b, reason: collision with root package name */
    public static final List<okio2.j> f890b = com.a.a.apkg.l.a(okio2.j.a("connection"), okio2.j.a("host"), okio2.j.a("keep-alive"), okio2.j.a("proxy-connection"), okio2.j.a("te"), okio2.j.a("transfer-encoding"), okio2.j.a("encoding"), okio2.j.a("upgrade"));
    public final o c;
    public final com.a.a.apkg.bpkg.ac d;
    public ao e;

    public aa(o oVar, com.a.a.apkg.bpkg.ac acVar) {
        this.c = oVar;
        this.d = acVar;
    }

    @Override // com.a.a.apkg.apkg.ac
    public final okio2.x a(com.a.a.ab abVar, long j) {
        return this.e.d();
    }

    @Override // com.a.a.apkg.apkg.ac
    public final void a(com.a.a.ab abVar) {
        if (this.e == null) {
            this.c.a();
            boolean b2 = this.c.b();
            String a2 = x.a(this.c.c.g);
            com.a.a.apkg.bpkg.ac acVar = this.d;
            com.a.a.aa aaVar = this.d.f929a;
            com.a.a.t tVar = abVar.c;
            ArrayList arrayList = new ArrayList((tVar.f1049a.length / 2) + 10);
            arrayList.add(new com.a.a.apkg.bpkg.e(com.a.a.apkg.bpkg.e.f951b, abVar.f1007b));
            arrayList.add(new com.a.a.apkg.bpkg.e(com.a.a.apkg.bpkg.e.c, x.a(abVar.a())));
            String a3 = o.a(abVar.a());
            if (com.a.a.aa.SPDY_3 == aaVar) {
                arrayList.add(new com.a.a.apkg.bpkg.e(com.a.a.apkg.bpkg.e.g, a2));
                arrayList.add(new com.a.a.apkg.bpkg.e(com.a.a.apkg.bpkg.e.f, a3));
            } else if (com.a.a.aa.HTTP_2 == aaVar) {
                arrayList.add(new com.a.a.apkg.bpkg.e(com.a.a.apkg.bpkg.e.e, a3));
            } else {
                throw new AssertionError();
            }
            arrayList.add(new com.a.a.apkg.bpkg.e(com.a.a.apkg.bpkg.e.d, abVar.a().getProtocol()));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = tVar.f1049a.length / 2;
            for (int i = 0; i < length; i++) {
                okio2.j a4 = okio2.j.a(tVar.a(i).toLowerCase(Locale.US));
                String b3 = tVar.b(i);
                if (!a(aaVar, a4) && !a4.equals(com.a.a.apkg.bpkg.e.f951b) && !a4.equals(com.a.a.apkg.bpkg.e.c) && !a4.equals(com.a.a.apkg.bpkg.e.d) && !a4.equals(com.a.a.apkg.bpkg.e.e) && !a4.equals(com.a.a.apkg.bpkg.e.f) && !a4.equals(com.a.a.apkg.bpkg.e.g)) {
                    if (!linkedHashSet.add(a4)) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= arrayList.size()) {
                                break;
                            }
                            if (!arrayList.get(i2).h.equals(a4)) {
                                i2++;
                            } else {
                                arrayList.set(i2, new com.a.a.apkg.bpkg.e(a4, arrayList.get(i2).i.a() + (char) 0 + b3));
                                break;
                            }
                        }
                    } else {
                        arrayList.add(new com.a.a.apkg.bpkg.e(a4, b3));
                    }
                }
            }
            this.e = acVar.a(arrayList, b2);
            this.e.h.a(this.c.f908b.x, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.a.a.apkg.apkg.ac
    public final void a(y yVar) {
        yVar.a(this.e.d());
    }

    @Override // com.a.a.apkg.apkg.ac
    public final void a() {
        this.e.d().close();
    }

    @Override // com.a.a.apkg.apkg.ac
    public final ag b() {
        List<com.a.a.apkg.bpkg.e> c = this.e.c();
        com.a.a.aa aaVar = this.d.f929a;
        String str = null;
        String str2 = "HTTP/1.1";
        com.a.a.u uVar = new com.a.a.u();
        uVar.c(u.d, aaVar.toString());
        int size = c.size();
        int i = 0;
        while (i < size) {
            okio2.j jVar = c.get(i).h;
            String a2 = c.get(i).i.a();
            String str3 = str2;
            int i2 = 0;
            while (i2 < a2.length()) {
                int indexOf = a2.indexOf(0, i2);
                if (indexOf == -1) {
                    indexOf = a2.length();
                }
                String substring = a2.substring(i2, indexOf);
                if (!jVar.equals(com.a.a.apkg.bpkg.e.f950a)) {
                    if (jVar.equals(com.a.a.apkg.bpkg.e.g)) {
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

    @Override // com.a.a.apkg.apkg.ac
    public final ah a(af afVar) {
        return new w(afVar.f, okio2.o.a(this.e.f));
    }

    @Override // com.a.a.apkg.apkg.ac
    public final void c() {
    }

    @Override // com.a.a.apkg.apkg.ac
    public final boolean d() {
        return true;
    }

    public static boolean a(com.a.a.aa aaVar, okio2.j jVar) {
        if (aaVar == com.a.a.aa.SPDY_3) {
            return f889a.contains(jVar);
        }
        if (aaVar == com.a.a.aa.HTTP_2) {
            return f890b.contains(jVar);
        }
        throw new AssertionError(aaVar);
    }
}
