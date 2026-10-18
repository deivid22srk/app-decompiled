package com.google.android.finsky.search;

import com.android.volley.t;
import com.google.android.finsky.protos.oj;
import com.google.android.finsky.protos.ok;

/* loaded from: classes.dex */
final class j implements t<oj> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f4532a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f4533b;

    j(h hVar, n nVar) {
        this.f4533b = hVar;
        this.f4532a = nVar;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(oj ojVar) {
        g gVar;
        o oVar;
        oj ojVar2 = ojVar;
        gVar = this.f4533b.i;
        gVar.a(this.f4533b.c, 3, ojVar2.f4209a.length, ojVar2.f4210b, this.f4533b.e);
        for (int i = 0; i < ojVar2.f4209a.length; i++) {
            oVar = this.f4533b.f;
            ok okVar = ojVar2.f4209a[i];
            oVar.a(okVar.c, okVar.i != null ? okVar.i.f3890a : null, null, okVar.e, okVar.f4211a == 3 ? okVar.f : null, okVar.g, false, okVar.k ? okVar.j : oVar.f4539b);
        }
        this.f4532a.a();
    }
}
