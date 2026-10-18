package com.google.android.finsky.billing.lightpurchase.billingprofile;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.a.ae;
import android.text.TextUtils;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.billing.giftcard.RedeemCodeResult;
import com.google.android.finsky.billing.m;
import com.google.android.finsky.billing.o;
import com.google.android.finsky.billing.t;
import com.google.android.finsky.protos.as;
import com.google.android.finsky.protos.dp;
import com.google.android.finsky.receivers.FlushLogsReceiver;
import com.google.android.finsky.utils.ParcelableProto;

/* loaded from: classes.dex */
public class BillingProfileActivity extends ae implements t {
    private Account k;
    private String l;

    public static Intent a(Account account, String str, dp dpVar, int i, as asVar) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) BillingProfileActivity.class);
        intent.putExtra("BillingProfileActivity.account", account);
        intent.putExtra("BillingProfileActivity.purchaseContextToken", str);
        intent.putExtra("BillingProfileActivity.docid", ParcelableProto.a(dpVar));
        intent.putExtra("BillingProfileActivity.offerType", i);
        intent.putExtra("BillingProfileActivity.prefetchedBillingProfile", ParcelableProto.a(asVar));
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.billing_profile_activity);
        Intent intent = getIntent();
        this.k = (Account) intent.getParcelableExtra("BillingProfileActivity.account");
        this.l = intent.getStringExtra("BillingProfileActivity.purchaseContextToken");
        as asVar = (as) ParcelableProto.a(intent, "BillingProfileActivity.prefetchedBillingProfile");
        TextView textView = (TextView) findViewById(R.id.title);
        if (asVar != null && !TextUtils.isEmpty(asVar.j)) {
            textView.setText(asVar.j);
        } else {
            textView.setText(R.string.payment_methods);
        }
        if (asVar != null && asVar.n) {
            findViewById(R.id.logo).setVisibility(0);
        }
        TextView textView2 = (TextView) findViewById(R.id.account);
        textView2.setText(this.k.name);
        textView2.setVisibility(0);
        if (d().a("BillingProfileActivity.fragment") == null) {
            d().a().a(R.id.content_frame, o.a(this.k, this.l, (dp) ParcelableProto.a(intent, "BillingProfileActivity.docid"), intent.getIntExtra("BillingProfileActivity.offerType", 0), asVar), "BillingProfileActivity.fragment").b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onResume() {
        super.onResume();
        FlushLogsReceiver.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onPause() {
        super.onPause();
        FlushLogsReceiver.a();
    }

    @Override // com.google.android.finsky.billing.t
    public final void a(String str) {
        Intent intent = new Intent();
        intent.putExtra("BillingProfileActivity.selectedInstrumentId", str);
        setResult(-1, intent);
        finish();
    }

    @Override // com.google.android.finsky.billing.t
    public final void a(RedeemCodeResult redeemCodeResult) {
        Intent intent = new Intent();
        intent.putExtra("BillingProfileActivity.redeemPromoCodeResult", redeemCodeResult);
        setResult(-1, intent);
        finish();
    }

    @Override // com.google.android.finsky.billing.t
    public final void a() {
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        m mVar = (m) d().a("BillingProfileActivity.fragment");
        if (mVar != null && this.k != null) {
            FinskyApp.a().c(this.k).b(603, null, mVar);
        }
        super.finish();
    }
}
