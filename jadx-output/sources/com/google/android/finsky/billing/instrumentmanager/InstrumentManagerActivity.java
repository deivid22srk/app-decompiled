package com.google.android.finsky.billing.instrumentmanager;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.billing.u;

/* loaded from: classes.dex */
public class InstrumentManagerActivity extends a {
    public static Intent a(String str, byte[] bArr, byte[] bArr2, Bundle bundle) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) InstrumentManagerActivity.class);
        a.a(str, bArr, bArr2, bundle, intent);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c
    public final int f() {
        return 1600;
    }

    @Override // com.google.android.finsky.billing.instrumentmanager.a
    protected final int g() {
        return u.b();
    }
}
