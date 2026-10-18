package com.google.android.finsky.activities;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.PlayRecyclerView;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class er extends com.google.android.finsky.epkg.g implements com.google.android.finsky.api.model.x {

    /* renamed from: a, reason: collision with root package name */
    com.google.android.finsky.api.model.i f1724a;

    /* renamed from: b, reason: collision with root package name */
    com.google.android.finsky.adapters.an f1725b;
    PlayRecyclerView c;
    boolean d;
    Bundle e = new Bundle();
    private com.google.android.play.image.e n;
    private com.google.android.finsky.utils.ac o;
    private DfeToc p;
    private com.google.android.finsky.layout.play.cy q;
    private long r;

    public final void a(Context context, com.google.android.finsky.api.b bVar, com.google.android.finsky.navigationmanager.b bVar2, com.google.android.play.image.e eVar, DfeToc dfeToc, com.google.android.finsky.utils.ac acVar, com.google.android.finsky.layout.play.cy cyVar) {
        super.a(context, bVar, bVar2);
        this.n = eVar;
        this.p = dfeToc;
        this.o = acVar;
        this.q = cyVar;
    }

    public final void a(View view, Document document) {
        super.b(view, document);
        if (this.m == null) {
            this.m = new com.google.android.finsky.layout.bv(view, R.id.people_details_stream_list, new es(this));
        }
        com.google.android.finsky.protos.gq L = this.l.L();
        if ((L != null && L.f3876a) && com.google.android.finsky.utils.di.a(this.r)) {
            b();
            this.e.clear();
        }
        if (this.f1724a == null || !this.f1724a.a()) {
            this.m.a();
            a();
        } else {
            this.m.b();
            c();
        }
    }

    final void a() {
        b();
        this.f1724a = new com.google.android.finsky.api.model.i(this.g, this.l.g(), true);
        this.f1724a.a((com.google.android.finsky.api.model.x) this);
        this.f1724a.a((com.android.volley.s) this);
        this.f1724a.q();
        this.r = System.currentTimeMillis();
    }

    private void b() {
        if (this.f1724a != null) {
            this.f1724a.b((com.google.android.finsky.api.model.x) this);
            this.f1724a.b((com.android.volley.s) this);
            this.f1724a = null;
        }
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        if (this.m != null) {
            this.m.b();
        }
        c();
    }

    private void c() {
        if (this.c == null) {
            FinskyLog.c("List view null, ignoring.", new Object[0]);
            return;
        }
        boolean a2 = com.google.android.finsky.adapters.an.a(this.e);
        if (this.f1724a != null && this.f1724a.a()) {
            if (this.f1725b == null) {
                this.f1725b = new com.google.android.finsky.adapters.an(this.l, this.f, this.g, this.h, this.n, this.p, this.o, new com.google.android.finsky.api.model.s(this.f1724a), a2, this.q);
            }
            if (!this.d) {
                this.d = true;
                this.c.post(new et(this, a2));
            } else {
                this.f1725b.a((com.google.android.finsky.adapters.an) this.f1724a);
            }
        }
    }
}
