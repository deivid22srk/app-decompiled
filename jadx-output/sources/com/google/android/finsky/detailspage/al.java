package com.google.android.finsky.detailspage;

import android.text.TextUtils;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.om;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class al extends bd<aq> implements at, com.google.android.finsky.g.o, com.google.android.finsky.layout.play.cy {
    private com.google.android.finsky.a.ai A = com.google.android.finsky.a.i.a(211);
    private com.google.android.finsky.api.model.x B = new am(this);
    private com.android.volley.s C = new an(this);
    private com.google.android.finsky.api.model.x D = new ao(this);
    private com.android.volley.s E = new ap(this);

    /* renamed from: a, reason: collision with root package name */
    private com.google.android.finsky.api.model.i f2540a;
    private com.google.android.finsky.api.model.i u;
    private Document v;
    private List<Document> w;
    private boolean x;
    private String y;
    private String z;

    static /* synthetic */ String g(al alVar) {
        alVar.y = null;
        return null;
    }

    static /* synthetic */ List h(al alVar) {
        alVar.w = null;
        return null;
    }

    static /* synthetic */ Document i(al alVar) {
        alVar.v = null;
        return null;
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return R.layout.episode_list_module;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        return (this.f2559b == 0 || (((aq) this.f2559b).c == null && this.w == null)) ? false : true;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(bf bfVar) {
        super.a(bfVar);
        if (this.f2559b != 0) {
            this.m.a(this);
            if (((aq) this.f2559b).f2546b == null) {
                this.f2540a = new com.google.android.finsky.api.model.i(this.f, ((aq) this.f2559b).f2545a, false);
                this.f2540a.a(this.B);
                this.f2540a.a(this.C);
                this.f2540a.q();
                return;
            }
            if (((aq) this.f2559b).c == null) {
                e();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x021a  */
    @Override // com.google.android.finsky.detailspage.bw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r20) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.detailspage.al.a(android.view.View):void");
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void f() {
        this.m.b(this);
        if (this.f2540a != null) {
            this.f2540a.b(this.B);
            this.f2540a.b(this.C);
        }
        if (this.u != null) {
            this.u.b(this.D);
            this.u.b(this.E);
        }
    }

    @Override // com.google.android.finsky.detailspage.at
    public final void a(Document document) {
        ((aq) this.f2559b).e = document;
    }

    @Override // com.google.android.finsky.detailspage.at
    public final void b(Document document) {
        if (((aq) this.f2559b).d != document) {
            this.v = ((aq) this.f2559b).d;
            this.w = ((aq) this.f2559b).c;
            ((aq) this.f2559b).d = document;
            ((aq) this.f2559b).c = null;
            ((aq) this.f2559b).e = null;
            e();
            if (this.A.c.length != 0 && !Arrays.equals(this.A.c, ((aq) this.f2559b).d.f1963a.R)) {
                this.A.f = com.google.android.finsky.a.ai.b();
                this.A.d = false;
                this.A.c = com.google.protobuf.nano.e.h;
            }
            com.google.android.finsky.a.i.a(this.A, ((aq) this.f2559b).d.f1963a.R);
        }
    }

    @Override // com.google.android.finsky.g.o
    public final void M_() {
    }

    @Override // com.google.android.finsky.g.o
    public final void L_() {
        g();
        if (W_()) {
            a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.u != null) {
            this.u.b(this.D);
            this.u.b(this.E);
        }
        this.u = new com.google.android.finsky.api.model.i(this.f, ((aq) this.f2559b).d.g(), false);
        this.u.a(this.D);
        this.u.a(this.E);
        this.u.q();
        if (this.w != null) {
            a(false);
        }
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.A;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.layout.play.cy getParentNode() {
        return this.s;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        com.google.android.finsky.a.i.a(this, cyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (((aq) this.f2559b).d == null) {
            return;
        }
        String str = ((aq) this.f2559b).d.f1963a.f3890a;
        if (!(!((aq) this.f2559b).f.containsKey(str)) || ((aq) this.f2559b).c == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (Document document : ((aq) this.f2559b).c) {
            if (com.google.android.finsky.utils.cy.a(document, (com.google.android.finsky.g.p) this.m)) {
                hashSet.add(document.f1963a.f3890a);
            }
        }
        ((aq) this.f2559b).f.put(str, hashSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        this.x = true;
        this.d.a(this, z);
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        if ((document.f1963a.e == 18 && !TextUtils.isEmpty(document.g())) && this.f2559b == 0) {
            this.f2559b = new aq();
            om aw = document.aw();
            if (aw != null) {
                this.z = aw.f4215a;
                if (aw.c != null) {
                    this.y = aw.c.f4215a;
                }
            }
            ((aq) this.f2559b).f = new HashMap();
            ((aq) this.f2559b).f2545a = document.g();
            this.f2540a = new com.google.android.finsky.api.model.i(this.f, ((aq) this.f2559b).f2545a, false);
            this.f2540a.a(this.B);
            this.f2540a.a(this.C);
            this.f2540a.q();
            this.m.a(this);
        }
    }
}
