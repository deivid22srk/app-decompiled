package com.google.android.finsky.billing.lightpurchase.c;

import android.accounts.Account;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.auth.AuthState;
import com.google.android.finsky.billing.lightpurchase.PurchaseFragment;
import com.google.android.finsky.layout.AuthChallengeDialogDocumentInfoLayout;
import com.google.android.finsky.protos.cl;
import com.google.android.finsky.protos.ct;
import com.google.android.finsky.protos.cv;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.ai;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.ik;
import com.google.android.play.utils.UrlSpanUtils;

/* loaded from: classes.dex */
public final class b extends ab implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public int f2346a;
    private cl aj;
    private int ak;
    private boolean al;
    private TextView am;
    private Button an;
    private CheckBox ao;
    private TextView ap;
    private int aq;
    private r ar;
    private CheckBox as;
    private boolean at;
    private com.google.android.finsky.a.i au;

    public b() {
        super(750);
        this.f2346a = -1;
    }

    public static b a(int i, Account account, cl clVar, AuthState authState) {
        Bundle bundle = new Bundle();
        bundle.putInt("AuthChallengeStep.backend", i);
        bundle.putParcelable("account", account);
        bundle.putParcelable("AuthChallengeStep.challenge", ParcelableProto.a(clVar));
        bundle.putParcelable("PurchaseAuthenticationChallengeBaseStep.authState", authState);
        b bVar = new b();
        bVar.c = authState;
        bVar.f(bundle);
        return bVar;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.c.ab, com.google.android.finsky.billing.lightpurchase.b.f, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.aj = (cl) ParcelableProto.a(this.r, "AuthChallengeStep.challenge");
        this.al = false;
        this.at = false;
        this.au = FinskyApp.a().c(((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).i);
        if (bundle != null) {
            this.ak = bundle.getInt("AuthChallengeStep.retryCount");
            this.al = bundle.getBoolean("AuthChallengeStep.optOutSelected");
            this.at = bundle.getBoolean("AuthChallengeStep.fingerprintOptInSelected");
            this.f2346a = bundle.getInt("AuthChallengeStep.PurchaseAuthBeforeManageSettings");
        }
        this.aq = this.r.getInt("AuthChallengeStep.backend");
    }

    @Override // com.google.android.finsky.billing.lightpurchase.c.ab, com.google.android.finsky.billing.lightpurchase.b.f, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putInt("AuthChallengeStep.retryCount", this.ak);
        bundle.putBoolean("AuthChallengeStep.optOutSelected", this.al);
        bundle.putBoolean("AuthChallengeStep.fingerprintOptInSelected", this.at);
        bundle.putInt("AuthChallengeStep.PurchaseAuthBeforeManageSettings", this.f2346a);
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        this.g = layoutInflater.inflate(this.f ? R.layout.light_purchase_password_confirm_restyled : R.layout.light_purchase_password_confirm, viewGroup, false);
        if (this.f) {
            if (!TextUtils.isEmpty(this.aj.p)) {
                TextView textView = (TextView) this.g.findViewById(R.id.item_title);
                textView.setText(this.aj.p);
                textView.setVisibility(0);
            }
            if (!TextUtils.isEmpty(this.aj.r)) {
                TextView textView2 = (TextView) this.g.findViewById(R.id.item_price);
                textView2.setText(this.aj.r);
                textView2.setTextColor(ai.b(f(), this.aq));
                textView2.setVisibility(0);
            }
        } else {
            AuthChallengeDialogDocumentInfoLayout authChallengeDialogDocumentInfoLayout = (AuthChallengeDialogDocumentInfoLayout) this.g.findViewById(R.id.item_info);
            String str = this.aj.p;
            String str2 = this.aj.r;
            if (TextUtils.isEmpty(str)) {
                authChallengeDialogDocumentInfoLayout.f2925a.setVisibility(8);
                z = false;
            } else {
                authChallengeDialogDocumentInfoLayout.f2925a.setText(str);
                authChallengeDialogDocumentInfoLayout.f2925a.setVisibility(0);
                z = true;
            }
            if (TextUtils.isEmpty(str2)) {
                authChallengeDialogDocumentInfoLayout.f2926b.setVisibility(8);
            } else {
                authChallengeDialogDocumentInfoLayout.f2926b.setText(str2);
                authChallengeDialogDocumentInfoLayout.f2926b.setVisibility(0);
                z = true;
            }
            authChallengeDialogDocumentInfoLayout.setVisibility(z ? 0 : 8);
            if (!TextUtils.isEmpty(this.aj.p) || !TextUtils.isEmpty(this.aj.r) || !TextUtils.isEmpty(this.aj.t)) {
                this.g.findViewById(R.id.challenge_context).setVisibility(0);
            }
        }
        a(((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).i.name, this.aj.t, this.c.c());
        this.ap = (TextView) this.g.findViewById(R.id.opt_out_info);
        this.ao = (CheckBox) this.g.findViewById(R.id.opt_out_checkbox);
        if (!TextUtils.isEmpty(this.aj.v)) {
            TextView textView3 = (TextView) this.g.findViewById(R.id.challenge_description_text);
            textView3.setText(Html.fromHtml(this.aj.v));
            textView3.setVisibility(0);
        }
        if (ik.c(this.g.getContext())) {
            this.an = (Button) this.g.findViewById(R.id.settings);
            this.an.setOnClickListener(this);
        }
        int a2 = this.c.a();
        switch (a2) {
            case 1:
                a(R.id.password, R.string.content_description_password_help, R.string.google_password_hint);
                break;
            case 2:
                a(R.id.pin, R.string.content_description_pin_help, R.string.google_pin_hint);
                break;
            case 3:
                this.g.findViewById(R.id.fingerprint_frame).setVisibility(0);
                this.at = true;
                this.ar = new r(e(), (ImageView) this.g.findViewById(R.id.fingerprint_icon), (TextView) this.g.findViewById(R.id.fingerprint_status), this.e.name, new c(this));
                break;
            default:
                throw new IllegalStateException("Unexpected auth method " + a2);
        }
        return this.g;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.c.ab
    protected final void a(int i, int i2, int i3) {
        super.a(i, i2, i3);
        if (com.google.android.finsky.auth.a.a(this.e.name)) {
            this.as = (CheckBox) this.g.findViewById(R.id.fingerprint_opt_in_checkbox);
            this.at = com.google.android.finsky.auth.a.b(this.e.name);
            if (bg.aR.b(this.e.name).a().booleanValue() && !com.google.android.finsky.auth.a.b()) {
                TextView textView = (TextView) this.g.findViewById(R.id.fingerprint_locked);
                textView.setText(this.c.a() == 2 ? R.string.fingerprint_locked_pin : R.string.fingerprint_locked_password);
                textView.setVisibility(0);
                this.at = true;
            }
            if (!this.at) {
                this.as.setVisibility(0);
                this.as.setOnCheckedChangeListener(this);
            }
        } else {
            this.g.findViewById(R.id.opt_out_checkbox).setVisibility(0);
        }
        this.am = (TextView) this.g.findViewById(R.id.password_help);
        this.am.setMovementMethod(LinkMovementMethod.getInstance());
        if (FinskyApp.a().d(this.e.name).a(12605725L)) {
            TextView textView2 = this.am;
            AuthState authState = this.c;
            String a2 = authState.a(this.e.name);
            Spanned fromHtml = Html.fromHtml(a(authState.d(), a2));
            UrlSpanUtils.a(fromHtml, a2, new d(this, a2));
            textView2.setText(fromHtml);
        } else {
            this.am.setText(Html.fromHtml(a(this.c.d(), this.c.a(this.e.name))));
        }
        this.ap = (TextView) this.g.findViewById(R.id.opt_out_info);
        this.ap.setText(b(R.string.purchase_auth_message_never));
        this.ap.setMovementMethod(LinkMovementMethod.getInstance());
        this.ao = (CheckBox) this.g.findViewById(R.id.opt_out_checkbox);
        if (this.aj.m == null) {
            this.ao.setVisibility(8);
            return;
        }
        cv cvVar = this.aj.m;
        this.ao.setOnCheckedChangeListener(this);
        if (this.f) {
            this.ao.setText(f_(R.string.auth_challenge_opt_out_title));
        } else {
            this.ao.setText(f_(R.string.auth_challenge_opt_out_title).toUpperCase());
        }
        this.al = cvVar.c;
        this.ao.setChecked(this.al);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.c.ab, android.support.v4.app.Fragment
    public final void o() {
        super.o();
        if (this.ar != null) {
            r rVar = this.ar;
            if (!com.google.android.finsky.auth.a.a(rVar.d)) {
                rVar.e.b();
                return;
            }
            rVar.f = new CancellationSignal();
            rVar.g = false;
            rVar.f2370a.authenticate(null, rVar.f, 0, rVar, null);
            rVar.c.setTextColor(rVar.c.getResources().getColor(R.color.fingerprint_hint_color, null));
            rVar.c.setText(rVar.c.getResources().getString(R.string.fingerprint_scanning));
            rVar.f2371b.setImageResource(R.drawable.ic_fp_dialog_initial);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void p() {
        super.p();
        if (this.ar != null) {
            this.ar.a();
        }
    }

    @Override // com.google.android.finsky.billing.lightpurchase.c.ab
    protected final void c(Bundle bundle) {
        bundle.putString(this.aj.e, String.valueOf(this.ak));
        if (this.al) {
            int b2 = com.google.android.finsky.c.p.b(this.e.name);
            if (b2 == 0) {
                FinskyLog.e("Got through auth while opted out? Previous=%d", Integer.valueOf(b2));
            }
            com.google.android.finsky.c.p.a(this.e.name, 0, Integer.valueOf(b2), this.au, "purchase-auth-screen");
        }
        com.google.android.finsky.c.p.a(this.e.name, this.at, this.au, "purchase-auth-screen");
        bg.O.b(this.e.name).a((com.google.android.finsky.c.o<Long>) Long.valueOf(System.currentTimeMillis()));
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton == this.ao) {
            a(753, false);
            this.al = z;
            if (z) {
                a(false);
                this.ap.setVisibility(0);
            } else {
                this.ap.setVisibility(8);
            }
            B();
            return;
        }
        if (compoundButton == this.as) {
            a(755, false);
            this.at = z;
        }
    }

    private void B() {
        if (this.an != null) {
            this.an.setVisibility(this.al || this.d ? 0 : 8);
        }
    }

    private CharSequence b(int i) {
        Spanned fromHtml = Html.fromHtml(a(i, "SETTINGS_ACTIVITY_SENTINEL", com.google.android.finsky.c.d.K.b()));
        UrlSpanUtils.a(fromHtml, "SETTINGS_ACTIVITY_SENTINEL", new f(this));
        return fromHtml;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        e(false);
        this.c.f2014b = false;
        ((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).a(this.aj, this.c);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final void u() {
        if (this.c.a() == 3) {
            C();
        } else {
            b(false);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.i) {
            a(752, false);
            a(this.d ? false : true);
        } else {
            if (view != this.an) {
                return;
            }
            this.f2346a = com.google.android.finsky.c.p.b(this.e.name);
            ((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).x();
        }
    }

    @Override // com.google.android.finsky.billing.lightpurchase.c.ab
    protected final void a(boolean z) {
        this.d = z;
        y();
    }

    public final void y() {
        int i = R.string.purchase_auth_message_always;
        boolean z = true;
        int b2 = com.google.android.finsky.c.p.b(this.e.name);
        if (b2 == 0) {
            z = false;
        } else if (this.aj.x) {
            if (b2 == 1) {
                i = R.string.purchase_auth_message_session;
            } else if (b2 != 2) {
                FinskyLog.e("Unexpected value for PurchaseAuth message %d", Integer.valueOf(b2));
                z = false;
            }
            this.ai.setText(b(i));
        } else {
            z = false;
        }
        this.ai.setVisibility((z && this.d) ? 0 : 8);
        this.am.setVisibility(this.d ? 0 : 8);
        B();
    }

    @Override // com.google.android.finsky.billing.lightpurchase.c.ab
    protected final void z() {
        this.f2342b.a(this.e.name, this.h.getText().toString(), (ct) null);
    }

    static /* synthetic */ com.google.android.finsky.billing.lightpurchase.b.a c(b bVar) {
        return (com.google.android.finsky.billing.lightpurchase.b.a) bVar.E;
    }
}
