package com.google.android.finsky.billing.lightpurchase.c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.a.aj;
import com.google.android.finsky.billing.lightpurchase.PurchaseFragment;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.mb;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;

/* loaded from: classes.dex */
public final class j extends com.google.android.finsky.billing.lightpurchase.b.f<PurchaseFragment> implements cy {

    /* renamed from: a, reason: collision with root package name */
    private int f2358a;

    /* renamed from: b, reason: collision with root package name */
    private mb f2359b;
    private final ai c = com.google.android.finsky.a.i.a(1280);

    @Override // com.google.android.finsky.billing.lightpurchase.b.f, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        Bundle bundle2 = this.r;
        this.f2358a = bundle2.getInt("ChangeSubscriptionStep.backend");
        this.f2359b = (mb) ParcelableProto.a(bundle2, "ChangeSubscriptionStep.changeSubscription");
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.light_purchase_change_subscription, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.title)).setText(this.f2359b.f4113a);
        ColorStateList c = com.google.android.finsky.utils.ai.c(f(), this.f2358a);
        TextView textView = (TextView) inflate.findViewById(R.id.message);
        textView.setText(com.google.android.finsky.billing.u.a(this.f2359b.c, c.getDefaultColor()));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setLinkTextColor(textView.getTextColors());
        return inflate;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final String a(Resources resources) {
        return f_(R.string.continue_text);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.c;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final void u() {
        a(1281, (aj) null);
        com.google.android.finsky.billing.lightpurchase.e eVar = ((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).f2277a;
        if (eVar.as != 4) {
            FinskyLog.e("switchFromChangeSubscriptionToCart() called in state %d", Integer.valueOf(eVar.as));
        }
        eVar.a(5, 0);
    }
}
