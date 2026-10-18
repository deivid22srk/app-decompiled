package com.google.android.finsky.billing.lightpurchase.cpkg;

import android.accounts.Account;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.apkg.ai;
import com.google.android.finsky.apkg.aj;
import com.google.android.finsky.auth.AuthState;
import com.google.android.finsky.billing.lightpurchase.CheckoutPurchaseError;
import com.google.android.finsky.billing.lightpurchase.PurchaseFragment;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public abstract class ab extends com.google.android.finsky.billing.lightpurchase.bpkg.f<PurchaseFragment> implements View.OnClickListener, com.google.android.finsky.epkg.v, cy {

    /* renamed from: a, reason: collision with root package name */
    public int f2341a;
    TextView ai;
    public String aj;
    public TextView ak;
    public final ai al;

    /* renamed from: b, reason: collision with root package name */
    com.google.android.finsky.billing.lightpurchase.b f2342b;
    AuthState c;
    boolean d;
    public Account e;
    public boolean f;
    View g;
    EditText h;
    ImageView i;

    public abstract void a(boolean z);

    public abstract void c(Bundle bundle);

    public abstract void z();

    public ab(int i) {
        this.al = com.google.android.finsky.apkg.i.a(i);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.bpkg.f, android.support.v4.app.Fragment
    public void e(Bundle bundle) {
        super.e(bundle);
        bundle.putInt("PurchaseAuthenticationChallengeBaseStep.handledStateInstance", this.f2341a);
        bundle.putBoolean("PurchaseAuthenticationChallengeBaseStep.passwordHelpExpanded", this.d);
        bundle.putString("PurchaseAuthenticationChallengeBaseStep.errorMessage", this.aj);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.bpkg.f
    public String a(Resources resources) {
        int i;
        AuthState authState = this.c;
        if (!authState.f2014b) {
            i = R.string.confirm;
        } else if (authState.f2013a) {
            i = R.string.use_pin;
        } else {
            i = R.string.use_password;
        }
        return resources.getString(i);
    }

    @Override // android.support.v4.app.Fragment
    public final void g_() {
        super.g_();
        this.f2342b = (com.google.android.finsky.billing.lightpurchase.b) f().d().a("PurchaseAuthenticationChallengeBaseStep.sidecar");
        if (this.f2342b == null) {
            this.f2342b = com.google.android.finsky.billing.lightpurchase.b.a(this.e.name, this.c);
            f().d().a().a(this.f2342b, "PurchaseAuthenticationChallengeBaseStep.sidecar").b();
        }
        this.f2342b.a(this);
    }

    @Override // android.support.v4.app.Fragment
    public final void h_() {
        if (this.f2342b != null) {
            this.f2342b.a((com.google.android.finsky.epkg.v) null);
        }
        if (this.h != null) {
            ik.a((Activity) f(), (View) this.h);
        }
        super.h_();
    }

    @Override // android.support.v4.app.Fragment
    public void o() {
        super.o();
        ik.a(this.g.getContext(), f_(this.c.c()), this.g);
        if (this.h != null && !((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E)).aj && this.h.getVisibility() == 0) {
            ik.a((Activity) f(), this.h);
        }
    }

    public final void b(boolean z) {
        a(751, z);
        ik.a((Activity) f(), (View) this.h);
        ((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E)).z();
        z();
    }

    public final void a(String str, String str2, int i) {
        this.ai = (TextView) this.g.findViewById(R.id.purchase_disclaimer);
        this.ai.setMovementMethod(LinkMovementMethod.getInstance());
        ((TextView) this.g.findViewById(R.id.title)).setText(i);
        ((TextView) this.g.findViewById(R.id.account)).setText(str);
        if (!TextUtils.isEmpty(str2)) {
            TextView textView = (TextView) this.g.findViewById(R.id.instrument_title);
            textView.setText(str2);
            textView.setVisibility(0);
        }
    }

    public void a(int i, int i2, int i3) {
        this.g.findViewById(R.id.password_pin_frame).setVisibility(0);
        this.h = (EditText) this.g.findViewById(i);
        this.h.setVisibility(0);
        this.h.setOnEditorActionListener(new ac(this));
        if (this.f) {
            this.h.setHintTextColor(android.support.v4.b.g.b(((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E)).e(), R.color.play_tertiary_text));
        } else {
            this.h.setHintTextColor(android.support.v4.b.g.b(((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E)).e(), R.color.play_secondary_text));
        }
        this.h.setHint(i3);
        this.i = (ImageView) this.g.findViewById(R.id.help_toggle);
        this.i.setOnClickListener(this);
        this.i.setContentDescription(f_(i2));
        this.ak = (TextView) this.g.findViewById(R.id.error_message);
        if (!TextUtils.isEmpty(this.aj)) {
            a(this.aj);
        }
    }

    public final void A() {
        e(true);
        PurchaseFragment purchaseFragment = (PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E);
        Bundle bundle = new Bundle();
        int a2 = this.c.a();
        com.google.android.finsky.billing.lightpurchase.e eVar = purchaseFragment.f2277a;
        eVar.d.g = a2;
        eVar.d.h = true;
        bundle.putString("pcam", String.valueOf(a2));
        c(bundle);
        purchaseFragment.c(bundle);
    }

    public final void a(int i, boolean z) {
        aj ajVar = new aj();
        if (z) {
            ajVar.f = true;
            ajVar.g = true;
        }
        ajVar.h = this.c.b();
        a(i, ajVar);
    }

    public final void e(boolean z) {
        FinskyApp.a().f(this.e.name).b(new com.google.android.finsky.apkg.b(508).a(z).a(this.c.b()).f1473a);
    }

    public void a(String str) {
        this.aj = str;
        this.ak.setText(str);
        this.ak.setVisibility(0);
        ik.a(f(), str, this.ak);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public ai getPlayStoreUiElement() {
        return this.al;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.bpkg.f, android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        this.c = (AuthState) this.r.getParcelable("PurchaseAuthenticationChallengeBaseStep.authState");
        if (this.al.e == null) {
            this.al.e = new aj();
        }
        this.al.e.h = this.c.b();
        super.a(bundle);
        this.e = (Account) this.r.getParcelable("account");
        if (bundle != null) {
            this.f2341a = bundle.getInt("PurchaseAuthenticationChallengeBaseStep.handledStateInstance");
            this.d = bundle.getBoolean("PurchaseAuthenticationChallengeBaseStep.passwordHelpExpanded");
            this.aj = bundle.getString("PurchaseAuthenticationChallengeBaseStep.errorMessage");
        }
        this.f = FinskyApp.a().d(this.e.name).a(12605523L);
    }

    @Override // com.google.android.finsky.epkg.v
    public final void a(com.google.android.finsky.epkg.u uVar) {
        int i = uVar.au;
        Object[] objArr = {Integer.valueOf(uVar.as), Integer.valueOf(i)};
        if (i == this.f2341a) {
            FinskyLog.b("Already handled state %d", Integer.valueOf(this.f2341a));
        }
        this.f2341a = i;
        switch (this.f2342b.as) {
            case 2:
                A();
                break;
            case 3:
                int i2 = this.f2342b.at;
                if (i2 == 1) {
                    this.f2342b.a(this.e.name, this.h.getText().toString());
                    break;
                } else {
                    e(false);
                    if (i2 == 4) {
                        ((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E)).a((com.google.android.finsky.billing.lightpurchase.bpkg.f<?>) o.a(new CheckoutPurchaseError(a(this.c.e(), this.c.a(this.e.name))), true));
                        break;
                    } else {
                        this.h.setText("");
                        a(this.f2342b.f2313a);
                        ((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E)).A();
                        ik.a((Activity) f(), this.h);
                        break;
                    }
                }
        }
    }
}
