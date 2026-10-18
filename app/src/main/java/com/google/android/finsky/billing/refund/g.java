package com.google.android.finsky.billing.refund;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.apkg.ai;
import com.google.android.finsky.apkg.aj;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: b, reason: collision with root package name */
    private final ai f2430b = com.google.android.finsky.apkg.i.a(1158);

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
        String z2 = z();
        boolean z3 = TextUtils.isEmpty(z2) ? false : true;
        if (z3) {
            TextView textView2 = (TextView) a2.findViewById(R.id.message);
            textView2.setVisibility(0);
            textView2.setText(Html.fromHtml(z2));
        }
        if (!z && !z3) {
            throw new IllegalStateException("No content for view.");
        }
        return a2;
    }

    @Override // com.google.android.finsky.billing.refund.h, com.google.android.finsky.billing.lightpurchase.bpkg.f
    public final String a(Resources resources) {
        String a2 = super.a(resources);
        return !TextUtils.isEmpty(a2) ? a2 : resources.getString(R.string.ok);
    }

    @Override // com.google.android.finsky.billing.refund.h, com.google.android.finsky.billing.lightpurchase.bpkg.f
    public final void u() {
        super.u();
        a(1159, (aj) null);
    }

    @Override // com.google.android.finsky.billing.refund.h, com.google.android.finsky.billing.lightpurchase.bpkg.f
    public final void R_() {
        super.R_();
        a(1160, (aj) null);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.f2430b;
    }
}
