package com.google.android.finsky.billing.lightpurchase.billingprofile.instruments;

import android.content.Intent;
import android.os.Bundle;
import com.android.vending.R;
import com.google.android.finsky.billing.giftcard.RedeemCodeResult;
import com.google.android.finsky.protos.dp;
import com.google.android.finsky.utils.ParcelableProto;

/* loaded from: classes.dex */
public abstract class d extends c implements com.google.android.finsky.billing.giftcard.c {
    private com.google.android.finsky.billing.giftcard.a k;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c
    public abstract int f();

    protected abstract int g();

    protected abstract int i();

    protected abstract int j();

    protected static void a(Intent intent, String str, int i, int i2, dp dpVar, int i3, String str2, String str3) {
        intent.putExtra("authAccount", str);
        intent.putExtra("RedeemCodeBaseActivity.redemption_context", i);
        intent.putExtra("RedeemCodeBaseActivity.backend", i2);
        intent.putExtra("RedeemCodeBaseActivity.docid", ParcelableProto.a(dpVar));
        intent.putExtra("RedeemCodeBaseActivity.offer_type", i3);
        intent.putExtra("RedeemCodeBaseActivity.prefill_code", str2);
        intent.putExtra("RedeemCodeBaseActivity.partner_payload", str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c, com.google.android.finsky.billing.lightpurchase.a, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g());
        if (bundle == null) {
            Intent intent = getIntent();
            d().a().a(R.id.content_frame, com.google.android.finsky.billing.giftcard.a.a(this.p, intent.getIntExtra("RedeemCodeBaseActivity.redemption_context", 0), intent.getIntExtra("RedeemCodeBaseActivity.backend", -1), i(), (dp) ParcelableProto.a(intent, "RedeemCodeBaseActivity.docid"), intent.getIntExtra("RedeemCodeBaseActivity.offer_type", 0), intent.getStringExtra("RedeemCodeBaseActivity.prefill_code"), j(), intent.getStringExtra("RedeemCodeBaseActivity.partner_payload"))).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onStart() {
        super.onStart();
        this.k = (com.google.android.finsky.billing.giftcard.a) d().a(R.id.content_frame);
    }

    @Override // android.app.Activity
    public void finish() {
        RedeemCodeResult redeemCodeResult;
        Intent intent = new Intent();
        if (this.k != null && (redeemCodeResult = this.k.c) != null) {
            intent.putExtra("RedeemCodeBaseActivity.redeem_code_result", redeemCodeResult);
        }
        setResult(-1, intent);
        super.finish();
    }

    @Override // com.google.android.finsky.billing.giftcard.c
    public final void a() {
        finish();
    }
}
