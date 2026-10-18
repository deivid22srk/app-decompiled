package com.google.android.finsky.billing.refund;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.a.aj;

/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: b, reason: collision with root package name */
    private final ai f2426b = com.google.android.finsky.a.i.a(1151);

    @Override // com.google.android.finsky.billing.refund.h, android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = super.a(layoutInflater, viewGroup, bundle);
        String y = y();
        boolean z = !TextUtils.isEmpty(y);
        if (z) {
            TextView textView = (TextView) a2.findViewById(R.id.title);
            textView.setVisibility(0);
            textView.setText(y);
        }
        String string = this.r.getString("RefundStep.subtitle");
        boolean z2 = !TextUtils.isEmpty(string);
        if (z2) {
            TextView textView2 = (TextView) a2.findViewById(R.id.subtitle);
            textView2.setVisibility(0);
            textView2.setText(string);
        }
        String z3 = z();
        boolean z4 = TextUtils.isEmpty(z3) ? false : true;
        if (z4) {
            TextView textView3 = (TextView) a2.findViewById(R.id.message);
            textView3.setVisibility(0);
            textView3.setText(Html.fromHtml(z3));
        }
        if (!z && !z2 && !z4) {
            throw new IllegalStateException("No content for view.");
        }
        return a2;
    }

    @Override // com.google.android.finsky.billing.refund.h, com.google.android.finsky.billing.lightpurchase.b.f
    public final String a(Resources resources) {
        String a2 = super.a(resources);
        return !TextUtils.isEmpty(a2) ? a2 : resources.getString(R.string.continue_text);
    }

    @Override // com.google.android.finsky.billing.refund.h, com.google.android.finsky.billing.lightpurchase.b.f
    public final void u() {
        super.u();
        a(1152, (aj) null);
    }

    @Override // com.google.android.finsky.billing.refund.h, com.google.android.finsky.billing.lightpurchase.b.f
    public final void R_() {
        super.R_();
        a(1153, (aj) null);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.f2426b;
    }
}
