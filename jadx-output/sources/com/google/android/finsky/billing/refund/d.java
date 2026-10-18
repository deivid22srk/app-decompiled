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
public final class d extends h {

    /* renamed from: b, reason: collision with root package name */
    private final ai f2427b = com.google.android.finsky.a.i.a(1161);

    @Override // com.google.android.finsky.billing.refund.h, android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = super.a(layoutInflater, viewGroup, bundle);
        String y = y();
        TextView textView = (TextView) a2.findViewById(R.id.title);
        textView.setVisibility(0);
        textView.setText(y);
        String z = z();
        TextView textView2 = (TextView) a2.findViewById(R.id.message);
        textView2.setVisibility(0);
        textView2.setText(Html.fromHtml(z));
        return a2;
    }

    @Override // com.google.android.finsky.billing.refund.h
    protected final String y() {
        String y = super.y();
        return !TextUtils.isEmpty(y) ? y : f_(R.string.error);
    }

    @Override // com.google.android.finsky.billing.refund.h
    protected final String z() {
        String z = super.z();
        return !TextUtils.isEmpty(z) ? z : f_(R.string.generic_purchase_prepare_error);
    }

    @Override // com.google.android.finsky.billing.refund.h, com.google.android.finsky.billing.lightpurchase.b.f
    public final String a(Resources resources) {
        String a2 = super.a(resources);
        return !TextUtils.isEmpty(a2) ? a2 : resources.getString(R.string.ok);
    }

    @Override // com.google.android.finsky.billing.refund.h, com.google.android.finsky.billing.lightpurchase.b.f
    public final void u() {
        super.u();
        a(1162, (aj) null);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.f2427b;
    }
}
