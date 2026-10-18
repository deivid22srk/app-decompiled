package com.google.android.finsky.billing.lightpurchase.billingprofile.instruments;

import android.content.Intent;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.billing.u;
import com.google.android.finsky.protos.dp;

/* loaded from: classes.dex */
public class RedeemCodeActivity extends d {
    public static Intent a(String str, int i) {
        return a(str, i, (String) null, (String) null);
    }

    public static Intent a(String str, int i, String str2, String str3) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) RedeemCodeActivity.class);
        a(intent, str, i, 0, null, 0, str2, str3);
        return intent;
    }

    public static Intent a(String str, int i, dp dpVar, int i2) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) RedeemCodeActivity.class);
        a(intent, str, 1, i, dpVar, i2, null, null);
        return intent;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.d
    protected final int g() {
        return R.layout.redeem_activity;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.d
    protected final int i() {
        return 0;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.d
    protected final int j() {
        return u.b();
    }

    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.d, com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c
    protected final int f() {
        return 880;
    }
}
