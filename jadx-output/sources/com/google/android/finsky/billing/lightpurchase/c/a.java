package com.google.android.finsky.billing.lightpurchase.c;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.billing.lightpurchase.PurchaseFragment;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.ci;
import com.google.android.finsky.utils.ParcelableProto;

/* loaded from: classes.dex */
public final class a extends com.google.android.finsky.billing.lightpurchase.b.f<PurchaseFragment> {

    /* renamed from: a, reason: collision with root package name */
    public ci f2337a;

    /* renamed from: b, reason: collision with root package name */
    private final ai f2338b = com.google.android.finsky.a.i.a(1290);

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.acknowledgement_challenge, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.title)).setText(this.f2337a.c);
        TextView textView = (TextView) inflate.findViewById(R.id.description);
        textView.setText(Html.fromHtml(this.f2337a.e));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return inflate;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final String a(Resources resources) {
        return this.f2337a.j ? this.f2337a.i : resources.getString(R.string.continue_text);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.f2338b;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        this.f2337a = (ci) ParcelableProto.a(this.r, "AcknowledgementChallengeStep.challenge");
        com.google.android.finsky.a.i.a(this.f2338b, this.f2337a.g);
        super.a(bundle);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final void u() {
        ((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).a(1291, (cy) this);
        Bundle bundle = new Bundle();
        bundle.putString(this.f2337a.f3675a, "true");
        ((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).c(bundle);
    }
}
