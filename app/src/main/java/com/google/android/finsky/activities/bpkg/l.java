package com.google.android.finsky.activities.bpkg;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.apkg.ai;
import com.google.android.finsky.activities.gn;
import com.google.android.finsky.activities.gp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.RedeemCodeActivity;
import com.google.android.finsky.billing.refund.RefundActivity;
import com.google.android.finsky.gpkg.aq;
import com.google.android.finsky.layout.ContentFrame;
import com.google.android.finsky.layout.bi;
import com.google.android.finsky.layout.bv;
import com.google.android.finsky.layout.ce;
import com.google.android.finsky.layout.cr;
import com.google.android.finsky.layout.el;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.protos.jz;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.utils.dh;
import com.google.android.finsky.utils.jb;
import com.google.android.finsky.utils.ji;

/* loaded from: classes.dex */
public final class l extends com.google.android.finsky.epkg.q implements gp, com.google.android.finsky.gpkg.o, ce, cr, el, ji {
    public com.google.android.finsky.gpkg.h ai;
    public boolean aj;
    public String c;
    public RecyclerView d;
    public a e;
    public x f;
    public jz g;
    public long h;
    public boolean i;

    /* renamed from: a, reason: collision with root package name */
    public final ai f1586a = com.google.android.finsky.apkg.i.a(10);

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f1587b = new Bundle();

    public static l G_() {
        l lVar = new l();
        lVar.a("finsky.PageFragment.toc", FinskyApp.a().g);
        return lVar;
    }

