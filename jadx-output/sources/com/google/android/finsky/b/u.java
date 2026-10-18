package com.google.android.finsky.b;

import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final t f2132a;

    public u(String str) {
        this.f2132a = new t(str, (byte) 0);
    }

    public static u a(t tVar, String str) {
        String str2;
        String str3;
        u uVar = new u(str);
        if (tVar != null) {
            str2 = tVar.f2130a;
            if (!str.equals(str2)) {
                str3 = tVar.f2130a;
                FinskyLog.e("Package name mismatch,  %s != %s", str, str3);
            }
            uVar.a(tVar.f2131b);
            uVar.b(tVar.c);
            uVar.c(tVar.d);
            uVar.a(tVar.e, tVar.f);
            uVar.d(tVar.g);
            uVar.a(tVar.h);
            uVar.a(tVar.j);
            uVar.b(tVar.k);
            uVar.e(tVar.n);
            uVar.c(tVar.i);
            uVar.d(tVar.l);
            uVar.e(tVar.m);
            uVar.b(tVar.o);
            uVar.f(tVar.p);
            uVar.a(tVar.a());
            uVar.c(tVar.q);
            uVar.f(tVar.r);
            uVar.g(tVar.s);
            uVar.g(tVar.t);
            uVar.b(tVar.b());
            uVar.h(tVar.u);
            uVar.i(tVar.v);
        }
        return uVar;
    }

    public final u a(int i) {
        this.f2132a.f2131b = i;
        return this;
    }

    public final u b(int i) {
        this.f2132a.c = i;
        return this;
    }

    public final u c(int i) {
        this.f2132a.d = i;
        return this;
    }

    public final u a(com.google.android.finsky.protos.aa aaVar, long j) {
        this.f2132a.e = aaVar;
        this.f2132a.f = j;
        return this;
    }

    public final u d(int i) {
        this.f2132a.g = i;
        return this;
    }

    public final u a(String str) {
        this.f2132a.h = str;
        return this;
    }

    public final u a(long j) {
        this.f2132a.j = j;
        return this;
    }

    public final u b(String str) {
        this.f2132a.k = str;
        return this;
    }

    public final u c(String str) {
        this.f2132a.i = str;
        return this;
    }

    public final u d(String str) {
        this.f2132a.l = str;
        return this;
    }

    public final u e(int i) {
        this.f2132a.m = i;
        return this;
    }

    public final u e(String str) {
        this.f2132a.n = str;
        return this;
    }

    public final u b(long j) {
        this.f2132a.o = j;
        return this;
    }

    public final u f(String str) {
        this.f2132a.p = str;
        return this;
    }

    public final u a(String[] strArr) {
        this.f2132a.w = strArr;
        return this;
    }

    public final u c(long j) {
        this.f2132a.q = j;
        return this;
    }

    public final u f(int i) {
        this.f2132a.r = i;
        return this;
    }

    public final u g(int i) {
        this.f2132a.s = i;
        return this;
    }

    public final u g(String str) {
        this.f2132a.t = str;
        return this;
    }

    public final u b(String[] strArr) {
        this.f2132a.x = strArr;
        return this;
    }

    public final u h(String str) {
        this.f2132a.u = str;
        return this;
    }

    public final u i(String str) {
        this.f2132a.v = str;
        return this;
    }
}
