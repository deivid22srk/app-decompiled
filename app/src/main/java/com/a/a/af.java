package com.a.a;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    public final ab f1012a;

    /* renamed from: b, reason: collision with root package name */
    public final aa f1013b;
    public final int c;
    public final String d;
    public final s e;
    public final t f;
    public final ah g;
    af h;
    af i;
    public final af j;
    public volatile d k;

    /* synthetic */ af(ag agVar, byte b2) {
        this(agVar);
    }

    public af(ag agVar) {
        this.f1012a = agVar.f1014a;
        this.f1013b = agVar.f1015b;
        this.c = agVar.c;
        this.d = agVar.d;
        this.e = agVar.e;
        this.f = agVar.f.a();
        this.g = agVar.g;
        this.h = agVar.h;
        this.i = agVar.i;
        this.j = agVar.j;
    }

    public final ag a() {
        return new ag(this, (byte) 0);
    }

    public final List<j> b() {
        String str;
        if (this.c == 401) {
            str = "WWW-Authenticate";
        } else if (this.c == 407) {
            str = "Proxy-Authenticate";
        } else {
            return Collections.emptyList();
        }
        return com.a.a.apkg.apkg.u.a(this.f, str);
    }

    public final d c() {
        d dVar = this.k;
        if (dVar != null) {
            return dVar;
        }
        d a2 = d.a(this.f);
        this.k = a2;
        return a2;
    }

    public final String toString() {
        return "Response{protocol=" + this.f1013b + ", code=" + this.c + ", message=" + this.d + ", url=" + this.f1012a.f1006a + '}';
    }

    public final String a(String str) {
        String a2 = this.f.a(str);
        if (a2 != null) {
            return a2;
        }
        return null;
    }
}
