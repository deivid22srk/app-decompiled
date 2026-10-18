package com.google.android.finsky.billing.lightpurchase.billingprofile.instruments;

import android.content.Intent;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.cd;

/* loaded from: classes.dex */
public class AddDcb3Activity extends a {
    public static Intent a(String str, cd cdVar) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) AddDcb3Activity.class);
        a(str, cdVar, intent);
        return intent;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.a, com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c
    protected final int f() {
        return 841;
    }
}
