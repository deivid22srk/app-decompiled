package com.google.android.finsky.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.ParcelableProto;

/* loaded from: classes.dex */
public class AddressChallengeActivity extends ay {
    private final cj k = new cj(this);
    private com.google.android.finsky.billing.f l;

    public static Intent a(int i, com.google.android.finsky.protos.cj cjVar, Bundle bundle) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) AddressChallengeActivity.class);
        intent.putExtra("backend", i);
        intent.putExtra("challenge", ParcelableProto.a(cjVar));
        intent.putExtra("extra_parameters", bundle);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.billing_challenge_frame);
        com.google.android.finsky.layout.actionbar.e eVar = new com.google.android.finsky.layout.actionbar.e(this.k, this);
        eVar.a(getIntent().getIntExtra("backend", 0), false);
        eVar.a(false, -1);
        this.l = new com.google.android.finsky.billing.a.a(this, this, (com.google.android.finsky.protos.cj) ParcelableProto.a(getIntent(), "challenge"), getIntent().getBundleExtra("extra_parameters"));
        if (bundle != null) {
            this.l.a(bundle);
        } else {
            this.l.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.l != null) {
            this.l.b(bundle);
        }
    }

    @Override // com.google.android.finsky.activities.ay, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.k.a();
        return true;
    }
}
