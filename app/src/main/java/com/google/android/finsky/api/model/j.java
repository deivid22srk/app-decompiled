package com.google.android.finsky.api.model;

import com.android.volley.VolleyError;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class j implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    private VolleyError f1978a;

    /* renamed from: b, reason: collision with root package name */
    private HashSet<x> f1979b = new HashSet<>();
    private HashSet<com.android.volley.s> c = new HashSet<>();

    public abstract boolean a();

    public final void a(x xVar) {
        if (!this.f1979b.contains(xVar)) {
            this.f1979b.add(xVar);
        }
    }

    public final void a(com.android.volley.s sVar) {
        if (!this.c.contains(sVar)) {
            this.c.add(sVar);
        }
    }

    public VolleyError h() {
        return this.f1978a;
    }

    public boolean i() {
        return this.f1978a != null;
    }

    @Override // com.android.volley.s
    public void a(VolleyError volleyError) {
        this.f1978a = volleyError;
        b(volleyError);
    }

    public final void b(x xVar) {
        this.f1979b.remove(xVar);
    }

    public final void b(com.android.volley.s sVar) {
        this.c.remove(sVar);
    }

    protected void j() {
        this.f1978a = null;
    }

    public final void k() {
        this.f1979b.clear();
        this.c.clear();
    }

    protected final void l() {
        for (x xVar : (x[]) this.f1979b.toArray(new x[this.f1979b.size()])) {
            xVar.m_();
        }
    }

    protected final void b(VolleyError volleyError) {
        for (com.android.volley.s sVar : (com.android.volley.s[]) this.c.toArray(new com.android.volley.s[this.c.size()])) {
            sVar.a(volleyError);
        }
    }
}
