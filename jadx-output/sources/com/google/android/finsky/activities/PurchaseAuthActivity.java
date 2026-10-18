package com.google.android.finsky.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import com.android.vending.R;

/* loaded from: classes.dex */
public class PurchaseAuthActivity extends android.support.v7.a.ae implements View.OnClickListener {
    private int k;
    private Button l;

    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.purchase_auth_dialog);
        this.k = getIntent().getIntExtra("purchase-auth-current", -1);
        a(R.id.always, 2);
        a(R.id.session, 1);
        a(R.id.never, 0);
        this.l = (Button) findViewById(R.id.cancel);
        this.l.setOnClickListener(this);
    }

    private void a(int i, int i2) {
        RadioButton radioButton = (RadioButton) findViewById(i);
        radioButton.setChecked(i2 == this.k);
        radioButton.setOnClickListener(new ez(this, i2));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.l) {
            finish();
        }
    }

    static /* synthetic */ void a(PurchaseAuthActivity purchaseAuthActivity, int i) {
        if (purchaseAuthActivity.k == i) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("purchase-auth-current", purchaseAuthActivity.k);
        intent.putExtra("purchase-auth-new", i);
        purchaseAuthActivity.setResult(-1, intent);
    }
}
