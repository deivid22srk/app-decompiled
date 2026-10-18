package com.google.android.finsky.billing.instrumentmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.billing.u;
import com.google.android.finsky.utils.SetupWizardUtils;

/* loaded from: classes.dex */
public class SetupWizardInstrumentManagerActivity extends a {
    private SetupWizardUtils.SetupWizardParams k;

    public static Intent a(String str, byte[] bArr, byte[] bArr2, Bundle bundle, SetupWizardUtils.SetupWizardParams setupWizardParams) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) SetupWizardInstrumentManagerActivity.class);
        a.a(str, bArr, bArr2, bundle, intent);
        intent.putExtra("setupWizardParams", setupWizardParams);
        return intent;
    }

    @Override // com.google.android.finsky.billing.instrumentmanager.a, com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c, com.google.android.finsky.billing.lightpurchase.a, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.k = (SetupWizardUtils.SetupWizardParams) getIntent().getParcelableExtra("setupWizardParams");
        setTheme(this.k.c ? R.style.SetupWizardTheme_Light : R.style.SetupWizardTheme);
        super.onCreate(bundle);
        SetupWizardUtils.a(this, this.k, true);
        if (SetupWizardUtils.a()) {
            SetupWizardUtils.b(this, this.k, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.c
    public final int f() {
        return 1601;
    }

    @Override // com.google.android.finsky.billing.instrumentmanager.a
    protected final int g() {
        return u.a(this.k);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        SetupWizardUtils.a((Activity) this, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.billing.lightpurchase.a
    public final boolean h() {
        return true;
    }
}
