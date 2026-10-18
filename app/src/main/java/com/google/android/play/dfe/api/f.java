package com.google.android.play.dfe.api;

import com.android.volley.l;
import com.android.volley.o;
import com.android.volley.s;
import com.android.volley.t;
import com.google.android.finsky.protos.lj;
import com.google.android.play.utils.bpkg.j;

/* loaded from: classes.dex */
public final class f implements d {
    private static final int d = j.g.b().intValue();
    private static final int e = j.h.b().intValue();
    private static final float f = j.i.b().floatValue();
    private final o g;
    private final e h;

    public f(o oVar, e eVar) {
        this.g = oVar;
        this.h = eVar;
    }

    @Override // com.google.android.play.dfe.api.d
    public final l<?> a(t<lj> tVar, s sVar, boolean z) {
        b bVar = new b(f6838b.toString(), this.h, lj.class, tVar, sVar);
        if (!z) {
            bVar.g = new c(d, e, f, this.h);
        }
        return this.g.a(bVar);
    }

    @Override // com.google.android.play.dfe.api.d
    public final void a() {
        this.g.a(new a(this.h.f6840b, new b(f6838b.toString(), this.h, lj.class, null, null).c()));
    }
}
