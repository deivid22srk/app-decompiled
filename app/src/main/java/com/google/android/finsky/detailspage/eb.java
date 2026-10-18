package com.google.android.finsky.detailspage;

import com.android.volley.VolleyError;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.detailspage.ec;

/* loaded from: classes.dex */
public abstract class eb<D extends ec> extends bd<D> implements com.android.volley.s, com.google.android.finsky.api.model.x {
    protected abstract D a(Document document);

    @Override // com.google.android.finsky.detailspage.bd
    public boolean W_() {
        return (this.f2559b == 0 || ((ec) this.f2559b).f == null || !((ec) this.f2559b).f.a()) ? false : true;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(bf bfVar) {
        super.a(bfVar);
        if (this.f2559b != 0) {
            e();
        }
    }

    @Override // com.google.android.finsky.detailspage.bd
    public void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        if (this.f2559b == 0) {
            this.f2559b = a(document);
            if (this.f2559b != 0) {
                e();
            }
        }
    }

    protected void e() {
        com.google.android.finsky.api.model.i iVar = ((ec) this.f2559b).f;
        if (iVar == null) {
            com.google.android.finsky.api.model.i iVar2 = new com.google.android.finsky.api.model.i(this.f, ((ec) this.f2559b).e, false);
            ((ec) this.f2559b).f = iVar2;
            iVar = iVar2;
        }
        iVar.a((com.google.android.finsky.api.model.x) this);
        iVar.a((com.android.volley.s) this);
        if (!iVar.a()) {
            iVar.q();
        }
    }

    @Override // com.google.android.finsky.detailspage.bd
    public void f() {
        if (this.f2559b != 0 && ((ec) this.f2559b).f != null) {
            ((ec) this.f2559b).f.b((com.google.android.finsky.api.model.x) this);
            ((ec) this.f2559b).f.b((com.android.volley.s) this);
        }
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
    }
}