    @Override // com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        k();
        android.support.v4.app.ad adVar = this.B;
        Fragment a2 = adVar.a("billing_profile_sidecar");
        if (a2 != null) {
            adVar.a().a(a2).b();
        }
    }

    @Override // com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = super.a(layoutInflater, viewGroup, bundle);
        this.i = false;
        FinskyHeaderListLayout finskyHeaderListLayout = (FinskyHeaderListLayout) this.av;
        finskyHeaderListLayout.a(new m(this, finskyHeaderListLayout.getContext()));
        this.c = viewGroup.getContext().getString(R.string.side_drawer_my_account);
        this.d = (RecyclerView) this.av.findViewById(R.id.recycler_view);
        this.d.setLayoutManager(new LinearLayoutManager());
        this.d.setAdapter(new com.google.android.finsky.adapters.ab());
        this.ai = FinskyApp.a().p;
        this.ai.a(this);
        jb.a(this);
        return a2;
    }

    @Override // com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        o_();
        if (dh.a(this.h)) {
            this.g = null;
        }
        if (!(this.g != null)) {
            y();
            this.au.a();
        } else {
            u();
        }
        this.at.p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final bv a(ContentFrame contentFrame) {
        return new bi(contentFrame, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final int w() {
        return R.layout.header_list_container;
    }

    @Override // com.google.android.finsky.epkg.q
    public final void o_() {
        this.ao.b_(this.c);
        this.ao.a(0, true);
        this.ao.s_();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final void y() {
        if (this.g == null) {
            this.aq.a(new n(this), new o(this));
        } else {
            O();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final int E() {
        return 3;
    }

    public void P() {
        b(0);
        b(1);
        b(2);
    }

    public void b(int i) {
        if (this.f.a(i) && !this.f.b(i).a()) {
            x xVar = this.f;
            d dVar = new d(this.e, i);
            if (!xVar.f1601a.containsKey(Integer.valueOf(i))) {
                return;
            }
            xVar.f1601a.get(Integer.valueOf(i)).a(dVar, false);
        }
    }

    @Override // com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final void d() {
        this.i = true;
        if (this.d != null) {
            this.d = null;
        }
        if (this.e != null) {
            this.e.d();
            this.e = null;
        }
        this.ai.b(this);
        jb.b(this);
        super.d();
    }

    @Override // com.google.android.finsky.layout.cr
    public final void a(byte[] bArr, String str, int i) {
        a(RefundActivity.a(this.aq.c(), bArr, str, i), 1);
    }

    @Override // com.google.android.finsky.activities.gp
    public final void a(int i, Bundle bundle) {
        if (i == 1) {
            com.google.android.finsky.utils.j.a(this.B, bundle.getString("package_name"), bundle.getString("account_name"), true, new p(this));
        }
    }

    @Override // com.google.android.finsky.activities.gp
    public final void b(int i, Bundle bundle) {
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.f1586a;
    }

    @Override // com.google.android.finsky.gpkg.o
    public final void M_() {
    }

    @Override // com.google.android.finsky.gpkg.o
    public final void L_() {
        Q();
    }

    @Override // com.google.android.finsky.utils.ji
    public final void H_() {
        this.aj = false;
        if (this.e != null) {
            this.e.c();
        }
    }

    @Override // com.google.android.finsky.utils.ji
    public final void I_() {
        this.aj = false;
        if (this.e != null) {
            this.e.c();
        }
    }

    @Override // com.google.android.finsky.layout.ce
    public final void H() {
        a(new Intent("com.google.android.gms.kids.familymanagement.CREATE").setPackage(com.google.android.finsky.cpkg.d.eC.b()).putExtra("accountName", FinskyApp.a().j()).putExtra("appId", "play.and"), 3);
    }

    @Override // com.google.android.finsky.layout.ce
    public final void I() {
        a(bb.a((Activity) f(), FinskyApp.a().j()), 2);
    }

    @Override // com.google.android.finsky.layout.ce
    public final void J() {
        this.as.o();
    }

    @Override // com.google.android.finsky.layout.ce
    public final boolean K() {
        return this.aj;
    }

    @Override // android.support.v4.app.Fragment
    public final void a(int i, int i2, Intent intent) {
        switch (i) {
            case 1:
                Q();
                break;
            case 2:
            case 3:
                if (bb.a(i2, intent)) {
                    FinskyLog.a("Requerying family state by refreshing user settings.", new Object[0]);
                    this.aj = true;
                    jb.a(FinskyApp.a().j(), 3);
                    this.e.c();
                    com.google.android.finsky.billing.lightpurchase.billingprofile.a aVar = (com.google.android.finsky.billing.lightpurchase.billingprofile.a) this.B.a("billing_profile_sidecar");
                    if (aVar != null) {
                        aVar.u();
                        break;
                    } else {
                        FinskyLog.e("Billing profile sidecar not found!", new Object[0]);
                        break;
                    }
                }
                break;
            default:
                super.a(i, i2, intent);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        if (this.e == null) {
            return;
        }
        this.e.f774a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        this.au.b();
        u();
        this.f = new x(this.g, this.aq);
        this.e.a(this.f);
        P();
        this.h = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final void u() {
        com.google.android.finsky.billing.lightpurchase.billingprofile.a aVar;
        com.google.android.finsky.billing.lightpurchase.billingprofile.a aVar2 = (com.google.android.finsky.billing.lightpurchase.billingprofile.a) this.B.a("billing_profile_sidecar");
        if (aVar2 == null) {
            Account b2 = this.aq.b();
            aVar = com.google.android.finsky.billing.lightpurchase.billingprofile.a.a(b2, null, null, RedeemCodeActivity.a(b2.name, 5), 4, 380, 381, 384, 382, 383, 385, null);
            f().d().a().a(aVar, "billing_profile_sidecar").b();
        } else {
            aVar = aVar2;
        }
        if (this.e == null) {
            this.e = new a(this.ap, this.aq, this.ar, this.as, this, this, this, aVar, this.d, this, this.f1587b);
            aVar.a(new c(this.e));
            this.d.setAdapter(this.e);
        }
        if (this.f != null) {
            this.e.a(this.f);
            P();
        }
    }

    @Override // com.google.android.finsky.layout.cr
    public final void a(String str, String str2) {
        android.support.v4.app.ad adVar = this.B;
        if (adVar.a("refund_confirm") == null) {
            gn gnVar = new gn();
            gnVar.a(R.string.uninstall_refund_confirmation_body).d(R.string.yes).e(R.string.no);
            Bundle bundle = new Bundle();
            bundle.putString("package_name", str);
            bundle.putString("account_name", str2);
            gnVar.a(this, 1, bundle);
            gnVar.b().a(adVar, "refund_confirm");
        }
    }

    @Override // com.google.android.finsky.layout.el
    public final void a(Document document, aq aqVar) {
        com.google.android.finsky.utils.z.a(this.B, document, aqVar);
    }
}
