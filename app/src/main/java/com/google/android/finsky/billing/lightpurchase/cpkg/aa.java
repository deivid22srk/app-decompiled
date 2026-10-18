package com.google.android.finsky.billing.lightpurchase.cpkg;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.apkg.ai;
import com.google.android.finsky.apkg.aj;
import com.google.android.finsky.billing.lightpurchase.PurchaseFragment;
import com.google.android.finsky.protos.as;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public final class aa extends com.google.android.finsky.billing.lightpurchase.bpkg.f<PurchaseFragment> {

    /* renamed from: a, reason: collision with root package name */
    public final ai f2339a = com.google.android.finsky.apkg.i.a(1300);

    /* renamed from: b, reason: collision with root package name */
    public View f2340b;

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2340b = layoutInflater.inflate(R.layout.light_purchase_error_step, viewGroup, false);
        ((TextView) this.f2340b.findViewById(R.id.title)).setText(this.r.getString("PaymentDeclinedStep.title"));
        TextView textView = (TextView) this.f2340b.findViewById(R.id.message);
        textView.setText(Html.fromHtml(this.r.getString("PaymentDeclinedStep.messageHtml")));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return this.f2340b;
    }

    @Override // android.support.v4.app.Fragment
    public final void o() {
        super.o();
        String string = this.r.getString("PaymentDeclinedStep.messageHtml");
        String string2 = this.r.getString("PaymentDeclinedStep.title");
        if (!TextUtils.isEmpty(string)) {
            string2 = Html.fromHtml(string).toString();
        } else if (TextUtils.isEmpty(string2)) {
            string2 = null;
        }
        if (string2 != null) {
            ik.a(this.f2340b.getContext(), string2, this.f2340b);
        }
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.f2339a;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.bpkg.f
    public final String a(Resources resources) {
        String string = this.r.getString("PaymentDeclinedStep.continueButtonLabel");
        return TextUtils.isEmpty(string) ? resources.getString(R.string.ok) : string;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.bpkg.f
    public final void u() {
        a(1301, (aj) null);
        ((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E)).a((as) null);
    }
}
