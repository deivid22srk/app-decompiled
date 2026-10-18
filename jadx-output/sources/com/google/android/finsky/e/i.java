package com.google.android.finsky.e;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.aj;
import com.google.android.finsky.activities.gn;
import com.google.android.finsky.activities.gp;
import com.google.android.finsky.auth.AuthState;
import com.google.android.finsky.layout.play.ad;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.ct;
import com.google.android.finsky.utils.ik;
import com.google.android.finsky.utils.jm;

/* loaded from: classes.dex */
public final class i extends Fragment implements View.OnClickListener, gp, v {

    /* renamed from: a, reason: collision with root package name */
    public k f2756a;
    private com.google.android.finsky.a.i ai;
    private com.google.android.finsky.billing.lightpurchase.b aj;
    private View c;
    private String d;
    private AuthState e;
    private boolean f;
    private int g;
    private EditText h;

    /* renamed from: b, reason: collision with root package name */
    private com.android.volley.l<?> f2757b = null;
    private cy i = new ad(314);

    public static i a(String str, boolean z, AuthState authState) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putParcelable("GaiaAuthFragment_authState", authState);
        bundle.putBoolean("GaiaAuthFragment_showWarning", z);
        i iVar = new i();
        iVar.f(bundle);
        return iVar;
    }

    @Override // android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.d = this.r.getString("authAccount");
        this.e = (AuthState) this.r.getParcelable("GaiaAuthFragment_authState");
        this.f = this.r.getBoolean("GaiaAuthFragment_showWarning");
        if (bundle != null) {
            this.g = bundle.getInt("GaiaAuthFragment_retryCount");
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putInt("GaiaAuthFragment_retryCount", this.g);
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.gaia_auth_fragment, viewGroup, false);
        this.c = inflate;
        this.ai = FinskyApp.a().f(this.d);
        if (bundle == null) {
            this.i.getPlayStoreUiElement().e = new aj();
            this.i.getPlayStoreUiElement().e.h = this.e.b();
            this.ai.a(0L, this.i);
        }
        ((TextView) inflate.findViewById(R.id.challenge_description)).setText(jm.a(this.d, e()));
        TextView textView = (TextView) inflate.findViewById(R.id.challenge_title);
        this.h = (EditText) inflate.findViewById(this.e.a() == 2 ? R.id.pin : R.id.password);
        textView.setText(this.e.c());
        this.h.setVisibility(0);
        this.h.setOnEditorActionListener(new j(this));
        TextView textView2 = (TextView) inflate.findViewById(R.id.challenge_footer);
        Spanned fromHtml = Html.fromHtml(a(this.e.d(), this.e.a(this.d)));
        if (fromHtml != null) {
            textView2.setText(fromHtml);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        if (this.f) {
            TextView textView3 = (TextView) inflate.findViewById(R.id.opt_out_info);
            textView3.setText(Html.fromHtml(a(R.string.auth_challenge_opt_out_info, com.google.android.finsky.c.d.K.b())));
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
            textView3.setVisibility(0);
        }
        Button button = (Button) inflate.findViewById(R.id.positive_button);
        button.setText(R.string.ok);
        button.setOnClickListener(this);
        Button button2 = (Button) inflate.findViewById(R.id.negative_button);
        button2.setText(R.string.cancel);
        button2.setOnClickListener(this);
        return inflate;
    }

    @Override // android.support.v4.app.Fragment
    public final void g_() {
        this.aj = (com.google.android.finsky.billing.lightpurchase.b) f().d().a("AuthChallengeStep.sidecar");
        if (this.aj == null) {
            this.aj = com.google.android.finsky.billing.lightpurchase.b.a(this.d, this.e);
            f().d().a().a(this.aj, "AuthChallengeStep.sidecar").b();
        }
        this.aj.a(this);
        super.g_();
    }

    @Override // android.support.v4.app.Fragment
    public final void o() {
        super.o();
        ik.a(this.c.getContext(), f_(this.e.c()), this.c);
        ik.a((Activity) f(), this.h);
    }

    @Override // android.support.v4.app.Fragment
    public final void h_() {
        if (this.aj != null) {
            this.aj.a((v) null);
        }
        super.h_();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (view.getId()) {
            case R.id.negative_button /* 2131886371 */:
                a(266, false);
                if (this.f2756a != null) {
                    this.f2756a.h();
                    break;
                }
                break;
            case R.id.positive_button /* 2131886372 */:
                a(false);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        a(265, z);
        String obj = this.h.getText().toString();
        this.h.setEnabled(false);
        this.aj.a(this.d, obj, (ct) null);
    }

    @Override // android.support.v4.app.Fragment
    public final void d() {
        if (this.f2757b != null) {
            this.f2757b.d();
        }
        super.d();
    }

    private void u() {
        int i;
        this.g++;
        b(false);
        if (this.g < com.google.android.finsky.c.d.cR.b().intValue()) {
            this.h.setText("");
            this.h.setEnabled(true);
            ik.a((Activity) f(), this.h);
            EditText editText = this.h;
            AuthState authState = this.e;
            if (authState.f2014b) {
                throw new IllegalStateException("Call for fingerprint is not supported");
            }
            if (authState.f2013a) {
                i = R.string.google_pin_hint;
            } else {
                i = R.string.google_password_hint;
            }
            ik.a(editText, f_(i), this.aj.f2313a);
            return;
        }
        gn gnVar = new gn();
        gnVar.b(a(this.e.e(), this.e.a(this.d))).d(R.string.ok).a(this, 1, null);
        gnVar.b().a(this.B, "GaiaAuthFragment.errorDialog");
    }

    private void v() {
        this.h.setEnabled(true);
        this.h.setError(null);
        if (this.f2756a != null) {
            this.f2756a.g();
        }
        b(true);
    }

    @Override // android.support.v4.app.Fragment
    public final void a(int i, int i2, Intent intent) {
        if (i == 100) {
            if (i2 == -1) {
                v();
                return;
            } else {
                u();
                return;
            }
        }
        super.a(i, i2, intent);
    }

    @Override // com.google.android.finsky.activities.gp
    public final void a(int i, Bundle bundle) {
        if (i == 1) {
            this.f2756a.h();
        }
    }

    @Override // com.google.android.finsky.activities.gp
    public final void b(int i, Bundle bundle) {
        if (i == 1) {
            this.f2756a.h();
        }
    }

    private void b(boolean z) {
        this.ai.b(new com.google.android.finsky.a.b(502).a(z).a(this.e.b()).f1473a);
    }

    private void a(int i, boolean z) {
        aj ajVar = new aj();
        if (z) {
            ajVar.f = true;
            ajVar.g = true;
        }
        ajVar.h = this.e.b();
        this.ai.a(i, ajVar, this.i);
    }

    @Override // com.google.android.finsky.e.v
    public final void a(u uVar) {
        Object[] objArr = {Integer.valueOf(uVar.as), Integer.valueOf(uVar.au)};
        switch (this.aj.as) {
            case 2:
                v();
                break;
            case 3:
                if (this.aj.at == 1) {
                    this.aj.a(this.d, this.h.getText().toString());
                    break;
                } else {
                    u();
                    break;
                }
        }
    }
}
