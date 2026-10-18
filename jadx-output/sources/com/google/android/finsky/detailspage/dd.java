package com.google.android.finsky.detailspage;

import com.google.android.finsky.activities.ff;

/* loaded from: classes.dex */
final class dd implements com.google.android.finsky.api.model.x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f2606a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ff f2607b;
    final /* synthetic */ db c;

    dd(db dbVar, boolean z, ff ffVar) {
        this.c = dbVar;
        this.f2606a = z;
        this.f2607b = ffVar;
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        boolean z;
        if (!this.f2606a && this.f2607b == ff.SPAM) {
            com.google.android.finsky.api.model.l lVar = ((dg) this.c.f2559b).f2611b;
            this.c.g.a(((dg) this.c.f2559b).f2610a.f1963a.H, lVar.f1982b, lVar.c(), lVar.c, lVar.d);
            com.google.android.finsky.api.model.l lVar2 = new com.google.android.finsky.api.model.l(this.c.g, ((dg) this.c.f2559b).f2610a.f1963a.H, ((dg) this.c.f2559b).f2610a.d(), false);
            lVar2.d = 4;
            ((dg) this.c.f2559b).f2611b = lVar2;
            z = this.c.v;
            if (!z) {
                lVar2.a(this.c);
                lVar2.q();
                db.b(this.c);
            }
        }
    }
}
