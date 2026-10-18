package com.google.android.finsky.activities.b;

import android.accounts.Account;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.RedeemCodeActivity;
import com.google.android.finsky.layout.ContentFrame;
import com.google.android.finsky.layout.bi;
import com.google.android.finsky.layout.bv;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.layout.play.PlayRecyclerView;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.as;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.av;
import com.google.android.finsky.utils.aw;

/* loaded from: classes.dex */
public final class ad extends com.google.android.finsky.e.q implements View.OnClickListener, com.google.android.finsky.e.v {
    private FloatingActionButton ai;
    private aa aj;

    /* renamed from: b, reason: collision with root package name */
    private cy f1568b;
    private cy c;
    private int d;
    private com.google.android.finsky.billing.lightpurchase.billingprofile.a e;
    private as g;
    private com.google.android.finsky.a.i h;
    private PlayRecyclerView i;

    /* renamed from: a, reason: collision with root package name */
    private final ai f1567a = com.google.android.finsky.a.i.a(19);
    private int f = -1;

    public static ad K_() {
        return new ad();
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        k();
        this.h = FinskyApp.a().h();
        this.f1568b = new com.google.android.finsky.layout.play.ad(2621, this);
        this.c = new com.google.android.finsky.layout.play.ad(2622, this);
        if (av.a()) {
            this.d = 1;
            if (bundle == null) {
                FinskyApp.a().h().b(2630, null, this.c);
            }
        } else {
            this.d = 0;
        }
        android.support.v4.app.ad adVar = this.B;
        Fragment a2 = adVar.a("billing_profile_sidecar");
        if (a2 != null) {
            adVar.a().a(a2).b();
        }
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = super.a(layoutInflater, viewGroup, bundle);
        FinskyHeaderListLayout finskyHeaderListLayout = (FinskyHeaderListLayout) this.av;
        finskyHeaderListLayout.a(new ae(this, finskyHeaderListLayout.getContext()));
        this.i = (PlayRecyclerView) this.av.findViewById(R.id.recycler_view);
        this.i.setSaveEnabled(false);
        this.i.setLayoutManager(new LinearLayoutManager());
        this.i.setAdapter(new com.google.android.finsky.adapters.ab());
        this.ai = (FloatingActionButton) this.av.findViewById(R.id.floating_action_button);
        this.ai.setOnClickListener(this);
        return a2;
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        o_();
        if (this.e == null) {
            Account b2 = this.aq.b();
            this.e = com.google.android.finsky.billing.lightpurchase.billingprofile.a.a(b2, null, null, RedeemCodeActivity.a(b2.name, 5), 4, 380, 381, 384, 382, 383, 385, null);
            this.B.a().a(this.e, "billing_profile_sidecar").b();
            this.e.a(this);
        }
        if (H()) {
            u();
        }
        this.at.p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final bv a(ContentFrame contentFrame) {
        return new bi(contentFrame, this);
    }

    @Override // com.google.android.finsky.e.q
    public final void o_() {
        switch (this.d) {
            case 0:
                this.ao.b_(f_(R.string.payment_methods));
                break;
            case 1:
                this.ao.b_(f_(R.string.add_payment_method));
                break;
            default:
                throw new IllegalStateException("Unknown view state: " + this.d);
        }
        this.ao.a(0, true);
        this.ao.s_();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final int w() {
        return R.layout.header_list_container;
    }

    private boolean H() {
        return this.g != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final void y() {
        this.g = null;
        this.e.u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final void u() {
        if (this.aj == null) {
            this.aj = new aa(this.ap, this.e, this.f1568b, this.c);
            this.i.setAdapter(this.aj);
            if (av.a()) {
                aa aaVar = this.aj;
                aaVar.f = true;
                aaVar.g = 1;
            }
        }
        switch (this.d) {
            case 0:
                if (P()) {
                    J();
                    return;
                } else {
                    K();
                    return;
                }
            case 1:
                O();
                return;
            default:
                throw new IllegalStateException("Unknown view state: " + this.d);
        }
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d() {
        if (this.e != null) {
            this.e.a((com.google.android.finsky.e.v) null);
        }
        this.i = null;
        this.ai = null;
        this.aj = null;
        super.d();
    }

    @Override // com.google.android.finsky.e.q
    public final boolean G() {
        if (this.d != 1 || !H() || !P()) {
            return super.G();
        }
        I();
        return true;
    }

    @Override // com.google.android.finsky.e.q, com.google.android.finsky.layout.by
    public final void n_() {
        FinskyApp.a().h().a(2628, (byte[]) null, this);
        super.n_();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final int E() {
        return 3;
    }

    private void I() {
        this.d = 0;
        o_();
        if (H()) {
            J();
        }
    }

    private void J() {
        if (this.g.f3605a == null || this.g.f3605a.length == 0) {
            throw new IllegalArgumentException("No existing instruments to show.");
        }
        aa aaVar = this.aj;
        if (aaVar.f) {
            aaVar.f = false;
            aaVar.g = 0;
        }
        this.aj.a(this.g.f3605a);
        this.au.b();
        this.ai.a(true);
        this.h.a(2624, this.f1568b);
    }

    private void K() {
        this.d = 1;
        o_();
        if (H()) {
            O();
        }
    }

    private void O() {
        if (this.g.d == null || this.g.d.length == 0) {
            throw new IllegalArgumentException("No creatable instruments to show.");
        }
        this.aj.a(this.g.d);
        this.au.b();
        this.ai.b(true);
    }

    private boolean P() {
        if (H()) {
            return this.g.f3605a != null && this.g.f3605a.length > 0;
        }
        throw new IllegalStateException("Cannot check for existing instruments without a billing profile.");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.ai) {
            this.h.a(2624, (byte[]) null, this.f1568b);
            K();
        } else {
            FinskyLog.e("Click received on unknown view: " + view, new Object[0]);
        }
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.f1567a;
    }

    @Override // com.google.android.finsky.e.v
    public final void a(com.google.android.finsky.e.u uVar) {
        if (uVar.au != this.f) {
            this.f = uVar.au;
            switch (uVar.as) {
                case 0:
                    y();
                    break;
                case 1:
                    N();
                    this.ai.b(true);
                    break;
                case 2:
                    this.g = this.e.f2322a;
                    u();
                    break;
                case 3:
                    switch (uVar.at) {
                        case 3:
                            e(Html.fromHtml(this.e.f2323b).toString());
                            break;
                        case 4:
                            e(aw.a(this.ap, this.e.c));
                            break;
                        default:
                            FinskyLog.c("Unhandled state: %s substate: %s", Integer.valueOf(uVar.as), Integer.valueOf(uVar.at));
                            e(f_(R.string.error));
                            break;
                    }
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    y();
                    I();
                    break;
                default:
                    FinskyLog.c("Unhandled state: " + uVar.as, new Object[0]);
                    break;
            }
        }
    }
}
