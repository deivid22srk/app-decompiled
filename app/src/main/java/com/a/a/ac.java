package com.a.a;

import java.net.URL;

/* loaded from: classes.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    public String f1008a;

    /* renamed from: b, reason: collision with root package name */
    URL f1009b;
    String c;
    u d;
    ad e;
    Object f;

    /* synthetic */ ac(ab abVar, byte b2) {
        this(abVar);
    }

    public ac() {
        this.c = "GET";
        this.d = new u();
    }

    public ac(ab abVar) {
        this.f1008a = abVar.f1006a;
        this.f1009b = abVar.f;
        this.c = abVar.f1007b;
        this.e = abVar.d;
        this.f = abVar.e;
        this.d = abVar.c.b();
    }

    public final ac a(URL url) {
        this.f1009b = url;
        this.f1008a = url.toString();
        return this;
    }

    public final ac a(String str, String str2) {
        this.d.c(str, str2);
        return this;
    }

    public final ac b(String str, String str2) {
        this.d.a(str, str2);
        return this;
    }

    public final ac a(String str) {
        this.d.a(str);
        return this;
    }

    public final ac a(String str, ad adVar) {
        if (str.length() == 0) {
            throw new IllegalArgumentException("method == null || method.length() == 0");
        }
        if (adVar != null && !com.a.a.apkg.apkg.s.a(str)) {
            throw new IllegalArgumentException("method " + str + " must not have a request body.");
        }
        if (adVar == null && com.a.a.apkg.apkg.s.a(str)) {
            adVar = ad.a(null, com.a.a.apkg.l.f1000a);
        }
        this.c = str;
        this.e = adVar;
        return this;
    }

    public final ab a() {
        if (this.f1008a == null) {
            throw new IllegalStateException("url == null");
        }
        return new ab(this, (byte) 0);
    }
}
