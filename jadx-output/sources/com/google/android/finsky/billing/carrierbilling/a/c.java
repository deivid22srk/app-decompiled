package com.google.android.finsky.billing.carrierbilling.a;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.r;
import android.text.TextUtils;
import com.deivid22srk.store.R;
import com.android.volley.VolleyError;
import com.android.volley.s;
import com.android.volley.t;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.i;
import com.google.android.finsky.a.n;
import com.google.android.finsky.billing.ao;
import com.google.android.finsky.billing.carrierbilling.b.e;
import com.google.android.finsky.billing.carrierbilling.b.k;
import com.google.android.finsky.billing.carrierbilling.b.m;
import com.google.android.finsky.billing.carrierbilling.b.o;
import com.google.android.finsky.billing.carrierbilling.b.p;
import com.google.android.finsky.billing.carrierbilling.model.SubscriberInfo;
import com.google.android.finsky.billing.g;
import com.google.android.finsky.billing.j;
import com.google.android.finsky.billing.u;
import com.google.android.finsky.protos.bw;
import com.google.android.finsky.protos.cd;
import com.google.android.finsky.protos.ce;
import com.google.android.finsky.protos.cf;
import com.google.android.finsky.protos.sa;
import com.google.android.finsky.protos.v;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.aw;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends ao implements s, t<bw>, com.google.android.finsky.billing.carrierbilling.b.c, e, m, p {
    private String A;
    private boolean B;
    private String C;
    final g c;
    v d;
    Fragment e;
    int f;
    String g;
    String h;
    int i;
    private final com.google.android.finsky.api.b j;
    private final String k;
    private final i l;
    private int m;
    private boolean n;
    private SubscriberInfo o;
    private int p;
    private bw q;
    private com.google.android.finsky.billing.carrierbilling.b.a r;
    private k s;
    private com.google.android.finsky.billing.carrierbilling.b.d t;
    private com.google.android.finsky.billing.carrierbilling.a.a.a u;
    private String v;
    private String w;
    private d x;
    private String y;
    private String z;

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(bw bwVar) {
        this.q = bwVar;
        h();
        f();
    }

    public c(g gVar, j jVar, com.google.android.finsky.api.b bVar, cd cdVar, int i) {
        super(gVar, jVar, null);
        List<sa> f;
        sa a2;
        this.m = 0;
        this.p = -1;
        this.f = 0;
        this.c = gVar;
        this.j = bVar;
        this.i = i;
        if (com.google.android.finsky.c.d.ah.b().booleanValue() && (f = com.google.android.finsky.billing.k.f()) != null && (a2 = u.a(u.a(FinskyApp.a(), (String) null), f)) != null) {
            this.f = a2.e ? 1 : 0;
        }
        this.k = bVar.c();
        this.l = FinskyApp.a().c(bVar.b());
        if (cdVar.k != null) {
            this.v = cdVar.k.c;
            this.w = cdVar.k.f3866a;
        }
        if (cdVar.j) {
            this.y = cdVar.i;
            this.C = FinskyApp.a().getString(R.string.dcb_setup_title, new Object[]{this.y});
        } else {
            FinskyLog.e("No carrier name available in status.", new Object[0]);
        }
        if (cdVar.f3667a != null) {
            ce ceVar = cdVar.f3667a;
            if (ceVar.f3669a != null) {
                cf cfVar = ceVar.f3669a;
                this.g = cfVar.f3671a;
                this.h = cfVar.c;
            }
            if (ceVar.f3670b != null) {
                cf cfVar2 = ceVar.f3670b;
                this.z = cfVar2.f3671a;
                this.A = cfVar2.c;
            }
        }
        this.B = cdVar.f3668b;
    }

    private void a(int i, String str) {
        this.l.a(342, (String) null, (String) null, i, str, (n) null);
    }

    @Override // com.google.android.finsky.billing.f
    public final void a() {
        if (i()) {
            f();
        }
    }

    private boolean i() {
        if (this.y != null && this.j != null) {
            return true;
        }
        FinskyLog.a("Cannot run this BillingFlow since carrier name or DFE api is null.", new Object[0]);
        a(FinskyApp.a().getString(R.string.generic_purchase_prepare_error));
        return false;
    }

    @Override // com.google.android.finsky.billing.f
    public final boolean e() {
        return true;
    }

    @Override // com.google.android.finsky.billing.f
    public final void c() {
        super.c();
    }

    @Override // com.google.android.finsky.billing.f
    public final void a(Bundle bundle) {
        if (i()) {
            if (this.m != 0) {
                throw new IllegalStateException();
            }
            this.m = bundle.getInt("state");
            if (this.m == 5) {
                a(false, (Bundle) null);
            }
            this.n = bundle.getBoolean("add_fragment_shown");
            this.o = (SubscriberInfo) bundle.getParcelable("user_provided_address");
            if (bundle.containsKey("dcb_tos_url")) {
                this.g = bundle.getString("dcb_tos_url");
            }
            if (bundle.containsKey("dcb_tos_version")) {
                this.h = bundle.getString("dcb_tos_version");
            }
            if (bundle.containsKey("pii_tos_url")) {
                this.z = bundle.getString("pii_tos_url");
            }
            if (bundle.containsKey("pii_tos_version")) {
                this.A = bundle.getString("pii_tos_version");
            }
            if (bundle.containsKey("error_dialog")) {
                this.t = (com.google.android.finsky.billing.carrierbilling.b.d) this.c.a(bundle, "error_dialog");
                this.t.ai = this;
            }
            if (bundle.containsKey("add_fragment")) {
                this.r = (com.google.android.finsky.billing.carrierbilling.b.a) this.c.a(bundle, "add_fragment");
                this.r.f2184a = this;
            }
            if (bundle.containsKey("edit_fragment")) {
                this.s = (k) this.c.a(bundle, "edit_fragment");
                this.s.f2189a = this;
            }
            if (bundle.containsKey("verify_dialog")) {
                this.u = new com.google.android.finsky.billing.carrierbilling.a.a.b(this.j, this.v, this.w, this.A, true);
                this.x = new d(this);
                this.u.a(bundle, this.x, this);
                this.e = this.c.a(bundle, "verify_dialog");
                if (!(this.e instanceof o)) {
                    if (!(this.e instanceof com.google.android.finsky.billing.carrierbilling.b.n)) {
                        return;
                    }
                    ((com.google.android.finsky.billing.carrierbilling.b.n) this.e).f2192a = this;
                    return;
                }
                ((o) this.e).ai = this;
            }
        }
    }

    @Override // com.google.android.finsky.billing.f
    public final void b() {
        if (this.u != null && this.x != null) {
            this.u.b(this.x, this);
        }
    }

    @Override // com.google.android.finsky.billing.f
    public final void b(Bundle bundle) {
        bundle.putInt("state", this.m);
        bundle.putBoolean("add_fragment_shown", this.n);
        if (this.t != null) {
            this.c.a(bundle, "error_dialog", this.t);
        }
        if (this.r != null) {
            this.c.a(bundle, "add_fragment", this.r);
        }
        if (this.s != null) {
            this.c.a(bundle, "edit_fragment", this.s);
        }
        if (this.e != null) {
            this.c.a(bundle, "verify_dialog", this.e);
            if (this.u != null) {
                this.u.a(bundle);
            }
        }
        if (this.o != null) {
            bundle.putParcelable("user_provided_address", this.o);
        }
        if (!TextUtils.isEmpty(this.g)) {
            bundle.putString("dcb_tos_url", this.g);
            bundle.putString("dcb_tos_version", this.h);
        }
        if (!TextUtils.isEmpty(this.z)) {
            bundle.putString("pii_tos_version", this.A);
            bundle.putString("pii_tos_url", this.z);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:202)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:103)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    final void f() {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.billing.carrierbilling.a.c.f():void");
    }

    private void a(SubscriberInfo subscriberInfo, String str, String str2) {
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            if (subscriberInfo != null) {
                i = 2;
            } else if (TextUtils.isEmpty(str2)) {
                FinskyLog.c("showTosFragment has no address and tos. wrong fragment.", new Object[0]);
                return;
            }
        } else if (subscriberInfo != null) {
            i = 3;
        } else {
            i = !TextUtils.isEmpty(str2) ? 1 : 6;
        }
        this.r = com.google.android.finsky.billing.carrierbilling.b.a.a(i, subscriberInfo, str, str2, this.y, this.k, this.i);
        this.r.f2184a = this;
        this.n = true;
        this.c.a(this.r, this.C);
    }

    private void a(ArrayList<Integer> arrayList) {
        this.s = k.a(this.k, this.f, this.o != null ? this.o : com.google.android.finsky.billing.carrierbilling.b.a(this.d), arrayList, this.i);
        this.s.f2189a = this;
        this.c.a(this.s, this.C);
    }

    private void a(String str, boolean z) {
        this.t = com.google.android.finsky.billing.carrierbilling.b.d.a(str, z);
        this.t.ai = this;
        this.c.a((r) this.t, "error");
    }

    final void a(String str, String str2, boolean z) {
        FinskyLog.c(str, new Object[0]);
        a(str2, z);
    }

    private void b(String str) {
        a(str, FinskyApp.a().getString(R.string.add_carrier_billing_error, new Object[]{this.y}), false);
    }

    private void j() {
        this.c.b(R.string.saving);
        if (this.r != null) {
            this.r.a(false);
        }
    }

    final void h() {
        this.c.S_();
        if (this.r != null) {
            this.r.a(true);
        }
    }

    @Override // com.google.android.finsky.billing.carrierbilling.b.c
    public final void a(int i) {
        this.p = i;
        if (this.r != null) {
            this.c.a(this.r);
            this.r = null;
        }
        if (i == 0) {
            f();
            return;
        }
        if (i == 2) {
            f();
        } else if (i != 1) {
            b("Invalid error code.");
        } else {
            super.c();
        }
    }

    @Override // com.google.android.finsky.billing.carrierbilling.b.p
    public final void g() {
        if (this.u != null) {
            this.u.a();
        }
        super.c();
    }

    @Override // com.google.android.finsky.billing.carrierbilling.b.e
    public final void a(boolean z) {
        if (this.u != null) {
            this.u.a();
        }
        if (z) {
            a(FinskyApp.a().getString(R.string.generic_purchase_prepare_error));
        } else {
            super.c();
        }
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        h();
        FinskyLog.c("Error received: %s", volleyError);
        a(1, volleyError.getClass().getCanonicalName());
        a(aw.a(FinskyApp.a(), volleyError), false);
    }

    @Override // com.google.android.finsky.billing.f
    public final void d() {
        super.c();
    }

    @Override // com.google.android.finsky.billing.carrierbilling.b.m
    public final void a(SubscriberInfo subscriberInfo) {
        if (this.s != null) {
            this.c.a(this.s);
            this.s = null;
        }
        if (subscriberInfo != null) {
            this.o = subscriberInfo;
            f();
        } else {
            super.c();
        }
    }
}
