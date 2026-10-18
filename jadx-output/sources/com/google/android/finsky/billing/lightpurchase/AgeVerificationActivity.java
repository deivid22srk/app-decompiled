package com.google.android.finsky.billing.lightpurchase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ap;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public class AgeVerificationActivity extends com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c implements com.google.android.finsky.billing.lightpurchase.a.h {
    public static Intent a(String str, int i, String str2) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) AgeVerificationActivity.class);
        intent.putExtra("authAccount", str);
        intent.putExtra("AgeVerificationActivity.backend", i);
        intent.putExtra("AgeVerificationActivity.docid_str", str2);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c, com.google.android.finsky.billing.lightpurchase.a, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(getLayoutInflater().inflate(R.layout.age_verification_activity, (ViewGroup) null));
        if (d().a("AgeVerificationActivity.host_fragment") == null) {
            Fragment a2 = com.google.android.finsky.billing.lightpurchase.a.g.a(this.p, getIntent().getIntExtra("AgeVerificationActivity.backend", -1), getIntent().getStringExtra("AgeVerificationActivity.docid_str"));
            ap a3 = d().a();
            a3.a(R.id.container, a2, "AgeVerificationActivity.host_fragment");
            a3.b();
        }
    }

    @Override // com.google.android.finsky.billing.lightpurchase.a.h
    public final void b(boolean z) {
        setResult(z ? -1 : 0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c
    public final int f() {
        return 1400;
    }
}
