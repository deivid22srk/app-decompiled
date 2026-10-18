package com.google.android.finsky.billing.lightpurchase.c;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.a.aj;
import com.google.android.finsky.billing.an;
import com.google.android.finsky.billing.lightpurchase.CheckoutPurchaseError;
import com.google.android.finsky.billing.lightpurchase.PurchaseFragment;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public final class o extends com.google.android.finsky.billing.lightpurchase.b.f<PurchaseFragment> {

    /* renamed from: a, reason: collision with root package name */
    private final ai f2365a = com.google.android.finsky.a.i.a(770);

    /* renamed from: b, reason: collision with root package name */
    private CheckoutPurchaseError f2366b;

    public static o a(CheckoutPurchaseError checkoutPurchaseError, boolean z) {
        o oVar = new o();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ErrorStep.checkoutPurchaseError", checkoutPurchaseError);
        bundle.putBoolean("ErrorStep.purchaseFailed", z);
        oVar.f(bundle);
        oVar.f2366b = checkoutPurchaseError;
        return oVar;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.f2366b = (CheckoutPurchaseError) this.r.getParcelable("ErrorStep.checkoutPurchaseError");
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.light_purchase_error_step, viewGroup, false);
        String f_ = TextUtils.isEmpty(this.f2366b.f2274b) ? f_(R.string.error) : this.f2366b.f2274b;
        String f_2 = TextUtils.isEmpty(this.f2366b.c) ? f_(R.string.generic_purchase_prepare_error) : this.f2366b.c;
        ((TextView) viewGroup2.findViewById(R.id.title)).setText(f_);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.message);
        textView.setText(Html.fromHtml(f_2));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return viewGroup2;
    }

    @Override // android.support.v4.app.Fragment
    public final void g_() {
        super.g_();
        View view = this.R;
        ik.a(f(), ((TextView) view.findViewById(R.id.message)).getText().toString(), view);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final String a(Resources resources) {
        return TextUtils.isEmpty(this.f2366b.d) ? resources.getString(R.string.ok) : this.f2366b.d;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.f2365a;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final void u() {
        a(771, (aj) null);
        if (this.r.getBoolean("ErrorStep.purchaseFailed")) {
            ((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).v();
        } else {
            if (this.f2366b.f != null) {
                PurchaseFragment purchaseFragment = (PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E);
                purchaseFragment.f2277a.a(this.f2366b.f);
                return;
            }
            ((PurchaseFragment) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).a((an) null, (Boolean) null);
        }
    }
}
