package com.google.android.finsky.billing.lightpurchase.billingprofile.instruments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ap;
import android.support.v4.app.r;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.billing.ar;
import com.google.android.finsky.billing.f;
import com.google.android.finsky.billing.g;
import com.google.android.finsky.billing.h;
import com.google.android.finsky.billing.i;
import com.google.android.finsky.billing.j;
import com.google.android.finsky.billing.v;
import com.google.android.finsky.setup.SetupWizardNavBar;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.SetupWizardUtils;

/* loaded from: classes.dex */
public abstract class b extends c implements g, i, j {
    protected View k;
    protected TextView l;
    protected ViewGroup m;
    protected Bundle n;
    public SetupWizardNavBar o;
    private f r;
    private h s;
    private boolean t;
    private ar u;
    private boolean v;

    protected abstract f i();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c, com.google.android.finsky.billing.lightpurchase.a, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k = View.inflate(this, j(), null);
        this.l = (TextView) this.k.findViewById(R.id.title);
        setContentView(this.k);
        this.m = (ViewGroup) findViewById(R.id.content_frame);
        this.o = k() == 1 ? SetupWizardUtils.a(this) : null;
        if (bundle != null) {
            this.n = bundle.getBundle("InstrumentActivity.saved_flow_state");
            this.u = (ar) a(bundle, "InstrumentActivity.progress_dialog");
            if (this.u != null) {
                this.u.a(false);
                this.u = null;
            }
            if (bundle.containsKey("InstrumentActivity.title")) {
                this.l.setText(bundle.getString("InstrumentActivity.title"));
            }
        }
    }

    protected int j() {
        return R.layout.light_add_instrument_activity;
    }

    protected int k() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c, android.support.v4.app.t, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.r != null) {
            this.r.b();
        }
        this.t = false;
        if (this.v) {
            S_();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c, com.google.android.finsky.billing.lightpurchase.a, android.support.v4.app.t, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.m.setVisibility(8);
        this.r = null;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c, android.support.v4.app.t, android.app.Activity
    public void onBackPressed() {
        if (this.r != null) {
            this.q.a(600, (byte[]) null, this);
            if (this.r.e()) {
                this.r.d();
                return;
            } else {
                FinskyLog.a("Cannot interrupt the current flow.", new Object[0]);
                return;
            }
        }
        if (this.s != null) {
            this.q.a(600, (byte[]) null, this);
            if (this.s.u()) {
                this.s.v();
                return;
            } else {
                FinskyLog.a("Cannot interrupt the current flow.", new Object[0]);
                return;
            }
        }
        super.onBackPressed();
    }

    protected final void a(Bundle bundle) {
        this.s = (h) d().a("InstrumentActivity.billing_flow_fragment");
        if (this.s == null) {
            this.s = null;
            if (this.s != null) {
                d().a().a(this.m.getId(), this.s, "InstrumentActivity.billing_flow_fragment").b();
            } else {
                this.r = i();
            }
            if (this.r == null && this.s == null) {
                FinskyLog.e("Couldn't instantiate BillingFlow for FOP.", new Object[0]);
                finish();
                return;
            }
            if (this.r != null) {
                if (bundle == null) {
                    this.r.a();
                } else {
                    this.r.a(bundle);
                }
            }
            this.m.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.t = true;
        super.onSaveInstanceState(bundle);
        if (this.r != null) {
            Bundle bundle2 = new Bundle();
            this.r.b(bundle2);
            bundle.putBundle("InstrumentActivity.saved_flow_state", bundle2);
        }
        if (this.u != null) {
            a(bundle, "InstrumentActivity.progress_dialog", this.u);
        }
        if (!TextUtils.isEmpty(this.l.getText())) {
            bundle.putString("InstrumentActivity.title", this.l.getText().toString());
        }
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        this.l.setText(charSequence);
    }

    @Override // com.google.android.finsky.billing.g
    public final void a(Fragment fragment, String str) {
        if (!this.t) {
            setTitle(str);
            ap a2 = d().a();
            a2.a(R.id.content_frame, fragment);
            a2.c();
            if (this.o != null) {
                this.o.a();
            }
        }
    }

    @Override // com.google.android.finsky.billing.g
    public final void a(r rVar, String str) {
        if (!this.t) {
            ap a2 = d().a();
            Fragment a3 = d().a(str);
            if (a3 != null) {
                a2.a(a3);
            }
            a2.a((String) null);
            rVar.a(d(), str);
        }
    }

    @Override // com.google.android.finsky.billing.g
    public final void a(Fragment fragment) {
        if (!this.t) {
            ap a2 = d().a();
            a2.a(fragment);
            a2.b();
        }
    }

    @Override // com.google.android.finsky.billing.g
    public final void a(Bundle bundle, String str, Fragment fragment) {
        d().a(bundle, str, fragment);
    }

    @Override // com.google.android.finsky.billing.g
    public final Fragment a(Bundle bundle, String str) {
        return d().a(bundle, str);
    }

    @Override // com.google.android.finsky.billing.j
    public final void a(boolean z, Bundle bundle) {
        int i = z ? 0 : -1;
        Intent intent = new Intent();
        intent.putExtra("billing_flow_error", false);
        intent.putExtra("billing_flow_canceled", z);
        if (!z && bundle != null && bundle.containsKey("instrument_id")) {
            intent.putExtra("instrument_id", bundle.getString("instrument_id"));
        }
        if (!z) {
            v.a(this.p);
        }
        setResult(i, intent);
        finish();
    }

    public void b(int i) {
        if (!this.t) {
            this.u = ar.b(i);
            this.u.a(d(), "progress_dialog");
        }
    }

    public void S_() {
        this.v = false;
        if (this.u != null) {
            if (this.t) {
                this.v = true;
            } else {
                this.u.a(false);
                this.u = null;
            }
        }
    }

    @Override // com.google.android.finsky.billing.j
    public final void a(String str) {
        Intent intent = new Intent();
        intent.putExtra("billing_flow_error", true);
        intent.putExtra("billing_flow_error_message", str);
        setResult(0, intent);
        finish();
    }

    @Override // com.google.android.finsky.billing.i
    public final void a_(Bundle bundle) {
        a(false, bundle);
    }

    @Override // com.google.android.finsky.billing.i
    public final void a() {
        a(true, (Bundle) null);
    }

    @Override // com.google.android.finsky.billing.i
    public final void b(String str) {
        a(str);
    }
}
