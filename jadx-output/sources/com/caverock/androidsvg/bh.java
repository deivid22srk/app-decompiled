package com.caverock.androidsvg;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class bh extends bk implements bg, bj {
    public List<bn> i = new ArrayList();
    public Set<String> j = null;
    public String k = null;
    public Set<String> l = null;
    public Set<String> m = null;
    public Set<String> n = null;

    protected bh() {
    }

    @Override // com.caverock.androidsvg.bj
    public final List<bn> a() {
        return this.i;
    }

    @Override // com.caverock.androidsvg.bj
    public void a(bn bnVar) {
        this.i.add(bnVar);
    }

    @Override // com.caverock.androidsvg.bg
    public final void a(Set<String> set) {
        this.j = set;
    }

    @Override // com.caverock.androidsvg.bg
    public final Set<String> b() {
        return this.j;
    }

    @Override // com.caverock.androidsvg.bg
    public final void a(String str) {
        this.k = str;
    }

    @Override // com.caverock.androidsvg.bg
    public final String c() {
        return this.k;
    }

    @Override // com.caverock.androidsvg.bg
    public final void b(Set<String> set) {
        this.l = set;
    }

    @Override // com.caverock.androidsvg.bg
    public final Set<String> d() {
        return null;
    }

    @Override // com.caverock.androidsvg.bg
    public final void c(Set<String> set) {
        this.m = set;
    }

    @Override // com.caverock.androidsvg.bg
    public final Set<String> e() {
        return this.m;
    }

    @Override // com.caverock.androidsvg.bg
    public final void d(Set<String> set) {
        this.n = set;
    }

    @Override // com.caverock.androidsvg.bg
    public final Set<String> f() {
        return this.n;
    }
}
