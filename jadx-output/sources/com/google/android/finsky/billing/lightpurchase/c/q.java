package com.google.android.finsky.billing.lightpurchase.c;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.a.aj;
import com.google.android.finsky.billing.lightpurchase.PurchaseFragment;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.cs;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public final class q extends com.google.android.finsky.billing.lightpurchase.b.f<PurchaseFragment> implements cy {

    /* renamed from: a, reason: collision with root package name */
    private cs f2368a;

    /* renamed from: b, reason: collision with root package name */
    private View f2369b;
    private final ai c = com.google.android.finsky.a.i.a(5210);

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2369b = layoutInflater.inflate(R.layout.light_purchase_ask_to_buy_pass_device, viewGroup, false);
        ((TextView) this.f2369b.findViewById(R.id.approval_required_title)).setText(this.f2368a.f3695a);
        ((TextView) this.f2369b.findViewById(R.id.approval_required_description)).setText(this.f2368a.c);
        return this.f2369b;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final String a(Resources resources) {
        return resources.getString(R.string.continue_text);
    }

    @Override // android.support.v4.app.Fragment
    public final void o() {
        super.o();
        ik.a(this.f2369b.getContext(), a(R.string.purchase_flow_ask_to_buy_prompt, this.f2368a.f3695a, this.f2368a.c), this.f2369b);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.c;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        this.f2368a = (cs) ParcelableProto.a(this.r, "FamilyAskToBuyDescriptionStep.challenge");
        super.a(bundle);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final void u() {
        a(5211, (aj) null);
        com.google.android.finsky.billing.lightpurchase.e eVar = ((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).f2277a;
        if (eVar.as != 7) {
            FinskyLog.e("switchToFamilyManagerChallenge() called in state %d", Integer.valueOf(eVar.as));
        }
        eVar.a(12, 0);
    }
}
