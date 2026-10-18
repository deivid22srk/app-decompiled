package com.google.android.finsky.detailspage;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.ol;

/* loaded from: classes.dex */
public class ca extends dz implements com.google.android.finsky.gpkg.o {
    private com.google.android.finsky.api.model.h A;
    private Boolean u;
    private Boolean v;
    private boolean w;
    private Document x;
    private com.google.android.finsky.api.model.h y;
    private Document z;

    @Override // com.google.android.finsky.detailspage.eb, com.google.android.finsky.detailspage.bd
    public final void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        if (this.u == null) {
            this.u = Boolean.valueOf(com.google.android.finsky.cpkg.d.W.b().booleanValue() || document.f1963a.g == 3 || document.f1963a.g == 1 || FinskyApp.a().e().a(12603134L));
        }
        if (this.u.booleanValue()) {
            if (this.v == null) {
                this.v = Boolean.valueOf(com.google.android.finsky.utils.cy.a(document, (com.google.android.finsky.gpkg.p) this.m));
                this.m.a(this);
            }
            this.w = z;
            this.x = document;
            this.y = hVar;
            this.z = document2;
            this.A = hVar2;
        }
    }

    @Override // com.google.android.finsky.detailspage.dz
    protected final ol b(Document document) {
        if (document.n() != null) {
            return document.n();
        }
        if (document.f1963a.C != null) {
            return document.f1963a.C.M;
        }
        return null;
    }

    @Override // com.google.android.finsky.detailspage.eb, com.google.android.finsky.detailspage.bd
    public final void f() {
        super.f();
        this.m.b(this);
    }

    @Override // com.google.android.finsky.gpkg.o
    public final void M_() {
    }

    @Override // com.google.android.finsky.gpkg.o
    public final void L_() {
        if (!this.v.booleanValue() && com.google.android.finsky.utils.cy.a(this.x, (com.google.android.finsky.gpkg.p) this.m)) {
            super.a(this.w, this.x, this.y, this.z, this.A);
            this.v = true;
        }
    }
}
