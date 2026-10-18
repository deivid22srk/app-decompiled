package com.google.android.finsky.bpkg;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ab implements s {

    /* renamed from: a, reason: collision with root package name */
    public final s f2063a;

    /* renamed from: b, reason: collision with root package name */
    public final s f2064b;
    public final Handler c;
    public final Handler d;
    public boolean e;
    public Collection<Runnable> f = new ArrayList();

    public ab(s sVar, s sVar2, Handler handler, Handler handler2) {
        this.f2064b = sVar;
        this.f2063a = sVar2;
        this.c = handler;
        this.d = handler2;
    }

    public final synchronized boolean b() {
        return this.e;
    }

    public final synchronized void c() {
        if (!this.e) {
            Iterator<t> it = this.f2063a.a().iterator();
            while (it.hasNext()) {
                this.f2064b.a(it.next());
            }
            this.e = true;
        }
        for (Runnable runnable : this.f) {
            if (runnable != null) {
                this.d.post(runnable);
            }
        }
        this.f.clear();
    }

    public final synchronized boolean a(Runnable runnable) {
        boolean z;
        if (this.e) {
            if (runnable != null) {
                this.d.post(runnable);
            }
            z = true;
        } else {
            this.f.add(runnable);
            if (this.f.size() < 2) {
                this.c.post(new ac(this));
            }
            z = false;
        }
        return z;
    }

    @Override // com.google.android.finsky.bpkg.s
    public final synchronized t a(String str) {
        return this.f2064b.a(str);
    }

    @Override // com.google.android.finsky.bpkg.s
    public final synchronized Collection<t> a() {
        return this.f2064b.a();
    }

    @Override // com.google.android.finsky.bpkg.s
    public final synchronized void a(t tVar) {
        this.f2064b.a(tVar);
        this.c.post(new al(this, tVar));
    }

    @Override // com.google.android.finsky.bpkg.s
    public final synchronized void a(String str, int i) {
        this.f2064b.a(str, i);
        this.c.post(new aq(this, str, i));
    }

    @Override // com.google.android.finsky.bpkg.s
    public final synchronized void b(String str, int i) {
        this.f2064b.b(str, i);
        this.c.post(new ar(this, str, i));
    }

    @Override // com.google.android.finsky.bpkg.s
    public final synchronized void c(String str, int i) {
        this.f2064b.c(str, i);
        this.c.post(new as(this, str, i));
    }

    @Override // com.google.android.finsky.bpkg.s
    public final synchronized void a(String str, com.google.android.finsky.protos.aa aaVar, long j) {
        this.f2064b.a(str, aaVar, j);
        this.c.post(new at(this, str, aaVar, j));
    }

    @Override // com.google.android.finsky.bpkg.s
    public final synchronized void a(String str, int i, String str2) {
        this.f2064b.a(str, i, str2);
        this.c.post(new au(this, str, i, str2));
    }

    @Override // com.google.android.finsky.bpkg.s
    public final synchronized void a(String str, long j) {
        this.f2064b.a(str, j);
        this.c.post(new av(this, str, j));
    }

    @Override // com.google.android.finsky.bpkg.s
    public final synchronized void a(String str, String str2) {
        this.f2064b.a(str, str2);
        this.c.post(new ad(this, str, str2));
    }

    @Override // com.google.android.finsky.bpkg.s
    public final synchronized void d(String str, int i) {
        this.f2064b.d(str, i);
        this.c.post(new ae(this, str, i));
    }

    @Override // com.google.android.finsky.bpkg.s
    public final synchronized void b(String str, String str2) {
        this.f2064b.b(str, str2);
        this.c.post(new af(this, str, str2));
    }

    @Override // com.google.android.finsky.bpkg.s
    public final void b(String str, long j) {
        this.f2064b.b(str, j);
        this.c.post(new ag(this, str, j));
    }

    @Override // com.google.android.finsky.bpkg.s
    public final synchronized void c(String str, String str2) {
        this.f2064b.c(str, str2);
        this.c.post(new ah(this, str, str2));
    }

    @Override // com.google.android.finsky.bpkg.s
    public final synchronized void a(String str, String[] strArr) {
        this.f2064b.a(str, strArr);
        this.c.post(new ai(this, str, strArr));
    }

    @Override // com.google.android.finsky.bpkg.s
    public final void c(String str, long j) {
        this.f2064b.c(str, j);
        this.c.post(new aj(this, str, j));
    }

    @Override // com.google.android.finsky.bpkg.s
    public final void e(String str, int i) {
        this.f2064b.e(str, i);
        this.c.post(new ak(this, str, i));
    }

    @Override // com.google.android.finsky.bpkg.s
    public final void f(String str, int i) {
        this.f2064b.f(str, i);
        this.c.post(new am(this, str, i));
    }

    @Override // com.google.android.finsky.bpkg.s
    public final void d(String str, String str2) {
        this.f2064b.d(str, str2);
        this.c.post(new an(this, str, str2));
    }

    @Override // com.google.android.finsky.bpkg.s
    public final synchronized void b(String str, String[] strArr) {
        this.f2064b.b(str, strArr);
        this.c.post(new ao(this, str, strArr));
    }

    @Override // com.google.android.finsky.bpkg.s
    public final synchronized void e(String str, String str2) {
        this.f2064b.e(str, str2);
        this.c.post(new ap(this, str, str2));
    }
}
