package com.google.android.finsky.b;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class r implements s {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, t> f2129a = new HashMap();

    @Override // com.google.android.finsky.b.s
    public final synchronized t a(String str) {
        return this.f2129a.get(str);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized Collection<t> a() {
        return this.f2129a.values();
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void a(t tVar) {
        this.f2129a.put(tVar.f2130a, tVar);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void a(String str, int i) {
        this.f2129a.put(str, u.a(a(str), str).a(i).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void a(String str, com.google.android.finsky.protos.aa aaVar, long j) {
        this.f2129a.put(str, u.a(a(str), str).a(aaVar, j).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void b(String str, int i) {
        this.f2129a.put(str, u.a(a(str), str).b(i).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void c(String str, int i) {
        this.f2129a.put(str, u.a(a(str), str).c(i).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void a(String str, int i, String str2) {
        this.f2129a.put(str, u.a(a(str), str).d(i).a(str2).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void a(String str, long j) {
        this.f2129a.put(str, u.a(a(str), str).a(j).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void a(String str, String str2) {
        this.f2129a.put(str, u.a(a(str), str).b(str2).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void d(String str, int i) {
        this.f2129a.put(str, u.a(a(str), str).e(i).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final void b(String str, String str2) {
        this.f2129a.put(str, u.a(a(str), str).e(str2).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final void b(String str, long j) {
        this.f2129a.put(str, u.a(a(str), str).b(j).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void c(String str, String str2) {
        this.f2129a.put(str, u.a(a(str), str).f(str2).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void a(String str, String[] strArr) {
        this.f2129a.put(str, u.a(a(str), str).a(strArr).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final void c(String str, long j) {
        this.f2129a.put(str, u.a(a(str), str).c(j).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final void e(String str, int i) {
        this.f2129a.put(str, u.a(a(str), str).f(i).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final void f(String str, int i) {
        this.f2129a.put(str, u.a(a(str), str).g(i).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final void d(String str, String str2) {
        this.f2129a.put(str, u.a(a(str), str).g(str2).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void b(String str, String[] strArr) {
        this.f2129a.put(str, u.a(a(str), str).b(strArr).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void e(String str, String str2) {
        this.f2129a.put(str, u.a(a(str), str).h(str2).f2132a);
    }
}
