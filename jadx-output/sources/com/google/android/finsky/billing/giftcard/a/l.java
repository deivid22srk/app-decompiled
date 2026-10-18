package com.google.android.finsky.billing.giftcard.a;

import android.text.Html;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.a.aj;
import com.google.android.finsky.billing.at;
import com.google.android.finsky.protos.n;
import com.google.android.finsky.protos.r;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class l extends at<com.google.android.finsky.billing.giftcard.a> {
    private final ai g = com.google.android.finsky.a.i.a(885);

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final void u() {
        if (!TextUtils.isEmpty(this.c)) {
            a(1109, (aj) null);
        } else {
            a(886, (aj) null);
        }
        P_();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.at
    public final void a(r rVar) {
        super.a(rVar);
        int b2 = android.support.v4.b.g.b(this.e.getContext(), R.color.redeem_success_link_text);
        ((TextView) this.e.findViewById(R.id.message_2)).setLinkTextColor(b2);
        ((TextView) this.e.findViewById(R.id.footer_html)).setLinkTextColor(b2);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.g;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final void R_() {
        a(1108, (aj) null);
        com.google.android.finsky.billing.giftcard.a aVar = (com.google.android.finsky.billing.giftcard.a) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E);
        com.google.android.finsky.protos.l lVar = this.d;
        if (lVar != null) {
            if (aVar.f2207a == 1) {
                FinskyLog.e("Cannot perform success action during Setup Wizard", new Object[0]);
            } else if (aVar.a(lVar)) {
                FinskyLog.a("Dialog shown, waiting for user input.", new Object[0]);
                return;
            }
        }
        aVar.v();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.at
    public final void a(n nVar) {
        if (!this.r.getBoolean("RedeemSuccessStep.in_setup_wizard")) {
            throw new UnsupportedOperationException("Setup Wizard template is not supported outside of the Setup Wizard.");
        }
        Button button = (Button) ((com.google.android.finsky.billing.giftcard.a) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).ak.findViewById(R.id.cancel_button);
        if (button != null) {
            button.setVisibility(8);
        }
        f().setTitle(nVar.f4154a);
        a(Html.fromHtml(nVar.c), R.id.message);
        this.f2168a = nVar.f4154a;
        this.f2169b = nVar.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.at
    public final void P_() {
        ((com.google.android.finsky.billing.giftcard.a) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).u();
    }
}
