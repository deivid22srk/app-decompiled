package com.google.android.finsky.billing;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.billing.giftcard.RedeemCodeResult;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.io;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.SetupWizardUtils;
import com.google.android.finsky.utils.aw;
import com.google.android.finsky.utils.cz;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m extends Fragment implements cy {

    /* renamed from: a, reason: collision with root package name */
    protected com.google.android.finsky.billing.lightpurchase.billingprofile.a f2410a;
    private String ak;

    /* renamed from: b, reason: collision with root package name */
    public com.google.android.finsky.protos.as f2411b;
    public Account c;
    public com.google.android.finsky.apkg.i d;
    public View e;
    public View f;
    protected View g;
    private String i;
    private final n h = new n(this, 0);
    private int ai = -1;
    private int aj = -1;
    private boolean al = true;

    public abstract int A();

    public abstract int B();

    public abstract int C();

    public abstract int D();

    public abstract int F();

    public abstract byte[] G();

    public abstract int H();

    public abstract void a(RedeemCodeResult redeemCodeResult);

    public abstract void a(String str);

    public abstract void a(List<com.google.android.finsky.billing.lightpurchase.billingprofile.g> list);

    public abstract void a(io[] ioVarArr, byte[] bArr);

    public abstract void c(String str);

    public abstract void d(String str);

    public abstract void e(String str);

    public abstract void u();

    public abstract void w();

    public abstract Intent z();

    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        this.c = (Account) this.r.getParcelable("BillingProfileFragment.account");
        this.i = this.r.getString("BillingProfileFragment.purchaseContextToken");
        if (bundle != null) {
            this.f2411b = (com.google.android.finsky.protos.as) ParcelableProto.a(bundle, "BillingProfileFragment.profile");
            if (this.f2411b != null) {
                this.al = true;
            }
            this.ai = bundle.getInt("BillingProfileFragment.lastBillingProfileStateInstance", -1);
            this.aj = bundle.getInt("BillingProfileFragment.lastCarrierBillingStateInstance", -1);
            this.ak = bundle.getString("PurchaseFlowBillingProfileFragment.storedValueInstrumentId");
        }
        this.d = FinskyApp.a().c(this.c);
    }

    @Override // android.support.v4.app.Fragment
    public void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("BillingProfileFragment.profile", ParcelableProto.a(this.f2411b));
        bundle.putInt("BillingProfileFragment.lastBillingProfileStateInstance", this.ai);
        bundle.putInt("BillingProfileFragment.lastCarrierBillingStateInstance", this.aj);
        bundle.putString("PurchaseFlowBillingProfileFragment.storedValueInstrumentId", this.ak);
    }

    @Override // android.support.v4.app.Fragment
    public void a(View view, Bundle bundle) {
        super.a(view, bundle);
        if (this.e == null) {
            throw new IllegalStateException("mProfileView not set up.");
        }
        if (this.f == null) {
            throw new IllegalStateException("mProgressIndicator not set up.");
        }
        this.f2410a = (com.google.android.finsky.billing.lightpurchase.billingprofile.a) this.B.a("BillingProfileFragment.billingProfileSidecar");
        if (this.f2410a == null) {
            this.f2410a = com.google.android.finsky.billing.lightpurchase.billingprofile.a.a(this.c, this.i, y(), z(), H(), A(), B(), F(), C(), D(), E(), G());
            this.B.a().a(this.f2410a, "BillingProfileFragment.billingProfileSidecar").b();
        }
        v();
    }

    @Override // android.support.v4.app.Fragment
    public final void o() {
        super.o();
        v();
        this.f2410a.a(this.h);
    }

    @Override // android.support.v4.app.Fragment
    public final void p() {
        this.f2410a.a((com.google.android.finsky.epkg.v) null);
        super.p();
    }

    @Override // android.support.v4.app.Fragment
    public final void d() {
        super.d();
        this.al = true;
        this.ai = -1;
        this.aj = -1;
    }

    protected final void v() {
        com.google.android.finsky.billing.lightpurchase.billingprofile.g a2;
        if (this.al) {
            this.al = false;
            if (this.f2411b != null && a(this.f2411b.f3605a)) {
                x();
                for (io ioVar : this.f2411b.f3605a) {
                    if (ioVar.f == 7 && ioVar.o != null && ioVar.o.f4245a == 33) {
                        this.ak = ioVar.f3961a;
                    }
                }
                a(this.f2411b.f3605a, this.f2411b.e);
                ArrayList a3 = cz.a(this.f2411b.d.length);
                android.support.v4.app.t f = f();
                boolean z = f.getPackageManager().checkPermission("android.permission.SEND_SMS", f.getPackageName()) == 0;
                for (com.google.android.finsky.protos.at atVar : this.f2411b.d) {
                    if ((atVar.f3607a != 2 || z) && (a2 = this.f2410a.a(atVar, this.f2411b.e, this)) != null) {
                        a3.add(a2);
                    }
                }
                a(a3);
                b(this.f2411b.l);
                this.f.setVisibility(8);
                if (this.g != null) {
                    this.g.setVisibility(8);
                }
                this.e.setVisibility(0);
                this.e.requestFocus();
                w();
            }
        }
    }

    protected void b(String str) {
    }

    protected void x() {
    }

    public boolean a(io[] ioVarArr) {
        return true;
    }

    public SetupWizardUtils.SetupWizardParams y() {
        return null;
    }

    protected int E() {
        return -1;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(cy cyVar) {
        FinskyLog.e("Not using tree impressions.", new Object[0]);
    }

    static /* synthetic */ void b(m mVar) {
        mVar.u();
        mVar.e.setVisibility(8);
        mVar.f.setVisibility(0);
        if (mVar.g == null) {
            return;
        }
        mVar.g.setVisibility(8);
    }

    static /* synthetic */ void a(m mVar, com.google.android.finsky.protos.as asVar) {
        mVar.f2411b = asVar;
        mVar.al = true;
        mVar.v();
    }

    static /* synthetic */ void d(m mVar) {
        switch (mVar.f2410a.at) {
            case 3:
                mVar.a(mVar.f2410a.f2323b);
                break;
            case 4:
                mVar.a(aw.a(mVar.f(), mVar.f2410a.c));
                break;
            default:
                FinskyLog.d("Don't know how to handle error substate %d, cancel.", Integer.valueOf(mVar.f2410a.at));
                mVar.a(mVar.f_(R.string.error));
                break;
        }
    }
}
