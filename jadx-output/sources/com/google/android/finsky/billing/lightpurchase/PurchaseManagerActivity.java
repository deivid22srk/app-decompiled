package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.dd;
import com.google.android.finsky.protos.de;
import com.google.android.finsky.protos.df;
import com.google.android.wallet.common.pub.SecurePaymentsPayload;

/* loaded from: classes.dex */
public class PurchaseManagerActivity extends com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c implements com.google.android.wallet.common.pub.d {
    private Account k;
    private boolean l;

    public static Intent a(Account account, dd ddVar) {
        de deVar = ddVar.f3719a;
        int length = deVar.c.length;
        com.google.android.wallet.common.pub.g[] gVarArr = new com.google.android.wallet.common.pub.g[length];
        for (int i = 0; i < length; i++) {
            df dfVar = deVar.c[i];
            gVarArr[i] = new com.google.android.wallet.common.pub.g(dfVar.f3722a, dfVar.c);
        }
        SecurePaymentsPayload securePaymentsPayload = new SecurePaymentsPayload(deVar.f3720a, gVarArr);
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) PurchaseManagerActivity.class);
        intent.putExtra("PurchaseManagerActivity.account", account);
        intent.putExtra("PurchaseManagerActivity.securePaymentPayload", securePaymentsPayload);
        com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c.a(intent, account.name);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c, com.google.android.finsky.billing.lightpurchase.a, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.purchase_manager_activity);
        Intent intent = getIntent();
        this.k = (Account) intent.getParcelableExtra("PurchaseManagerActivity.account");
        com.google.android.wallet.common.pub.a.a.f7286a = new com.google.android.finsky.billing.instrumentmanager.b(this, this.q);
        com.google.android.wallet.common.c.a.a(FinskyApp.a().f1434a);
        com.google.android.wallet.common.c.a.b(FinskyApp.a().e);
        if (d().a("PurchaseManagerActivity.fragment") == null) {
            d().a().a(R.id.content_frame, com.google.android.wallet.c.b.a.a(this.k, (SecurePaymentsPayload) intent.getParcelableExtra("PurchaseManagerActivity.securePaymentPayload"), com.google.android.finsky.billing.u.b(), Bundle.EMPTY), "PurchaseManagerActivity.fragment").b();
            FinskyApp.a().c(this.k).a(774, (String) null, (String) null, 0, (String) null, (com.google.android.finsky.a.n) null);
        }
        if (bundle != null) {
            this.l = bundle.getBoolean("PurchaseManagerActivity.isChallengeFinishedEventLogged");
        }
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("PurchaseManagerActivity.isChallengeFinishedEventLogged", this.l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c, com.google.android.finsky.billing.lightpurchase.a, android.support.v4.app.t, android.app.Activity
    public void onDestroy() {
        com.google.android.wallet.common.pub.a.a.f7286a = null;
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c
    public final int f() {
        return 1619;
    }

    @Override // com.google.android.wallet.common.pub.d
    public final void a(int i, Bundle bundle) {
        c(i, bundle);
        finish();
    }

    @Override // com.google.android.wallet.common.pub.d
    public final void b(int i, Bundle bundle) {
        c(i, bundle);
    }

    private void c(int i, Bundle bundle) {
        int i2 = 0;
        switch (i) {
            case 50:
                Bundle bundle2 = new Bundle();
                SecurePaymentsPayload securePaymentsPayload = (SecurePaymentsPayload) bundle.getParcelable("com.google.android.wallet.purchasemanager.EXTRA_SECURE_PAYMENTS_PAYLOAD");
                if (securePaymentsPayload != null) {
                    bundle2.putParcelable("PurchaseManagerActivity.securePaymentsPayload", securePaymentsPayload);
                }
                Intent intent = new Intent();
                intent.putExtra("challenge_response", bundle2);
                setResult(-1, intent);
                break;
            case 51:
            case 52:
                setResult(0);
                i2 = i;
                break;
            default:
                throw new IllegalStateException("Unexpected Orchestration Result: " + i);
        }
        if (!this.l) {
            this.l = true;
            FinskyApp.a().c(this.k).a(775, (String) null, (String) null, i2, (String) null, (com.google.android.finsky.a.n) null);
        }
    }
}
