package com.google.android.finsky.billing.lightpurchase.c;

import android.accounts.Account;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.auth.AuthState;
import com.google.android.finsky.protos.cs;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public final class p extends ab {

    /* renamed from: a, reason: collision with root package name */
    private cs f2367a;

    public p() {
        super(5212);
    }

    public static p a(Account account, cs csVar, AuthState authState) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("account", account);
        bundle.putParcelable("FamilyAskToBuyAuthChallengeStep.challenge", ParcelableProto.a(csVar));
        bundle.putParcelable("PurchaseAuthenticationChallengeBaseStep.authState", authState);
        p pVar = new p();
        pVar.f(bundle);
        return pVar;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.c.ab, com.google.android.finsky.billing.lightpurchase.b.f, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.f2367a = (cs) ParcelableProto.a(this.r, "FamilyAskToBuyAuthChallengeStep.challenge");
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.g = layoutInflater.inflate(R.layout.light_purchase_ask_to_buy_password_confirm, viewGroup, false);
        TextView textView = (TextView) this.g.findViewById(R.id.ask_to_buy_item_title);
        textView.setText(this.f2367a.f);
        textView.setVisibility(0);
        TextView textView2 = (TextView) this.g.findViewById(R.id.ask_to_buy_item_price);
        textView2.setText(this.f2367a.j);
        textView2.setVisibility(0);
        FifeImageView fifeImageView = (FifeImageView) this.g.findViewById(R.id.application_icon);
        if (this.f2367a.h != null) {
            fifeImageView.a(this.f2367a.h.f, this.f2367a.h.l, FinskyApp.a().d);
            fifeImageView.setVisibility(0);
        }
        this.g.findViewById(R.id.challenge_context).setVisibility(0);
        a(this.f2367a.e.c, this.f2367a.l, R.string.ask_to_buy_dialog_title);
        a(R.id.password, R.string.content_description_password_help, R.string.google_password_hint);
        return this.g;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.c.ab, com.google.android.finsky.billing.lightpurchase.b.f
    public final String a(Resources resources) {
        return resources.getString(R.string.approve);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final void u() {
        b(false);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.c.ab
    protected final void c(Bundle bundle) {
    }

    @Override // com.google.android.finsky.billing.lightpurchase.c.ab
    protected final void a(boolean z) {
        this.d = z;
        this.ai.setText(Html.fromHtml(this.f2367a.o));
        this.ai.setVisibility(this.d ? 0 : 8);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.c.ab
    protected final void z() {
        this.f2342b.a(this.e.name, this.h.getText().toString(), this.f2367a.e);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.i) {
            a(752, false);
            a(this.d ? false : true);
        }
    }
}
