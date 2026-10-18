package com.google.android.finsky.billing.lightpurchase.c;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.a.aj;
import com.google.android.finsky.billing.lightpurchase.PurchaseFragment;
import com.google.android.finsky.utils.ik;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
public final class ad extends com.google.android.finsky.billing.lightpurchase.b.f<PurchaseFragment> implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final ai f2344a = com.google.android.finsky.a.i.a(1250);

    /* renamed from: b, reason: collision with root package name */
    private String f2345b;
    private String c;
    private View d;
    private PlayActionButton e;
    private PlayActionButton f;

    public static ad a(String str, int i, boolean z) {
        Bundle bundle = new Bundle();
        ad adVar = new ad();
        bundle.putString("authAccount", str);
        bundle.putInt("SuccessStepWithAuthChoices.backend", i);
        bundle.putBoolean("SuccessStepWithAuthChoices.usedPinBasedAuth", z);
        adVar.f(bundle);
        return adVar;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.f2345b = this.r.getString("authAccount");
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.d = layoutInflater.inflate(R.layout.light_purchase_success_step_with_auth_choices, viewGroup, false);
        Bundle bundle2 = this.r;
        this.c = bundle2.getBoolean("SuccessStepWithAuthChoices.usedPinBasedAuth") ? f_(R.string.payment_success_via_pin_auth_choices_description) : f_(R.string.payment_success_auth_choices_description);
        TextView textView = (TextView) this.d.findViewById(R.id.description);
        textView.setText(this.c);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        int i = bundle2.getInt("SuccessStepWithAuthChoices.backend");
        this.e = (PlayActionButton) this.d.findViewById(R.id.choice_everytime_button);
        this.f = (PlayActionButton) this.d.findViewById(R.id.choice_session_button);
        this.e.a(i, R.string.purchase_auth_choice_everytime, this);
        this.f.a(i, R.string.purchase_auth_choice_session, this);
        return this.d;
    }

    @Override // android.support.v4.app.Fragment
    public final void o() {
        super.o();
        if (this.c == null) {
            throw new IllegalArgumentException("No text was specified for a11y announcements.");
        }
        ik.a(this.d.getContext(), this.c, this.d);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != this.e) {
            if (view == this.f) {
                a(1252, (aj) null);
                b(1);
            }
        } else {
            a(1251, (aj) null);
            b(2);
        }
        PurchaseFragment purchaseFragment = (PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E);
        if (purchaseFragment == null) {
            return;
        }
        purchaseFragment.f2277a.v();
    }

    private void b(int i) {
        com.google.android.finsky.c.p.a(this.f2345b, i, null, FinskyApp.a().f(this.f2345b), "success-step-with-choices");
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final String a(Resources resources) {
        return null;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final void u() {
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.f2344a;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final boolean x() {
        return false;
    }
}
