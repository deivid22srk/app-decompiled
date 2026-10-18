package com.google.android.finsky.billing.refund;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public abstract class h extends com.google.android.finsky.billing.lightpurchase.b.f<e> {

    /* renamed from: a, reason: collision with root package name */
    int f2431a = 0;

    /* renamed from: b, reason: collision with root package name */
    private View f2432b;

    @Override // android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.a(layoutInflater, viewGroup, bundle);
        this.f2432b = layoutInflater.inflate(R.layout.refund_step, viewGroup, false);
        return this.f2432b;
    }

    @Override // android.support.v4.app.Fragment
    public final void o() {
        super.o();
        String y = y();
        if (TextUtils.isEmpty(y)) {
            y = z();
            if (TextUtils.isEmpty(y)) {
                y = null;
            }
        }
        if (!TextUtils.isEmpty(y)) {
            ik.a(this.f2432b.getContext(), y, this.f2432b);
        }
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public void u() {
        b(1);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public void R_() {
        b(2);
    }

    final void b(int i) {
        FinskyLog.a("Moving from state %d to state %d.", Integer.valueOf(this.f2431a), Integer.valueOf(i));
        this.f2431a = i;
        ((e) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).u();
    }

    protected String y() {
        return this.r.getString("RefundStep.title");
    }

    protected String z() {
        return this.r.getString("RefundStep.messageHtml");
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public String a(Resources resources) {
        return this.r.getString("RefundStep.continueButtonLabel");
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final String v() {
        return this.r.getString("RefundStep.secondaryButtonLabel");
    }
}
